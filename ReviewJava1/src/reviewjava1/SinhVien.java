/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reviewjava1;

/**
 *
 * @author Huyen
 */
public class SinhVien {
        private String maSV;
        private String ten;
        private int namSinh;
        
        public void inThongTin(){
            System.out.println("Ma SV:"+maSV+", Ho Ten: "+ten+", Nam Sinh: "+namSinh);
        }

    public SinhVien() {
    }

    public SinhVien(String MaSV, String Ten, int NamSinh) {
        this.maSV = MaSV;
        this.ten = Ten;
        this.namSinh = NamSinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String MaSV) {
        this.maSV = MaSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String Ten) {
        this.ten = Ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.namSinh = NamSinh;
    }
        
        
    
}
