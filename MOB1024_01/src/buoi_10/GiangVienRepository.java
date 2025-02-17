/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_10;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Huyen
 */
public class GiangVienRepository {

    public ArrayList<GiangVien> getAll() {
        ArrayList<GiangVien> lstGVs = new ArrayList<>();///SỬA LẠI CHỖ NÀY NHÉ
        //gõ 3 lần nháy "
        String sql = """
                    SELECT [ma]
                          ,[ten]
                          ,[loai]
                          ,[tuoi]
                          ,[bac]
                          ,[gioi_tinh]
                      FROM [dbo].[giang_vien]
                    """;
        //try + ctrl cách 
        //import java.sql.Connection;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            //dữ liệu trả về -> table=> Result Set để chứa kết quả
            ResultSet rs = ps.executeQuery();
            //kiểm tra xem có dòng dữ liệu ko?
            while (rs.next()) {
                //1. khởi tạo đối tượng mới
                GiangVien gv = new GiangVien();
                //2. gán giá trị 
                gv.setMa(rs.getString(1));
                gv.setTen(rs.getString(2));
                gv.setLoai(rs.getString(3));
                gv.setTuoi(rs.getInt(4));
                gv.setBac(rs.getInt(5));
                gv.setGioiTinh(rs.getInt(6));
                //3. thêm đối tượng vào list

                lstGVs.add(gv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstGVs;
    }

    //tìm kiếm Giảng viên theo mã => trả về 1 GV
    public GiangVien getOne(String ma) {
        //Select => from => where
        //gõ 3 lần nháy "
        String sql = """
                      SELECT [ma],[ten] ,[loai],[tuoi]  ,[bac],[gioi_tinh]
                      FROM [dbo].[giang_vien]
                      WHERE ma = ?
                    """;
        //try + ctrl cách 
        //import java.sql.Connection;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            //set dữ liệu cho dấu ?
            ps.setObject(1, ma);
            //dữ liệu trả về -> table=> Result Set để chứa kết quả
            ResultSet rs = ps.executeQuery();
            //kiểm tra xem có dòng dữ liệu ko?
            while (rs.next()) {
                //1. khởi tạo đối tượng mới
                GiangVien gv = new GiangVien();
                //2. gán giá trị 
                gv.setMa(rs.getString(1));
                gv.setTen(rs.getString(2));
                gv.setLoai(rs.getString(3));
                gv.setTuoi(rs.getInt(4));
                gv.setBac(rs.getInt(5));
                gv.setGioiTinh(rs.getInt(6));
                //3. trả về 1 đối tượng tìm thấy
                return gv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insert(GiangVien gv) {
        //gõ 3 lần nháy "
        String sql = """
                   INSERT INTO [dbo].[giang_vien]
                                 ([ma]
                                 ,[ten]
                                 ,[loai]
                                 ,[tuoi]
                                 ,[bac]
                                 ,[gioi_tinh])
                           VALUES(?,?,?,?,?,?)
                    """;
        //try + ctrl cách 
        //import java.sql.Connection;
        int check = 0;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, gv.getMa());
            ps.setObject(2, gv.getTen());
            ps.setObject(3, gv.getLoai());
            ps.setObject(4, gv.getTuoi());
            ps.setObject(5, gv.getBac());
            ps.setObject(6, gv.getGioiTinh());

            check = ps.executeUpdate(); //trả về số dòng dữ liệu được thực hiện
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public static void main(String[] args) {
        System.out.println("--Danh sách--");
        GiangVienRepository repo = new GiangVienRepository();
        ArrayList<GiangVien> lstGVs = repo.getAll();
        for (GiangVien gv : lstGVs) {
            System.out.println(gv.toString());
        }
        System.out.println("Tìm kiếm theo mã");
        GiangVien gvSearch = repo.getOne("DungNA");
        System.out.println(gvSearch.toString());
    }
    //getAll => Select
    //thêm mơi => Insert
    //sửa => Update
    //xóa => Delete

}
