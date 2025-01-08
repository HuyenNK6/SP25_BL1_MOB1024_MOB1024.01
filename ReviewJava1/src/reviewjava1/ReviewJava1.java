/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reviewjava1;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class ReviewJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        QLSV qlsv= new QLSV();
        int luaChon;
        do {
            System.out.println("------MENU--------");
            System.out.println("1. Nhap DS");
            System.out.println("2. Xuat DS");
            System.out.println("3. Xuat DS >20 tuoi");
            System.out.println("4. Tim SV theo ma");
            System.out.println("0. Thoat");
            System.out.println("------------------");
            System.out.println("Moi nhap lua chon (1-4): ");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    qlsv.nhapDS();
                    break;
                case 2:
                    qlsv.xuatDS();
                    break;
                case 3:
                    qlsv.xuatDS20();
                    break;
                case 4:
                    System.out.println("Nhap ma SV can tim:");
                    String ma= sc.nextLine();
                    qlsv.timKiemTheoMa(ma);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Moi nhap lai!!!");
            }
        } while (luaChon != 0);

    }
}
