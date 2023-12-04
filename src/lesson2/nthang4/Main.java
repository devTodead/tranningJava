package lesson2.nthang4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner Spending = new Scanner(System.in);
        Spending CT = new Spending();
        CT.Ten_khoan_chi =Spending.nextLine();
        CT.Loai_khoan_chi=Spending.nextLine();
        CT.Do_uu_tien=Spending.nextLine();
        CT.So_tien=Spending.nextInt();
        CT.Ham();
         */
        Luyentap LT = new Luyentap();
        Scanner sc = new Scanner(System.in);
        int Chucnang;
        do {
            System.out.println("Nhập thông tin chức năng: (1-10)");
            Chucnang = sc.nextInt();
            switch (Chucnang) {
                case 1:
                    LT.CN1();
                    break;
                case 2:
                    LT.CN2();
                    break;
                case 3:
                    LT.CN3();
                    break;
                case 4:
                    LT.CN4();
                    break;
                case 5:
                    LT.CN5();
                    break;
                case 6:
                    LT.CN6();
                    break;
                case 7:
                    LT.CN7();
                    break;
                case 8:
                    LT.CN8();
                    break;
                case 9:
                    LT.CN9();
                    break;
                case 10:
                    LT.CN10();
                    break;
                default:
                    System.out.println("Exit");
                    break;
            }
        } while (Chucnang > 0 && Chucnang < 11) ;
    }
}
