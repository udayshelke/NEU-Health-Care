/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.InsuranceAgent;

import NUHealthCare.Account.Account;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.JobQueue.InsuranceJob;
import NUHealthCare.Map.SMS;
import NUHealthCare.Map.SendEmail;
import NUHealthCare.Org.InsuranceTreasurerOrg;
import NUHealthCare.Org.Org;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class InsuranceProcessRequest extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceProcessRequest
     */
    private JPanel userProcessContainer;
    private Account account;
    private Enterprise enterprise;
    private InsuranceJob insuranceJob;

    public InsuranceProcessRequest(JPanel userProcessContainer, Account account, Enterprise enterprise, InsuranceJob insuranceJob) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.insuranceJob = insuranceJob;
        this.account = account;
        populateFields();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCustomersName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtMessages = new javax.swing.JTextField();
        txtClaimAmounts = new javax.swing.JTextField();
        txtBillAmounts = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnRejectRequest = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPolicyNumbers = new javax.swing.JTextField();
        btnAcceptSend = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Process Claim Request");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total Bill Amount");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Policy Number");

        txtCustomersName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCustomersName.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Message");

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtMessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessagesActionPerformed(evt);
            }
        });

        txtClaimAmounts.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtClaimAmounts.setEnabled(false);

        txtBillAmounts.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtBillAmounts.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Claim Amount");

        btnRejectRequest.setBackground(new java.awt.Color(153, 0, 0));
        btnRejectRequest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRejectRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnRejectRequest.setText("Reject Request");
        btnRejectRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectRequestActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Customer Name");

        txtPolicyNumbers.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPolicyNumbers.setEnabled(false);

        btnAcceptSend.setBackground(new java.awt.Color(153, 0, 0));
        btnAcceptSend.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAcceptSend.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceptSend.setText("Accept and Send Request To Finance");
        btnAcceptSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptSendActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Assets/NU_Health_footer.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPolicyNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCustomersName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(17, 17, 17)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtBillAmounts)
                                        .addComponent(txtClaimAmounts, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAcceptSend, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRejectRequest))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBillAmounts, txtClaimAmounts, txtCustomersName, txtMessages, txtPolicyNumbers});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAcceptSend, btnRejectRequest});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPolicyNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCustomersName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBillAmounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtClaimAmounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnAcceptSend, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnRejectRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAcceptSend, btnRejectRequest});

    }// </editor-fold>//GEN-END:initComponents

    private void txtMessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessagesActionPerformed

    private void btnAcceptSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptSendActionPerformed
        String message = txtMessages.getText();
        String sub = "Your Insurance claim is approved";
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
            insuranceJob.setMessage(message);
            int dialogResult = JOptionPane.showConfirmDialog(null,
                    "Do you want to proceed?");

            if (dialogResult == JOptionPane.YES_OPTION) {
                Org org = null;
                for (Org organization
                        : enterprise.getOrgDirectory().
                                getOrganizations()) {
                    if (organization instanceof InsuranceTreasurerOrg) {
                        org = organization;
                        break;
                    }
                }

                if (org != null) {
                    org.getJobQueue().getJobRequestList().add(insuranceJob);
                    account.getJobQueue().getJobRequestList().add(insuranceJob);
                }

                JOptionPane.showMessageDialog(null,
                        "Request Approved and Sent To Finance Department");
                insuranceJob.setStatus("Sent To Finance Department");
                insuranceJob.setAgent(account.getEmployee().
                        getEmpName());
                insuranceJob.setReceiver(null);

                txtMessages.setText("");
                btnRejectRequest.setEnabled(false);
                btnAcceptSend.setEnabled(false);
                try {
                    SendEmail.send(insuranceJob.getCustomerEmail(), "\nHi "
                            + insuranceJob.getInsuranceCustomer().
                                    getCustomerFName() + ","
                            + "\n\nYour Insurance claim of amount: " + insuranceJob.
                                    getClaimAmount()
                            + " is approved" + "\n\n\nThanks\n" + insuranceJob.
                                    getInsuranceCompany(), sub);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Email Sent");
                    System.out.println(ex.getMessage());
                }
                //Send SMS
                try {
                    SMS.SendSMS("+18573138300", "Hi " + insuranceJob.
                            getInsuranceCustomer().
                            getCustomerFName() + ","
                            + "\n\nYour Insurance claim of amount: " + insuranceJob.
                                    getClaimAmount()
                            + " is approved" + "\n\nThanks,\n" + insuranceJob.
                                    getInsuranceCompany());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                //Send SMS end

            }
            txtMessages.setText("");
        }
    }//GEN-LAST:event_btnAcceptSendActionPerformed

    private void btnRejectRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectRequestActionPerformed
        String message = txtMessages.getText();
        String sub = "Your Insurance claim is rejected";
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
            insuranceJob.setMessage(message);

            int dialogResult = JOptionPane.showConfirmDialog(null,
                    "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {

                insuranceJob.setStatus("Rejected");
                insuranceJob.setMessage(txtMessages.getText().
                        trim());
                insuranceJob.setAgent(account.getEmployee().
                        getEmpName());
                try {
                    SendEmail.send(insuranceJob.getCustomerEmail(), "\nHi "
                            + insuranceJob.getInsuranceCustomer().
                                    getCustomerFName() + ","
                            + "\n\nYour Insurance claim of amount: " + insuranceJob.
                                    getClaimAmount()
                            + " is rejected" + "\nMessage: " + message + "\n\n\nThanks\n"
                            + insuranceJob.getInsuranceCompany(), sub);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Email Sent");
                    System.out.println(ex.getMessage());
                }
                //Send SMS
                try {
                    SMS.SendSMS("+18573138300", "Hi " + insuranceJob.
                            getInsuranceCustomer().
                            getCustomerFName() + ","
                            + "\n\nYour Insurance claim of amount: " + insuranceJob.
                                    getClaimAmount()
                            + " is rejected" + "\nMessage: " + message + "\n\nThanks,\n"
                            + insuranceJob.getInsuranceCompany());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                //Send SMS end
                txtMessages.setText("");
                btnRejectRequest.setEnabled(false);
                btnAcceptSend.setEnabled(false);
            }
            txtMessages.setText("");
        }
    }//GEN-LAST:event_btnRejectRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AllInsuranceRequests allInsuranceRequests = (AllInsuranceRequests) component;
        allInsuranceRequests.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptSend;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRejectRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtBillAmounts;
    private javax.swing.JTextField txtClaimAmounts;
    private javax.swing.JTextField txtCustomersName;
    private javax.swing.JTextField txtMessages;
    private javax.swing.JTextField txtPolicyNumbers;
    // End of variables declaration//GEN-END:variables

    private void populateFields() {
        txtPolicyNumbers.setText(insuranceJob.getPolicyNumber());
        txtCustomersName.setText(insuranceJob.getInsuranceCustomer().
                getCustomerFName() + " " + insuranceJob.getInsuranceCustomer().getCustomerLName());
        txtBillAmounts.setText(String.valueOf(insuranceJob.getBillAmount()));
        txtClaimAmounts.setText(String.valueOf(insuranceJob.getClaimAmount()));
    }
}
