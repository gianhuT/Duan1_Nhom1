/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entity.DanhSachSanPham;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author T490
 */
public class DanhSachSPDAO extends ShopGiayDAO<DanhSachSanPham, String>{

    @Override
    public void insert(DanhSachSanPham model) {
        String sql = "INSERT INTO THUONGHIEU(MaTH, TenTH, MoTa) VALUES (?,?,?)";
        XJdbc.update(sql, 
                model.getMaGiay(),
                model.getTenTH(),
                model.getGhiChu()
                );
    }

    @Override
    public void update(DanhSachSanPham model) {
        String sql = "UPDATE THUONGHIEU SET TenTH=?, MoTa=? WHERE MaSP=?";
        XJdbc.update(sql, 
                model.getTenTH(),
                model.getGhiChu(),
                model.getMaGiay()
                );
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE THUONGHIEU WHERE MaSP=?";
        XJdbc.update(sql, id);
    }

    @Override
    public List<DanhSachSanPham> selectAll() {
        String sql = "SELECT MaSP, TenTH, MoTa FROM THUONGHIEU";
        return this.selectBySql(sql);
    }

    @Override
    public DanhSachSanPham selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<DanhSachSanPham> selectBySql(String sql, Object... args) {
        List<DanhSachSanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    DanhSachSanPham entity = new DanhSachSanPham();
                    entity.setMaGiay(rs.getString("MaSP"));
                    entity.setTenTH(rs.getString("TenTH"));
                    entity.setGhiChu(rs.getString("MoTa"));
                    list.add(entity);
                }
            }finally{
                rs.getStatement().getConnection().close();
            } 
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }
    
    public List<DanhSachSanPham> selectByThuongHieu(String MaTH){
        String sql = "SELECT MaTH, TenTH, MoTa FROM THUONGHIEU WHERE MaTh = ?";
        return this.selectBySql(sql, MaTH);
    }
    
}
