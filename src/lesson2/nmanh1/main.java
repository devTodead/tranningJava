package lesson2.nmanh1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("Tôi là Minh Anh. Đây là bài tập buổi 2 của tôi:");
        Chitieu ct = new Chitieu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên khoản chi: ");
        ct.Tenkhoanchi = sc.nextLine();
        System.out.println("Xếp loại khoản chi: ");
        ct.Xeploaikhoanchi = sc.nextLine();
        System.out.println("Độ ưu tiên: ");
        ct.Douutien = sc.nextLine();
        System.out.println("Số tiền cần chi: ");
        ct.Sotiencanchi = sc.nextDouble();
        System.out.println("Tên khoản chi: " + ct.Tenkhoanchi);
        System.out.println("Xếp loại khoản chi: " + ct.Xeploaikhoanchi);
        System.out.println("Độ ưu tiên: " + ct.Douutien);
        DecimalFormat format = new DecimalFormat("###,###,###");
        System.out.println("Số tiền cần chi: " + (format.format(ct.Sotiencanchi)) + " VNĐ");
    }
}
