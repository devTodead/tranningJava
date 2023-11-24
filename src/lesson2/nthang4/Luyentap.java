package lesson2.nthang4;

import java.util.Scanner;
import java.util.Timer;

public class Luyentap {
    public void CN1() {
        System.out.println("Đây là chức năng 1");
        System.out.println("Nhập thông tin x: ");
        double x;
        boolean a = true;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        //Kiểm tra xem x có phải số nguyên không?
        if (x == (int) x) {
            System.out.println("X là số nguyên");
        } else {
            System.out.println("X không là số nguyên");
        }
        //Kiểm tra xem x có phải số nguyên tố không?
        if (x < 2) {
            System.out.println("X không phải là số nguyên tố");
        } else {
            for (int i = 2; i < x / 2; i++) {
                if (x % i == 0) {
                    System.out.println("X không là số nguyên tố");
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.println("X là số nguyên tố");
            }
        }
        //Kiểm tra xem x có phải số chính phương không?
        double b = Math.sqrt(x);
        if (b == (int) b) {
            System.out.println("X là số chính phương");
        } else {
            System.out.println("X không là số chính phương");
        }
    }

    public void UCLN(int Sonho, int Solon) {
        for (int i = Sonho; i > 0; i--) {
            if (Sonho % i == 0 & Solon % i == 0) {
                System.out.println("Ước chung lớn nhất của 2 số x và y là: " + i);
                break;
            }
        }
    }

    public void BCNN(int Sonho, int Solon) {
        for (int i = Solon; i >= Solon; i++) {
            if (i % Sonho == 0 & i % Solon == 0) {
                System.out.println("Bội chung nhỏ nhất của 2 số x và y là: " + i);
                break;
            }
        }
    }

    public void CN2() {
        System.out.println("Đây là chức năng 2");
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin x: ");
        x = sc.nextInt();
        System.out.println("Nhập thông tin y: ");
        y = sc.nextInt();
        //Tìm ước chung lớn nhất của x và y
        if (x < y) {
            UCLN(x, y);
        } else {
            UCLN(y, x);
        }
        //Tìm bội chung nhỏ nhất của x và y
        if (x < y) {
            BCNN(x, y);
        } else {
            BCNN(y, x);
        }
        //Cách 2 tìm bội chung nhỏ nhất của x và y sử dụng while
        if (x < y) {
            int i = y;
            int a = 0;
            while (a == 0) {
                if (i % x == 0 & i % y == 0) {
                    System.out.println("Bội chung nhỏ nhất của 2 số x và y là: " + i);
                    a = 1;
                }
                i++;
            }
        } else {
            int i = x;
            int a = 0;
            while (a == 0) {
                if (i % x == 0 & i % y == 0) {
                    System.out.println("Bội chung nhỏ nhất của 2 số x và y là: " + i);
                    a = 1;
                }
                i++;
            }
        }
    }

    public void CN3() {
        System.out.println("Đây là chức năng 3");
        int Giobatdau;
        int Gioketthuc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giờ bắt đầu: ");
        Giobatdau = sc.nextInt();
        System.out.println("Nập giờ kết thúc: ");
        Gioketthuc = sc.nextInt();
        if (12 <= Giobatdau & Giobatdau < 23 & 12 < Gioketthuc & Gioketthuc <= 23) {
            if (Giobatdau > Gioketthuc) {
                System.out.println("Giờ bắt đầu phải nhỏ hơn hoặc bằng giờ kết thúc");
            } else {
                int Giohat = Gioketthuc - Giobatdau;
                if (Giohat <= 3) {
                    int Sotien = Giohat * 150000;
                    System.out.println("Số tiền cần thanh toán là: " + Sotien);
                }
                else {
                    int Sotien = 150000 * 3 + (Giohat-3)* 105000;
                    System.out.println("Số tiền cần thanh toán là: " + Sotien);
                }
            }
        }
        else {
            System.out.println("Quán chưa mở cửa");
        }
    }

    public void CN4(){
        System.out.println("Đây là chức năng 4");
        int SodienSD;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện sử dụng: ");
        SodienSD=sc.nextInt();
        int a = 50*1678;
        int b = 50*1734;
        int c = 100*2014;
        int d = 100*2536;
        int e = 100*2834;
        if(SodienSD>=0 & SodienSD<=50){
            int Sotien = SodienSD * 1678;
            System.out.println("Số tiền cần phải trả là: "+Sotien);
        } else if (SodienSD<=100) {
            int Sotien = a + (SodienSD-50)*1734;
            System.out.println("Số tiền cần phải trả là: "+Sotien);            
        } else if (SodienSD<=200) {
            int Sotien = a + b + (SodienSD-100)*2014;
            System.out.println("Số tiền cần phải trả là: "+Sotien);
        } else if (SodienSD<=300) {
            int Sotien = a + b + c + (SodienSD-200)*2536;
            System.out.println("Số tiền cần phải trả là: "+Sotien);
        } else if (SodienSD <= 400) {
            int Sotien = a + b + c + d + (SodienSD-300)*2834;
            System.out.println("Số tiền cần phải trả là: "+Sotien);        
        } else{
            int Sotien = a + b + c + d + e + (SodienSD-400)*2927;
            System.out.println("Số tiền cần phải trả là: "+Sotien);
        }
    }

    public void CN5(){
        System.out.println("Đây là chức năng 5");
        Scanner sc = new Scanner(System.in);
        int Sotien;
        System.out.println("Nhập số tiền cần đổi: ");
        Sotien= sc.nextInt();
        int[] Loaitien = {500,200,100,50,20,10,5,2,1};
        int[] Solan = {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0, 0};
        int Socuoi = 0;
        while (Sotien>0){
            for (int i=0; i<Loaitien.length; i++){
                if(Sotien >= Loaitien[i]){
                    Sotien=Sotien-Loaitien[i];
                    Socuoi= i;
                    Solan[i]++;
                    break;
                }
            }
        }
        boolean moi = true;
        for (int i = 0 ; i<Loaitien.length;i++){
            if(Solan[i]>0){
                String soToTien = Solan[i] + " tờ "+ Solan[i];
                if(moi){
                    System.out.printf(soToTien);
                    moi = false;
                }else{
                    if(i<Socuoi) {
                        System.out.printf(" ;" + soToTien);
                    }
                    else{
                        System.out.printf(" và "+soToTien);
                    }
                }
            }
        }
    }
    /*public void CN6(){
        double Tienvay;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn vay: ");
        Tienvay= sc.nextDouble();
        double Laiphaitra = 0;
        double Gocphaitra = Tienvay/12;
        double Sotienphaitra = Laiphaitra + Gocphaitra;
        double Sotienconlai = 0;
        for(int Kyhan=1; Kyhan<13; Kyhan++) {
            if (Kyhan == 1){
                Laiphaitra = Tienvay*0.05;
                Sotienconlai = Tienvay - Gocphaitra;
                System.out.println("Số tiền phải trả của kỳ "+Kyhan+ " là: "+Sotienphaitra);
            }else {
                Laiphaitra = Sotienconlai*0.05;
                Sotienconlai = Sotienphaitra - Gocphaitra;
                System.out.println("Số tiền phải trả của kỳ "+Kyhan+ " là: "+Sotienphaitra);
            }
        }
    }

     */
}
