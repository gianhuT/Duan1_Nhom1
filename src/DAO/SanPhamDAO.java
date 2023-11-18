/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entity.SanPham;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author T490
 */
public class SanPhamDAO extends ShopGiayDAO<SanPham, Integer>{
    
    public void insert(SanPham model){
        String sql = "EXEC InsertDataSanPham MaSP=?, TenSP=?, SoLuongTonKho=?, DonGia=?,ChatLieu=?, MauSac=?, KichCo=?, MaNCC=?,ThuongHieu=?, AnhSP=? ";
        XJdbc.update(sql, 
                model.getMaSP(),
                model.getTenSP(),
                model.getSoLuongTonKho(),
                model.getDonGia(),
                model.getChatLieu(),
                model.getMauSac(),
                model.getKichCo(),
                model.getMaNCC(),
                model.getThuongHieu(),
                model.getHinhSP()
                );
    } 

    @Override
    public void update(SanPham entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SanPham> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SanPham selectById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SanPham> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public List<SanPham> selectBySanPham(String masp){
        String sql="SELECT MaSP, TenSP, SoLuongTonKho,DonGia,ChatLieu, MauSac, KichCo, MaNCC,ThuongHieu, AnhSP "
                + "FROM SanPham INNER JOIN GIABAN ON SanPham.MaSP=GiaBan.MaSP"
                + "INNER JOIN ThuongHieu ON SanPham.MaSP=ThuongHieu.MaSP WHERE MaSP=?";
        return this.selectBySql(sql, masp);
    }
}
