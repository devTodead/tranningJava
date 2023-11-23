package lesson2.hthang;

import java.util.Scanner;

public class input {
    public float a;

    public void Unit1() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào số: ");
        a = scanner.nextFloat();
        //so nguyên
        if (a == (int) a) {
            System.out.println(a + " là số nguyên");
        } else {
            System.out.println(a + " không phải là số nguyên");
        }
        scanner.nextLine();
        // số nguyên tố
        if (a < 2) {
            System.out.println(a + " không phải là số nguyên tố");
        } else {
            int count = 0;
            for (int i = 2; i < a; i++) {
                if ((int) a % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(a + " là số nguyên tố");
            } else {
                System.out.println(a + " không phải là số nguyên tố");
            }
        }

        // số chính phương
        boolean lasochinhphuong = false;
        for (int i = 1; i < a; i++) {
            if ((i * i) == a) {
                lasochinhphuong = true;
            }
        }
        if (lasochinhphuong == true) {
            System.out.println(a + " là số chính phương");
            scanner.nextLine();
        } else {
            System.out.println(a + " không phải là số chính phương");
            scanner.nextLine();
        }
    }

    public void Unit2() {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào số thứ 1: ");
        x = scanner.nextInt();
        System.out.printf("Nhập vào số thứ 2: ");
        y = scanner.nextInt();

        //tìm UCLN
        for (int i = x; i > 1; i--) { //gán giá trị khởi tạo bằng x hoặc y, chạy lùi
            if (x % i == 0 && y % i == 0) { //nếu cả x và y đều chia hết cho i => i là UCLN
                System.out.println("UCLN của " + x + " và " + y + " là: " + i);
                break;
            }
        }
        //tìm BCNN
        for (int i = 2; ; i++) { //biểu thức điều kiện trống, vô hạn
            if (i % x == 0 && i % y == 0) {
                System.out.println("BCNN của " + x + " và " + y + " là: " + i);
                break;
            }
        }
    }

    public void Unit3() {
        double donGia = 150000;
        int Vao, Ra, TongGio;
        int tongGio;
        double tienThanhToan;
        double khuyenMai; //km từ giờ thứ 4

        System.out.println("Tính tiền thanh toán karaoke ");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhập vào giờ vào: ");
        Vao = scanner.nextInt();
        System.out.printf("Nhập vào giờ ra: ");
        Ra = scanner.nextInt();
        tongGio = Ra - Vao;
        if (tongGio > 3){
            khuyenMai = (tongGio - 3) * 0.3 * donGia;
            tienThanhToan = tongGio * donGia - khuyenMai;
        }else {
            tienThanhToan = tongGio * donGia;
        }
        System.out.println("Tiền phải trả là: " + tienThanhToan);
        }

    public void Unit4 (){
        float tongSoDienTieuThu;

    }
    }






