package com.main.view;

import com.main.controller.InputValidor;
import com.main.dto.UserDTO;
import com.main.services.UserService;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static org.omg.IOP.CodecPackage.InvalidTypeForEncodingHelper.id;

public class LoginWindow extends javax.swing.JFrame {

    public LoginWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labCode = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnPayAmt = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Window");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        labCode.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labCode.setForeground(new java.awt.Color(102, 102, 102));
        labCode.setText("USER NAME :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("PASSWORD : ");

        btnPayAmt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/main/images/update.png"))); // NOI18N
        btnPayAmt.setText("LOGIN");
        btnPayAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayAmtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnPayAmt)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(labCode)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPassword, txtUserName});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPayAmt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtPassword, txtUserName});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(296, 258));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPayAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayAmtActionPerformed
        // TODO add your handling code here:

        String password = txtPassword.getText().trim();
        String userName = txtUserName.getText().trim();

        if (InputValidor.validateText(userName, "Enter proper user name !!!", this)) {
            if (InputValidor.validateText(password, "Enter proper password !!!", this)) {

                String searchQuery = "SELECT * FROM tbl_user WHERE userName = '" + userName + "' AND password = '" + password + "'  ";
                ArrayList<UserDTO> searchOrListUser = UserService.searchOrListUser(searchQuery, "query");
                System.out.println("searchOrListUser = " + searchOrListUser);
                if (!searchOrListUser.isEmpty()) {
                    new MainView(searchOrListUser.get(0).getID(),searchOrListUser.get(0).getUserType()).setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "ENTER PROPER LOGIN DETAILS !!!");
                }

            } else {
                txtPassword.requestFocus();
            }
        } else {
            txtUserName.requestFocus();
        }


    }//GEN-LAST:event_btnPayAmtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPayAmt;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labCode;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

}
