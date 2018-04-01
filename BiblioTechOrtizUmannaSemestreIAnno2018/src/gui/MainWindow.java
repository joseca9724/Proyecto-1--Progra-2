/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.LoanData;
import domain.BiblioTech;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author byron
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public BiblioTech biblioTech;

    public MainWindow() {
        this.add(new Fondo());

        initComponents();
//        this.biblioTech = new BiblioTech();
    }

    public MainWindow(int a) {

    }

    public BiblioTech getBiblioTech() {
        return this.biblioTech;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemShowAudiovisual = new javax.swing.JMenuItem();
        jMenuItemShowBook = new javax.swing.JMenuItem();
        jMenuItemShowLoans = new javax.swing.JMenuItem();
        jMenuItemShowStudents = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main window");

        jMenu1.setText("Register menu");

        jMenuItem1.setText("Register student");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Register material");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Loans");

        jMenuItem3.setText("Books loan");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Audiovisual loan");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Devolutions");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Registered");

        jMenuItemShowAudiovisual.setText("Audiovisual");
        jMenuItemShowAudiovisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemShowAudiovisualActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemShowAudiovisual);

        jMenuItemShowBook.setText("Books");
        jMenuItemShowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemShowBookActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemShowBook);

        jMenuItemShowLoans.setText("Loans");
        jMenuItemShowLoans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemShowLoansActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemShowLoans);

        jMenuItemShowStudents.setText("Students");
        jMenuItemShowStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemShowStudentsActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemShowStudents);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        SignInStudent signInStudent = new SignInStudent();
        signInStudent.setSize(400, 400);
        signInStudent.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        RegisterMaterial registerMaterial = new RegisterMaterial();
        registerMaterial.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        IdentificationWindow identificationWindow = new IdentificationWindow("B");
        identificationWindow.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        IdentificationWindow identificationWindow = new IdentificationWindow("A");
        identificationWindow.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItemShowAudiovisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemShowAudiovisualActionPerformed
        // TODO add your handling code here:
        ShowAudiovisual showAudiovisual=new ShowAudiovisual();
        showAudiovisual.setVisible(true);
    }//GEN-LAST:event_jMenuItemShowAudiovisualActionPerformed

    private void jMenuItemShowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemShowBookActionPerformed
        // TODO add your handling code here:
        ShowBooks showBook=new ShowBooks();
        showBook.setVisible(true);
    }//GEN-LAST:event_jMenuItemShowBookActionPerformed

    private void jMenuItemShowLoansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemShowLoansActionPerformed

        ShowLoans showLoan=new ShowLoans();
        showLoan.setVisible(true);
    }//GEN-LAST:event_jMenuItemShowLoansActionPerformed

    private void jMenuItemShowStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemShowStudentsActionPerformed
        // TODO add your handling code here:

        ShowStudents showStudents=new ShowStudents();
        showStudents.setVisible(true);
    }//GEN-LAST:event_jMenuItemShowStudentsActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Devolution devolution = new Devolution();
        devolution.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemShowAudiovisual;
    private javax.swing.JMenuItem jMenuItemShowBook;
    private javax.swing.JMenuItem jMenuItemShowLoans;
    private javax.swing.JMenuItem jMenuItemShowStudents;
    // End of variables declaration//GEN-END:variables
}
