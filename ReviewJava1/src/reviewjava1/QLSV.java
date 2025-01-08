/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reviewjava1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class QLSV {

    ArrayList<SinhVien> _list = new ArrayList<>();
    Scanner _sc = new Scanner(System.in);
    SinhVien _sv = new SinhVien();

    public QLSV() {
        fakeData();
    }

    public void fakeData() {
        _list.add(new SinhVien("PH123", "Nguyen Van A", 2005));
        _list.add(new SinhVien("PH124", "Nguyen Van B", 2004));
        _list.add(new SinhVien("PH125", "Nguyen Van C", 2003));
        _list.add(new SinhVien("PH126", "Nguyen Van D", 2002));
        _list.add(new SinhVien("PH127", "Nguyen Van E", 2001));
        _list.add(new SinhVien("PH128", "Nguyen Van F", 1990));
        _list.add(new SinhVien("PH129", "Nguyen Van G", 1994));
    }

    public void nhapDS() {
        String tiepTuc;
        do {
            System.out.print("Moi nhap ma sv= ");
            String msv = _sc.nextLine();
            System.out.print("Moi nhap ten sv= ");
            String ten = _sc.nextLine();
            System.out.print("Moi nhap nam sinh= ");
            int namSinh = _sc.nextInt();
            _sc.nextLine();
            _sv = new SinhVien(msv, ten, namSinh);
            _list.add(_sv);
            System.out.println("Ban co muon tiep tuc ko yes/no");
            tiepTuc = _sc.nextLine();
        } while (tiepTuc.equals("yes"));
    }

    public void xuatDS() {
        for (SinhVien sinhVien : _list) {
            sinhVien.inThongTin();
        }
    }

    public void xuatDS20() {
        ArrayList<SinhVien> list1 = new ArrayList<>();
        int tuoi;
        for (SinhVien sinhVien : _list) {
            tuoi = 2025 - sinhVien.getNamSinh();
            if (tuoi > 20) {
                list1.add(sinhVien);
            }

        }
        if (!list1.isEmpty()) {
            for (SinhVien sinhVien : list1) {
                sinhVien.inThongTin();
            }
        } else {
            System.out.println("  khong co sinh vien nao tren 20t");
        }
    }
    public void timKiemTheoMa(String ma){
        int count=0;
        for (SinhVien sinhVien : _list) {
            if(sinhVien.getMaSV().equals(ma)){
                sinhVien.inThongTin();
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Khong tim thay!!");
        }
    }
}
