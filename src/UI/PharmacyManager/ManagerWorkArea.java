package UI.PharmacyManager;


//import UI.GovernmentTreasurerRole.*;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.Order.Order;
import NUHealthCare.Org.HealthOfficialOrg;
import NUHealthCare.Org.ManagerOrg;
import NUHealthCare.Org.Org;
import NUHealthCare.Org.FinancialOfficialOrg;
import NUHealthCare.Account.Account;
import NUHealthCare.JobQueue.GovtFundJob;
import NUHealthCare.JobQueue.LabTestJob;
import NUHealthCare.JobQueue.OrderJob;
import NUHealthCare.JobQueue.JobRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import UI.LabAttendant.LabAttendantProcessRequest;
import UI.GovtFinancialOfficial.*;


/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class ManagerWorkArea extends javax.swing.JPanel {
     private JPanel jPanel;
    private Account account;
    private ManagerOrg managerOrg;
    private Enterprise enterprise;
    List<Order> completed = new ArrayList<>();
    List<Order> inProgress = new ArrayList<>();
  /**
   * Creates new form ManagerWorkArea
   */
     public ManagerWorkArea(JPanel jpanel, Account account, Org org, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.jPanel = jpanel;
        this.managerOrg = (ManagerOrg) org;
        this.account = account;

        populateTable();
    }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnRequestGovSecretary = new javax.swing.JButton();
        btnEmail = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnCheckStats = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manger Work Area ");

        tblWorkRequest.setBackground(new java.awt.Color(204, 204, 204));
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Status", "Amount", "Message", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);

        btnAssign.setBackground(new java.awt.Color(153, 0, 0));
        btnAssign.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnRequestGovSecretary.setBackground(new java.awt.Color(153, 0, 0));
        btnRequestGovSecretary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRequestGovSecretary.setForeground(new java.awt.Color(255, 255, 255));
        btnRequestGovSecretary.setText("Process Request");
        btnRequestGovSecretary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestGovSecretaryActionPerformed(evt);
            }
        });

        btnEmail.setBackground(new java.awt.Color(153, 0, 0));
        btnEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEmail.setForeground(new java.awt.Color(255, 255, 255));
        btnEmail.setText("Send Email");
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(153, 0, 0));
        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Manage Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnCheckStats.setBackground(new java.awt.Color(153, 0, 0));
        btnCheckStats.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCheckStats.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckStats.setText("Check Order Stats");
        btnCheckStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckStatsActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Assets/NU_Health_footer.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMenu)
                        .addGap(33, 33, 33)
                        .addComponent(btnEmail)
                        .addGap(30, 30, 30)
                        .addComponent(btnAssign)
                        .addGap(31, 31, 31)
                        .addComponent(btnRequestGovSecretary)
                        .addGap(32, 32, 32)
                        .addComponent(btnCheckStats))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(242, 242, 242))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckStats, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequestGovSecretary, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
          int selectedRow = tblWorkRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            JobRequest request = (OrderJob) tblWorkRequest.getValueAt(selectedRow, 5);
            if (request.getStatus().equals("Sent to Pharma")) {
                request.setReceiver(account);
                request.setStatus("Pending on Manager");
                populateTable();
                JOptionPane.showMessageDialog(null, "Success !! Request is assigned to you ");
            } else {
                JOptionPane.showMessageDialog(null, "Can't assign this work request, as the work request is in " + request.getStatus() + " status", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }        
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnRequestGovSecretaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestGovSecretaryActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = tblWorkRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            OrderJob request = (OrderJob) tblWorkRequest.getValueAt(selectedRow, 5);
            if (request.getStatus().equalsIgnoreCase("Sent to Pharma")) {
                JOptionPane.showMessageDialog(null, "Please assign selected request first");
                return;
            }
            if (request.getStatus().equalsIgnoreCase("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request already completed", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!account.equals(request.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!account.equals(request.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!account.getEmployee().equals(request.getReceiver().getEmployee())) {
                JOptionPane.showMessageDialog(null, "Request assigned to other Officer", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (request.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Cannot process a Rejected Request", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            //request.setStatus("Processing");
            ManagerProcessRequest managerProcessWorkRequest = new ManagerProcessRequest(jPanel, request, enterprise, account);
            jPanel.add("ManagerProcessWorkRequestJPanel", managerProcessWorkRequest);
            CardLayout layout = (CardLayout) jPanel.getLayout();
            layout.next(jPanel);
        }
    
    }//GEN-LAST:event_btnRequestGovSecretaryActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        
            ManageMenu managerProcessWorkRequestJPanel = new ManageMenu(jPanel, enterprise);
            jPanel.add("MnagerProcessWorkRequestJPanel", managerProcessWorkRequestJPanel);
            CardLayout layout = (CardLayout) jPanel.getLayout();
            layout.next(jPanel);
     
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCheckStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckStatsActionPerformed
        // TODO add your handling code here:
        
        
        DefaultPieDataset defaultPieDataset = new DefaultPieDataset();
        defaultPieDataset.setValue("Orders still under Progress", inProgress.size());
        defaultPieDataset.setValue("Order Completed Successfully", completed.size());
        JFreeChart chart = ChartFactory.createPieChart("Order Status Pie Chart", defaultPieDataset, true, true, true);
        PiePlot piePlot =(PiePlot) chart.getPlot();
        ChartFrame frame = new ChartFrame("Order Status Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(500,500);
      
    }//GEN-LAST:event_btnCheckStatsActionPerformed

    private void btnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailActionPerformed
          // TODO add your handling code here:
          
           int selectedRow = tblWorkRequest.getSelectedRow();
        String to="";
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            OrderJob request = (OrderJob) tblWorkRequest.getValueAt(selectedRow, 5);
            to = request.getSender().getEmployee().getEmpEmail();
            SendEmailJPanel emailJPanel = new SendEmailJPanel(jPanel,to,"Pharma");
            jPanel.add("emailJPanel", emailJPanel);
            CardLayout layout = (CardLayout) jPanel.getLayout();
            layout.next(jPanel);
        }
        
    }//GEN-LAST:event_btnEmailActionPerformed

   public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkRequest.getModel();
        model.setRowCount(0);

        for (JobRequest request : managerOrg.getJobQueue().getJobRequestList()) {
            String status = request.getStatus();
            Object[] row = new Object[6];
            row[0] = request.getSender().getEmployee().getEmpName();
            if (status.equalsIgnoreCase("Sent to Pharma")) {
                row[1] = null;
            } else {
                row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getEmpName();
            }
            row[2] = status;
            row[3] = ((OrderJob) request).getBillAmt();
            row[4] = ((OrderJob) request).getMessage();
            row[5] = request;

            model.addRow(row);
            if(status.equals("Accepted"))
            {
              completed.add(((OrderJob) request).getOrder());
            }
            else
            {
               inProgress.add(((OrderJob) request).getOrder()); 
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnCheckStats;
    private javax.swing.JButton btnEmail;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRequestGovSecretary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}