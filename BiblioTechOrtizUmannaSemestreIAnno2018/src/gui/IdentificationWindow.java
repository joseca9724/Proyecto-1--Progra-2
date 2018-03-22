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
import javax.swing.JOptionPane;

/**
 *
 * @author byron
 */
public class IdentificationWindow extends javax.swing.JFrame {

    /**
     * Creates new form IdentificationWindow
     */
    private String uidAux, bookOrAudio;

    StudentData data;

    public IdentificationWindow(String bookOrAudio) {
        initComponents();
        this.bookOrAudio = bookOrAudio;
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Enter your university ID");

        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            data = new StudentData();
            this.uidAux = jTextField1.getText();

            ArrayList<Student> list = new ArrayList<>();

            list = data.readStudent();

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
            boolean yes = false;
            for (int i = 0; i < studentAgros.size(); i++) {
                if (studentAgros.get(i).getUid().equalsIgnoreCase(this.uidAux)) {
                    JOptionPane.showMessageDialog(null, "Student found correctly");
                    yes = true;
                    break;
                }
            }
            for (int i = 0; i < studentEdus.size(); i++) {
                if(yes == true){
                    break;
                }else if (studentEdus.get(i).getUid().equalsIgnoreCase(this.uidAux)) {
                    JOptionPane.showMessageDialog(null, "Student found correctly");
                    yes = true;
                    break;
                }
            }
            for (int i = 0; i < studentInfos.size(); i++) {
                if(yes == true){
                    break;
                }else if (studentInfos.get(i).getUid().equalsIgnoreCase(this.uidAux)) {
                    JOptionPane.showMessageDialog(null, "Student found correctly");
                    yes = true;
                    break;
                }
            }

            if (yes == false) {
                JOptionPane.showMessageDialog(null, "Student not found");
            } else if(this.bookOrAudio.equals("B")){
                this.dispose();
                new LoanBook().setVisible(true);
            } else if(this.bookOrAudio.equals("A")){
                this.dispose();
                new LoanAudiovisual().setVisible(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(IdentificationWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IdentificationWindow.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}