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

        animals haiDo = new animals();
        haiDo.tenDongVat = "Con cho";
        haiDo.toilaai();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên = "); //title để nhập tên
        haiDo.tenDongVat = sc.nextLine(); //nhập tên
        System.out.println("Tôi là  " +  haiDo.tenDongVat); //in ra kết quả

    }
}
