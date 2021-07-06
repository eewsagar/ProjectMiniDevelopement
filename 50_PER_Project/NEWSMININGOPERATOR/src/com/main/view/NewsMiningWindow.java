package com.main.view;

import com.images.process.DocumentScanner;
import com.main.algos.LWCAlgorithm;
import com.main.algos.TraningDataSet;
import com.main.controller.ParcePDF;
import com.main.dto.LCWDTO;
import com.main.dto.NewsMiningDTO;
import com.main.services.MySQLConnection;
import com.main.services.NewsMiningService;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

public class NewsMiningWindow extends javax.swing.JFrame {

    private String txtId;
    private String txtUserType;

    public NewsMiningWindow() {
        initComponents();
    }

    public NewsMiningWindow(String txtId, String txtUserType) {
        initComponents();
        this.txtId = txtId;
        this.txtUserType = txtUserType;
        System.out.println("txtId = " + txtId);
        System.out.println("txtUserType = " + txtUserType);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtFileUplaod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        txtFullDetails = new javax.swing.JTextArea();
        btnClose = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NEWS MINING WINDOW");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "NEWS MINING", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 0, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("PLEASE ENTER FILE : ");

        txtFileUplaod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFileUplaodFocusGained(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("TEXT FROM FILE / PAST FILE HERE :");

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtFullDetails.setColumns(20);
        txtFullDetails.setRows(5);
        scroll.setViewportView(txtFullDetails);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/main/images/close.png"))); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/main/images/clear.png"))); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/main/images/update.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtFileUplaod, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnClose, btnSave});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFileUplaod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClear, btnClose, btnSave});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
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
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(670, 435));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFileUplaodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFileUplaodFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFileUplaodFocusGained

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String filter = txtFullDetails.getText().replaceAll("\n", " ");
        if (chkForTitle()) {
            String txtTitle = filter.substring(0, filter.indexOf("."));
            String txtCategory = "";
            ArrayList<LCWDTO> process = LWCAlgorithm.process(filter);
            for (LCWDTO lcwdto : process) {
                String sqlInsert = " INSERT INTO `tbl_tokanizing` (`txtToken`, `txtWeight`) VALUES ('" + lcwdto.getWord() + "', '" + lcwdto.getFrequncy() + "'); ";
                try {
                    MySQLConnection.preStateMent(sqlInsert).execute();
                } catch (Exception e) {
                }
            }
            ArrayList<LCWDTO> processTokanizing = processTokanizing();
            TraningDataSet traningDataSet = new TraningDataSet();
            for (LCWDTO lcwdto : process) {
                txtCategory = traningDataSet.filter(lcwdto.getWord());
                if (txtCategory.length() != 0) {
                    break;
                }
            }
            btnSave.setEnabled(false);
            mineNewsDetails(processTokanizing, txtCategory, txtTitle);
            new MiningResultWindow(process, processTokanizing, txtCategory).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "TITLE ALREADY EXISTS !!! ");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        btnSave.setEnabled(true);
        txtFullDetails.setText("");
        txtFileUplaod.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser("input/");
        jFileChooser.showOpenDialog(this);
        File selectedFile = jFileChooser.getSelectedFile();
        if (selectedFile != null) {
            String absolutePath = selectedFile.getAbsolutePath();
            if (absolutePath.endsWith("png")) {
                processForImage(absolutePath);
            } else {
                if (absolutePath.endsWith("txt") || absolutePath.endsWith("pdf") || absolutePath.endsWith("doc")) {
                    txtFileUplaod.setText(absolutePath);
                    scroll.requestFocus();
                    processFile(absolutePath);
                } else {
                    JOptionPane.showMessageDialog(this, "ENTER TEXT / .txt FILE ONLY !!! ");
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewsMiningWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextField txtFileUplaod;
    private javax.swing.JTextArea txtFullDetails;
    // End of variables declaration//GEN-END:variables

    private void processFile(String absolutePath) {
        if (absolutePath.endsWith("txt")) {
            try (FileInputStream fileInputStream = new FileInputStream(new File(absolutePath))) {
                byte[] readByte = new byte[fileInputStream.available()];
                fileInputStream.read(readByte);
                String extracted = new String(readByte);
                fileInputStream.close();
                txtFullDetails.setWrapStyleWord(true);
                txtFullDetails.setText(extracted);
            } catch (Exception exception) {
            }
        }
        if (absolutePath.endsWith("pdf")) {
            try {
                String parsePdf = ParcePDF.parsePdf(absolutePath);
                txtFullDetails.setText(parsePdf);
                txtFullDetails.setWrapStyleWord(true);
            } catch (IOException ex) {
                Logger.getLogger(NewsMiningWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private ArrayList<LCWDTO> processTokanizing() {
        String sqlSelect = "SELECT * FROM  `tbl_tokanizing` ORDER BY  `txtWeight` DESC LIMIT 0,10  ";
        ArrayList<LCWDTO> arrayList = new ArrayList<>();
        try {
            ResultSet executeQuery = MySQLConnection.preStateMent(sqlSelect).executeQuery();
            while (executeQuery.next()) {
                LCWDTO lcwdto = new LCWDTO();
                lcwdto.setWord(executeQuery.getString("txtToken"));
                lcwdto.setFrequncy(executeQuery.getString("txtWeight"));
                arrayList.add(lcwdto);
            }
            MySQLConnection.preStateMent("TRUNCATE TABLE  `tbl_tokanizing` ").execute();
        } catch (Exception e) {
        }
        return arrayList;
    }

    private void mineNewsDetails(ArrayList<LCWDTO> processTokanizing, String txtCategory, String title) {
        int i = 0;
        for (LCWDTO lcwdto : processTokanizing) {
            i = i + Integer.parseInt(lcwdto.getFrequncy());
        }
//        byte[] encodedBytes = Base64.encodeBase64(txtFullDetails.getText().getBytes());
//        System.out.println("encodedBytes = " + encodedBytes);

        NewsMiningDTO newsMiningDTO = new NewsMiningDTO();
        newsMiningDTO.setByUser(txtId);
        newsMiningDTO.setByUser(txtUserType);
        newsMiningDTO.setTitle(title.replaceAll("'", ""));
        newsMiningDTO.setTotalWeight(i + "");
        newsMiningDTO.setCategory(txtCategory);
        newsMiningDTO.setFilePath(txtFullDetails.getText().toString().replaceAll("'", ""));
        newsMiningDTO.setToken1(processTokanizing.get(1).getWord());
        newsMiningDTO.setToken2(processTokanizing.get(2).getWord());
        newsMiningDTO.setToken3(processTokanizing.get(3).getWord());
        newsMiningDTO.setToken4(processTokanizing.get(4).getWord());
        newsMiningDTO.setToken5(processTokanizing.get(5).getWord());
        newsMiningDTO.setToken6(processTokanizing.get(6).getWord());
        newsMiningDTO.setToken7(processTokanizing.get(7).getWord());
        newsMiningDTO.setToken8(processTokanizing.get(8).getWord());
        NewsMiningService.saveNewsMining(newsMiningDTO);
        checkCategory(txtCategory);
    }

    private void checkCategory(String cat) {
        String sqlSelect = "SELECT txtCategory FROM  `tbl_category` WHERE txtCategory = '" + cat.toLowerCase() + "' ";
//        System.out.println("sqlSelect = " + sqlSelect);
        String avaiCat = "";
        try {
            ResultSet executeQuery = MySQLConnection.preStateMent(sqlSelect).executeQuery();
            while (executeQuery.next()) {
                String string = executeQuery.getString("txtCategory");
                avaiCat = string;
            }
            if (avaiCat.length() == 0) {
                String insert = "INSERT INTO  `tbl_category`(`txtCategory`) VALUES ('" + cat.toLowerCase() + "')";
                MySQLConnection.preStateMent(insert).execute();
            }
        } catch (Exception e) {
        }
    }

    private void processForImage(String absolutePath) {
        String textFromImage = DocumentScanner.getTextFromImage(absolutePath);
        txtFileUplaod.setText(absolutePath);
        txtFullDetails.setText(textFromImage);
    }

    private boolean chkForTitle() {
        String[] split = txtFullDetails.getText().split("\n");
        String trim = split[0].trim();
        String result = trim.substring(0, trim.length() - 1);
        String sql = " SELECT * FROM tbl_newsmining  WHERE  txtSearchText LIKE '%" + result + "%' ";
        System.out.println("sql = " + sql);
        try {
            ResultSet executeQuery = MySQLConnection.preStateMent(sql).executeQuery();
            while (executeQuery.next()) {
                return false;
            }

        } catch (Exception e) {
        }
        return true;
    }
}
