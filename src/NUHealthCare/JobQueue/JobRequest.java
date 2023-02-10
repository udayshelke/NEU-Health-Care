package NUHealthCare.JobQueue;

import NUHealthCare.Account.Account;
import java.util.Date;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public abstract class JobRequest {
  private String message;
  private Account sender;
  private Account receiver;
  private String status;
  private Date requestDate;
  private Date resolveDate;

  public JobRequest() {
    requestDate = new Date();
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Account getSender() {
    return sender;
  }

  public void setSender(Account sender) {
    this.sender = sender;
  }

  public Account getReceiver() {
    return receiver;
  }

  public void setReceiver(Account receiver) {
    this.receiver = receiver;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Date getRequestDate() {
    return requestDate;
  }

  public void setRequestDate(Date requestDate) {
    this.requestDate = requestDate;
  }

  public Date getResolveDate() {
    return resolveDate;
  }

  public void setResolveDate(Date resolveDate) {
    this.resolveDate = resolveDate;
  }
  
  
}
