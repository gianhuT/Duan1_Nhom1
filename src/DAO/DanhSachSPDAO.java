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
public class DanhSachSPDAO extends ShopGiayDAO<SanPham, Integer>{
    public void insert(SanPham model){
        String sql = "EXEC InsertDataSanPham MaSP=?, TenSP=?, SoLuongTonKho=?, DonGia=?,ChatLieu=?, MauSac=?, KichCo=?, MaNCC=?,TenTH=?, AnhSP=? ";
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
    public void update(SanPham model) {
        String sql = "UPDATE SANPHAM INNER JOIN GIABAN ON SANPHAM.MASP=GIABAN.MASP INNER JOIN THUONGHIEU INNER JOIN SANPHAM.MASP=THUONGHIEU.MASP"
                + "SET TenSP=?, SoLuongTonKho=?, DonGia=?,ChatLieu=?, MauSac=?, KichCo=?, MaNCC=?,TenTH=?, AnhSP=? "
                + "WHERE MASP=?";
        XJdbc.update(sql, 
                model.getTenSP(),
                model.getSoLuongTonKho(),
                model.getDonGia(),
                model.getChatLieu(),
                model.getMauSac(),
                model.getKichCo(),
                model.getMaNCC(),
                model.getThuongHieu(),
                model.getHinhSP(),
                model.getMaSP()
                );
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE TenSP, SoLuongTonKho, DonGia,ChatLieu, MauSac, KichCo, MaNCC,TenTH, AnhSP"
                + "FROM SANPHAM INNER JOIN GIABAN ON SANPHAM.MASP=GIABAN.MASP INNER JOIN THUONGHIEU INNER JOIN SANPHAM.MASP=THUONGHIEU.MASP"
                + "WHERE SANPHAM.MASP=?";
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
    public List<SanPham> selectByDSSP(String masp){
        String sql="SELECT SANPHAM.MaSP, TenSP,TenTH, MoTa \n" +
"                FROM SanPham INNER JOIN ThuongHieu ON SanPham.MaSP=ThuongHieu.MaSP WHERE SANPHAM.MaSP=?";
        return this.selectBySql(sql, masp);
    }
}
