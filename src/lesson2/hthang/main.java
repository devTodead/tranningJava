package lesson2.hthang;
import java.text.DecimalFormat;
import java.util.Scanner; //BÀI TẬP BUỔI 3
public class main {
    public static void main (String[] args){
        chitieu tien = new chitieu();
         /*
        tien.tenKhoanChi = "Học phí kì 1";
        tien.doUuTien = "vừa";
        tien.xepLoaiKhoanChi = 1;
        tien.soTienCanChi = 2000000;
        tien.tienchitieu();
         */
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
        DecimalFormat format = new DecimalFormat("###,###,###");
        System.out.println("SỐ TIỀN CẦN CHI = : " + (format.format(tien.soTienCanChi)) + " VNĐ");
    }
}
