/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.StudentData;
import domain.BiblioTech;
import domain.Student;
import domain.StudentAgro;
import domain.StudentEdu;
import domain.StudentInfo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author byron
 */
public class SignInStudent extends javax.swing.JFrame {

    /**
     * Creates new form SignInStudent
     */
    private String name, lastName, uid, career;
    private int year;
    public BiblioTech biblioTech;
    private StudentData studentData;
    private Timer t;
    private ActionListener actionYes;

    Calendar cal = Calendar.getInstance();

    public SignInStudent() {
        super("Sign in");
        initComponents();
        this.setLayout(null);
        this.biblioTech = new BiblioTech();
        this.studentData = new StudentData();
        this.jLabel5.setVisible(false);
        this.jLabel6.setVisible(false);
        this.jLabel7.setVisible(false);
        this.jLabel8.setVisible(false);

        cal = Calendar.getInstance();

        validNumbers(jTextField1);
        validNumbers(jTextField2);
        validNumbers1(jTextField3);

        this.actionYes = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel6.setVisible(false);
            }
        };

        this.pack();
    }

    public void validNumbers(javax.swing.JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
    }

    public void validNumbers1(javax.swing.JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Last name");

        jLabel3.setText("Year of income");

        jLabel4.setText("Career");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computing", "Education", "Agronomy" }));

        jButton1.setText("Sign In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 51, 51));
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("*");

        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText("Created account");

        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("*");

        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2)
                    .addComponent(jComboBox2, 0, 159, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField1)
                    .addComponent(jTextField3))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<Student> list = new ArrayList<>();
        if (this.jTextField1.getText().equals("") && this.jTextField2.getText().equals("")) {
            this.jLabel5.setVisible(true);
            this.jLabel7.setVisible(true);
            this.jLabel8.setVisible(true);

        } else if (this.jTextField1.getText().equals("")) {
            this.jLabel5.setVisible(true);
//            this.jLabel7.setVisible(false);

        } else if (this.jTextField2.getText().equals("")) {
            this.jLabel7.setVisible(true);
//            this.jLabel5.setVisible(false);
        } else if (this.jTextField3.getText().equals("")) {
            this.jLabel8.setVisible(true);
//            this.jLabel5.setVisible(false);
        } else {
            this.name = this.jTextField1.getText();
            this.lastName = this.jTextField2.getText();
            this.year = Integer.parseInt((String) this.jTextField3.getText());

            int actualYear = cal.get(Calendar.YEAR);;
            if (this.year < 1950 || this.year > actualYear) {
                JOptionPane.showMessageDialog(null, "Invalid year");
                this.jTextField3.setText("");
            } else {
                this.career = (String) this.jComboBox2.getSelectedItem();

                if (career.equals("Computing")) {
                    try {
                        StudentInfo student = new StudentInfo();
                        student.setName(name);
                        student.setLastName(lastName);
                        student.setCarrer(career);
                        student.setYear(year);
                        list = this.studentData.readStudent();
                        student.setUid(year, String.valueOf(list.size()));
                        this.studentData.saveStudent(student);
                        this.biblioTech.setStudents(student);
                    } catch (IOException ex) {
                        Logger.getLogger(SignInStudent.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(SignInStudent.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else if (career.equals("Education")) {
                    try {
                        StudentEdu student = new StudentEdu();
                        student.setName(name);
                        student.setLastName(lastName);
                        student.setCarrer(career);
                        student.setYear(year);
                        list = this.studentData.readStudent();
                        student.setUid(year, String.valueOf(list.size()));
                        this.studentData.saveStudent(student);
                        this.biblioTech.setStudents(student);

                    } catch (IOException ex) {
                        Logger.getLogger(SignInStudent.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(SignInStudent.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else if (career.equals("Agronomy")) {
                    try {
                        StudentAgro student = new StudentAgro();
                        student.setName(name);
                        student.setLastName(lastName);
                        student.setCarrer(career);
                        student.setYear(year);
                        list = this.studentData.readStudent();
                        student.setUid(year, String.valueOf(list.size()));
                        this.studentData.saveStudent(student);
                        this.biblioTech.setStudents(student);

                    } catch (IOException ex) {
                        Logger.getLogger(SignInStudent.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(SignInStudent.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

                this.jLabel5.setVisible(false);
                this.jLabel7.setVisible(false);
                this.jLabel8.setVisible(false);
                this.jLabel6.setVisible(true);

                t = new Timer(2000, actionYes);
                t.start();

                this.jTextField1.setText("");
                this.jTextField2.setText("");
                this.jTextField3.setText("");

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
