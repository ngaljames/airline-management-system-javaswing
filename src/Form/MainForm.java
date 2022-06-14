/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DungChung.DungChung;
import Model.MainDAO;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author conne
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    String chucVu = DangNhap.vt;
    
    void layTenVaChucVu()
    {
        String ten = new MainDAO().getHoTen(DangNhap.tenDN);
        lblUser.setText(ten);
        lblChucVu.setText(DangNhap.vt);
    }
    
     private void changeIcon(int so, JButton btn, String url) {
        if (so == 1) {
            Image img = getToolkit().createImage(url);
            btn.setIcon(new ImageIcon(img));
            btn.setCursor(new Cursor(HAND_CURSOR));
        } else {
            Image img = getToolkit().createImage(url);
            btn.setIcon(new ImageIcon(img));
        }
    }
    
     private void thoat()
    {
        new DungChung().thoat();
    }
    
    public MainForm() {
        initComponents();
        setLocationRelativeTo(this);
        layTenVaChucVu();
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
        jPanel2 = new javax.swing.JPanel();
        lblChuyenBay = new javax.swing.JLabel();
        lblChuyenBay1 = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        btnClose2 = new javax.swing.JButton();
        btnChuyenBay = new javax.swing.JButton();
        btnDichVu = new javax.swing.JButton();
        btnHangMayBay = new javax.swing.JButton();
        btnDoanhThuTheoTN = new javax.swing.JButton();
        btnHoaDonChiTiet = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnHanhKhach = new javax.swing.JButton();
        btnHangVe = new javax.swing.JButton();
        btnSanBay = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnMayBay = new javax.swing.JButton();
        btnLoaiVe = new javax.swing.JButton();
        btnVeMayBay = new javax.swing.JButton();
        btnTuyenbay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        lblChuyenBay.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblChuyenBay.setForeground(new java.awt.Color(255, 255, 255));
        lblChuyenBay.setText("Chuyến bay An Định Thắng");

        lblChuyenBay1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblChuyenBay1.setForeground(new java.awt.Color(255, 255, 255));
        lblChuyenBay1.setText("Hệ Thống Bán Vé Máy Bay");

        lblChucVu.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lblChucVu.setForeground(new java.awt.Color(255, 255, 255));
        lblChucVu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user.png"))); // NOI18N
        lblUser.setText("Nguyễn Văn An");

        btnClose2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/close.png"))); // NOI18N
        btnClose2.setToolTipText("");
        btnClose2.setBorder(null);
        btnClose2.setBorderPainted(false);
        btnClose2.setContentAreaFilled(false);
        btnClose2.setDefaultCapable(false);
        btnClose2.setFocusPainted(false);
        btnClose2.setFocusable(false);
        btnClose2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClose2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClose2MouseExited(evt);
            }
        });
        btnClose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(322, 322, 322)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblChuyenBay1)
                    .addComponent(lblChuyenBay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblChuyenBay))
                    .addComponent(btnClose2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblChuyenBay1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnChuyenBay.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnChuyenBay.setForeground(new java.awt.Color(0, 153, 153));
        btnChuyenBay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgChuyenBay.png"))); // NOI18N
        btnChuyenBay.setBorderPainted(false);
        btnChuyenBay.setContentAreaFilled(false);
        btnChuyenBay.setDefaultCapable(false);
        btnChuyenBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenBayActionPerformed(evt);
            }
        });

        btnDichVu.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnDichVu.setForeground(new java.awt.Color(0, 153, 153));
        btnDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgDichvu.png"))); // NOI18N
        btnDichVu.setBorderPainted(false);
        btnDichVu.setContentAreaFilled(false);
        btnDichVu.setDefaultCapable(false);
        btnDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDichVuActionPerformed(evt);
            }
        });

        btnHangMayBay.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnHangMayBay.setForeground(new java.awt.Color(0, 153, 153));
        btnHangMayBay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgHangMayBay.jpg"))); // NOI18N
        btnHangMayBay.setBorderPainted(false);
        btnHangMayBay.setContentAreaFilled(false);
        btnHangMayBay.setDefaultCapable(false);
        btnHangMayBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHangMayBayActionPerformed(evt);
            }
        });

        btnDoanhThuTheoTN.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnDoanhThuTheoTN.setForeground(new java.awt.Color(0, 153, 153));
        btnDoanhThuTheoTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgDoanhThu.png"))); // NOI18N
        btnDoanhThuTheoTN.setBorderPainted(false);
        btnDoanhThuTheoTN.setContentAreaFilled(false);
        btnDoanhThuTheoTN.setDefaultCapable(false);
        btnDoanhThuTheoTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanhThuTheoTNActionPerformed(evt);
            }
        });

        btnHoaDonChiTiet.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnHoaDonChiTiet.setForeground(new java.awt.Color(0, 153, 153));
        btnHoaDonChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgHoadonchitiet.png"))); // NOI18N
        btnHoaDonChiTiet.setBorderPainted(false);
        btnHoaDonChiTiet.setContentAreaFilled(false);
        btnHoaDonChiTiet.setDefaultCapable(false);
        btnHoaDonChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonChiTietActionPerformed(evt);
            }
        });

        btnHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnHoaDon.setForeground(new java.awt.Color(0, 153, 153));
        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgHoadon.png"))); // NOI18N
        btnHoaDon.setBorderPainted(false);
        btnHoaDon.setContentAreaFilled(false);
        btnHoaDon.setDefaultCapable(false);
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        btnHanhKhach.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnHanhKhach.setForeground(new java.awt.Color(0, 153, 153));
        btnHanhKhach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgHanhkhach.png"))); // NOI18N
        btnHanhKhach.setBorderPainted(false);
        btnHanhKhach.setContentAreaFilled(false);
        btnHanhKhach.setDefaultCapable(false);
        btnHanhKhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHanhKhachActionPerformed(evt);
            }
        });

        btnHangVe.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnHangVe.setForeground(new java.awt.Color(0, 153, 153));
        btnHangVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgHangVe.png"))); // NOI18N
        btnHangVe.setBorderPainted(false);
        btnHangVe.setContentAreaFilled(false);
        btnHangVe.setDefaultCapable(false);
        btnHangVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHangVeActionPerformed(evt);
            }
        });

        btnSanBay.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnSanBay.setForeground(new java.awt.Color(0, 153, 153));
        btnSanBay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgSanbay.png"))); // NOI18N
        btnSanBay.setBorderPainted(false);
        btnSanBay.setContentAreaFilled(false);
        btnSanBay.setDefaultCapable(false);
        btnSanBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanBayActionPerformed(evt);
            }
        });

        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnNhanVien.setForeground(new java.awt.Color(0, 153, 153));
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgNhanvien.png"))); // NOI18N
        btnNhanVien.setBorderPainted(false);
        btnNhanVien.setContentAreaFilled(false);
        btnNhanVien.setDefaultCapable(false);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnMayBay.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnMayBay.setForeground(new java.awt.Color(0, 153, 153));
        btnMayBay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgMaybay.png"))); // NOI18N
        btnMayBay.setBorderPainted(false);
        btnMayBay.setContentAreaFilled(false);
        btnMayBay.setDefaultCapable(false);
        btnMayBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayBayActionPerformed(evt);
            }
        });

        btnLoaiVe.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnLoaiVe.setForeground(new java.awt.Color(0, 153, 153));
        btnLoaiVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgLoaive.png"))); // NOI18N
        btnLoaiVe.setBorderPainted(false);
        btnLoaiVe.setContentAreaFilled(false);
        btnLoaiVe.setDefaultCapable(false);
        btnLoaiVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoaiVeActionPerformed(evt);
            }
        });

        btnVeMayBay.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnVeMayBay.setForeground(new java.awt.Color(0, 153, 153));
        btnVeMayBay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgVemaybay.png"))); // NOI18N
        btnVeMayBay.setBorderPainted(false);
        btnVeMayBay.setContentAreaFilled(false);
        btnVeMayBay.setDefaultCapable(false);
        btnVeMayBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeMayBayActionPerformed(evt);
            }
        });

        btnTuyenbay.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnTuyenbay.setForeground(new java.awt.Color(0, 153, 153));
        btnTuyenbay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgTuyenbay.png"))); // NOI18N
        btnTuyenbay.setBorderPainted(false);
        btnTuyenbay.setContentAreaFilled(false);
        btnTuyenbay.setDefaultCapable(false);
        btnTuyenbay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTuyenbayActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4.png"))); // NOI18N

        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(0, 153, 153));
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgDangxuat.png"))); // NOI18N
        btnDangXuat.setBorderPainted(false);
        btnDangXuat.setContentAreaFilled(false);
        btnDangXuat.setDefaultCapable(false);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHangMayBay)
                    .addComponent(btnTuyenbay)
                    .addComponent(btnMayBay)
                    .addComponent(btnSanBay))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVeMayBay)
                            .addComponent(btnHangVe)
                            .addComponent(btnLoaiVe, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnChuyenBay))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNhanVien, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnHanhKhach, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDoanhThuTheoTN, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnHoaDonChiTiet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(btnDangXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel1))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMayBay, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDangXuat, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTuyenbay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSanBay))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnLoaiVe)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnHangVe))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnDichVu)
                                            .addComponent(btnHoaDon)
                                            .addComponent(btnChuyenBay))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnHoaDonChiTiet)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHangMayBay)
                            .addComponent(btnVeMayBay)
                            .addComponent(btnDoanhThuTheoTN)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnNhanVien)
                        .addGap(18, 18, 18)
                        .addComponent(btnHanhKhach)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSanBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanBayActionPerformed
        // TODO add your handling code here:
        new SanBay().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSanBayActionPerformed

    private void btnMayBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayBayActionPerformed
        // TODO add your handling code here:
        new MayBay().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMayBayActionPerformed

    private void btnTuyenbayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTuyenbayActionPerformed
        // TODO add your handling code here:
        new TuyenBay().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTuyenbayActionPerformed

    private void btnChuyenBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenBayActionPerformed
        // TODO add your handling code here:
        new ChuyenBay().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnChuyenBayActionPerformed

    private void btnHangMayBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHangMayBayActionPerformed
        // TODO add your handling code here:
        new HangMayBay().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHangMayBayActionPerformed

    private void btnLoaiVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoaiVeActionPerformed
        // TODO add your handling code here:
        new LoaiVe().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoaiVeActionPerformed

    private void btnHangVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHangVeActionPerformed
        // TODO add your handling code here:
        new HangVe().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHangVeActionPerformed

    private void btnVeMayBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeMayBayActionPerformed
        // TODO add your handling code here:
        new VeMayBay().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVeMayBayActionPerformed

    private void btnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDichVuActionPerformed
        // TODO add your handling code here:
        new DichVu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDichVuActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        new NhanVien().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        // TODO add your handling code here:
        new HoaDon().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnHoaDonChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonChiTietActionPerformed
        // TODO add your handling code here:
        new HoaDonChiTiet().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHoaDonChiTietActionPerformed

    private void btnDoanhThuTheoTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanhThuTheoTNActionPerformed
        // TODO add your handling code here:
          if (chucVu.equals("Trưởng phòng")) {
              new DoanhThuTheoThang().setVisible(true);
              this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Chỉ trưởng phòng được phép mở.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDoanhThuTheoTNActionPerformed

    private void btnHanhKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHanhKhachActionPerformed
        // TODO add your handling code here:
        new HanhKhach().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHanhKhachActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        new DangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnClose2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose2MouseEntered
        changeIcon(1, btnClose2, "src//Icon//closeGray.png");
    }//GEN-LAST:event_btnClose2MouseEntered

    private void btnClose2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose2MouseExited
        changeIcon(2, btnClose2, "src//Icon//close.png");
    }//GEN-LAST:event_btnClose2MouseExited

    private void btnClose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose2ActionPerformed
        thoat();
    }//GEN-LAST:event_btnClose2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenBay;
    private javax.swing.JButton btnClose2;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDichVu;
    private javax.swing.JButton btnDoanhThuTheoTN;
    private javax.swing.JButton btnHangMayBay;
    private javax.swing.JButton btnHangVe;
    private javax.swing.JButton btnHanhKhach;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnHoaDonChiTiet;
    private javax.swing.JButton btnLoaiVe;
    private javax.swing.JButton btnMayBay;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSanBay;
    private javax.swing.JButton btnTuyenbay;
    private javax.swing.JButton btnVeMayBay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblChuyenBay;
    private javax.swing.JLabel lblChuyenBay1;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}