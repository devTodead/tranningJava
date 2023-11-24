package lesson2.hthang;

import java.util.Scanner;

public class MAIN1 {
    public static void main(String[] args) {
        //1. Nhập vào số lượng sinh viên cần quản lý
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sinh viên cần quản lý: ");
        int soLuongSinhVien = sc.nextInt();
        sc.nextLine();

        //2. Nhập thông tin sinh viên
        System.out.println("------------");
        //Tạo danh sách sinh viên để quản lý n sinh viên
        sinhvien[] danhSachsv = new sinhvien[soLuongSinhVien];
        //Nhập thông tin cho n sinh viên
        for (int i = 0; i < soLuongSinhVien; i++) {
            System.out.println("Sinh viên " + (i + 1)); //Tiêu đề

            //Khởi tạo từng sv trong danh sach:
            danhSachsv[i] = new sinhvien();
            //Nhập thông tin sv:
            danhSachsv[i].nhap();
            sc.nextLine();

        }
        //3. Nhập vào họ và tên để in ra thông tin tương ứng
        System.out.println("-----------");
        System.out.printf("Nhập vào thông tin để tìm kiếm: ");
        String tuKhoa = sc.nextLine();


        //gọi hàm tìm kiếm
        sinhvien sinhVienCanTim = TimKiem(danhSachsv, tuKhoa);
        //nếu kquả hàm tìm kiếm trả về null thì in không tìm thấy
        if (sinhVienCanTim == null) {
            System.out.println("Không tìm thấy kết quả");
        }
        else { //nếu khác null
            sinhVienCanTim.in();
        }
    }
    /**
     * Tìm kiếm sinh viên dựa trên họ và tên được nhập
     * @param nguon   danh sach sinh vien đầu vào
     * @param hovaten họ và tên sinh viên cần tìm
     */
    public static sinhvien TimKiem(sinhvien[] nguon, String hovaten) {
        sinhvien sinhVienCanTim = null;
        //duyệt từ đầu tới cuối danh sách sinh viên để tìm
        for (int i = 0; i < nguon.length; i++) {
            //Nếu khớp họ và tên thì gán vào kết quả trả về
            // so sánh bằng của String là a.equals(b)
            if (nguon[i].HoTen.equals(hovaten)) {
                sinhVienCanTim = nguon[i];
                break;
            }
        }
                return sinhVienCanTim;
            }
        }






