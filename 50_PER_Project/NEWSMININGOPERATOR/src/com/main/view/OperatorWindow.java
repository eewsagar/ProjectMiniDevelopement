package com.main.view;

import com.main.controller.DateUtil;
import com.main.controller.InputValidor;
import com.main.dto.OperatorDTO;
import com.main.dto.UserDTO;
import com.main.services.OperatorService;
import com.main.services.UserService;
import javax.swing.JOptionPane;

public class OperatorWindow extends javax.swing.JFrame {

    public OperatorWindow() {
        initComponents();
        txtEntryDate.setText(DateUtil.getCurrentDate());
        txtCodeNumber.setText("" + getCodeNumber());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labCode = new javax.swing.JLabel();
        txtCodeNumber = new javax.swing.JTextField();
        txtEntryDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtContatNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD OPERATOR WINDOW");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), " Customer Entry Form ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 0, 14))); // NOI18N

        labCode.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labCode.setForeground(new java.awt.Color(102, 102, 102));
        labCode.setText("Code Number");

        txtCodeNumber.setFocusable(false);

        txtEntryDate.setFocusable(false);
        txtEntryDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEntryDateMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Entry Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Full Name");

        txtFullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFullNameFocusGained(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Contact No");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("EMail Id");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("User Name");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Password ");

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/main/images/addUser.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/main/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/main/images/close.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnClose, btnSave});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClear, btnClose, btnSave});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labCode))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtEntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContatNo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPassword, txtUserName});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCode)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtPassword, txtUserName});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(375, 371));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEntryDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEntryDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntryDateMouseClicked

    private void txtFullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameFocusGained

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String fullName = txtFullName.getText().trim();
        String userName = txtUserName.getText().trim();
        String codeNumber = txtCodeNumber.getText().trim();
        String contatNo = txtContatNo.getText().trim();
        String password = txtPassword.getText().trim();
        String emailId = txtEmailId.getText().trim();

        String searchQuery = "SELECT * FROM tbl_user WHERE userName = '" + userName + "' ";
        if (UserService.searchOrListUser(searchQuery, "query").isEmpty()) {
            if (InputValidor.validateText(fullName, "Enter proper full name !!!", this)) {
                if (InputValidor.validateEMail(emailId, "Enter proper email id !!!", this)) {
                    if (InputValidor.validateInteger(this, contatNo, "Enter proper contat no !!!")) {
                        if (InputValidor.validateText(userName, "Enter proper user name !!!", this)) {
                            if (InputValidor.validateText(password, "Enter proper password !!!", this)) {
                                OperatorDTO dTO = new OperatorDTO();
                                dTO.setFullName(fullName);
                                dTO.setUserName(userName);
                                dTO.setCodeNumber(codeNumber);
                                dTO.setContatNo(contatNo);
                                dTO.setPassword(password);
                                dTO.setEntryDate(DateUtil.getCurrentDate());
                                dTO.setEmailId(emailId);
                                Integer saveOperator = OperatorService.saveOperator(dTO);
                                if (saveOperator != null) {
                                    UserDTO userDTO = new UserDTO();
                                    userDTO.setUserType("operator");
                                    userDTO.setUserName(userName);
                                    userDTO.setPassword(password);
                                    userDTO.setEntryDate(txtEntryDate.getText());
                                    UserService.saveUser(userDTO);
                                    JOptionPane.showMessageDialog(this, "OPERATOR ADDED SUCESSFULLY !!!");
                                    txtCodeNumber.setText("" + getCodeNumber());
                                }
                            } else {
                                txtPassword.requestFocus();
                            }
                        } else {
                            txtUserName.requestFocus();
                        }
                    } else {
                        txtContatNo.requestFocus();
                    }
                } else {
                    txtEmailId.requestFocus();
                }
            } else {
                txtFullName.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "ENTER DIFFERNT USERNAME !!! ");
            txtUserName.setText("");
            txtUserName.requestFocus();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        // TODO add your handling code here:
        txtFullName.setText("");
        txtUserName.setText("");
        txtContatNo.setText("");
        txtPassword.setText("");
        txtEntryDate.setText(DateUtil.getCurrentDate());
        txtEmailId.setText("");
        txtCodeNumber.setText("" + getCodeNumber());
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperatorWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labCode;
    private javax.swing.JTextField txtCodeNumber;
    private javax.swing.JTextField txtContatNo;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEntryDate;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private String getCodeNumber() {

        String string = System.currentTimeMillis() + "";
        return string.substring(7, string.length() - 1);

    }

}
