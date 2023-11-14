create database duan1_nhom1
go
use  duan1_nhom1
go



CREATE TABLE NhaCungCap
(
  MaNCC NVARCHAR(50) NOT NULL,
  TenNCC NVARCHAR(225) NOT NULL,
  SDT NVARCHAR(20) NOT NULL,
  DiaChi NVARCHAR(225) NOT NULL,
  Email NVARCHAR(225) NOT NULL,
  PRIMARY KEY (MaNCC)
);

CREATE TABLE ThuongHieu
(
  MaTH NVARCHAR(50) NOT NULL,
  TenTH NVARCHAR(225) NOT NULL,
  MoTa NVARCHAR(225) NOT NULL,
  PRIMARY KEY (MaTH)
);

CREATE TABLE KhachHang
(
  MaKH NVARCHAR(50) NOT NULL,
  TenKH NVARCHAR(225) NOT NULL,
  SDT NVARCHAR(225) NOT NULL,
  DiaChi NVARCHAR(225) NOT NULL,
  Email NVARCHAR(225) NOT NULL,
  GioiTinh NVARCHAR(225) NOT NULL,
  NgaySinh DATE NOT NULL,
  TichDiem NVARCHAR(50) NOT NULL,
  NhomKhachHang INT NOT NULL,
  PRIMARY KEY (MaKH)
);

CREATE TABLE TaiKhoan
(
  ID NVARCHAR(20) NOT NULL,
  TaiKhoan NVARCHAR(225) NOT NULL,
  MatKhau NVARCHAR(25) NOT NULL,
  VaiTro NVARCHAR(100) NOT NULL,
  TenNV NVARCHAR(225) NOT NULL,
  DiaChi NVARCHAR(225) NOT NULL,
  NgaySinh DATE NOT NULL,
  GioiTinh NVARCHAR(225) NOT NULL,
  Email NVARCHAR(225) NOT NULL,
  SDT NVARCHAR(225) NOT NULL,
  HinhAnh NVARCHAR(225) NOT NULL,
  LichLamViec NVARCHAR(225) NOT NULL,
  PRIMARY KEY (ID)
);

CREATE TABLE HoaDon
(
  MaHD NVARCHAR(50) NOT NULL,
  NgayTao DATE NOT NULL,
  TinhTrang NVARCHAR(225) NOT NULL,
  ID NVARCHAR(20) NOT NULL,
  MaKH NVARCHAR(50) NOT NULL,
  PRIMARY KEY (MaHD),
  FOREIGN KEY (ID) REFERENCES TaiKhoan(ID),
  FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH)
);

CREATE TABLE LichSuMuaHang
(
  MaDH NVARCHAR(20) NOT NULL,
  NgayTao DATE NOT NULL,
  TinhTrang NVARCHAR(100) NOT NULL,
  TongTien NVARCHAR(1000) NOT NULL,
  MaKH NVARCHAR(50) NOT NULL,
  PRIMARY KEY (MaDH),
  FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH)
);

CREATE TABLE KhuyenMai
(
  MaKM NVARCHAR(50) NOT NULL,
  TenKM NVARCHAR(225) NOT NULL,
  NgayBD DATE NOT NULL,
  NgayKT DATE NOT NULL,
  GiaTriGiam NVARCHAR(225) NOT NULL,
  TrangThai NVARCHAR(225) NOT NULL,
  HinhThucKM NVARCHAR(225) NOT NULL,
  PRIMARY KEY (MaKM)
);

CREATE TABLE SanPham
(
  TenSP NVARCHAR(225) NOT NULL,
  MaSP NVARCHAR(50) NOT NULL,
  SoLuongTonKho INT NOT NULL,
  MauSac NVARCHAR(225) NOT NULL,
  KichCo INT NOT NULL,
  ChatLieu NVARCHAR(225) NOT NULL,
  MoTa NVARCHAR(225) NOT NULL,
  MaTH NVARCHAR(50) NOT NULL,
  MaNCC NVARCHAR(50) NOT NULL,
  PRIMARY KEY (MaSP),
  FOREIGN KEY (MaTH) REFERENCES ThuongHieu(MaTH),
  FOREIGN KEY (MaNCC) REFERENCES NhaCungCap(MaNCC)
);

CREATE TABLE GiaBan
(
  DonGia DECIMAL(20,0) NOT NULL,
  NgayBD DATE NOT NULL,
  NgayKT DATE NOT NULL,
  MaGia INT NOT NULL,
  MaSP NVARCHAR(50) NOT NULL,
  PRIMARY KEY (MaGia),
  FOREIGN KEY (MaSP) REFERENCES SanPham(MaSP)
);

CREATE TABLE HoaDonChiTiet
(
  SoLuong INT NOT NULL,
  ThanhTien DECIMAL(20,0) NOT NULL,
  MaSP NVARCHAR(50) NOT NULL,
  MaHD NVARCHAR(50) NOT NULL,
  PRIMARY KEY (MaSP, MaHD),
  FOREIGN KEY (MaSP) REFERENCES SanPham(MaSP),
  FOREIGN KEY (MaHD) REFERENCES HoaDon(MaHD)
);

CREATE TABLE SanPham_KhuyenMai
(
  MaSP NVARCHAR(50) NOT NULL,
  MaKM NVARCHAR(50) NOT NULL,
  PRIMARY KEY (MaSP, MaKM),
  FOREIGN KEY (MaSP) REFERENCES SanPham(MaSP),
  FOREIGN KEY (MaKM) REFERENCES KhuyenMai(MaKM)
);



--------------------------------------------------------------------------------------
-- Insert data into NhaCungCap table
INSERT INTO NhaCungCap (MaNCC, TenNCC, SDT, DiaChi, Email) 
VALUES 
  ('NCC001', 'Adidas Supplier', '123456789', '123 Sneaker Street, Adidas City', 'adidas_supplier@example.com'),
  ('NCC002', 'Nike Supplier', '987654321', '456 Sneaker Avenue, Nike Town', 'nike_supplier@example.com'),
  ('NCC003', 'Puma Supplier', '555555555', '789 Sneaker Boulevard, Puma Village', 'puma_supplier@example.com'),
  ('NCC004', 'Converse Supplier', '333333333', '101 Sneaker Lane, Converse District', 'converse_supplier@example.com');

-- Insert data into ThuongHieu table
INSERT INTO ThuongHieu (MaTH, TenTH, MoTa) 
VALUES 
   ('TH001', 'Adidas', N'Adidas là một trong những thương hiệu thể thao nổi tiếng trên toàn thế giới, chuyên sản xuất giày, quần áo và phụ kiện thể thao với thiết kế đẹp và chất lượng cao.'),
  ('TH002', 'Nike', N'Nike là thương hiệu thể thao hàng đầu với đa dạng sản phẩm bao gồm giày, áo, và dụng cụ thể thao. Nike luôn nỗ lực mang lại sự đổi mới và hiệu suất tốt nhất cho người tiêu dùng.'),
  ('TH003', 'Puma', N'Puma là thương hiệu thể thao quốc tế với lịch sử lâu dài, nổi tiếng với những sản phẩm thoải mái và phong cách độc đáo.'),
  ('TH004', 'Converse', N'Converse là thương hiệu nổi tiếng với dòng sản phẩm giày Chuck Taylor All Star, là biểu tượng của văn hóa sneaker và thời trang.');

-- Insert data into KhachHang table
INSERT INTO KhachHang (MaKH, TenKH, SDT, DiaChi, Email, GioiTinh, NgaySinh, TichDiem, NhomKhachHang) 
VALUES 
  ('KH001', N'Phạm Hoài Phong', '987654321', N'Lê Văn Sỹ, Quận Tân Bình', 'phong@gmail.com', N'Nam', '1995-01-01', '0', 1),
  ('KH002', N'Trần Gia Tiên', '123456789', N'Quang Trung, Gò Vấp', 'tien@gmail.com', N'Nữ', '1990-05-15', '50', 2),
  ('KH003', N'Phan Đình Gót', '555555555', N'CMT8, Quận 1', 'got@gmail.com', N'Nam', '1988-11-30', '100', 1),
  ('KH004', N'Nguyễn Thanh Thảo', '333333333', N'Thống Nhất, Gò Vấp', 'thao@gmail.com', N'Nữ', '2000-03-20', '30', 2);

-- Insert data into TaiKhoan table
INSERT INTO TaiKhoan (ID, TaiKhoan, MatKhau, VaiTro, TenNV, DiaChi, NgaySinh, GioiTinh, Email, SDT, HinhAnh, LichLamViec) 
VALUES 
  ('ID001', 'sy levan', '123', N'Admin', N'Lê Văn Sỹ', N'Gò Vấp', '1990-01-01', N'Nam', 'sy@gmail.com', '0123456789', 'avatar1.jpg', 'Ca 1'),
  ('ID002', 'nhu tran', '123', N'Nhân viên', N'Trần Gia Như', N'Tân Bình', '1995-05-15', N'Nữ', 'nhu@gmail.com', '0987654321', 'avatar2.jpg', 'Ca 2'),
  ('ID003', 'anh long', '9999', N'Nhân viên', N'Phan Văn Long', N'Quận 1', '1988-11-30', N'Nam', 'long@gmail.com', '0555555555', 'avatar3.jpg', 'Ca 3'),
  ('ID004', 'phan thi', '123', N'Admin', N'Phan Thị', N'Quận 10', '2000-03-20', N'Nữ', 'thi@gmail.com', '0333333333', 'avatar4.jpg', 'Ca 4');

-- Insert data into HoaDon table
INSERT INTO HoaDon (MaHD, NgayTao, TinhTrang, ID, MaKH) 
VALUES 
  ('HD001', '2023-01-01', N'Chưa thanh toán', 'ID001', 'KH001'),
  ('HD002', '2023-02-01', N'Đã thanh toán', 'ID002', 'KH002'),
  ('HD003', '2023-03-01', N'Chưa thanh toán', 'ID003', 'KH003'),
  ('HD004', '2023-04-01', N'Đã thanh toán', 'ID004', 'KH004');

-- Insert data into LichSuMuaHang table
INSERT INTO LichSuMuaHang (MaDH, NgayTao, TinhTrang, TongTien, MaKH) 
VALUES 
  ('DH001', '2023-01-01', N'Đã thanh toán', '1000000', 'KH001'),
  ('DH002', '2023-02-01', N'Chưa thanh toán', '1500000', 'KH002'),
  ('DH003', '2023-03-01', N'Đã thanh toán', '800000', 'KH003'),
  ('DH004', '2023-04-01', N'Chưa thanh toán', '1200000', 'KH004');

-- Insert data into Khuyến_mãi table
INSERT INTO KhuyenMai (MaKM, TenKM, NgayBD, NgayKT, GiaTriGiam, TrangThai, HinhThucKM) 
VALUES 
  ('KM001', N'Khuyến mãi 1', '2023-01-01', '2023-01-31', '10%', N'Hoạt động', N'Giảm giá'),
  ('KM002', N'Khuyến mãi 2', '2023-02-01', '2023-02-28', '20%', N'Chưa kích hoạt', N'Tặng sản phẩm'),
  ('KM003', N'Khuyến mãi 3', '2023-03-01', '2023-03-31', '15%', N'Hoạt động', N'Giảm giá'),
  ('KM004', N'Khuyến mãi 4', '2023-04-01', '2023-04-30', '25%', N'Chưa kích hoạt', N'Tặng sản phẩm');

-- Insert data into SanPham table
INSERT INTO SanPham (TenSP, MaSP, SoLuongTonKho, MauSac, KichCo, ChatLieu, MoTa, MaTH, MaNCC) 
VALUES 
  ('UltraBoost', 'SP001', 50, N'Đen', 42, N'Da', N'Giày sneaker Adidas UltraBoost', 'TH001', 'NCC001'),
  ('Air Max', 'SP002', 70, N'Trắng', 39, N'Vải', N'Giày sneaker Nike Air Max', 'TH002', 'NCC002'),
  ('Calibrate Runner', 'SP003', 30, N'Đỏ', 38, N'Nỉ', N'Giày sneaker Puma Calibrate Runner', 'TH003', 'NCC003'),
  ('Chuck Taylor All Star', 'SP004', 90, N'Xanh', 41, N'Da', N'Giày sneaker Converse Chuck Taylor All Star', 'TH004', 'NCC004');

-- Insert data into GiaBan table
INSERT INTO GiaBan (DonGia, NgayBD, NgayKT, MaGia, MaSP) 
VALUES 
  ('500000', '2023-01-01', '2023-01-31', 1, 'SP001'),
  ('700000', '2023-02-01', '2023-02-28', 2, 'SP002'),
  ('600000', '2023-03-01', '2023-03-31', 3, 'SP003'),
  ('800000', '2023-04-01', '2023-04-30', 4, 'SP004');

-- Insert data into HoaDonChiTiet table
INSERT INTO HoaDonChiTiet (SoLuong, ThanhTien, MaSP, MaHD) 
VALUES 
  (2, '1000000', 'SP001', 'HD001'),
  (3, '2100000', 'SP002', 'HD002'),
  (1, '600000', 'SP003', 'HD003'),
  (4, '3200000', 'SP004', 'HD004');

-- Insert data into SanPham_KhuyenMai table
INSERT INTO SanPham_KhuyenMai (MaSP, MaKM) 
VALUES 
  ('SP001', 'KM001'),
  ('SP002', 'KM002'),
  ('SP003', 'KM003'),
  ('SP004', 'KM004');


