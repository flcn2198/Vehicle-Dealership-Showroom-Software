/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import javax.swing.*;
/**
 *
 * @author student
 */
public class car1_gallery extends javax.swing.JFrame {

    /**
     * Creates new form car1_gallery
     */
    String id, nam, phn, eml;
    public car1_gallery() {
        initComponents();
        assign1();
    }
    public car1_gallery(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9) {
        initComponents();
        assign1();
        t1.setText(s1);
        t2.setText(s2);
        t3.setText(s3);
        t4.setText(s4);
        t5.setText(s5);
        id = s6;
        nam = s7;
        phn = s8;
        eml = s9;
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
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        t5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BREZZA");
        setMaximumSize(new java.awt.Dimension(782, 530));
        setMinimumSize(new java.awt.Dimension(782, 530));
        setPreferredSize(new java.awt.Dimension(782, 530));
        setResizable(false);
        setSize(new java.awt.Dimension(782, 530));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel1.setText("MILEAGE:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 103, 86, 30);

        t1.setEditable(false);
        t1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        getContentPane().add(t1);
        t1.setBounds(10, 15, 290, 30);

        t2.setEditable(false);
        t2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        getContentPane().add(t2);
        t2.setBounds(129, 103, 141, 30);

        t3.setEditable(false);
        t3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3);
        t3.setBounds(129, 159, 141, 30);

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel5.setText("PRICE:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 159, 86, 30);

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel6.setText("CAPACITY:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 215, 86, 30);

        t4.setEditable(false);
        t4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        getContentPane().add(t4);
        t4.setBounds(129, 215, 141, 30);

        jButton1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jButton1.setText("PREVIOUS");
        jButton1.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 430, 110, 30);

        jButton2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jButton2.setText("NEXT");
        jButton2.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(580, 430, 110, 30);

        jButton3.setFont(new java.awt.Font("Segoe WP SemiLight", 1, 14)); // NOI18N
        jButton3.setText("BOOK");
        jButton3.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton3.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton3.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(180, 350, 90, 40);

        t5.setEditable(false);
        t5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        getContentPane().add(t5);
        t5.setBounds(129, 274, 141, 30);

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel8.setText("TYPE:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 274, 86, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/brezza_fv.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(310, 20, 460, 360);

        jButton4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 350, 90, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/rsz_1download.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 780, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed
    static String images1[] = {"brezza_fv.png", "brezza_rs.png", "brezza_bv.png", "brezza_ls.png", "brezza_int.png"};
    int c1 = 0;
    ImageIcon[] imglist1 = new ImageIcon[5];
    void assign1(){
        for(int c = 0; c < images1.length; c++){
            imglist1[c] = new ImageIcon(getClass().getResource("/project/c1/"+images1[c]));
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(c1 < 0)
            c1 = 1;
        if(c1 >= 0 && c1 < images1.length)
        { 
            jLabel10.setIcon(imglist1[c1]);
            c1++;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(c1 >= images1.length)
            c1 = images1.length - 2 ;
        if(c1 >= 0 && c1 < images1.length)
        { 
            jLabel10.setIcon(imglist1[c1]);
            c1--;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //customer_id+vdr = booking_id and booking_id+customer_id = tracking_id
        //entry into sales table
        //entry into tracking table
        //dialog saying confirm(ed booking and showroom addressa and expected delivery date. Close application
        details d = new details("MARUTI SUZUKI VITARA BREZZA", id, nam, phn, eml);
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Profile p = new Profile(id, nam, phn, eml);
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(car1_gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(car1_gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(car1_gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(car1_gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                car1_gallery cr1 = new car1_gallery();
                cr1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
