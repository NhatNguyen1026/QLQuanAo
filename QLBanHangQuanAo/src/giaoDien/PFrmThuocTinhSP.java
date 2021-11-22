package giaoDien;

import DAO.ThuocTinhDAO;
import MODELS.ChatLieu;
import MODELS.DanhMuc;
import MODELS.DonViTinh;
import MODELS.GioiTinh;
import MODELS.KichCo;
import MODELS.MauSac;
import MODELS.NhaSanXuat;
import helper.XJdbc;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class PFrmThuocTinhSP extends javax.swing.JPanel {

    ThuocTinhDAO ttDao = new ThuocTinhDAO();

    public PFrmThuocTinhSP() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cboNhaSX = new javax.swing.JComboBox<>();
        cboKichCo = new javax.swing.JComboBox<>();
        cboMauSac = new javax.swing.JComboBox<>();
        cboChatLieu = new javax.swing.JComboBox<>();
        cboDanhMuc = new javax.swing.JComboBox<>();
        cboGioiTinh = new javax.swing.JComboBox<>();
        cboDonViTinh = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnThemCboNSX = new javax.swing.JButton();
        btnThemCboKichCo = new javax.swing.JButton();
        btnThemCboMauSac = new javax.swing.JButton();
        btnThemCboChatLieu = new javax.swing.JButton();
        btnThemCboDanhMuc = new javax.swing.JButton();
        btnThemCboGioiTinh = new javax.swing.JButton();
        btnThemCboDonVi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNSX = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKichCo = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblChatLieu = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMauSac = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDanhMuc = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblGioiTinh = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblDonViTinh = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel14.setText("Thuộc tính ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin "));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nhà Sản Xuất:");

        cboNhaSX.setEditable(true);
        cboNhaSX.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboNhaSX.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cboKichCo.setEditable(true);
        cboKichCo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboKichCo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cboMauSac.setEditable(true);
        cboMauSac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboMauSac.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cboChatLieu.setEditable(true);
        cboChatLieu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboChatLieu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cboDanhMuc.setEditable(true);
        cboDanhMuc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cboGioiTinh.setEditable(true);
        cboGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cboDonViTinh.setEditable(true);
        cboDonViTinh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboDonViTinh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Đơn Vị Tính:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Giới Tính:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Danh Mục:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Chất Liệu:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Màu Sắc:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Kích Cỡ:");

        btnThemCboNSX.setText("+");
        btnThemCboNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCboNSXActionPerformed(evt);
            }
        });

        btnThemCboKichCo.setText("+");
        btnThemCboKichCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCboKichCoActionPerformed(evt);
            }
        });

        btnThemCboMauSac.setText("+");
        btnThemCboMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCboMauSacActionPerformed(evt);
            }
        });

        btnThemCboChatLieu.setText("+");
        btnThemCboChatLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCboChatLieuActionPerformed(evt);
            }
        });

        btnThemCboDanhMuc.setText("+");
        btnThemCboDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCboDanhMucActionPerformed(evt);
            }
        });

        btnThemCboGioiTinh.setText("+");
        btnThemCboGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCboGioiTinhActionPerformed(evt);
            }
        });

        btnThemCboDonVi.setText("+");
        btnThemCboDonVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCboDonViActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboGioiTinh, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboDanhMuc, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboChatLieu, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboMauSac, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboKichCo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboNhaSX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThemCboDanhMuc)
                    .addComponent(btnThemCboGioiTinh)
                    .addComponent(btnThemCboMauSac)
                    .addComponent(btnThemCboDonVi)
                    .addComponent(btnThemCboChatLieu)
                    .addComponent(btnThemCboNSX)
                    .addComponent(btnThemCboKichCo))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboNhaSX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemCboNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThemCboKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnThemCboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThemCboChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemCboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(btnThemCboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnThemCboDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(319, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboChatLieu, cboDanhMuc, cboDonViTinh, cboGioiTinh, cboKichCo, cboMauSac, cboNhaSX, jLabel10, jLabel13, jLabel3, jLabel4, jLabel7, jLabel8, jLabel9});

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách "));

        tblNSX.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nhà Sản Xuất "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNSX.setRowHeight(22);
        tblNSX.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblNSX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblNSXMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblNSX);

        tblKichCo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kích cỡ "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKichCo.setRowHeight(22);
        tblKichCo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblKichCo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblKichCoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblKichCo);

        tblChatLieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chất Liệu "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChatLieu.setRowHeight(22);
        tblChatLieu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblChatLieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblChatLieuMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tblChatLieu);

        tblMauSac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Màu Sắc "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMauSac.setRowHeight(22);
        tblMauSac.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblMauSac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblMauSacMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tblMauSac);

        tblDanhMuc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Danh Mục "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhMuc.setRowHeight(22);
        tblDanhMuc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDanhMuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDanhMucMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tblDanhMuc);

        tblGioiTinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Giới Tính "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGioiTinh.setRowHeight(22);
        tblGioiTinh.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblGioiTinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblGioiTinhMousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(tblGioiTinh);

        tblDonViTinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Đơn Vị Tính "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDonViTinh.setRowHeight(22);
        tblDonViTinh.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDonViTinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDonViTinhMousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(tblDonViTinh);

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tìm kiếm:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemCboNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCboNSXActionPerformed
        String nhaSX = cboNhaSX.getSelectedItem().toString();

        if (checkValidateCombo(cboNhaSX)) {
            return;
        }
        if (!helper.MsgBox.confirm(null, "Bạn có muốn thêm " + nhaSX + " vào hệ thống?")) {
            return;
        }

        XJdbc.update("insert into NhaSanXuat(TenNhaSX) values(?)", nhaSX);
        fillComboNSX();
        fillTableNSX();
        cboNhaSX.setSelectedIndex(cboNhaSX.getItemCount() - 1);
    }//GEN-LAST:event_btnThemCboNSXActionPerformed

    private void btnThemCboKichCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCboKichCoActionPerformed
        String kichCo = cboKichCo.getSelectedItem().toString();

        if (checkValidateCombo(cboKichCo)) {
            return;
        }
        if (!helper.MsgBox.confirm(null, "Bạn có muốn thêm " + kichCo + " vào hệ thống?")) {
            return;
        }

        XJdbc.update("insert into KichCoSP(KichCo) values(?)", kichCo);
        fillComboKichCo();
        fillTableKichCo();
        cboKichCo.setSelectedIndex(cboKichCo.getItemCount() - 1);
    }//GEN-LAST:event_btnThemCboKichCoActionPerformed

    private void btnThemCboMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCboMauSacActionPerformed
        String mauSac = cboMauSac.getSelectedItem().toString();

        if (checkValidateCombo(cboMauSac)) {
            return;
        }
        if (!helper.MsgBox.confirm(null, "Bạn có muốn thêm " + mauSac + " vào hệ thống?")) {
            return;
        }

        XJdbc.update("insert into MauSac(MauSac) values(?)", mauSac);
        fillComboMauSac();
        fillTableMauSac();
        cboMauSac.setSelectedIndex(cboMauSac.getItemCount() - 1);
    }//GEN-LAST:event_btnThemCboMauSacActionPerformed

    private void btnThemCboChatLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCboChatLieuActionPerformed
        String chatLieu = cboChatLieu.getSelectedItem().toString();

        if (checkValidateCombo(cboChatLieu)) {
            return;
        }
        if (!helper.MsgBox.confirm(null, "Bạn có muốn thêm " + chatLieu + " vào hệ thống?")) {
            return;
        }

        XJdbc.update("insert into ChatLieu(ChatLieuSP) values(?)", chatLieu);
        fillComboChatLieu();
        fillTableChatLieu();
        cboChatLieu.setSelectedIndex(cboChatLieu.getItemCount() - 1);
    }//GEN-LAST:event_btnThemCboChatLieuActionPerformed

    private void btnThemCboDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCboDanhMucActionPerformed
        String danhMuc = cboDanhMuc.getSelectedItem().toString();

        if (checkValidateCombo(cboDanhMuc)) {
            return;
        }
        if (!helper.MsgBox.confirm(null, "Bạn có muốn thêm " + danhMuc + " vào hệ thống?")) {
            return;
        }

        XJdbc.update("insert into DanhMucSP(TenDanhMuc) values(?)", danhMuc);
        fillComboDanhMuc();
        fillTableDanhMuc();
        cboDanhMuc.setSelectedIndex(cboDanhMuc.getItemCount() - 1);
    }//GEN-LAST:event_btnThemCboDanhMucActionPerformed

    private void btnThemCboGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCboGioiTinhActionPerformed
        String gioiTinh = cboGioiTinh.getSelectedItem().toString();

        if (checkValidateCombo(cboGioiTinh)) {
            return;
        }
        if (!helper.MsgBox.confirm(null, "Bạn có muốn thêm " + gioiTinh + " vào hệ thống?")) {
            return;
        }

        XJdbc.update("insert into GioiTinh(GioiTinh) values(?)", gioiTinh);
        fillComboGioiTinh();
        fillTableGioiTinh();
        cboGioiTinh.setSelectedIndex(cboGioiTinh.getItemCount() - 1);
    }//GEN-LAST:event_btnThemCboGioiTinhActionPerformed

    private void btnThemCboDonViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCboDonViActionPerformed
        String donVi = cboDonViTinh.getSelectedItem().toString();

        if (checkValidateCombo(cboDonViTinh)) {
            return;
        }
        if (!helper.MsgBox.confirm(null, "Bạn có muốn thêm " + donVi + " vào hệ thống?")) {
            return;
        }

        XJdbc.update("insert into DonViTinh(DonViTinh) values(?)", donVi);
        fillComboDonVi();
        fillTableDonVi();
        cboDonViTinh.setSelectedIndex(cboDonViTinh.getItemCount() - 1);
    }//GEN-LAST:event_btnThemCboDonViActionPerformed

    private void tblNSXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNSXMousePressed
        int row;
        if (evt.getClickCount() == 2) {
            row = tblNSX.getSelectedRow();
            int id = 0;
            if (!helper.MsgBox.confirm(null, "Bạn có muốn sửa NSX " + tblNSX.getValueAt(row, 0).toString() + " trong hệ thống?")) {
                return;
            }
            try {
                String sql1 = "select * from NhaSanXuat where TenNhaSX = ?";
                ResultSet rs = XJdbc.query(sql1, tblNSX.getValueAt(row, 0).toString());
                while (rs.next()) {
                    id = rs.getInt(1);
                }
            } catch (Exception e) {
                helper.MsgBox.alert(null, "Lỗi tìm NSX");
            }
            String fix;
            List<NhaSanXuat> lst = ttDao.selectNSX();
            while (true) {
                fix = helper.MsgBox.prompt(this, "Xin mời nhập tên NSX mới:");
                boolean flag = false;
                for (NhaSanXuat nsx : lst) {
                    if (nsx.getNhaSanXuat().equalsIgnoreCase(fix)) {
                        flag = true;
                    }
                }
                if (fix.isEmpty()) {
                    helper.MsgBox.alert(this, "Xin mời nhập tên cho NSX");
                } else if (flag) {
                    helper.MsgBox.alert(this, "NSX này đã bị trùng");
                } else {
                    try {
                        String sql = "update NhaSanXuat set TenNhaSX = ? where IDNhaSanXuat = ?";
                        XJdbc.update(sql, fix, id);
                        fillTableNSX();
                        fillComboNSX();
                    } catch (Exception e) {
                        helper.MsgBox.alert(null, "Lỗi sửa NSX");
                    }
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblNSXMousePressed

    private void tblKichCoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKichCoMousePressed
        int row;
        if (evt.getClickCount() == 2) {
            row = tblKichCo.getSelectedRow();
            if (!helper.MsgBox.confirm(null, "Bạn có muốn sửa kích cỡ " + tblKichCo.getValueAt(row, 0).toString() + " trong hệ thống?")) {
                return;
            }
            int id = 0;
            try {
                String sql1 = "select * from KichCoSP where KichCo = ?";
                ResultSet rs = XJdbc.query(sql1, tblKichCo.getValueAt(row, 0).toString());
                while (rs.next()) {
                    id = rs.getInt(1);
                }
            } catch (Exception e) {
                helper.MsgBox.alert(null, "Lỗi tìm kích cỡ");
            }
            String fix;
            List<KichCo> lst = ttDao.selectKichCo();
            while (true) {
                fix = helper.MsgBox.prompt(this, "Xin mời nhập kích cỡ mới:");
                boolean flag = false;
                for (KichCo kc : lst) {
                    if (kc.getKichCo().equalsIgnoreCase(fix)) {
                        flag = true;
                    }
                }
                if (fix.isEmpty()) {
                    helper.MsgBox.alert(this, "Xin mời nhập kích cỡ");
                } else if (flag) {
                    helper.MsgBox.alert(this, "Kích cỡ này đã bị trùng");
                } else {
                    try {
                        String sql = "update KichCoSP set KichCo = ? where IDKichCo = ?";
                        XJdbc.update(sql, fix, id);
                        fillTableKichCo();
                        fillComboKichCo();
                    } catch (Exception e) {
                        helper.MsgBox.alert(null, "Lỗi sửa kích cỡ");
                    }
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblKichCoMousePressed

    private void tblMauSacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMauSacMousePressed
        int row;
        if (evt.getClickCount() == 2) {
            row = tblMauSac.getSelectedRow();
            if (!helper.MsgBox.confirm(null, "Bạn có muốn sửa màu " + tblMauSac.getValueAt(row, 0).toString() + " trong hệ thống?")) {
                return;
            }
            int id = 0;
            try {
                String sql1 = "select * from MauSac where MauSac = ?";
                ResultSet rs = XJdbc.query(sql1, tblMauSac.getValueAt(row, 0).toString());
                while (rs.next()) {
                    id = rs.getInt(1);
                }
            } catch (Exception e) {
                helper.MsgBox.alert(null, "Lỗi tìm màu");
            }
            String fix;
            List<MauSac> lst = ttDao.selectMauSac();
            while (true) {
                fix = helper.MsgBox.prompt(this, "Xin mời nhập màu sắc mới:");
                boolean flag = false;
                for (MauSac ms : lst) {
                    if (ms.getMauSac().equalsIgnoreCase(fix)) {
                        flag = true;
                    }
                }
                if (fix.isEmpty()) {
                    helper.MsgBox.alert(this, "Xin mời nhập màu sắc");
                } else if (flag) {
                    helper.MsgBox.alert(this, "Màu sắc này đã bị trùng");
                } else {
                    try {
                        String sql = "update MauSac set MauSac = ? where IDMauSac = ?";
                        XJdbc.update(sql, fix, id);
                        fillTableMauSac();
                        fillComboMauSac();
                    } catch (Exception e) {
                        helper.MsgBox.alert(null, "Lỗi sửa màu sắc");
                    }
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblMauSacMousePressed

    private void tblChatLieuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChatLieuMousePressed
        int row;
        if (evt.getClickCount() == 2) {
            row = tblChatLieu.getSelectedRow();
            if (!helper.MsgBox.confirm(null, "Bạn có muốn sửa chất liệu " + tblChatLieu.getValueAt(row, 0).toString() + " trong hệ thống?")) {
                return;
            }
            int id = 0;
            try {
                String sql1 = "select * from ChatLieu where ChatLieuSP = ?";
                ResultSet rs = XJdbc.query(sql1, tblChatLieu.getValueAt(row, 0).toString());
                while (rs.next()) {
                    id = rs.getInt(1);
                }
            } catch (Exception e) {
                helper.MsgBox.alert(null, "Lỗi tìm chất liệu");
            }
            String fix;
            List<ChatLieu> lst = ttDao.selectChatLieu();
            while (true) {
                fix = helper.MsgBox.prompt(this, "Xin mời nhập chất liệu mới:");
                boolean flag = false;
                for (ChatLieu cl : lst) {
                    if (cl.getChatLieu().equalsIgnoreCase(fix)) {
                        flag = true;
                    }
                }
                if (fix.isEmpty()) {
                    helper.MsgBox.alert(this, "Xin mời nhập chất liệu");
                } else if (flag) {
                    helper.MsgBox.alert(this, "Chất liệu này đã bị trùng");
                } else {
                    try {
                        String sql = "update ChatLieu set ChatLieuSP = ? where IDChatLieu = ?";
                        XJdbc.update(sql, fix, id);
                        fillTableChatLieu();
                        fillComboChatLieu();
                    } catch (Exception e) {
                        helper.MsgBox.alert(null, "Lỗi sửa chất liệu");
                    }
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblChatLieuMousePressed

    private void tblDanhMucMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhMucMousePressed
        int row;
        if (evt.getClickCount() == 2) {
            row = tblDanhMuc.getSelectedRow();
            if (!helper.MsgBox.confirm(null, "Bạn có muốn sửa danh mục " + tblDanhMuc.getValueAt(row, 0).toString() + " trong hệ thống?")) {
                return;
            }
            int id = 0;
            try {
                String sql1 = "select * from DanhMucSP where TenDanhMuc = ?";
                ResultSet rs = XJdbc.query(sql1, tblDanhMuc.getValueAt(row, 0).toString());
                while (rs.next()) {
                    id = rs.getInt(1);
                }
            } catch (Exception e) {
                helper.MsgBox.alert(null, "Lỗi tìm danh mục");
            }
            String fix;
            List<DanhMuc> lst = ttDao.selectDanhMuc();
            while (true) {
                fix = helper.MsgBox.prompt(this, "Xin mời nhập danh mục mới:");
                boolean flag = false;
                for (DanhMuc dm : lst) {
                    if (dm.getDanhMuc().equalsIgnoreCase(fix)) {
                        flag = true;
                    }
                }
                if (fix.isEmpty()) {
                    helper.MsgBox.alert(this, "Xin mời nhập danh mục");
                } else if (flag) {
                    helper.MsgBox.alert(this, "Danh mục này đã bị trùng");
                } else {
                    try {
                        String sql = "update DanhMucSP set TenDanhMuc = ? where IDDanhMuc = ?";
                        XJdbc.update(sql, fix, id);
                        fillTableDanhMuc();
                        fillComboDanhMuc();
                    } catch (Exception e) {
                        helper.MsgBox.alert(null, "Lỗi sửa chất liệu");
                    }
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblDanhMucMousePressed

    private void tblGioiTinhMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGioiTinhMousePressed
        int row;
        if (evt.getClickCount() == 2) {
            row = tblGioiTinh.getSelectedRow();
            if (!helper.MsgBox.confirm(null, "Bạn có muốn sửa giới tính " + tblGioiTinh.getValueAt(row, 0).toString() + " trong hệ thống?")) {
                return;
            }
            int id = 0;
            try {
                String sql1 = "select * from GioiTinh where GioiTinh = ?";
                ResultSet rs = XJdbc.query(sql1, tblGioiTinh.getValueAt(row, 0).toString());
                while (rs.next()) {
                    id = rs.getInt(1);
                }
            } catch (Exception e) {
                helper.MsgBox.alert(null, "Lỗi tìm giới tính");
            }
            String fix;
            List<GioiTinh> lst = ttDao.selectGioiTinh();
            while (true) {
                fix = helper.MsgBox.prompt(this, "Xin mời nhập giới tính mới:");
                boolean flag = false;
                for (GioiTinh gt : lst) {
                    if (gt.getGioiTinh().equalsIgnoreCase(fix)) {
                        flag = true;
                    }
                }
                if (fix.isEmpty()) {
                    helper.MsgBox.alert(this, "Xin mời nhập giới tính");
                } else if (flag) {
                    helper.MsgBox.alert(this, "Giới tính này đã bị trùng");
                } else {
                    try {
                        String sql = "update GioiTinh set GioiTinh = ? where IDGioiTinh = ?";
                        XJdbc.update(sql, fix, id);
                        fillTableGioiTinh();
                        fillComboGioiTinh();
                    } catch (Exception e) {
                        helper.MsgBox.alert(null, "Lỗi sửa giới tính");
                    }
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblGioiTinhMousePressed

    private void tblDonViTinhMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDonViTinhMousePressed
        int row;
        if (evt.getClickCount() == 2) {
            row = tblDonViTinh.getSelectedRow();
            if (!helper.MsgBox.confirm(null, "Bạn có muốn sửa đơn vị " + tblDonViTinh.getValueAt(row, 0).toString() + " trong hệ thống?")) {
                return;
            }
            int id = 0;
            try {
                String sql1 = "select * from DonViTinh where DonViTinh = ?";
                ResultSet rs = XJdbc.query(sql1, tblDonViTinh.getValueAt(row, 0).toString());
                while (rs.next()) {
                    id = rs.getInt(1);
                }
            } catch (Exception e) {
                helper.MsgBox.alert(null, "Lỗi tìm đơn vị");
            }
            String fix;
            List<DonViTinh> lst = ttDao.selectDonViTinh();
            while (true) {
                fix = helper.MsgBox.prompt(this, "Xin mời nhập đơn vị mới:");
                boolean flag = false;
                for (DonViTinh dvt : lst) {
                    if (dvt.getDonViTinh().equalsIgnoreCase(fix)) {
                        flag = true;
                    }
                }
                if (fix.isEmpty()) {
                    helper.MsgBox.alert(this, "Xin mời nhập đơn vị");
                } else if (flag) {
                    helper.MsgBox.alert(this, "Đơn vị này đã bị trùng");
                } else {
                    try {
                        String sql = "update DonViTinh set DonViTinh = ? where IDDonViTinh = ?";
                        XJdbc.update(sql, fix, id);
                        fillTableDonVi();
                        fillComboDonVi();
                    } catch (Exception e) {
                        helper.MsgBox.alert(null, "Lỗi sửa đơn vị");
                    }
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblDonViTinhMousePressed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        String timKiem = txtTimKiem.getText();
        filterTable(tblNSX, timKiem);
        filterTable(tblChatLieu, timKiem);
        filterTable(tblDanhMuc, timKiem);
        filterTable(tblMauSac, timKiem);
        filterTable(tblKichCo, timKiem);
        filterTable(tblDonViTinh, timKiem);
        filterTable(tblGioiTinh, timKiem);
    }//GEN-LAST:event_txtTimKiemKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemCboChatLieu;
    private javax.swing.JButton btnThemCboDanhMuc;
    private javax.swing.JButton btnThemCboDonVi;
    private javax.swing.JButton btnThemCboGioiTinh;
    private javax.swing.JButton btnThemCboKichCo;
    private javax.swing.JButton btnThemCboMauSac;
    private javax.swing.JButton btnThemCboNSX;
    private javax.swing.JComboBox<String> cboChatLieu;
    private javax.swing.JComboBox<String> cboDanhMuc;
    private javax.swing.JComboBox<String> cboDonViTinh;
    private javax.swing.JComboBox<String> cboGioiTinh;
    private javax.swing.JComboBox<String> cboKichCo;
    private javax.swing.JComboBox<String> cboMauSac;
    private javax.swing.JComboBox<String> cboNhaSX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tblChatLieu;
    private javax.swing.JTable tblDanhMuc;
    private javax.swing.JTable tblDonViTinh;
    private javax.swing.JTable tblGioiTinh;
    private javax.swing.JTable tblKichCo;
    private javax.swing.JTable tblMauSac;
    private javax.swing.JTable tblNSX;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void init() {
        fillComboDanhMuc();
        fillComboNSX();
        fillComboKichCo();
        fillComboMauSac();
        fillComboChatLieu();
        fillComboDonVi();
        fillComboGioiTinh();
        fillTableNSX();
        fillTableKichCo();
        fillTableMauSac();
        fillTableChatLieu();
        fillTableDanhMuc();
        fillTableGioiTinh();
        fillTableDonVi();
    }

    private void fillComboDanhMuc() {
        AutoCompleteDecorator.decorate(cboDanhMuc);
        DefaultComboBoxModel modelCombo = (DefaultComboBoxModel) cboDanhMuc.getModel();
        modelCombo.removeAllElements();
        try {
            String sql = "select * from DanhMucSP";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                modelCombo.addElement(new DanhMuc(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            helper.MsgBox.alert(null, "Lỗi combo");
        }
        cboDanhMuc.setSelectedIndex(0);
    }

    private void fillComboNSX() {
        AutoCompleteDecorator.decorate(cboNhaSX);
        DefaultComboBoxModel modelCombo = (DefaultComboBoxModel) cboNhaSX.getModel();
        modelCombo.removeAllElements();
        try {
            String sql = "select * from NhaSanXuat";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                modelCombo.addElement(new NhaSanXuat(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            helper.MsgBox.alert(null, "Lỗi combo");
        }
        cboNhaSX.setSelectedIndex(0);
    }

    private void fillComboKichCo() {
        AutoCompleteDecorator.decorate(cboKichCo);
        DefaultComboBoxModel modelCombo = (DefaultComboBoxModel) cboKichCo.getModel();
        modelCombo.removeAllElements();
        try {
            String sql = "select * from KichCoSP";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                modelCombo.addElement(new KichCo(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            helper.MsgBox.alert(null, "Lỗi combo");
        }
        cboKichCo.setSelectedIndex(0);
    }

    private void fillComboMauSac() {
        AutoCompleteDecorator.decorate(cboMauSac);
        DefaultComboBoxModel modelCombo = (DefaultComboBoxModel) cboMauSac.getModel();
        modelCombo.removeAllElements();
        try {
            String sql = "select * from MauSac";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                modelCombo.addElement(new MauSac(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            helper.MsgBox.alert(null, "Lỗi combo");
        }
        cboMauSac.setSelectedIndex(0);
    }

    private void fillComboChatLieu() {
        AutoCompleteDecorator.decorate(cboChatLieu);
        DefaultComboBoxModel modelCombo = (DefaultComboBoxModel) cboChatLieu.getModel();
        modelCombo.removeAllElements();
        try {
            String sql = "select * from ChatLieu";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                modelCombo.addElement(new ChatLieu(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            helper.MsgBox.alert(null, "Lỗi combo");
        }
        cboChatLieu.setSelectedIndex(0);
    }

    private void fillComboDonVi() {
        AutoCompleteDecorator.decorate(cboDonViTinh);
        DefaultComboBoxModel modelCombo = (DefaultComboBoxModel) cboDonViTinh.getModel();
        modelCombo.removeAllElements();
        try {
            String sql = "select * from DonViTinh";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                modelCombo.addElement(new DonViTinh(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            helper.MsgBox.alert(null, "Lỗi combo");
        }
        cboDonViTinh.setSelectedIndex(0);
    }

    private void fillComboGioiTinh() {
        AutoCompleteDecorator.decorate(cboGioiTinh);
        DefaultComboBoxModel modelCombo = (DefaultComboBoxModel) cboGioiTinh.getModel();
        modelCombo.removeAllElements();
        try {
            String sql = "select * from GioiTinh";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                modelCombo.addElement(new GioiTinh(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            helper.MsgBox.alert(null, "Lỗi combo");
        }
        cboGioiTinh.setSelectedIndex(0);
    }

    private boolean checkValidateCombo(JComboBox cbo) {
        String temp = cbo.getSelectedItem().toString();
        int size = cbo.getItemCount();
        for (int j = 0; j < size; j++) {
            if (temp.equalsIgnoreCase(cbo.getItemAt(j).toString())) {
                helper.MsgBox.alert(null, temp + " là giá trị đã có sẵn, không được thêm trùng!");
                return true;
            }
        }
        if (temp.equals("")) {
            helper.MsgBox.alert(null, "Giá trị thêm mới không được trống!");
            return true;
        }
        return false;
    }

    private void fillTableNSX() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblNSX.getModel();
            model.setRowCount(0);
            String sql = "select * from NhaSanXuat";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(2)});
            }
        } catch (Exception e) {
            helper.MsgBox.alert(null, "Lỗi table");
        }
    }

    private void fillTableKichCo() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblKichCo.getModel();
            model.setRowCount(0);
            String sql = "select * from KichCoSP";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(2)});
            }
        } catch (Exception e) {
            helper.MsgBox.alert(null, "Lỗi table");
        }
    }

    private void fillTableMauSac() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblMauSac.getModel();
            model.setRowCount(0);
            String sql = "select * from MauSac";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(2)});
            }
        } catch (Exception e) {
            helper.MsgBox.alert(null, "Lỗi table");
        }
    }

    private void fillTableChatLieu() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblChatLieu.getModel();
            model.setRowCount(0);
            String sql = "select * from ChatLieu";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(2)});
            }
        } catch (Exception e) {
            helper.MsgBox.alert(null, "Lỗi table");
        }
    }

    private void fillTableDanhMuc() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblDanhMuc.getModel();
            model.setRowCount(0);
            String sql = "select * from DanhMucSP";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(2)});
            }
        } catch (Exception e) {
            helper.MsgBox.alert(null, "Lỗi table");
        }
    }

    private void fillTableGioiTinh() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblGioiTinh.getModel();
            model.setRowCount(0);
            String sql = "select * from GioiTinh";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(2)});
            }
        } catch (Exception e) {
            helper.MsgBox.alert(null, "Lỗi table");
        }
    }

    private void fillTableDonVi() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblDonViTinh.getModel();
            model.setRowCount(0);
            String sql = "select * from DonViTinh";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(2)});
            }
        } catch (Exception e) {
            helper.MsgBox.alert(null, "Lỗi table");
        }
    }

    private void filterTable(JTable tbl, String tk) {
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        TableRowSorter ts = new TableRowSorter<>(model);
        tbl.setRowSorter(ts);
        if (tk.trim().length() == 0) {
            ts.setRowFilter(null);
        } else {
            ts.setRowFilter(RowFilter.regexFilter("(?i)" + tk));
        }
    }

}
