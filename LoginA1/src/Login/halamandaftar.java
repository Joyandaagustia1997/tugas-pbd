/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class halamandaftar extends javax.swing.JFrame {
    Connection coon;
            PreparedStatement ps;
            ResultSet rs;
            
            
            public void sinkron(){
                String sql ="select * from login";
                
                try{
                    ps = coon.prepareStatement(sql);
                    rs = ps.executeQuery();
                    tabel.setModel(DbUtils.resultSetToTableModel(rs));
                    
                    
                }catch (Exception e){
                JOptionPane.showMessageDialog(rootPane, e);
                }
                
            }
    /**
     * Creates new form halamandaftar
     */
    public halamandaftar() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        telepon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("halaman daftar ");

        jLabel2.setText("Username");

        user.setText(" ");

        jLabel3.setText("Password");

        pass.setText(" ");

        jLabel4.setText("Nama");

        nama.setText(" ");

        jLabel5.setText("Alamat");

        alamat.setText(" ");

        jLabel6.setText("Telepon");

        telepon.setText(" ");

        jLabel7.setText("Status");

        status.setText(" ");

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(32, 32, 32)
                                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(32, 32, 32)
                                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)))))
                        .addGap(40, 40, 40)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String sql = "insert into login values (null,?,?,?,?,?,?)";
        
        try{
            ps = coon.prepareStatement(sql);
        if ("".equals(user.getText())){
            JOptionPane.showMessageDialog(null, "Masukan Username terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if ("".equals(user.getText())){
            JOptionPane.showMessageDialog(null, "Masukan Username terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if ("".equals(pass.getText())){
            JOptionPane.showMessageDialog(null, "Masukan Password terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if ("".equals(nama.getText())){
            JOptionPane.showMessageDialog(null, "Masukan Nama terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if ("".equals(telepon.getText())){
            JOptionPane.showMessageDialog(null, "Masukan Telepon terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if ("".equals(alamat.getText())){
            JOptionPane.showMessageDialog(null, "Masukan Alamat terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        else if (pass.getText() == null ? pass.getText() != null : !pass.getText().equals(pass.getText())){
            JOptionPane.showMessageDialog(null, "Password tidak sama !","Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if("".equals(status.getText())){
        }
            
            ps = coon.prepareStatement(sql);
            ps.setString(1,user.getText());
            ps.setString(2,pass.getText());
            ps.setString(3,nama .getText());
            ps.setString(4,telepon.getText());
            ps.setString(5,alamat.getText());
            ps.setString(6,status.getText());
            ps.executeUpdate();
             JOptionPane.showMessageDialog(rootPane, "Data berhasil ditambahkan!");
            sinkron();
           
        }catch(Exception e){
             JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        coon = Koneksi.Conn();
        sinkron();
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int pilihan = JOptionPane.showConfirmDialog
        (rootPane, "Yakin mau dihapus?","Konfirmasi Hapus",JOptionPane.YES_NO_OPTION);
       if (pilihan == 0){
          
        String id_user = tabel.getModel().getValueAt(tabel.getSelectedRow(),0).toString();
        String sql = "delete from login where id_user=?";
      
        
        try {  
          ps = coon.prepareStatement(sql);
          ps.setString(1, id_user);
          ps.executeUpdate();
          JOptionPane.showMessageDialog(rootPane, "Data Berhasil dihapus");
            sinkron();
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
            
        }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        String sql ="select * from login where id_user=?";
        String id_user = tabel.getModel().getValueAt(tabel.getSelectedRow(),0).toString();
        
        try{
           ps = coon.prepareStatement(sql);
           rs = ps.executeQuery();
           if (rs.next())
           {user.setText(rs.getString("id_user"));
            JOptionPane.showMessageDialog(null, "Masukan Username terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
           }
           else if (rs.next())
               {user.setText(rs.getString("id_user"));
               JOptionPane.showMessageDialog(null, "Masukan Username terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
               }
           else if (rs.next())
           {pass.setText(rs.getString("password"));
            JOptionPane.showMessageDialog(null, "Masukan Password terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
           }
           else if (rs.next())
           {nama.setText(rs.getString("nama"));
            JOptionPane.showMessageDialog(null, "Masukan Nama terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
           }
           else if (rs.next())
           {telepon.setText(rs.getString("telepon"));
            JOptionPane.showMessageDialog(null, "Masukan Telepon terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
           }
            else if (rs.next())
           {alamat.setText(rs.getString("alamat"));
            JOptionPane.showMessageDialog(null, "Masukan Alamat terlebih dahulu !","Message", JOptionPane.ERROR_MESSAGE);
            return;
           }
            
           else if (pass.getText() == null ? pass.getText() != null : !pass.getText().equals(pass.getText())){
            JOptionPane.showMessageDialog(null, "Password tidak sama !","Message", JOptionPane.ERROR_MESSAGE);
            return;
           }
            else if("".equals(status.getText())){
        }
           
                 
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);    
        }
    }//GEN-LAST:event_formMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // UPDATE
        String sql ="update login set id_user=?,username=?,password=?,nama=?,telepon=?,alamat=?,status=?";
        
        try{
            
            String value1 = user.getText();
            String value2= pass.getText();
            String value3= nama.getText();
            String value4= telepon.getText();
            String value5= alamat.getText();
            String value6= status.getText();
            
            String sql ="update tabel_pre3 set username='"+value1+"',password='"+value2+"',nama='"
                    +value3+"',telepon='"+value4+"',alamat='"+value5+"',status='"
                    +value6+"'whereusername='"+value1+"'";
            ps = coon.prepareStatement();
            ps.execute();
            JOptionPane.showMessageDialog(null, "update");
                    sinkron();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
      
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(halamandaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halamandaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halamandaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halamandaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halamandaftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField status;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField telepon;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
