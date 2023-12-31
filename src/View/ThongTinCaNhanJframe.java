/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import DAO.ThongTinCaNhanDAO;
import entity.ThongTinCaNhan;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author ASUS
 */
public class ThongTinCaNhanJframe extends javax.swing.JInternalFrame {

    /**
     * Creates new form ThongTinCaNhan
     */
    public ThongTinCaNhanJframe() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        init();
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
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblAnh = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnCapNhatHang = new javax.swing.JButton();
        btnDoiMatKhau = new javax.swing.JButton();
        txtMaNV = new javax.swing.JTextField();
        txtTenTaiKhoan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1237, 545));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setText("Họ Và Tên");

        jLabel3.setText("Địa Chỉ ");

        jLabel5.setText("Email ");

        jLabel6.setText("Số Điện Thoại");

        jLabel7.setText("Ngày Sinh ");

        jLabel8.setText("Giới Tính");

        txtHoVaTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoVaTenActionPerformed(evt);
            }
        });

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        txtNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySinhActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblAnh.setText("Thêm Ảnh");
        lblAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Mật Khẩu");

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam ");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        jLabel16.setText("Tài Khoản");

        jLabel11.setText("Mã Nhân viên");

        btnCapNhatHang.setBackground(new java.awt.Color(153, 255, 153));
        btnCapNhatHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Tick.png"))); // NOI18N
        btnCapNhatHang.setText("Cập nhật");
        btnCapNhatHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatHangActionPerformed(evt);
            }
        });

        btnDoiMatKhau.setBackground(new java.awt.Color(255, 255, 204));
        btnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh.png"))); // NOI18N
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });

        jButton1.setText("<");

        jButton2.setText(">");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCapNhatHang)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(rdoNam)
                                                .addGap(45, 45, 45)
                                                .addComponent(rdoNu))
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaNV)))))
                .addGap(190, 190, 190)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDoiMatKhau)
                    .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(txtTenTaiKhoan))
                .addContainerGap(354, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCapNhatHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel16))
                            .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDoiMatKhau)))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thông Tin Cá Nhân", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoVaTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoVaTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoVaTenActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void txtNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamActionPerformed

    private void btnCapNhatHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatHangActionPerformed
        update();
    }//GEN-LAST:event_btnCapNhatHangActionPerformed

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        DoiMatKhau form = new DoiMatKhau();
        form.setVisible(true);
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatHang;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenTaiKhoan;
    // End of variables declaration//GEN-END:variables
    ThongTinCaNhanDAO dao = new ThongTinCaNhanDAO();

    void init() {
        fillToTable();
    }

    void fillToTable() {
        try {
            List<ThongTinCaNhan> list = dao.selectAll();
            if (list != null && !list.isEmpty()) {
                ThongTinCaNhan firstItem = list.get(0); // Lấy phần tử đầu tiên từ danh sách (chỉ để minh họa)
                txtHoVaTen.setText(firstItem.getTenNV());
                txtDiaChi.setText(firstItem.getDiaChi());
                txtEmail.setText(firstItem.getEmail());
                txtNgaySinh.setText(firstItem.getNgaySinh());
                txtTenTaiKhoan.setText(firstItem.getTaiKhoan());
                txtMatKhau.setText(firstItem.getMatKhau());
                lblAnh.setText(firstItem.getHinh());
                if (firstItem.isGioiTinh()) {
                    rdoNam.setSelected(false);
                    rdoNu.setSelected(true);
                } else {
                    rdoNam.setSelected(true);
                    rdoNu.setSelected(false);
                }

                // Set giá trị cho các trường Mã Nhân Viên và Số Điện Thoại
                txtMaNV.setText(firstItem.getID());
                txtSoDienThoai.setText(firstItem.getSoDT());
                // ...
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void clearForm() {
        ThongTinCaNhan sp = new entity.ThongTinCaNhan();
        this.setForm(sp);
    }

    private void setForm(ThongTinCaNhan sp) {
        txtHoVaTen.setText(sp.getTenNV());
        txtDiaChi.setText(sp.getDiaChi());
        txtEmail.setText(sp.getEmail());
        txtNgaySinh.setText(sp.getNgaySinh());
        lblAnh.setText(sp.getHinh());
        rdoNam.setSelected(sp.isGioiTinh());
        rdoNu.setSelected(!sp.isGioiTinh());
        txtTenTaiKhoan.setText(sp.getTaiKhoan());
        txtMatKhau.setText(sp.getMatKhau());

        try {
            int maNV = Integer.parseInt(sp.getID());
            txtMaNV.setText(String.valueOf(maNV)); // Gán giá trị sau khi chuyển đổi
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        try {
            int soDienThoai = Integer.parseInt(sp.getSoDT());
            txtSoDienThoai.setText(String.valueOf(soDienThoai)); // Gán giá trị sau khi chuyển đổi
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private ThongTinCaNhan getForm() {
        ThongTinCaNhan sp = new ThongTinCaNhan();
        sp.setTenNV(txtHoVaTen.getText());
        sp.setDiaChi(txtDiaChi.getText());
        sp.setEmail(txtEmail.getText());
        sp.setNgaySinh(txtNgaySinh.getText());
        sp.setHinh(lblAnh.getText());
        sp.setGioiTinh(rdoNam.isSelected());
        sp.setTaiKhoan(txtTenTaiKhoan.getText());
        sp.setMatKhau(txtMatKhau.getText());
        sp.setID(txtMaNV.getText());
        sp.setSoDT(txtSoDienThoai.getText());
        // ...

        return sp;
    }

    void update() {
        entity.ThongTinCaNhan thongTinCaNhan = getForm();
        try {
            dao.update(thongTinCaNhan);
            this.fillToTable();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cập nhật thất bại !");
            e.printStackTrace();
        }
    }

}
