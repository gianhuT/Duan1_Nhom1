/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entity.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author T490
 */
public class SanPhamDAO extends ShopGiayDAO<SanPham, String>{
    
    public void insert(SanPham model){
        String sql = "EXEC InsertDataSanPham @MaSP=?, @TenSP=?, @SoLuongTonKho=?, @DonGia=?,@ChatLieu=?, @MauSac=?, @KichCo=?, @MaNCC=?,@TenTH=?, @AnhSP=? ";
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
        String sql = "EXEC Update_SanPham "
                + "@MaSP=?, @TenSP=?, @SoLuongTonKho=?, @DonGia=?, @ChatLieu=?, @MauSac=?, @KichCo=?, @MaNCC=?, @TenTH=?, @AnhSP=?";
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
    public void delete(String id) {
        String sql = "DELETE FROM SANPHAM WHERE MaSP = ?";
        XJdbc.update(sql, id);
    }
    


//    @Override
//    public List<SanPham> selectAll() {
//
//    }

    @Override
    public SanPham selectById(String id) {
        String sql="SELECT * FROM SANPHAM WHERE MaSP=?";
        List<SanPham> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    
    public List<SanPham> selectBySanPham(String MaSP){
        String sql="SELECT SANPHAM.MaSP, TenSP, SoLuongTonKho,DonGia,ChatLieu, MauSac, KichCo, MaNCC,TenTH, AnhSP \n" +
"                FROM SanPham INNER JOIN GIABAN ON SanPham.MaSP=GiaBan.MaSP\n" +
"                INNER JOIN ThuongHieu ON SanPham.MaSP=ThuongHieu.MaSP WHERE SANPHAM.MaSP=?";
        return this.selectBySql(sql, MaSP);
    }

    @Override
    public List<SanPham> selectAll() {
        String sql = "SELECT * FROM SanPham_View";
        return this.selectBySql(sql);
    }

    
    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    SanPham entity=new SanPham();
                    entity.setMaSP(rs.getString("MaSP"));
                    entity.setTenSP(rs.getString("TenSP"));
                    entity.setSoLuongTonKho(rs.getInt("SoLuongTonKho"));
                    entity.setDonGia(rs.getDouble("DonGia"));
                    entity.setChatLieu(rs.getString("ChatLieu"));
                    entity.setMauSac(rs.getString("MauSac"));
                    entity.setKichCo(rs.getInt("KichCo"));
                    entity.setMaNCC(rs.getString("MaNCC"));
                    entity.setThuongHieu(rs.getString("TenTH"));
                    entity.setHinhSP(rs.getString("AnhSP"));
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    
    }

    
}
