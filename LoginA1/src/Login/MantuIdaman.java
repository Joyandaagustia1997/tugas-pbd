/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author MY COMP
 */
public class MantuIdaman extends javax.swing.JFrame {

    /**
     * Creates new form MantuIdaman
     */
    public MantuIdaman() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tingkahlaku = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        nominal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        P1 = new javax.swing.JRadioButton();
        P2 = new javax.swing.JRadioButton();
        P3 = new javax.swing.JRadioButton();
        P4 = new javax.swing.JRadioButton();
        klik = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Menantu Idaman");

        jLabel2.setText("Nama");

        jLabel3.setText("Attitude");

        tingkahlaku.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sangat Baik", "Baik", "Cukup Baik", "Kurang Baik" }));
        tingkahlaku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tingkahlakuActionPerformed(evt);
            }
        });

        jLabel4.setText("Penghasilan");

        jLabel5.setText("Pendidikan");

        buttonGroup1.add(P1);
        P1.setText("SMA");

        buttonGroup1.add(P2);
        P2.setText("S1");

        buttonGroup1.add(P3);
        P3.setText("S2");

        buttonGroup1.add(P4);
        P4.setText("S3");

        klik.setText("Hasil");
        klik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klikActionPerformed(evt);
            }
        });

        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane1.setViewportView(Hasil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addComponent(nama)
                                        .addComponent(tingkahlaku, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nominal, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(klik))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(P1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P4)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tingkahlaku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(nominal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(P1)
                        .addComponent(P2)
                        .addComponent(P3)
                        .addComponent(P4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(klik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tingkahlakuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tingkahlakuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tingkahlakuActionPerformed

    private void klikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klikActionPerformed
        String Nama = nama.getText();
        String Attitude = (String)tingkahlaku.getSelectedItem();
        String Penghasilan = nominal.getText();
        String keputusan = "";
        
    float nilai1=0;
   if (P1.isSelected()){
    nilai1 = 3;
    }else if (P2.isSelected()){
    nilai1 = 5;
    }else if (P3.isSelected()){
    nilai1 = 7;
    }else if (P4.isSelected()){
    nilai1 = 10;
    }
    
   float nilai2=0;
  float p = Float.parseFloat(nominal.getText());
   if (p>50000000){
       nilai2 = 10;
   }
   else if (p>25000000){
       nilai2 = 7;
   }
   else if (p>5000000){
       nilai2 = 5;
   }
   else if (p<=5000000){
       nilai2 = 3;
   }
   
   float nilai3=0;
   if (tingkahlaku.getSelectedItem().equals("Sangat Baik")){
   nilai3=10;
    }
   else if (tingkahlaku.getSelectedItem().equals("Baik")){
   nilai3=8;
    }
   else if (tingkahlaku.getSelectedItem().equals("Cukup Baik")){
   nilai3=4;
    }
   else if (tingkahlaku.getSelectedItem().equals("Kurang Baik")){
   nilai3=1;
    }
   
   float cek =(nilai1+nilai2+nilai3)/3;
   if (cek > 6.5){
            keputusan = "Sangat Recommended menjadi menantu";
        }
        else if  (cek > 5){
            keputusan = "Recommended menjadi menantu";
        }
        else if (cek > 4){
            keputusan = "Cukup Recommended menjadi menantu";
        }
        else  {
            keputusan = "Kurang Recommended menjadi menantu";
        }
   
   //buat mengecek semua hasil penjumlahan
   String a = Float.toString(nilai1);
   String b = Float.toString(nilai2);
   String c = Float.toString(nilai3);
  //ngecek setiap bobotnya = Hasil.setText(c+b+a);
   
   Hasil.setText(Nama + " " + keputusan);
   
   
   
   
   
   
   
   
    }//GEN-LAST:event_klikActionPerformed

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
            java.util.logging.Logger.getLogger(MantuIdaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantuIdaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantuIdaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantuIdaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantuIdaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Hasil;
    private javax.swing.JRadioButton P1;
    private javax.swing.JRadioButton P2;
    private javax.swing.JRadioButton P3;
    private javax.swing.JRadioButton P4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton klik;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nominal;
    private javax.swing.JComboBox tingkahlaku;
    // End of variables declaration//GEN-END:variables
}