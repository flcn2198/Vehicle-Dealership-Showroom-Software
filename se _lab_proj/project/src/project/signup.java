/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author deblin
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
    }
    public signup(String s1, String s2, String s3, String s4, int count) {
        initComponents();
        //jTextField1.setText(count+"");
    }
    public signup(int count) {
        initComponents();
        jTextField1.setText(count+"");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jDialog3 = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jDialog1.setMaximumSize(new java.awt.Dimension(400, 300));
        jDialog1.setMinimumSize(new java.awt.Dimension(400, 300));
        jDialog1.setResizable(false);
        jDialog1.setSize(new java.awt.Dimension(400, 300));
        jDialog1.getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Incorrect Details!");
        jDialog1.getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 140, 131, 17);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/wp1.png"))); // NOI18N
        jDialog1.getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 400, 300);

        jDialog2.setMaximumSize(new java.awt.Dimension(400, 300));
        jDialog2.setMinimumSize(new java.awt.Dimension(400, 300));
        jDialog2.setResizable(false);
        jDialog2.setSize(new java.awt.Dimension(400, 300));
        jDialog2.getContentPane().setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Account Created!");
        jDialog2.getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 90, 121, 33);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDialog2.getContentPane().add(jButton2);
        jButton2.setBounds(150, 195, 80, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/wp1.png"))); // NOI18N
        jDialog2.getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 400, 300);

        jDialog3.setMaximumSize(new java.awt.Dimension(400, 330));
        jDialog3.setMinimumSize(new java.awt.Dimension(400, 330));
        jDialog3.setPreferredSize(new java.awt.Dimension(400, 330));
        jDialog3.setSize(new java.awt.Dimension(400, 330));
        jDialog3.getContentPane().setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("               Password must be 8-20 characters long!");
        jDialog3.getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 400, 300);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/wp1.png"))); // NOI18N
        jDialog3.getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 400, 300);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(782, 530));
        setMinimumSize(new java.awt.Dimension(782, 530));
        setPreferredSize(getMaximumSize());
        setResizable(false);
        setSize(new java.awt.Dimension(782, 530));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/rsz_1user.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 40, 220, 250);

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel2.setText("CUSTOMER IDENTIFICATION NUMBER:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(264, 56, 268, 16);

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel3.setText("NAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(264, 129, 45, 16);

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel4.setText("PHONE NUMBER:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(264, 202, 118, 16);

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel5.setText("EMAIL-ID:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(264, 274, 71, 16);

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(547, 55, 190, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(547, 128, 190, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(547, 201, 190, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(547, 273, 190, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("SIGN-UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 420, 226, 40);

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel8.setText("PASSWORD:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(270, 350, 110, 16);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(550, 350, 190, 20);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(80, 420, 110, 40);

        jLabel12.setText("(8 to 20 characters)");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(270, 370, 130, 10);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/back_list.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 780, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.setVisible(false);
         jDialog2.setVisible(false);
         login l1 = new login();
         l1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String cin = jTextField1.getText();
        String nam = jTextField2.getText();
        String ph = jTextField3.getText();
        String email = jTextField4.getText();
        String pass = jTextField5.getText();

        if(ph.length()!=10)
        {
            jDialog1.setVisible(true);
            jTextField3.setText("");
        }

        else if(!email.contains("@")||!email.contains(".com"))
        {
            jDialog1.setVisible(true);
            jTextField4.setText("");
        }
        
        else if(pass.length()<8|| pass.length()>20)
        {
            jDialog3.setVisible(true);
            jTextField5.setText("");
        }

        else
        {
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ddas123");
                PreparedStatement ps = conn.prepareStatement("insert into registered values('"+cin+"','"+nam+"','"+email+"','"+pass+"','"+ph+"')");
                ResultSet rs = null;
                rs = ps.executeQuery();
                this.setVisible(false);
                jDialog2.setVisible(true);
            }
            catch(Exception e)
            {

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        login n = new login();
        n.setVisible(true);
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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
