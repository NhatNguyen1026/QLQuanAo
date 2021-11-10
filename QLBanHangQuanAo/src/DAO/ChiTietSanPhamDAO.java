package DAO;

import MODELS.ChiTietSanPham;
import helper.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChiTietSanPhamDAO implements IDAOService<ChiTietSanPham, Integer> {

    final String INSERT_SQL = "insert into ChiTietSanPham(IDSanPham, MaSanPham, IDKichCo, IDMauSac, IDDonViTinh, IDChatLieu, IDGioiTinh, MoTa, GiaTien, TenChiTiet, Soluong,TrangThai)\n"
            + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "update ChiTietSanPham set IDSanPham=?,MaSanPham=?,IDKichCo=?,IDMauSac=?,IDDonViTinh=?, IDChatLieu=?, IDGioiTinh=?, MoTa=?, GiaTien=?, TenChiTiet=?, Soluong=?, TrangThai=? where IDCTSP=?";
    final String DELETE_SQL = "delete from ChiTietSanPham where IDCTSP = ?";
    final String SELECT_ALL_SQL = "select * from ChiTietSanPham";
    final String SELECT_BY_ID_SQL = "select * from ChiTietSanPham where IDCTSP = ?";

    @Override
    public void insert(ChiTietSanPham entity) {
    }

    @Override
    public void update(ChiTietSanPham entity) {
    }

    @Override
    public void delete(Integer id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public List<ChiTietSanPham> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChiTietSanPham selectById(Integer id) {
        List<ChiTietSanPham> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChiTietSanPham> selectBySql(String sql, Object... agrs) {
        List<ChiTietSanPham> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, agrs);
            while (rs.next()) {
                ChiTietSanPham entity = new ChiTietSanPham();
                entity.setIdSanPham(rs.getInt("IDSanPham"));
                entity.setMaSP(rs.getString("MaSanPham"));
                entity.setIdChatLieu(rs.getInt("IDDanhMuc"));
                entity.setIdChiTietSP(rs.getInt("IDCTSP"));
                entity.setIdDonViTinh(rs.getInt("IDDonViTinh"));
                entity.setIdGioiTinh(rs.getInt("IDGioiTinh"));
                entity.setGiaTien(rs.getDouble("GiaTien"));
                entity.setIdKichCo(rs.getInt("IDKichCo"));
                entity.setIdMauSac(rs.getInt("IDMauSac"));
                entity.setMoTa(rs.getString("MoTa"));
                entity.setSoLuong(rs.getInt("Soluong"));
                entity.setTenCT(rs.getString("TenChiTiet"));
                entity.setTrangThai(rs.getInt("TrangThai"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }

}
