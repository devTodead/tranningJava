package lesson2.phvan1;

import java.util.Scanner;

public class Student {
    public String Ho;
    public String Ten;
    public String Nganh;
    public String Hedaotao;
    public int TongSoTin;
    public double TongSoTien;

    public void Input() {
        Scanner SC= new Scanner(System.in);
        System.out.println("Nhập họ của HS = ");
        Ho = SC.nextLine();
        System.out.println("Nhập Tên của HS = ");
        Ten = SC.nextLine();
        System.out.println("Nhập Ngành của HS = ");
        Nganh = SC.nextLine();
        System.out.println("Nhập Hệ đào tạo của HS = ");
        Hedaotao = SC.nextLine();
        System.out.println("Nhập Tổng số tín của HS = ");
        TongSoTin = SC.nextInt();
    }

    public void ThongTinSinhVien() {
        int CP1tin;
        switch (Hedaotao) {
            case ("Cao đẳng"):
                TongSoTien = 100000 * TongSoTin;
                break;
            case ("Đại học"):
                TongSoTien = 120000 * TongSoTin;
                break;
            default:
                TongSoTien = 80000 * TongSoTin;
                break;
        }

        System.out.println("Họ và tên: "+ Ho + " " +Ten );
        System.out.println("Ngành: " + Nganh);
        System.out.println("Hệ đào tạo: " +Hedaotao);
        System.out.println("Tôngr số tín:" +TongSoTin);
        System.out.println("Tổng số tiền: " +TongSoTien);
    }
}
