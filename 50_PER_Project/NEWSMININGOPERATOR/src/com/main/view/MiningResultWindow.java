package com.main.view;

import com.main.dto.LCWDTO;
import java.util.ArrayList;

public class MiningResultWindow extends javax.swing.JFrame {

    public MiningResultWindow() {
        initComponents();
    }

    public MiningResultWindow(ArrayList<LCWDTO> process, ArrayList<LCWDTO> processTokanizing, String txtCategory) {
        initComponents();
        String token = "N-GRAM\tTOKEN\n";
        String miner = "N-GRAM\tMINE\n";
        for (LCWDTO lcwdto : processTokanizing) {
            token = token + "" + lcwdto.getFrequncy() + "\t" + lcwdto.getWord() + "\n";
        }
        txtSelectedWord.setText(token);
        for (LCWDTO lcwdto : process) {
            miner = miner + "" + lcwdto.getFrequncy() + "\t" + lcwdto.getWord() + "\n";
        }
        txtMingWord.setText(miner);
        if (txtCategory.length() == 0) {
            txtCategoryChoose.setText("unknown");
        } else {
            txtCategoryChoose.setText(txtCategory);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCategoryChoose = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMingWord = new javax.swing.JTextArea();
        btnClose = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSelectedWord = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NEWS MINING WINDOW");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "NEWS MINING", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 0, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("CATEGORY DETECTED :");

        txtCategoryChoose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCategoryChooseFocusGained(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("MINE WORD SELECTED :");

        txtMingWord.setColumns(20);
        txtMingWord.setRows(5);
        jScrollPane1.setViewportView(txtMingWord);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/main/images/close.png"))); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        txtSelectedWord.setColumns(20);
        txtSelectedWord.setRows(5);
        jScrollPane2.setViewportView(txtSelectedWord);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCategoryChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCategoryChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
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
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(582, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCategoryChooseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCategoryChooseFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCategoryChooseFocusGained

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
                new MiningResultWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCategoryChoose;
    private javax.swing.JTextArea txtMingWord;
    private javax.swing.JTextArea txtSelectedWord;
    // End of variables declaration//GEN-END:variables

}
