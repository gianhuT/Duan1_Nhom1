/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import utils.XJdbc;
import entity.HoaDonChiTiet;
import entity.ThongKe;
import java.sql.SQLException;

/**
 *
 * @author PHONG
 */
public class ThongKeDAO {

    String Doanhthu = "SELECT SUM(ThanhTien) AS DoanhThu\n"
            + "FROM HoaDon as hd  inner join HoaDonChiTiet as hdct on  hd.MaHD = hdct.MaHD\n"
            + "WHERE YEAR(NgayTao) = ?";
    
    String DoanhThuCaoNhat = "SELECT \n"
            + "MAX(ThanhTien) AS DoanhThuCaoNhat FROM HoaDonChiTiet";
    
    String DoanhThuThapNhat = "SELECT \n"
            + "MIN(ThanhTien) AS DoanhThuThapNhat FROM HoaDonChiTiet";
    
    String DoanhThuTrungBinh = "SELECT \n"
            + "AVG(ThanhTien) AS DoanhThuTrungBinh FROM HoaDonChiTiet";
    
    

    public double DoanhThuTheoNam(int year) throws SQLException {
        ResultSet rs = null;
        double doanhThu = 0.0;
        try {
            rs = XJdbc.query(Doanhthu, year);
            while (rs.next()) {
                doanhThu = rs.getDouble("DoanhThu");
            }
        } finally {
            if (rs != null) {
                rs.getStatement().getConnection().close();
            }
        }

        return doanhThu;
    }
    
    public double DoanhThuCaoNhat() throws SQLException {
        ResultSet rs = null;
        double doanhThu = 0.0;
        try {
            rs = XJdbc.query(DoanhThuCaoNhat);
            while (rs.next()) {
                doanhThu = rs.getDouble("DoanhThuCaoNhat");
            }
        } finally {
            if (rs != null) {
                rs.getStatement().getConnection().close();
            }
        }

        return doanhThu;
    }
    
    public double DoanhThuThapNhat(int year) throws SQLException {
        ResultSet rs = null;
        double doanhThu = 0.0;
        try {
            rs = XJdbc.query(DoanhThuThapNhat, year);
            while (rs.next()) {
                doanhThu = rs.getDouble("DoanhThuThapNhat");
            }
        } finally {
            if (rs != null) {
                rs.getStatement().getConnection().close();
            }
        }

        return doanhThu;
    }
    
    public double DoanhThuTrungBinh(int year) throws SQLException {
        ResultSet rs = null;
        double doanhThu = 0.0;
        try {
            rs = XJdbc.query(DoanhThuTrungBinh, year);
            while (rs.next()) {
                doanhThu = rs.getDouble("DoanhThuTrungBinh");
            }
        } finally {
            if (rs != null) {
                rs.getStatement().getConnection().close();
            }
        }

        return doanhThu;
    }
    
    
    

}
