/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Obat extends javax.swing.JFrame {

   
    DefaultTableModel model;
    public Obat() {
        initComponents();
    String [] judul = {"Kode Buku","Nama Buku","ID Kategori","Kode Satuan"};
    model =new DefaultTableModel(judul,0);
    tabel.setModel(model);
    tampilkan();
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
        jLabel2 = new javax.swing.JLabel();
        kode_buku = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nama_buku = new javax.swing.JTextField();
        id_kategori = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kode_satuan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btntambah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 36, 100));
        setIconImages(null);

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUKU");

        jLabel2.setText("Kode Buku");

        kode_buku.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setText("Nama Buku");

        nama_buku.setBackground(new java.awt.Color(204, 255, 204));

        id_kategori.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setText("ID Kategori");

        kode_satuan.setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setText("Kode Satuan");

        btntambah.setBackground(new java.awt.Color(0, 204, 102));
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnhapus.setBackground(new java.awt.Color(0, 204, 102));
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(0, 204, 102));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnedit.setBackground(new java.awt.Color(0, 204, 102));
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        tabel.setBackground(new java.awt.Color(204, 255, 204));
        tabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(kode_satuan))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(id_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(kode_buku, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(nama_buku)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btntambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnedit)
                        .addGap(18, 18, 18)
                        .addComponent(btnhapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnreset))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kode_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(id_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kode_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambah)
                    .addComponent(btnedit)
                    .addComponent(btnhapus)
                    .addComponent(btnreset))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/apotek2","root","");
            cn.createStatement().executeUpdate("insert into obat values"+"('"+kode_buku.getText()+"','"+nama_buku.getText()+"','"+id_kategori.getText()+"','"+kode_satuan.getText()+"')");
        tampilkan();
        reset();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ada yang belum di isi, atau kode telah dipakai");
        }
    }//GEN-LAST:event_btntambahActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/apotek2","root","");
            cn.createStatement().executeUpdate("update obat set nama_buku='"+nama_buku.getText()+"',id_kategori ='"+id_kategori.getText()+"',kode_satuan='"+kode_satuan.getText()+"'where kode_buku='"+kode_buku.getText()+"'");
      tampilkan();
        reset();
        } catch (SQLException ex) {
            Logger.getLogger(Obat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int i = tabel.getSelectedRow();
        
        if(i>-1){
            kode_buku.setText(model.getValueAt(i,0).toString());
             nama_buku.setText(model.getValueAt(i,1).toString());
              id_kategori.setText(model.getValueAt(i,2).toString());
               kode_satuan.setText(model.getValueAt(i,3).toString());
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/apotek2","root","");
            cn.createStatement().executeUpdate("delete from obat where kode_buku='"+kode_buku.getText()+"'");
       tampilkan();
       reset();
        } catch (SQLException ex) {
            Logger.getLogger(Obat.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnresetActionPerformed
private void reset(){
    kode_buku.setText("");
     nama_buku.setText("");
      id_kategori.setText("");
       kode_satuan.setText("");
    
}
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
            java.util.logging.Logger.getLogger(Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Obat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btntambah;
    private javax.swing.JTextField id_kategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kode_buku;
    private javax.swing.JTextField kode_satuan;
    private javax.swing.JTextField nama_buku;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
     int row=tabel.getRowCount();
     for(int a=0; a<row;a++){
         model.removeRow(0);
     }
        try {
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/apotek2","root","");
             ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM obat");
       while (rs.next()){
           String data []={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
      model.addRow(data);
       }
        } catch (SQLException ex) {
            Logger.getLogger(Obat.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
}
