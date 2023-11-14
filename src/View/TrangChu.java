/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author ASUS
 */
public class TrangChu extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnDoiMatKhau = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnKhuyenMai = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnHuongDanSuDung = new javax.swing.JButton();
        btnGioiThieuSanPham = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnBaoDong = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblTenNhanVien = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();
        lblThoiGian = new javax.swing.JLabel();
        lblHinh = new javax.swing.JLabel();
        lblSanPham = new javax.swing.JLabel();
        lblKhuyenMai = new javax.swing.JLabel();
        lblKhachHang = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        lblBanHang = new javax.swing.JLabel();
        thongtincanhan = new javax.swing.JLabel();
        lblDonHang = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseClicked(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh.png"))); // NOI18N
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDoiMatKhau.setMaximumSize(new java.awt.Dimension(84, 51));
        btnDoiMatKhau.setMinimumSize(new java.awt.Dimension(84, 51));
        btnDoiMatKhau.setPreferredSize(new java.awt.Dimension(84, 51));
        btnDoiMatKhau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoiMatKhauMouseClicked(evt);
            }
        });
        jToolBar1.add(btnDoiMatKhau);

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Stop.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnKetThuc);
        jToolBar1.add(jSeparator1);

        btnKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Wallet.png"))); // NOI18N
        btnKhuyenMai.setText("Khuyến mãi");
        btnKhuyenMai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhuyenMai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnKhuyenMai);

        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clien list.png"))); // NOI18N
        btnKhachHang.setText("Khách hàng");
        btnKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnKhachHang);

        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Document.png"))); // NOI18N
        btnHoaDon.setText("Hóa đơn");
        btnHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHoaDon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHoaDon);

        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Bar chart.png"))); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThongKe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnThongKe);
        jToolBar1.add(jSeparator2);

        btnHuongDanSuDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Computer.png"))); // NOI18N
        btnHuongDanSuDung.setText("Hướng dẫn sử dụng");
        btnHuongDanSuDung.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDanSuDung.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHuongDanSuDung);

        btnGioiThieuSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Globe.png"))); // NOI18N
        btnGioiThieuSanPham.setText("Giới thiệu sản phẩm");
        btnGioiThieuSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGioiThieuSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnGioiThieuSanPham);
        jToolBar1.add(jSeparator3);

        btnBaoDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Problem.png"))); // NOI18N
        btnBaoDong.setText("Báo động");
        btnBaoDong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBaoDong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnBaoDong);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        pnlMenu.setBackground(new java.awt.Color(0, 153, 255));
        pnlMenu.setForeground(new java.awt.Color(242, 242, 242));

        lblTenNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblTenNhanVien.setText("Nhân viên:");

        lblVaiTro.setForeground(new java.awt.Color(255, 255, 255));
        lblVaiTro.setText("Vai trò:");

        lblThoiGian.setForeground(new java.awt.Color(255, 255, 255));
        lblThoiGian.setText("Thời gian: ");

        lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logoShopGiay1.jpg"))); // NOI18N

        lblSanPham.setBackground(new java.awt.Color(0, 51, 255));
        lblSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(242, 242, 242));
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setText("Sản phẩm");
        lblSanPham.setPreferredSize(new java.awt.Dimension(35, 35));
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
        });

        lblKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblKhuyenMai.setForeground(new java.awt.Color(242, 242, 242));
        lblKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhuyenMai.setText("Khuyến mãi");
        lblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhuyenMaiMouseClicked(evt);
            }
        });

        lblKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblKhachHang.setForeground(new java.awt.Color(242, 242, 242));
        lblKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhachHang.setText("Khách hàng");
        lblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHangMouseClicked(evt);
            }
        });

        lblThongKe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lblThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongKe.setText("Thống kê");
        lblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongKeMouseClicked(evt);
            }
        });

        lblNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhanVien.setText("Nhân viên");
        lblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseClicked(evt);
            }
        });

        lblBanHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBanHang.setForeground(new java.awt.Color(255, 255, 255));
        lblBanHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanHang.setText("Bán hàng");
        lblBanHang.setPreferredSize(new java.awt.Dimension(35, 35));
        lblBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBanHangMouseClicked(evt);
            }
        });

        thongtincanhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu.png"))); // NOI18N
        thongtincanhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongtincanhanMouseClicked(evt);
            }
        });

        lblDonHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDonHang.setForeground(new java.awt.Color(255, 255, 255));
        lblDonHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonHang.setText("Đơn hàng");
        lblDonHang.setPreferredSize(new java.awt.Dimension(35, 35));
        lblDonHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDonHangMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đổi - Trả");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lblHinh)
                .addGap(22, 22, 22))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(lblTenNhanVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(thongtincanhan))
                    .addComponent(lblBanHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblThoiGian)
                            .addComponent(lblVaiTro))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenNhanVien)
                    .addComponent(thongtincanhan))
                .addGap(21, 21, 21)
                .addComponent(lblVaiTro)
                .addGap(27, 27, 27)
                .addComponent(lblThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(lblBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1004, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1420, 720));

        jDesktopPane.setPreferredSize(new java.awt.Dimension(1180, 720));
        jDesktopPane.setLayout(new javax.swing.OverlayLayout(jDesktopPane));
        getContentPane().add(jDesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 1205, 717));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        // TODO add your handling code here:
        SanPham sp = new SanPham();
        jDesktopPane.removeAll();
        jDesktopPane.add(sp).setVisible(true);
    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void lblBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseClicked
        BanHang bh = new BanHang();
        jDesktopPane.removeAll();
        jDesktopPane.add(bh).setVisible(true);
    }//GEN-LAST:event_lblBanHangMouseClicked

    private void lblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseClicked
        KhachHang kh = new KhachHang();
        jDesktopPane.removeAll();
        jDesktopPane.add(kh).setVisible(true);
    }//GEN-LAST:event_lblKhachHangMouseClicked

    private void lblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseClicked
        NhanVien nv = new NhanVien();
        jDesktopPane.removeAll();
        jDesktopPane.add(nv).setVisible(true);
    }//GEN-LAST:event_lblNhanVienMouseClicked

    private void lblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseClicked
        ThongKe tk = new ThongKe();
        jDesktopPane.removeAll();
        jDesktopPane.add(tk).setVisible(true);
    }//GEN-LAST:event_lblThongKeMouseClicked

    private void thongtincanhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongtincanhanMouseClicked
        ThongTinCaNhan cn = new ThongTinCaNhan();
        jDesktopPane.removeAll();
        jDesktopPane.add(cn).setVisible(true);
    }//GEN-LAST:event_thongtincanhanMouseClicked

    private void lblDonHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDonHangMouseClicked
        DonHang dh = new DonHang();
        jDesktopPane.removeAll();
        jDesktopPane.add(dh).setVisible(true);
    }//GEN-LAST:event_lblDonHangMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        DoiTraHang dt = new DoiTraHang();
        jDesktopPane.removeAll();
        jDesktopPane.add(dt).setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhuyenMaiMouseClicked
        KhuyenMai km = new KhuyenMai();
        jDesktopPane.removeAll();
        jDesktopPane.add(km).setVisible(true);
    }//GEN-LAST:event_lblKhuyenMaiMouseClicked

    private void btnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseClicked
        this.dispose();
        new DangNhap().setVisible(true);
    }//GEN-LAST:event_btnDangXuatMouseClicked

    private void btnDoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMatKhauMouseClicked

        new DoiMatKhau().setVisible(true);
    }//GEN-LAST:event_btnDoiMatKhauMouseClicked

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaoDong;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnGioiThieuSanPham;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnHuongDanSuDung;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnKhuyenMai;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblDonHang;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblKhuyenMai;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblThoiGian;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JLabel thongtincanhan;
    // End of variables declaration//GEN-END:variables
}
