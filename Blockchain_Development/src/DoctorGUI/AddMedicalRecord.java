package DoctorGUI;

import Classes.Doctor;
import Classes.Patient;
import HelperClass.Block;
import HelperClass.Blockchain;
import HelperClass.Hasher;
import HelperClass.KeyAccess;
import java.security.PrivateKey;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddMedicalRecord extends javax.swing.JFrame {
    final private static String filePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") + "Database";
    private String doctorId;
    
    public AddMedicalRecord() {
        initComponents();
        Blockchain bc = Blockchain.getInstance(filePath + "/master/chain.bin");
        for(Block block : bc.get()){
            if(Hasher.sha256(txtUserId.getText()) == block.blockHeader.getUserIdHash()) {
                String pastMedicalRecord = block.tranxList.toString();
                String[] data = pastMedicalRecord.split("\\|");
                
                if(data[0] != "Create new patient account"){
                    txtMedicalRecord.setText(data[0]);
                }
            }
        }
    }
    
    public AddMedicalRecord(String userId) {
        doctorId = userId;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtContactNum = new javax.swing.JTextField();
        txtICPassport = new javax.swing.JTextField();
        txtUserId = new javax.swing.JTextField();
        txtMedicalRecord = new javax.swing.JTextField();
        btnAddMedicalRecord = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDoctorNote = new javax.swing.JTextArea();
        cmbAppointmentId = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jLabel3.setText("IC Number / Passport");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Manage Medical Records");

        jLabel4.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jLabel4.setText("Contact Number");

        btnBack.setBackground(new java.awt.Color(102, 153, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        btnBack.setText("Back");

        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jLabel2.setText("Full Name");

        jLabel11.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jLabel11.setText("Doctor's Note");

        jLabel9.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jLabel9.setText("NFC bar-code");

        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jLabel10.setText("History Medical Record");

        txtName.setBackground(new java.awt.Color(153, 153, 153));
        txtName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtContactNum.setBackground(new java.awt.Color(153, 153, 153));
        txtContactNum.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtICPassport.setBackground(new java.awt.Color(153, 153, 153));
        txtICPassport.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtICPassport.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtUserId.setEditable(false);
        txtUserId.setBackground(new java.awt.Color(153, 153, 153));
        txtUserId.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtMedicalRecord.setBackground(new java.awt.Color(153, 153, 153));
        txtMedicalRecord.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnAddMedicalRecord.setBackground(new java.awt.Color(102, 153, 255));
        btnAddMedicalRecord.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        btnAddMedicalRecord.setText("Add Medical Record");
        btnAddMedicalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMedicalRecordActionPerformed(evt);
            }
        });

        txtDoctorNote.setColumns(20);
        txtDoctorNote.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtDoctorNote.setRows(5);
        jScrollPane2.setViewportView(txtDoctorNote);

        jLabel5.setText("Appointment ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(157, 157, 157)
                .addComponent(btnBack)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtContactNum)
                        .addComponent(txtICPassport)
                        .addComponent(txtName)
                        .addComponent(txtUserId)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel9))
                            .addGap(53, 53, 53))
                        .addComponent(cmbAppointmentId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(txtMedicalRecord)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(btnAddMedicalRecord, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMedicalRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnAddMedicalRecord)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtICPassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(9, 9, 9)
                        .addComponent(txtContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMedicalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMedicalRecordActionPerformed
        try {
            String userId, doctorNote;
            userId = txtUserId.getText();
            doctorNote = txtDoctorNote.getText();
            // save into blockchain
            String priFilePath = filePath + "/KeyPair/Patient/PrivateKey/" + doctorId;
            PrivateKey doctorPrivateKey = KeyAccess.getPrivateKey(priFilePath);
            Doctor.saveMedicalRecordIntoBlockchain(userId, doctorNote, doctorPrivateKey);
        } catch (Exception ex) {
            Logger.getLogger(AddMedicalRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddMedicalRecordActionPerformed

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
            java.util.logging.Logger.getLogger(AddMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicalRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMedicalRecord;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbAppointmentId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtContactNum;
    private javax.swing.JTextArea txtDoctorNote;
    private javax.swing.JTextField txtICPassport;
    private javax.swing.JTextField txtMedicalRecord;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
