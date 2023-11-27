package DAO;

import entity.ThongTinCaNhan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

public class ThongTinCaNhanDAO extends ShopGiayDAO<ThongTinCaNhan, Integer> {

    @Override
    public List<ThongTinCaNhan> selectAll() {
        String sql = "SELECT * FROM ThongTin_CaNhan";
        return this.selectBySql(sql);
    }

    @Override
    public ThongTinCaNhan selectById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected List<ThongTinCaNhan> selectBySql(String sql, Object... args) {
        List<ThongTinCaNhan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    ThongTinCaNhan entity = new ThongTinCaNhan();
                    entity.setTenNV(rs.getString("TenNV"));
                    entity.setID(rs.getString("ID"));
                    entity.setNgaySinh(rs.getString("NgaySinh"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setSoDT(rs.getString("SoDT"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setHinh(rs.getString("Hinh"));
                    entity.setTaiKhoan(rs.getString("TaiKhoan"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    list.add(entity);
                }
            } finally {
                if (rs != null) {
                    rs.getStatement().getConnection().close();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }

    @Override
    public void insert(ThongTinCaNhan entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(ThongTinCaNhan entity) {
        String sql = "UPDATE ThongTin_CaNhan SET TenNV = ?, NgaySinh = ?, GioiTinh = ?, Email = ?, SoDT = ?, DiaChi = ?, Hinh = ?, TaiKhoan = ?, MatKhau = ? WHERE ID = ?";
        XJdbc.update(sql, entity.getTenNV(), entity.getNgaySinh(), entity.isGioiTinh(), entity.getEmail(), entity.getSoDT(), entity.getDiaChi(), entity.getHinh(), entity.getTaiKhoan(), entity.getMatKhau(), entity.getID());
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
