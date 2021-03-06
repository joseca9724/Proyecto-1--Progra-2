/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.LoanData;
import data.MaterialData;
import domain.Audiovisual;
import domain.Book;
import domain.Loan;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Josec
 */
public class Devolution extends javax.swing.JFrame {

    /**
     * Creates new form Devolution
     */
    private LoanData lData;
    private MaterialData mData;
    
    ArrayList<Audiovisual> listA;
    private Audiovisual auxA;
    
    ArrayList<Book> listB;
    private Book auxB;
    private DateFormat dateFormat;
    
    ArrayList<Loan> listL;
    private Loan loanAux;
    
    private String uid;
    
    public Devolution() {
        try {
            dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            this.mData = new MaterialData();
            this.lData = new LoanData();
            listA = this.mData.readAudiovisual();
            listB = this.mData.readBook();
            listL = this.lData.loanList();
            loanAux = new Loan();
            initComponents();
        } catch (IOException ex) {
            Logger.getLogger(Devolution.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Devolution.class.getName()).log(Level.SEVERE, null, ex);
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEnterUID = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jButtonSelect = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonReturn = new javax.swing.JButton();
        jTextFieldUID = new javax.swing.JTextField();
        jTextFieldMaterial = new javax.swing.JTextField();
        jTextFieldPenalty = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material Identification", "Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("UID:");

        jButtonSearch.setText("Search for loans");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonSelect.setText("Select Loan");
        jButtonSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectActionPerformed(evt);
            }
        });

        jLabel2.setText("Studen ID:");

        jLabel3.setText("Material:");

        jLabel4.setText("Penalty fee:");

        jButtonReturn.setText("Return Material");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });

        jTextFieldUID.setEditable(false);

        jTextFieldMaterial.setEditable(false);

        jTextFieldPenalty.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Devolution Part");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButtonSelect))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEnterUID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldUID, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jTextFieldMaterial)
                            .addComponent(jTextFieldPenalty))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonReturn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(96, 96, 96))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldEnterUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSearch)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonSelect)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPenalty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonReturn)
                        .addGap(65, 65, 65))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        try {
            // TODO add your handling code here:
            this.listL=lData.loanList();
            String matriz[][] = new String[listL.size()][2];
            int line = 0;
            this.uid=jTextFieldEnterUID.getText();
            for (int i = 0; i < listL.size(); i++) {
                if(!this.uid.equals("")){
                    if (listL.get(i).getUidStudent().equalsIgnoreCase(jTextFieldEnterUID.getText())){
                        matriz[line][0] = listL.get(i).getSerieMaterial();
                        if(listL.get(i).getReturned()){
                            matriz[line][1] = "Returned";
                        }
                        else{
                            matriz[line][1] = "On loan";
                        }
                        line++;
                    }
                }
            }
            String mShow[][] = new String[line][2];
            for (int i = 0; i <mShow.length; i++) {
                for (int j = 0; j <mShow[i].length; j++) {
                    mShow[i][j]=matriz[i][j];
                    
                }
            }
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    mShow,
                    new String[]{
                        "Material Identification", "Status"
                    }
            ));
        } catch (IOException ex) {
            Logger.getLogger(Devolution.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectActionPerformed
        // TODO add your handling code here:
        int penalty = 0;
        jTextFieldUID.setText(jTextFieldEnterUID.getText());
        jTextFieldMaterial.setText((String)jTable1.getValueAt(jTable1.getSelectedRow(),0));
        for (int i = 0; i < listL.size(); i++) {
            if (this.uid.equals(listL.get(i).getUidStudent())
                    && ((String)jTable1.getValueAt(jTable1.getSelectedRow(),0)).equals(listL.get(i).getSerieMaterial())) {
                this.loanAux = listL.get(i);
            }
            System.out.println(loanAux);
        }
//        try {
//            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//            String inicialD = loanAux.getDate();
//            String finalD = loanAux.getDate2();
//            Date inicialDate=dateFormat.parse(inicialD);
//            Date finalDate=dateFormat.parse(finalD);
//            int days = (int)((finalDate.getTime()-inicialDate.getTime())/86400000);
//            if(days<0){
//                penalty = days*-200;
//            }
//            else{
//                penalty = 0;
//            }
            loanAux.setPenalty(loanAux.penaltyFee());
            jTextFieldPenalty.setText(loanAux.getPenalty()+"");
//        } catch (ParseException ex) {
//            Logger.getLogger(Loan.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jButtonSelectActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
        try {
            // TODO add your handling code here:
            if(jTextFieldUID.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane,"Error, empty spaces on devolution part",null,0);
            }
            else if(((String)jTable1.getValueAt(jTable1.getSelectedRow(),1)).equals("Returned")){
                JOptionPane.showMessageDialog(rootPane,"Loan already returned",null,1);
                jTextFieldUID.setText("");
                jTextFieldMaterial.setText("");
                jTextFieldPenalty.setText("");
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][]{},
                    new String[]{
                        "Material Identification", "Status"
                    }
            ));
            }
            else{
            lData.updatedLoan(jTextFieldUID.getText(), jTextFieldMaterial.getText());
            if(jTextFieldMaterial.getText().length()==5){
                for (int i = 0; i <listA.size(); i++) {
                    if(jTextFieldMaterial.getText().equals(listA.get(i).getSerial())){
                        mData.updateAudioUsedFalse(listA.get(i));
                    }
                }
            }
            else{
                for (int i = 0; i <listB.size(); i++) {
                    if(jTextFieldMaterial.getText().equals(listB.get(i).getIsbn())){
                        mData.updateBookUp(listB.get(i));
                    }
                }
            }
            listL = this.lData.loanList();
            JOptionPane.showMessageDialog(rootPane,"Loan Returned successfully",null,1);
            jTextFieldEnterUID.setText("");
            jTextFieldMaterial.setText("");
            jTextFieldPenalty.setText("");
            jTextFieldUID.setText("");
           
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][]{},
                    new String[]{
                        "Material Identification", "Status"
                    }
            ));
            }
        } catch (IOException ex) {
            Logger.getLogger(Devolution.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Devolution.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonReturnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Devolution.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Devolution.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Devolution.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Devolution.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Devolution().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldEnterUID;
    private javax.swing.JTextField jTextFieldMaterial;
    private javax.swing.JTextField jTextFieldPenalty;
    private javax.swing.JTextField jTextFieldUID;
    // End of variables declaration//GEN-END:variables
}
