package NUHealthCare.DB4OUtil;

import NUHealthCare.ConfigureASystem;
import NUHealthCare.Ecosystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class DB4OUtil {
  private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
  private static DB4OUtil dB4OUtil;
  
  public synchronized static DB4OUtil getInstance() {
    if (dB4OUtil == null) {
      dB4OUtil = new DB4OUtil();
    }
    return dB4OUtil;
  }
  
  protected synchronized static void shutdown(ObjectContainer connection) {
    if (connection != null) {
      connection.close();
    }
  }
  
  private ObjectContainer createConnection() {
    try {

      EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
      config.common().
          add(new TransparentPersistenceSupport());
      //Controls the number of objects in memory
      config.common().
          activationDepth(Integer.MAX_VALUE);
      //Controls the depth/level of updation of Object
      config.common().
          updateDepth(Integer.MAX_VALUE);

      //Register your top most Class here
      config.common().
          objectClass(Ecosystem.class).
          cascadeOnUpdate(true); // Change to the object you want to save

      ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
      return db;
    } catch (Exception e) {
      System.out.print(e.getMessage());
    }
    return null;
  }
  
  public synchronized void storeSystem(Ecosystem ecosystem) {
    try {
      ObjectContainer conn = createConnection();
      conn.store(ecosystem);
      conn.commit();
      conn.close();
    } catch (Exception e) {
      System.out.print(e.getMessage());
    }
  }
  
  public Ecosystem retrieveSystem(){
    try {
      ObjectContainer conn = createConnection();
      ObjectSet<Ecosystem> ecosystems;
      try {

        ecosystems = conn.query(Ecosystem.class); // Change to the object you want to save
      } catch (Exception e) {
        System.out.print(e.getCause());
        ecosystems = conn.query(Ecosystem.class);
      }
      Ecosystem ecosystem;
      if (ecosystems.isEmpty()) {
        ecosystem = ConfigureASystem.configure();  // If there's no System in the record, create a new one
      } else {
        ecosystem = ecosystems.get(ecosystems.size() - 1);
      }
      conn.close();
      return ecosystem;
    } catch (Exception e) {
      System.out.print(e.getMessage());
    }
    return null;
  }
}
