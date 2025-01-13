/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi4;

/**
 *
 * @author Huyen
 */
public class DienThoai {
    private String imei;
    private String hang; //Hãng: Iphone hoặc SamSung
    private int gia;
    private String mauSac;
    private int dungLuong;

    public DienThoai() {
    }

    public DienThoai(String imei, String hang, int gia, String mauSac, int dungLuong) {
        this.imei = imei;
        this.hang = hang;
        this.gia = gia;
        this.mauSac = mauSac;
        this.dungLuong = dungLuong;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    @Override
    public String toString() {
        return "DienThoai{" + "imei=" + imei + ", hang=" + hang + ", gia=" + gia + ", mauSac=" + mauSac + ", dungLuong=" + dungLuong + '}';
    }
    
}
