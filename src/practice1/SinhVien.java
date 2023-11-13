package practice1;

import java.util.Scanner;

/**
 * Lớp sinh viên
 */
public class SinhVien {
    // Họ và đệm
    public String Ho;
    // Tên
    public String Ten;
    // Họ và tên
    public String HoVaTen;
    // Ngành theo học
    public String NganhHoc;
    // Hệ đào tạo
    public String HeDaoTao;
    public int TongSoTinChi;
    // Tổng số tiền phải trả cho toàn bộ khóa học
    public double HocPhi;

    /**
     * Nhập vào thông tin sinh viên
     */
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ: ");
        this.Ho = sc.nextLine();

        System.out.print("Tên: ");
        this.Ten = sc.nextLine();

        // Tính toán thông tin họ và tên
        this.HoVaTen = this.Ho + " " + this.Ten;

        System.out.print("Ngành học: ");
        this.NganhHoc = sc.nextLine();

        System.out.print("Hệ đào tạo: ");
        this.HeDaoTao = sc.nextLine();

        System.out.print("Tổng số tín chỉ: ");
        this.TongSoTinChi = sc.nextInt();
        // sau nextInt phải có nextLine để chặn tràn dòng
        sc.nextLine();

        // tính tổng số tiền cần nộp luôn
        this.HocPhi = this.TinhSoTien(this.TongSoTinChi, this.HeDaoTao);
    }

    /**
     * Dựa vào số tín chỉ và hệ đào tạo tính tổng số tiền sinh viên cần nộp
     * @param soTinChi tổng số tín chỉ
     * @param heDaoTao hệ đào tạo
     * @return tổng số tiền cần nộp
     */
    public double TinhSoTien(int soTinChi, String heDaoTao){
        double tongTien;
        switch (heDaoTao){
            case "Cao đẳng":
                tongTien = soTinChi * 100000;
                break;
            case "Đại học":
                tongTien = soTinChi * 120000;
                break;
            default:
                tongTien = soTinChi * 80000;
                break;
        }
        return tongTien;
    }

    /**
     * Xuất ra thông tin sinh viên
     */
    public void in(){
        // printf giúp in văn bản ra theo 1 format
        // %s sẽ được thay bởi giá trị truyền vào
        // Ví dụ: printf("A [%s] (%s)", B, C) => A [B] (C)
        // \n là ký tự xuống dòng
        System.out.printf("Họ và tên: %s\n", this.HoVaTen);
        System.out.printf("Ngành học: %s\n", this.NganhHoc);
        System.out.printf("Hệ đào tạo: %s\n", this.HeDaoTao);
        System.out.printf("Tổng số tín chỉ: %s\n", this.TongSoTinChi);
        // %f giúp format giá trị của số thực khi in ra
        System.out.printf("Tổng Học phí: %,.3f\n", this.HocPhi);
    }
}
