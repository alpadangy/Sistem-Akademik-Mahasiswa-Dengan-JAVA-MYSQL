/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable; 
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ujang Wahyu
 */
public class frmMahasiswa extends javax.swing.JFrame {
    private DefaultTableModel tblModel = getDefaultTableModel();
    private Connection connection;
    private Statement statement;
    String data[] = new String[5];
    
    /**
     * Creates new form frmMahasiswa
     */
    public frmMahasiswa() {
        initComponents();
        OpenDB();
        tampilGrid();
        Tengah();
        nonAktif();
        Tabel.setModel(tblModel);
        Tabel(Tabel, new int[]{80,120,110,180,80});
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
        jLabel5 = new javax.swing.JLabel();
        txtNIM = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        cmbJurusan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTutup = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Jurusan");

        jLabel4.setText("Alamat");

        jLabel5.setText("Phone");

        txtNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIMActionPerformed(evt);
            }
        });

        cmbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Teknik Telekomunikasi", "Teknik Sipil" }));
        cmbJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJurusanActionPerformed(evt);
            }
        });

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Jurusan", "Alamat", "Phone"
            }
        ));
        Tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel);

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnTutup.setText("Tutup");
        btnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutupActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTutup))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnTutup))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIMActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
         try {
            OpenDB();
            String sql = "insert into mahasiswa value('"+txtNIM.getText()+"','"+txtNama.getText()+"','"+cmbJurusan.getSelectedItem().toString()+"','"+txtAlamat.getText()+"','"+txtPhone.getText()+"')";
            statement.executeUpdate(sql);
            data[0] = txtNIM.getText();
            data[1] = txtNama.getText();
            data[2] = cmbJurusan.getSelectedItem().toString();
            data[3] = txtAlamat.getText();
            data[4] = txtPhone.getText();
            tblModel.insertRow(0,data);
            JOptionPane.showMessageDialog(this,"Data telah tersimpan!");
            Kosong();
            nonAktif();
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
    }                    
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        if(btnTambah.getText().equals("Tambah"))
        {
            Aktif();
            txtNIM.requestFocus();
            btnSimpan.setEnabled(true);
            btnTambah.setText("Batal");
        }else{
            Kosong();
            nonAktif();
            btnTambah.setText("Tambah");
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        try {
            OpenDB();
            String sql = "update mahasiswa set nama='"+txtNama.getText()+"',jurusan='"+cmbJurusan.getSelectedItem().toString()+"',alamat='"+txtAlamat.getText()+"',phone='"+txtPhone.getText()+"'"+"where nim='"+txtNIM.getText()+"'";
            statement.executeUpdate(sql);
            data[0] = txtNIM.getText();
            data[1] = txtNama.getText();
            data[2] = cmbJurusan.getSelectedItem().toString();
            data[3] = txtAlamat.getText();
            data[4] = txtPhone.getText();
            tblModel.removeRow(row);
            tblModel.insertRow(0,data);
            JOptionPane.showMessageDialog(this,"Data telah tersimpan!");
            Kosong();
            nonAktif();
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
    }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
       
        if(JOptionPane.showConfirmDialog(this, "Apakah Anda yakin akan menghapus data ini?","Konfirmasi", JOptionPane.YES_NO_OPTION) == 0){
            try {
                OpenDB();
                String sql = "delete from mahasiswa where nim='"+txtNIM.getText()+"'";
                statement.executeUpdate(sql);
                tblModel.removeRow(row);
                JOptionPane.showMessageDialog(this, "Data telah dihapus!");
                Kosong();
                nonAktif();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());            }
            
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutupActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Apakah Anda yakin akan menutup form ini?","Konfirmasi", JOptionPane.YES_NO_OPTION)==0){
            System.exit(0);
        }
    
    }//GEN-LAST:event_btnTutupActionPerformed

    private void TabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            Tampil();
        }
    }//GEN-LAST:event_TabelMouseClicked

    private void cmbJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJurusanActionPerformed

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
            java.util.logging.Logger.getLogger(frmMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTutup;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbJurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables

     private void OpenDB() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/sistemakademik","root","");
        statement = connection.createStatement();
    } catch (SQLException ex) {
        Logger.getLogger(frmMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(frmMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}

private void nonAktif(){
    txtNIM.setEnabled(false);
    txtNama.setEnabled(false);
    cmbJurusan.setEnabled(false);
    txtAlamat.setEnabled(false);
    txtPhone.setEnabled(false);
    btnSimpan.setEnabled(false);
    btnUbah.setEnabled(false);
    btnHapus.setEnabled(false);
    btnTambah.setText("Tambah");
}

private void Aktif(){
    txtNIM.setEnabled(true);
    txtNama.setEnabled(true);
    cmbJurusan.setEnabled(true);
    txtAlamat.setEnabled(true);
    txtPhone.setEnabled(true);
}

private void Kosong(){
    txtNIM.setText("");
    txtNama.setText("");
    cmbJurusan.setSelectedIndex(0);
    txtAlamat.setText("");
    txtPhone.setText("");
}

private javax.swing.table.DefaultTableModel getDefaultTableModel(){
    return new javax.swing.table.DefaultTableModel(
    new Object[][]{},
    new String[] {"nim","nama","jurusan","alamat","phone"})
    {
        boolean[] canEdit = new boolean[]{
            false, false, false, false
        };
        public boolean isCellEditable(int rowIndex, int columnIndex){
            return canEdit[columnIndex];
        }
    };
}

private void Tabel(javax.swing.JTable tb,int lebar[]){
        tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        int kolom = tb.getColumnCount();
        for(int i=0;i<kolom;i++){
            javax.swing.table.TableColumn tbc = tb.getColumnModel().getColumn(i);
            tbc.setPreferredWidth(lebar[i]);
            tb.setRowHeight(17);
        }
}

private void tampilGrid(){
    try {
        String sql = "select * from mahasiswa";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            data[0] = rs.getString(1);
            data[1] = rs.getString(2);
            data[2] = rs.getString(3);
            data[3] = rs.getString(4);
            data[4] = rs.getString(5);
            tblModel.addRow(data);
        }
        rs.close();
        statement.close();
        connection.close();
    } catch (SQLException ex) {
        Logger.getLogger(frmMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
    }
}
int row=0;
public void Tampil(){
    Aktif();
    btnTambah.setText("Batal");
    btnSimpan.setEnabled(false);
    btnUbah.setEnabled(true);
    btnHapus.setEnabled(true);
    row = Tabel.getSelectedRow();
    txtNIM.setText(tblModel.getValueAt(row,0).toString());
    txtNama.setText(tblModel.getValueAt(row, 1).toString());
    cmbJurusan.setSelectedItem(tblModel.getValueAt(row, 2).toString());
    txtAlamat.setText(tblModel.getValueAt(row,3).toString());
    txtPhone.setText(tblModel.getValueAt(row,4).toString());
}

private void Tengah(){
    Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();
    if(frameSize.height < screensize.height){
        frameSize.height = screensize.height;
    }
    if(frameSize.width > screensize.width){
        frameSize.width = screensize.width;
    }
    
    this.setLocation((screensize.width - frameSize.width)/2, (screensize.height-frameSize.height)/2);
}

}
