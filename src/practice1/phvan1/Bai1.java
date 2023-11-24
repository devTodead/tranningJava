package practice1.phvan1;

import java.util.Scanner;

public class   Bai1 {
    public void bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị của x:");
        double x = sc.nextDouble();
        boolean laSoNguyen = false;
        //Làm tròn lên = làm tròn xuống => số nguyên
        if (Math.ceil(x) == Math.floor(x)) {
            laSoNguyen = true;
            System.out.println(x + " là Số nguyên");
        } else {
            System.out.println(x + " không phải là Số nguyên");
        }
        //Số nguyên tố: x/2 vì để không chia cho chính nó

        if(!laSoNguyen || x<2){
            System.out.println(x + " Không phải là số nguyên tố");
        }
        else if (x>=2) {
            boolean laSoNguyenTo = true;
            for (double i = 2; i <= x/2; i++) {
                if (x % i == 0) {
                    System.out.println(x + " Không phải là số nguyên tố");
                    laSoNguyenTo = false;
                    break;
                }
            }
            if(laSoNguyenTo){
                System.out.println(x + " Là số nguyên tố");
            }
        }

        //Số chính phương
        double a = Math.sqrt(x);
        if (Math.ceil(a) == Math.floor(a)) {
            System.out.println(x + " là số chính phương");
        } else {
            System.out.println(x + " không là số chính phương");
        }
    }
    public void bai2() {
        Scanner bai2 = new Scanner(System.in);
        System.out.println("Nhập giá trị của x:");
        int x = bai2.nextInt();
        System.out.println("Nhập giá trị của y:");
        int y = bai2.nextInt();
        //tìm ước chung lớn nhất
        boolean a= false;
        for (int i=x; 0<i; i--) {
             if (x %i==0) {
                 int[] uocx = new int[i];
                 for (int j=y; 0<j; j--) {
                     if (y % j==0) {
                         //System.out.println( j + (j--));
                         int[] uocy = new int[j];
                         if (i==j) {
                             System.out.println("UCLN của " + x+ " và " +y +" là: "+i);
                             a= true;
                             break;
                         }
                     }
                 }
             }
             if(a){
                 break;
             }
        }
        //tìm bội chung nhỏ nhất
            for (int i=1; i<=y*x; i++) {
            if (i % x==0) {
                int[] boix = new int[i];
                for (int j=1; j<=x*y; j++) {
                    if (j % y==0) {
                        int[] boiy = new int[j];
                        if (i==j) {
                            System.out.println("BCNN của " + x+ " và " +y +" là: "+i);
                            return;
                        }
                    }
                }
            }
        }
    }
    public void bai3() {
        Scanner bai3= new Scanner(System.in);
        System.out.println("Nhập giờ vào:");
        int giovao= bai3.nextInt();
        System.out.println("Nhập giờ ra:");
        int giora= bai3.nextInt();
        int bagiodau = 150000; double saubagio= 0.7 * bagiodau;
        double tongtien;
        if (giovao >=12 && giovao <=23 && giora <=23 && giora >=12) {
            if ((giora - giovao)<3) {
                tongtien = (giora - giovao) * bagiodau;
            }
            else {
                tongtien = 3* bagiodau + (giora- giovao-3)*saubagio;
            }
            System.out.println("Tổng số tiền cần thanh toán= "+ tongtien);
        }
        else {
            System.out.println("giờ vào, giờ ra không hợp lệ");
        }

    }
    public void bai4() {
        Scanner bai4= new Scanner(System.in);
        System.out.println("Nhập số điện sử dụng");
        int sodien= bai4.nextInt();
        int tiendien=0;
        int bac1= 1678; int bac2=1734; int bac3= 2014; int bac4= 2536; int bac5=2834; int bac6=2927;
        if (sodien <=50 && sodien>=0) {
            tiendien = sodien *bac1;
        } else if (sodien <=100 && sodien>=51) {
            tiendien = 50 *bac1+ (sodien-50)*bac2;
        }
        else if (sodien <=200 && sodien>=101) {
            tiendien = 50 *bac1+ 50*bac2 + (sodien-100)*bac3;
        }
        else if (sodien <=300 && sodien>=201) {
            tiendien = 50 * bac1 + 50 * bac2 + 100 * bac3 + (sodien - 200) * bac4;
        }
        else if (sodien <=400 && sodien>=301) {
            tiendien = 50 * bac1 + 50 * bac2 + 100 * bac3 + 100 * bac4 + (sodien - 300) * bac5;
        }
        else if (sodien>=401){
            tiendien = 50 * bac1 + 50 * bac2 + 100 * bac3 + 100 * bac4 + 100 * bac5 + (sodien - 400) * bac6;
        }
        else {
            System.out.println("Số tiền điện không hợp lệ");
        }
        System.out.println("Tiền điện"+ tiendien);
    }
    public void bai5() {
        Scanner bai5 = new Scanner(System.in);
        System.out.println("Nhập số tiền cần rút");
        int sotiencanrut = bai5.nextInt();
        int[] loaitien = new int[9];
        loaitien[0] = 500000;
        loaitien[1] = 200000;
        loaitien[2] = 100000;
        loaitien[3] = 50000;
        loaitien[4] = 20000;
        loaitien[5] = 10000;
        loaitien[6] = 5000;
        loaitien[7] = 2000;
        loaitien[8] = 1000;
        int[] soto = new int[9];
        int soconlai = sotiencanrut;
        for (int i = 0; i < loaitien.length; i++) {
            soto[i] = (int) (soconlai / loaitien[i]);
            soconlai = soconlai - soto[i] * loaitien[i];
        }
        System.out.println("Số tiền " + sotiencanrut + " được rút tối thiểu số tờ như sau: ");
        for(int i = 0; i<soto.length;i++){
            if (soto[i] >0) {
                System.out.println(soto[i] + " tờ loại tiền " + loaitien[i]);
            }
        }
    }
}
