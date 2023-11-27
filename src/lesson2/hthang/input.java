package lesson2.hthang;

import java.text.DecimalFormat;
import java.util.Scanner;

public class input {
    public float a;

    public void Unit1() { // kiểm tra số nguyên tố
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

    public void Unit2() { //kiểm tra ucln, bcnn
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào số thứ 1: ");
        x = scanner.nextInt();
        System.out.printf("Nhập vào số thứ 2: ");
        y = scanner.nextInt();

        //tìm UCLN
        for (int i = x; i > 1; i--) { //gán giá trị khởi tạo bằng x hoặc y, chạy lùi
            if (x % i == 0 & y % i == 0) { //nếu cả x và y đều chia hết cho i => i là UCLN
                System.out.println("UCLN của " + x + " và " + y + " là: " + i);
                break;
            }
        }
        //tìm BCNN
        for (int i = 2; ; i++) { //biểu thức điều kiện trống, vô hạn
            if (i % x == 0 & i % y == 0) {
                System.out.println("BCNN của " + x + " và " + y + " là: " + i);
                break;
            }
        }
    }

    public void Unit3() { // tính tiền karaoke
        double donGia = 150000;
        int Vao = 0, Ra = 0, TongGio;
        int tongGio;
        double tienThanhToan = 0;
        double khuyenMai; //km từ giờ thứ 4


        System.out.println("Tính tiền thanh toán karaoke ");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhập vào giờ vào: ");
        Vao = scanner.nextInt();
        System.out.printf("Nhập vào giờ ra: ");
        Ra = scanner.nextInt();
        tongGio = Ra - Vao;

        if (Vao < 12 || Ra > 23 || Vao >= Ra) {
            System.out.println(" Giờ không hợp lệ");
        } else if (tongGio > 3) {
            khuyenMai = (tongGio - 3) * 0.3 * donGia;
            tienThanhToan = tongGio * donGia - khuyenMai;
        } else {
            tienThanhToan = tongGio * donGia;
        }
        System.out.println("Tổng số giờ: " + tongGio);
        DecimalFormat format = new DecimalFormat("###,###,###");
        System.out.println("Tiền phải trả là: " + (format.format(tienThanhToan)) + " VNĐ");
    }

    public void Unit4() { //tính tiền điện
        float soDien, tienDien = 0;
        int bac1 = 1678;
        int bac2 = 1734;
        int bac3 = 2014;
        int bac4 = 2536;
        int bac5 = 2834;
        int bac6 = 2927;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện sử dụng: ");
        soDien = scanner.nextFloat();

        if (soDien < 0) {
            System.out.println(" Số điện phải lớn hơn hoặc bằng 0 ");
        } else if (soDien <= 50) {
            tienDien = soDien * bac1;

        } else if (soDien <= 100) {
            tienDien = 50 * bac1 + ((soDien - 50) * bac2);

        } else if (soDien <= 200) {
            tienDien = 50 * bac1 + 50 * bac2 + ((soDien - 100) * bac3);

        } else if (soDien <= 300) {
            tienDien = 50 * bac1 + 50 * bac2 + 100 * bac3 + ((soDien - 200) * bac4);

        } else if (soDien <= 400) {
            tienDien = 50 * bac1 + 50 * bac2 + 100 * bac3 + 100 * bac4 + ((soDien - 300) * bac5);

        } else if (soDien >= 401) {
            tienDien = 50 * bac1 + 50 * bac2 + 100 * bac3 + 100 * bac4 + 100 * bac5 + ((soDien - 400) * bac6);

        }
        DecimalFormat format = new DecimalFormat("###,###,###");
        System.out.println(" Tiền điện = " + (format.format(tienDien)) + " VNĐ");
    }

    public void Unit5() {
        int soTien;
        int[] menhGia = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int soToTien;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tien can doi: ");
        soTien = sc.nextInt();
        System.out.println("So tien can doi " + soTien + " gom: ");
        sc.nextLine();

        if (soTien < 0) {
            System.out.println("So tien khong hop le");

        } else {
            for (int i = 0; i < 9; i++) {
                soToTien = soTien / menhGia[i];
                if (soToTien > 0) { //!=: khac
                    System.out.println("menh gia " + menhGia[i] + " co " + soToTien + " to");
                }
                soTien = soTien - soToTien * menhGia[i];
            }
        }
    }
    public void Unit6 (){
            double soTienMuonVay = 0 ;
            double tienLaiHangThang, tienPhaiTraHangThang, soTienConLai;

            Scanner sc = new Scanner(System.in);

            System.out.println("Nhap vao so tien muon vay: ");
            soTienMuonVay = sc.nextDouble();
            double tienGocPhaiTraHangThang = soTienMuonVay / 12;
            soTienConLai = soTienMuonVay;
            for (int i = 1; i <=12; i++){
                tienLaiHangThang = soTienConLai * 0.05;
                tienPhaiTraHangThang = tienGocPhaiTraHangThang + tienLaiHangThang;
                soTienConLai = soTienConLai - tienGocPhaiTraHangThang;
                DecimalFormat format = new DecimalFormat("###,###,###");
                System.out.println("-----------");
                System.out.println("ky han " + i);
                System.out.println("Tien lai phai tra = " + (format.format(tienLaiHangThang)) + " VND ");
                System.out.println("Tien goc phai tra = " + (format.format(tienGocPhaiTraHangThang)) + " VND ");
                System.out.println("Tong so tien phai tra hang thang = "+ (format.format(tienPhaiTraHangThang)) + " VND ");
                System.out.println("So tien con lai = " + (format.format(soTienConLai)) + " VND ");
            }
        }
    public void Unit7() {
        double tienXe;
        double tienVay;
        double tienTraTruoc;
        double soPhanTramVay;
        double soPhanTramTraTruoc;
        double tienGocPhaiTraHangThang, soTienConLai, tienLaiHangThang, tienPhaiTraHangThang;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tien xe: ");
        tienXe = sc.nextDouble();
        System.out.println("Nhap vao so phan tram vay: ");
        soPhanTramVay = sc.nextDouble();
        soPhanTramTraTruoc = 1 - soPhanTramVay/100;
        tienTraTruoc = tienXe * soPhanTramTraTruoc;
        tienVay = tienXe * soPhanTramVay;
        if (tienVay > 500000000) {
            tienVay = 500000000;
            DecimalFormat format = new DecimalFormat("###,###,###");
            System.out.println("So tien phai tra lan dau = " + (format.format(tienTraTruoc)) + " VND ");
            tienGocPhaiTraHangThang = tienVay / 24;
            soTienConLai = tienVay;
            for (int i = 1; i <= 24; i++) {
                tienLaiHangThang = soTienConLai * 0.072;
                tienPhaiTraHangThang = tienGocPhaiTraHangThang + tienLaiHangThang;
                soTienConLai = soTienConLai - tienGocPhaiTraHangThang;
                System.out.println("-----------");
                System.out.println("ky han " + i);
                System.out.println("Tien lai phai tra = " + (format.format(tienLaiHangThang)) + " VND ");
                System.out.println("Tien goc phai tra = " + (format.format(tienGocPhaiTraHangThang)) + " VND ");
                System.out.println("Tong so tien phai tra hang thang = " + (format.format(tienPhaiTraHangThang)) + " VND ");
                System.out.println("So tien con lai = " + (format.format(soTienConLai)) + " VND ");
            }
        } else {
            tienVay = tienXe - tienTraTruoc;
            System.out.println("So tien phai tra lan dau = " + tienTraTruoc);
            tienGocPhaiTraHangThang = tienVay / 24;
            soTienConLai = tienVay;
            for (int i = 1; i <= 24; i++) {
                tienLaiHangThang = soTienConLai * 0.072;
                tienPhaiTraHangThang = tienGocPhaiTraHangThang + tienLaiHangThang;
                soTienConLai = soTienConLai - tienGocPhaiTraHangThang;
                DecimalFormat format = new DecimalFormat("###,###,###");
                System.out.println("-----------");
                System.out.println("ky han " + i);
                System.out.println("Tien lai phai tra = " + (format.format(tienLaiHangThang)) + " VND ");
                System.out.println("Tien goc phai tra = " + (format.format(tienGocPhaiTraHangThang)) + " VND ");
                System.out.println("Tong so tien phai tra hang thang = " + (format.format(tienPhaiTraHangThang)) + " VND ");
                System.out.println("So tien con lai = " + (format.format(soTienConLai)) + " VND ");
            }
        }
    }
}

