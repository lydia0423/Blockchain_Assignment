package NurseGUI;

import Classes.Admin;
import Classes.Patient;
import HelperClass.Asymmetric;
import HelperClass.KeyAccess;
import java.security.PrivateKey;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NewAccountRegistration extends javax.swing.JFrame {
    final private static String filePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") + "Database";
    
    public NewAccountRegistration() {
        initComponents();
        txtUserId.setEditable(false);
        txtUserId.setText(Patient.generatePatientId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtContactNum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtICPassport = new javax.swing.JTextField();
        txtUserId = new javax.swing.JTextField();
        txtRelatives = new javax.swing.JTextField();
        cmbNationality = new javax.swing.JComboBox<>();
        dpDOB = new com.github.lgooddatepicker.components.DatePicker();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));

        jLabel1.setText("New Patient Account Registration");
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N

        jLabel2.setText("Full Name");
        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        jLabel3.setText("IC Number / Passport");
        jLabel3.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        jLabel4.setText("Contact Number");
        jLabel4.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        jLabel5.setText("Address");
        jLabel5.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        jLabel6.setText("Date of Birth");
        jLabel6.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        jLabel7.setText("Relatives");
        jLabel7.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        jLabel8.setText("Nationality");
        jLabel8.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        jLabel9.setText("NFC bar-code");
        jLabel9.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        btnBack.setText("Back");
        btnBack.setBackground(new java.awt.Color(102, 153, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N

        btnSignUp.setText("Sign Up");
        btnSignUp.setBackground(new java.awt.Color(102, 153, 255));
        btnSignUp.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtContactNum.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        txtICPassport.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtUserId.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtRelatives.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        cmbNationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Malaysia", "Foreign" }));
        cmbNationality.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel10.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txtICPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(cmbNationality, 0, 200, Short.MAX_VALUE)
                                    .addComponent(txtUserId, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jLabel9)
                                    .addComponent(dpDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEmail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(btnSignUp))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRelatives, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(55, 55, 55))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(123, 123, 123)
                .addComponent(btnBack)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSignUp)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnBack))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dpDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRelatives, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtICPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        try {
            String userId, name, icOrPassportNumber, email, contactNumber, address, dob, relatives, nationality;
            userId = txtUserId.getText();
            name = txtName.getText();
            icOrPassportNumber = txtICPassport.getText();
            email = txtEmail.getText();
            contactNumber = txtContactNum.getText();
            address = txtAddress.getText();
            dob = dpDOB.getDate().toString();
            relatives = txtRelatives.getText();
            nationality = cmbNationality.getSelectedItem().toString();
            // verify all the inputs are filled
            if(name.isEmpty() || icOrPassportNumber.isEmpty() || email.isEmpty() || contactNumber.isEmpty() || dob.isEmpty() || address.isEmpty() || relatives.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please ensure that all fields have been filled in", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
                return;
            }   
            
            // create an instance Patient and save it to the database
            Patient patient = new Patient(userId, name, icOrPassportNumber, contactNumber, email, address, dob, relatives, nationality);
            Patient.savePatientRegistration(patient);
            
            // save into blockchain
            String priFilePath = filePath + "/KeyPair/Patient/PrivateKey/" + userId;
            PrivateKey patientPrivateKey = KeyAccess.getPrivateKey(priFilePath);
            Patient patientBlockchain = new Patient(userId);
            Patient.savePatientRegistrationIntoBlockchain(patientBlockchain, patientPrivateKey);
            
            int n = JOptionPane.showConfirmDialog(null, "Registration has been saved. Add another admin account?", "Admin account added", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
            if(n == JOptionPane.YES_NO_OPTION){
                // if yes, reset the form
                txtName.setText("");
                txtICPassport.setText("");
                txtEmail.setText("");
                txtAddress.setText("");
                txtContactNum.setText("");
                txtRelatives.setText("");
                dpDOB.setDateToToday();
                txtUserId.setText(Admin.generateAdminId());
            }
        } catch (Exception ex) {
            Logger.getLogger(NewAccountRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewAccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAccountRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox<String> cmbNationality;
    private com.github.lgooddatepicker.components.DatePicker dpDOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContactNum;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtICPassport;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRelatives;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
