/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Booking;

import admin.AdminForm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Hoda
 */
public class Cancelaction extends javax.swing.JFrame {

    /**
     * Creates new form Cancelaction
     */
    public Cancelaction() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cnum = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("5MYH RESTAURANT");

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 780));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cancellation Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 28)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 640, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter customer mobile");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, 40));

        cnum.setBackground(new Color(213,134,145,123));
        cnum.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cnum.setForeground(new java.awt.Color(255, 255, 255));
        cnum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        cnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnumActionPerformed(evt);
            }
        });
        cnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnumKeyTyped(evt);
            }
        });
        jPanel1.add(cnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 220, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 590, 200, 37));

        jTextArea1.setBackground(new Color(213,134,145,123));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 419, 206));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3014741.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Scanner scanner = new Scanner(System.in);
        File file = new File("src\\wav\\Bell.wav");
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start();

        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        booking_table p = new booking_table ();
       p.show();
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 Scanner scanner = new Scanner(System.in);
        File file = new File("src\\wav\\Bell.wav");
        try {
            AudioInputStream as = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            clip.start();

        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        Booking b = new Booking ();
    String number ;
    int a = JOptionPane.showConfirmDialog(this, "You want to cancel booking ?", "Confirm", JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);
    try {
    if ( a== JOptionPane.YES_OPTION)
    {  
        Path path = Paths.get("submit.txt");
        File input = new File (path.toString());
        FileReader fr = null ;
        fr = new FileReader (input);
        BufferedReader br = new BufferedReader(fr);
        String num = cnum.getText();
        String sr  ;
        while ( (sr=br.readLine()) != null)
        {
            if (sr.contains(num))
            {
               while ((sr=br.readLine()) != "$")
               jTextArea1.append(br.readLine());
               JOptionPane.showMessageDialog(this, "Successfully Cancelled");
            }
            else 
            {
                 JOptionPane.showMessageDialog(this, "There is no reservation with this number ");
            }
        }
        br.close();
        booking_table p = new booking_table();
        p.show();
        dispose();
    }
    }
     catch ( IOException e)
    {
       JOptionPane.showMessageDialog(this,"Error opning the file");
    }
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnumActionPerformed

    private void cnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnumKeyTyped
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Enter a numerical value");
            evt.consume();
        }
    }//GEN-LAST:event_cnumKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cancelaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cancelaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cancelaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cancelaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancelaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cnum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}