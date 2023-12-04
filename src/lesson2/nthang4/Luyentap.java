package lesson2.nthang4;

import java.util.Random;
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
    public void CN6(){
        System.out.println("Đây là chức năng 6");
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số tiền muốn vay: ");
        double Tienvay = sc.nextDouble();
        double Laiphaitra = Tienvay * 0.05;
        double Gocphaitra = Tienvay/12;
        double Sotienphaitra = Laiphaitra + Gocphaitra;
        double Sotienconlai = Tienvay - Gocphaitra;
        for (int i = 1; i< 13; i++ ){
            if(i!=1){
                Laiphaitra = Sotienconlai*0.05;
                Sotienphaitra = Laiphaitra + Gocphaitra;
                Sotienconlai = Sotienconlai - Gocphaitra;
            }
            System.out.println("Kỳ hạn: "+i);
            System.out.println("Lãi phải trả: "+Laiphaitra);
            System.out.println("Gốc phải trả: "+ Gocphaitra);
            System.out.println("Số tiền phải trả: "+Sotienphaitra);
            System.out.println("Số tiền còn lại: "+Sotienconlai);
            System.out.println("---------");
        }
    }

    public void CN7 (){
        Scanner sc = new Scanner(System.in);
        double PhantramvayCC = sc.nextDouble();
        double Phantramvay = PhantramvayCC/100;
        double Sotienconphaitra = 500000000 * Phantramvay;
        double Laiphaitra = Sotienconphaitra * 0.072;
        double Sotiengocphaitra = Sotienconphaitra /24;
        double Sotientrahangnam = Laiphaitra + Sotiengocphaitra;
        double Sotienconlai = Sotienconphaitra - Sotiengocphaitra;
        for (int i=1;i<25; i++ ){
            if (i!=1){
                Laiphaitra = Sotienconlai * 0.072;
                Sotientrahangnam = Laiphaitra + Sotiengocphaitra;
                Sotienconlai = Sotienconlai - Sotiengocphaitra;
            }
            System.out.println("Kỳ hạn: "+i);
            System.out.println("Lãi phải trả: "+ (int)Laiphaitra);
            System.out.println("Số tiền gốc phải trả: "+ (int)Sotiengocphaitra);
            System.out.println("Số tiền phải trả năm " + i + " là: "+(int)Sotientrahangnam);
            System.out.println("Số tiền còn lại: "+(int)Sotienconlai);
            System.out.println("-----");
        }
    }
    public void CN8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên");
        int count = sc.nextInt();
        Double[] arrayDiem = new Double[count];
        String[] arrayHoten = new String[count];
        // Nhap data
        for (int i = 0; i < arrayDiem.length; i++){
            System.out.println("Nhập thông tin Họ và tên");
            String Hoten = sc.next();
            arrayHoten[i] = Hoten;
            System.out.println("Nhập thông tin điểm");
            double Diem = sc.nextDouble();
            arrayDiem[i]= Diem;
        }
        // xu ly data
        for (int i=0; i < arrayDiem.length; i++){
            for (int j = i+1; j < arrayDiem.length; j++){
                if (arrayDiem[i] < arrayDiem[j]){
                    double Diemtam = arrayDiem[j];
                    arrayDiem[j]=arrayDiem[i];
                    arrayDiem[i]=Diemtam;
                    String Hotentam = arrayHoten[j];
                    arrayHoten[j]=arrayHoten[i];
                    arrayHoten[i]=Hotentam;
                }
            }
        }
        String Hocluc;
        // Printf data
        for (int i = 0; i < arrayDiem.length; i++){
            System.out.println("Thông tin học sinh thứ " + (i+1) );
            System.out.println("Họ tên: "+arrayHoten[i]);
            System.out.println("Điểm: "+arrayDiem[i]);
            if(arrayDiem[i]<5){
                Hocluc = "Học lực Yếu";
            } else if (arrayDiem[i]<6.5) {
                Hocluc = "Học lực Trung bình";
            } else if (arrayDiem[i]<8) {
                Hocluc = "Học lực Khá";
            } else if (arrayDiem[i]<9) {
                Hocluc = "Học lực giỏi";
            }else {
                Hocluc = "Học lực xuất sẵc";
            }
            System.out.println("Học lực: "+Hocluc);
            System.out.println("-------");
        }
    }
    public void CN9() {
        System.out.println("Đây là chức năng 9 ");
        Scanner sc = new Scanner(System.in);
        int So1 = sc.nextInt();
        int So2 = sc.nextInt();
        Random generater = new Random();
        int value1 = generater.nextInt((15 - 1) + 1) + 1;
        System.out.println("giá trị 1 là: " + value1);
        int value2 = generater.nextInt((15 - 1) + 1) + 1;
        System.out.println("giá trị 2 là: " + value2);
        if (So1 == value1 || So1 == value2 || So2 == value1 || So2 == value2) {
            System.out.println("Chúc mừng bạn đã trúng giải nhì");
        } else if ((So1 == value1 & So2 == value2) || (So2 == value1 & So1 == value2)) {
            System.out.println("Chúc mừng bạn đã trúng giải nhất");
        } else {
            System.out.println("Chúc bạn may mắn lần sau");
        }
    }

    public void CN10(){
        int MSchung = 1;
        int UCLN = 1;
        System.out.println("Đây là chức năng 10 ");
        Scanner sc = new Scanner(System.in);
        int Tu1 = sc.nextInt();
        int Mau1 = sc.nextInt();
        int Tu2 = sc.nextInt();
        int Mau2 = sc.nextInt();
        if (Mau1 !=0 & Mau2 !=0){
            System.out.println("Phân số 1 là: "+Tu1+ "/" +Mau1);
            System.out.println("Phân số 2 là: "+Tu2 + "/" +Mau2);
        }
        else{
            System.out.println("Mẫu số phải khác 0");
            return;
        }
        //Tìm bội chung nhỏ nhất của mẫu 1 và mẫu 2
        if(Mau1<Mau2){
            MSchung = BCNN2(Mau1,Mau2);
        }
        else{
            MSchung=BCNN2(Mau2,Mau1);
        }

        //Tính tổng
        int TuTong = MSchung/Mau1*Tu1 + MSchung/Mau2*Tu2;
        System.out.println("Tử tổng là: "+TuTong);

        //Tìm phân số tối giản của phân số tổng
        if (TuTong<MSchung) {
            UCLN=UCLN1(TuTong,MSchung);
        }
        else {
            UCLN=UCLN1(MSchung,TuTong);
        }
        System.out.println("Tổng của phân số 1 và phân số 2 là: "+ TuTong/UCLN+"/"+MSchung/UCLN);
        //Tính hiệu
        int Tuhieu = 0;
        if(MSchung/Mau1*Tu1 > MSchung/Mau2*Tu2){
            Tuhieu = MSchung/Mau1*Tu1 - MSchung/Mau2*Tu2;
        }
        else {
            Tuhieu = MSchung/Mau2*Tu2 - MSchung/Mau1*Tu1;
        }
        //Tìm phân số tối giản của phân số hiệu
        if (Tuhieu < MSchung) {
            UCLN=UCLN1(Tuhieu,MSchung);
        }
        else {
            UCLN=UCLN1(MSchung,Tuhieu);
        }
        System.out.println("Hiệu của phân số 1 và phân số 2 là: "+ Tuhieu/UCLN+"/"+MSchung/UCLN);

        //Tính tích
        int Tutich = Tu1 * Tu2;
        int Mautich = Mau1 * Mau2;
        //Tìm UCLN của tích
        if (Tutich < Mautich) {
            UCLN=UCLN1(Tutich,Mautich);
        }
        else {
            UCLN=UCLN1(Mautich,Tutich);
        }
        System.out.println("Tích của phân số 1 và phân số 2 là: "+ Tutich/UCLN + "/"+Mautich/UCLN);

        //Tính thương
        int Tuthuong = Tu1 * Mau2;
        int Mauthuong = Mau1 * Tu2;
        //Tính UCNN
        if (Tuthuong < Mauthuong) {
            UCLN=UCLN1(Tuthuong,Mauthuong);
        }
        else {
            UCLN=UCLN1(Mauthuong,Tuthuong);
        }
        System.out.println("Thương của phân số 1 và phân số 2 là "+ Tuthuong/UCLN +"/"+Mauthuong/UCLN);
    }
    public int UCLN1(int Sonho, int Solon) {
        for (int i = Sonho; i > 0; i--) {
            if (Sonho % i == 0 & Solon % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public int BCNN2(int Sonho, int Solon) {
        for (int i = Solon; i >= Solon; i++) {
            if (i % Sonho == 0 & i % Solon == 0) {
                return i;
            }
        }
        return Solon * Sonho;
    }
}
