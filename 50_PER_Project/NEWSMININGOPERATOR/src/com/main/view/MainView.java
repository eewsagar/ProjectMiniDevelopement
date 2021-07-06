package com.main.view;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.main.dto.NewsMiningDTO;
import com.main.model.NewsMiningTableModel;
import com.main.refector.TableSetting;
import com.main.services.NewsMiningService;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainView extends javax.swing.JFrame {

    private String txtId;
    private String txtUserType;

    public MainView() {
        initComponents();
        loadNewsTable();
    }

    public MainView(String txtId, String txtUserType) {
        initComponents();
        this.txtId = txtId;
        loadNewsTable();
        this.txtUserType = txtUserType;
        System.out.println("txtId = " + txtId);
        System.out.println("txtUserType = " + txtUserType);
        if (txtUserType.toLowerCase().equals("operator")) {
            btnOperator.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRefresh = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnOperator = new javax.swing.JButton();
        btnNewsMining = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Window");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204))));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/main/images/head.png"))); // NOI18N
        jPanel2.add(jLabel1, java.awt.BorderLayout.LINE_START);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204))));

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/main/images/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/main/images/close.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnOperator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/main/images/addUser.png"))); // NOI18N
        btnOperator.setText("ADD OPERATOR ");
        btnOperator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperatorActionPerformed(evt);
            }
        });

        btnNewsMining.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/main/images/print.png"))); // NOI18N
        btnNewsMining.setText("NEWS MINING");
        btnNewsMining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewsMiningActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/main/images/ocr.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOperator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNewsMining, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClose, btnNewsMining, btnOperator, btnRefresh});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNewsMining)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addGap(18, 18, 18)
                .addComponent(btnClose)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClose, btnNewsMining, btnOperator, btnRefresh});

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204))));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(900, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperatorActionPerformed
        // TODO add your handling code here:
        new OperatorWindow().setVisible(true);
    }//GEN-LAST:event_btnOperatorActionPerformed

    private void btnNewsMiningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewsMiningActionPerformed
        // TODO add your handling code here:
        new NewsMiningWindow(txtId, txtUserType).setVisible(true);
    }//GEN-LAST:event_btnNewsMiningActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Properties props = new Properties();
                    props.put("logoString", " ");
                    AcrylLookAndFeel.setCurrentTheme(props);
                    UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                    new MainView().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNewsMining;
    private javax.swing.JButton btnOperator;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void loadNewsTable() {
        ArrayList<NewsMiningDTO> searchOrListNewsMining = NewsMiningService.searchOrListNewsMining("", "all");
        jTable1.setModel(new NewsMiningTableModel(searchOrListNewsMining));
        TableSetting.setTable(jTable1);
    }
}
