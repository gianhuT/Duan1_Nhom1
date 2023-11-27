/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ASUS
 */
public class HoaDonChiTiet {

    private int soLuong;
    private double thanhTien;
    private String maSP;
    private String maHD;
    private String tenSP;
    private double donGia;

    public HoaDonChiTiet(int soLuong, double thanhTien, String maSP, String maHD, String tenSP, double donGia) {
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.maSP = maSP;
        this.maHD = maHD;
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    public HoaDonChiTiet() {
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    

    
}
