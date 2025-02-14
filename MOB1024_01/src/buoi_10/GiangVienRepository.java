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
    public static ArrayList<GiangVien> lstGVs= new ArrayList<>();
    public  ArrayList<GiangVien> getAll(){
        //gõ 3 lần nháy "
        String sql= """
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
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps= con.prepareStatement(sql)) {
            //dữ liệu trả về -> table=> Result Set để chứa kết quả
            ResultSet rs= ps.executeQuery();
            //kiểm tra xem có dòng dữ liệu ko?
            while (rs.next()) {
                //1. khởi tạo đối tượng mới
                GiangVien gv= new GiangVien();
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
    public static void main(String[] args) {
        System.out.println("--Danh sách--");
        GiangVienRepository repo= new GiangVienRepository();
        lstGVs= repo.getAll();
        for (GiangVien gv : lstGVs) {
            System.out.println(gv.toString());
        }
    }
    //getAll => Select
    //thêm mơi => Insert
    //sửa => Update
    //xóa => Delete
  
}
