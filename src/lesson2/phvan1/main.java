package lesson2.phvan1;

import java.util.Scanner;

public class main {
    public static void main (String[] args){

        chitieu ct= new chitieu();
        Scanner sc= new Scanner(System.in);
        System.out.printf("Nhập ten khoan chi: ");
        ct.tenkhoanchi= sc.nextLine();
        System.out.printf("Nhập xep loai thứ: ");
        ct.xeploaikhoanchi= sc.nextInt();
        sc.nextLine();
        System.out.printf("Nhập độ ưu tiên: ");
        ct.douutien=sc.nextLine();
        System.out.printf("Nhập Số tiền: ");
        ct.sotiencanchi= sc.nextFloat();
        System.out.println("Khoản chi: "+ ct.tenkhoanchi);
        System.out.println("Xếp loại khoản chi: "+ ct.xeploaikhoanchi);
        System.out.println("Độ ưu tiên: "+ ct.douutien);
        System.out.print("Số tiền cần chi: "+ ct.sotiencanchi);

    }
}
