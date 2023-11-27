/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author PHONG
 */
public class ThongTinCaNhan {

    private String ID;
    private String TenNV;
    private String SoDT;
    private String NgaySinh;
    private String Email;
    private String DiaChi;
    private boolean GioiTinh;
    private String Hinh;
    private String TaiKhoan;
    private String MatKhau;

    public ThongTinCaNhan() {
    }

    public ThongTinCaNhan(String ID, String TenNV, String SoDT, String NgaySinh, String Email, String DiaChi, boolean GioiTinh, String Hinh, String TaiKhoan, String MatKhau) {
        this.ID = ID;
        this.TenNV = TenNV;
        this.SoDT = SoDT;
        this.NgaySinh = NgaySinh;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.Hinh = Hinh;
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

}
