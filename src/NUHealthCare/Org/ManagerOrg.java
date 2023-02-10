/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NUHealthCare.Org;

import NUHealthCare.Role.Manager;
import NUHealthCare.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class ManagerOrg extends Org {
    
     public ManagerOrg() {
        super(Org.Type.Manager.getValue());

    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Manager());
        return roles;
    }
}
