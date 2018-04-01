/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.StudentData;
import domain.Student;
import domain.StudentAgro;
import domain.StudentEdu;
import domain.StudentInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josec
 */
public class ShowStudents extends javax.swing.JFrame {

    /**
     * Creates new form ShowStudents
     */
    private StudentData sData;
    ArrayList<Student> list;
    
    public ShowStudents() {
        try {
            this.sData=new StudentData();
            list=this.sData.readStudent();
            initComponents();
            
            ArrayList<StudentInfo> studentInfos = new ArrayList<>();
            ArrayList<StudentAgro> studentAgros = new ArrayList<>();
            ArrayList<StudentEdu> studentEdus = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getCarrer().equalsIgnoreCase("Computing")) {
                    studentInfos.add((StudentInfo) list.get(i));
                } else if (list.get(i).getCarrer().equalsIgnoreCase("Education")) {
                    studentEdus.add((StudentEdu) list.get(i));
                } else if (list.get(i).getCarrer().equalsIgnoreCase("Agronomy")) {
                    studentAgros.add((StudentAgro) list.get(i));
                }
            }
            
            String matriz[][] = new String[list.size()][2];
        

            int line = 0;
            for (int i = 0; i < studentAgros.size(); i++) {
                
                    matriz[line][0] = studentAgros.get(i).getName()+" "+
                            studentAgros.get(i).getLastName();
                    matriz[line][1] = studentAgros.get(i).getUid();
                    line++;
                
            }
            for (int i = 0; i < studentEdus.size(); i++) {
                
                    matriz[line][0] = studentEdus.get(i).getName()+" "+
                            studentEdus.get(i).getLastName();
                    matriz[line][1] = studentEdus.get(i).getUid();
                    line++;
                
            }
            for (int i = 0; i < studentInfos.size(); i++) {
                
                    matriz[line][0] = studentInfos.get(i).getName()+" "+
                            studentInfos.get(i).getLastName();
                    matriz[line][1] = studentInfos.get(i).getUid();
                    line++;   
            }
            
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    matriz,
                    new String[]{
                        "Name", "UID"
                    }
            ));
                
            
        
        } catch (IOException ex) {
            Logger.getLogger(ShowStudents.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ShowStudents.class.getName()).log(Level.SEVERE, null, ex);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "UID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText(" Registered students");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
//            java.util.logging.Logger.getLogger(ShowStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ShowStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ShowStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ShowStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowStudents().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}