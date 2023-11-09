package HTHANG;

import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        /*
        Example vidu = new Example ();
        System.out.println(vidu.name);

        Object thuHang = new Object (); gọi đến object để lấy giá trị
        thuHang.soNguyen = 10; // gán giá trị cho so nguyen
        System.out.println("" + thuHang.soNguyen);
         */
/*
        animals haiDo = new animals();
        haiDo.tenDongVat = "Con cho";
        haiDo.toilaai();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên = "); //title để nhập tên
        haiDo.tenDongVat = sc.nextLine(); //nhập tên
        System.out.println("Tôi là  " +  haiDo.tenDongVat); //in ra kết quả

 */
        chitieu tien = new chitieu();
        /*
        tien.tenKhoanChi = "Học phí kì 1";
        tien.doUuTien = "vừa";
        tien.xepLoaiKhoanChi = 1;
        tien.soTienCanChi = 2000000;
        tien.tienchitieu();
         */
//  Bài tập buổi 3
        Scanner sc = new Scanner(System.in);
        System.out.println("TÊN KHOẢN CHI = ");
        tien.tenKhoanChi = sc.nextLine();
        System.out.println("ĐỘ ƯU TIÊN = ");
        tien.doUuTien = sc.nextLine();
        System.out.println("XẾP LOẠI KHOẢN CHI = ");
        tien.xepLoaiKhoanChi = sc.nextInt();
        sc.nextLine();
        System.out.println("SỐ TIỀN CẦN CHI = ");
        tien.soTienCanChi = sc.nextDouble();

        System.out.println("TÊN KHOẢN CHI = " + tien.tenKhoanChi);
        System.out.println("ĐỘ ƯU TIÊN = " + tien.doUuTien);
        System.out.println("XẾP LOẠI KHOẢN CHI = "+ tien.xepLoaiKhoanChi);
        System.out.println("SỐ TIỀN CẦN CHI = "+tien.soTienCanChi);
    }
}
