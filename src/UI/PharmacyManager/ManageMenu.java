/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PharmacyManager;


import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.Enterprise.PharmacyEnterprise;
import NUHealthCare.Org.Org;
import NUHealthCare.Org.Org.Type; 
import NUHealthCare.Org.OrgDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class ManageMenu extends javax.swing.JPanel {
    
        private Org directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;


    /**
     * Creates new form ManageMenu
     */
    public ManageMenu(JPanel userProcessContainer, Enterprise enterprise) {
            initComponents();
        this.userProcessContainer = userProcessContainer;
 
        this.enterprise = enterprise;

        populateTable();
    }
    
        private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        PharmacyEnterprise restaurant = (PharmacyEnterprise) enterprise;
        HashMap menuItem = restaurant.getMenu();
        model.setRowCount(0);

        for (Object i: menuItem.keySet()) {
            Object[] row = new Object[2];
            row[0] = i;
            row[1] = menuItem.get(i);

            model.addRow(row);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        priceLabel = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnAddMenuItem = new javax.swing.JButton();
        txtItemPrice = new javax.swing.JTextField();
        itemLabel = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblHeaderManageOrg = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        organizationJTable.setBackground(new java.awt.Color(204, 204, 204));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Menu Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        priceLabel.setText("Item Price");

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAddMenuItem.setBackground(new java.awt.Color(153, 0, 0));
        btnAddMenuItem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddMenuItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMenuItem.setText("Add Menu Item");
        btnAddMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMenuItemActionPerformed(evt);
            }
        });

        itemLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        itemLabel.setText("Item");

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblHeaderManageOrg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeaderManageOrg.setText("Manage Menu");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Assets/ManageMenu.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(itemLabel)
                                .addGap(18, 18, 18)
                                .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(priceLabel)
                                .addGap(18, 18, 18)
                                .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(25, 25, 25))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(167, 167, 167)
                            .addComponent(lblHeaderManageOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(btnAddMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(750, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemLabel)
                            .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceLabel)
                            .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(lblHeaderManageOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(303, 303, 303)
                    .addComponent(btnAddMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(354, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMenuItemActionPerformed

        //Type type = (Type) organizationJComboBox.getSelectedItem();
       PharmacyEnterprise restaurant = (PharmacyEnterprise) enterprise;
        HashMap menuItem = restaurant.getMenu();
        String item = txtItem.getText().trim();
        String price = txtItemPrice.getText().trim();
        Double itemPrice=0.0;
        try
        {
            itemPrice = Double.parseDouble(price);
            menuItem.put(item, itemPrice);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Price can only be integer");
            return;
        }
        
        //populateTable();
        txtItem.setText("");
        txtItemPrice.setText("");
        populateTable();
        
    }//GEN-LAST:event_btnAddMenuItemActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
     userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
 
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        PharmacyEnterprise restaurant = (PharmacyEnterprise) enterprise;
        HashMap menuItem = restaurant.getMenu();
        int selectedRow = organizationJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details", "Warning!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            //Organization organization = (Organization) organizationJTable.getValueAt(selectedRow, 1);
            String item = (String) organizationJTable.getValueAt(selectedRow, 0);
            menuItem.remove(item);
            //enterprise.getOrganizationDirectory().getOrganizations().remove(organization);
            populateTable();
            JOptionPane.showMessageDialog(null, "Item deleted!");
            
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMenuItem;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeaderManageOrg;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtItemPrice;
    // End of variables declaration//GEN-END:variables
}
