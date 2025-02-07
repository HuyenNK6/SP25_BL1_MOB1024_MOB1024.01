/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huyen
 */
public class SanPhamService {
    //Xử lý logic của project
    ArrayList<SanPham> list= new ArrayList<>();

    public SanPhamService() {
        fakeData();
    }
    private void fakeData() {
       list.add(new SanPham("SP01", "San Pham 1", 300, "Nhập khẩu"));
       list.add(new SanPham("SP02", "San Pham 2", 400, "Xuất khẩu"));
       list.add(new SanPham("SP03", "San Pham 3", 500, "Nhập khẩu"));
       list.add(new SanPham("SP04", "San Pham 4", 200, "Xuất khẩu"));
       list.add(new SanPham("SP05", "San Pham 5", 100, "Xuất khẩu"));
    }
    public ArrayList<SanPham> getAll(){
        return list;
    }
    public void addSanPham(SanPham sp){
        list.add(sp);
    }
    public void updateSanPham(String maSP, SanPham newSP){
        //update
    }
    public void deleteSanPham(String maSP){
        //delele
        int index;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMaSP().equalsIgnoreCase(maSP)){
                index=i;
                list.remove(index);
                return;
            }
        }
        
    }
}
