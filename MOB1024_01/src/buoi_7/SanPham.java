/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_7;

/**
 *
 * @author Huyen
 */
public class SanPham {
    private String maSP;
    private String ten;
    private int khoiLuong;
    private String loaiSP;

    public SanPham() {
    }

    public SanPham(String maSP, String ten, int khoiLuong, String loaiSP) {
        this.maSP = maSP;
        this.ten = ten;
        this.khoiLuong = khoiLuong;
        this.loaiSP = loaiSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(int khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", ten=" + ten + ", khoiLuong=" + khoiLuong + ", loaiSP=" + loaiSP + '}';
    }
    
    
}
