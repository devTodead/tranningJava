package lesson2.nthang4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Spending = new Scanner(System.in);
        Spending CT = new Spending();
        CT.Ten_khoan_chi =Spending.nextLine();
        CT.Loai_khoan_chi=Spending.nextLine();
        CT.Do_uu_tien=Spending.nextLine();
        CT.So_tien=Spending.nextInt();
        CT.Ham();
    }
}
