package lesson2.hthang;

import java.util.Scanner;

public class sinhvien {
    public String Ho;
    public String Ten;
    public String HoTen;
    public String NganhHoc;
    public String HeDaoTao;
    public int TongSoTinChi;
    public double HocPhi;
    public int SoTinChiDaHoc;

    //Nhập thông tin sinh viên
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Họ : ");
        Ho = sc.nextLine();

        System.out.printf("Tên : ");
        Ten = sc.nextLine();

        HoTen = Ho + " " + Ten;

        System.out.printf("Ngành học : ");
        NganhHoc = sc.nextLine();

        System.out.printf("Hệ đào tạo : ");
        HeDaoTao = sc.nextLine();

        System.out.printf("Tổng số tín chỉ : ");
        TongSoTinChi = sc.nextInt();
        sc.nextLine(); //sau nextInT phải có nextline để chặn tràn dòng

        System.out.printf("Nhập vào số tín chỉ đã học : ");
        SoTinChiDaHoc = sc.nextInt();

        // tính tổng số tiền cần nộp luôn
        System.out.printf("Tiền học phi : ");
        HocPhi = TinhSoTien(TongSoTinChi, HeDaoTao);
    }
    /**
     * Dựa vào số tín chỉ và hệ đào tạo tính tổng số tiền sinh viên cần nộp
     * @param soTinChi tổng số tín chỉ
     * @param heDaoTao hệ đào tạo
     * @return tổng số tiền cần nộp
     */
    public double TinhSoTien (int soTinChi, String heDaoTao){
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
        //In ra thông tin sinh viên
        public void in () {
            System.out.printf("Họ và tên: %s\n", HoTen);
            System.out.printf("Ngành học: %s\n", NganhHoc);
            System.out.printf("Hệ đào tạo: %s\n", HeDaoTao);
            System.out.printf("Tổng số tín chỉ: %s\n", TongSoTinChi);
            System.out.printf("Học phí: %s\n", HocPhi);
        }
    }



