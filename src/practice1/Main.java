package practice1;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        // 1. Nhập vào số lượng sinh viên cần quản lý
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng sinh viên: ");
        int soLuongSv = sc.nextInt();
        sc.nextLine();

        // 2. Nhập thông tin cho các sinh viên
        System.out.println("================");
        // Tạo danh sách sinh viên để quản lý n sinh vien
        SinhVien[] danhSachSv = new SinhVien[soLuongSv];

        // Lần lượt nhập thông tin cho n sinh viên
        for(int i = 0; i < soLuongSv; i++){
            System.out.println("Sinh viên " + (i + 1));

            // khởi tạo từng sinh viên trong danh sách
            danhSachSv[i] = new SinhVien();

            // nhập thông tin sinh viên
            danhSachSv[i].nhap();
        }

        // 3. Nhập vào họ và tên: in ra thông tin của sinh viên tương ứng
        System.out.println("================");
        System.out.print("Nhập họ và tên để tìm kiếm: ");
        String tuKhoa = sc.nextLine();

        // gọi hàm tìm kiếm
        SinhVien sinhVienCanTim = TimKiem(danhSachSv, tuKhoa);
        // nếu kết quả hàm tìm kiếm tra về null thì in không tìm thấy
        if(sinhVienCanTim == null){
            System.out.print("Không tìm thấy");
        }
        else {
            // nếu khác null => tìm thấy thì in ra thông tin sinh viên
            sinhVienCanTim.in();
        }
    }

    /**
     * Tìm kiếm sinh viên dựa trên thông tin họ và tên được nhập
     * @param nguon danh sách sinh viên đầu vào
     * @param hoVaTen họ và tên sinh viên cần tìm
     */
    public static SinhVien TimKiem(SinhVien[] nguon, String hoVaTen){
        SinhVien sinhVienCanTim = null;
        // duyệt từ đầu đến cuối danh sách sinh viên để tìm
        for(int i = 0; i < nguon.length; i++){
            // nếu khớp họ và tên thì gán vào kết quả trả về
            // phép toán so sánh bằng của 2 số là a == b, còn đối với String thì là a.equals(b)
            if(nguon[i].HoVaTen.equals(hoVaTen)){
                sinhVienCanTim = nguon[i];
                break;
            }
        }
        // trả về kết quả tìm được
        return sinhVienCanTim;
    }
}
