package practice1.phvan1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Bai1 baitap = new Bai1();
        Scanner baitap1= new Scanner(System.in);
        System.out.println("Nhập giá trị của Bài tập cần in kết quả");
        int bain= baitap1.nextInt();
        switch (bain) {
            case 1:
                baitap.bai1();
                break;
            case 2:
                baitap.bai2();
                break;
            case 3:
                baitap.bai3();
                break;
            case 4:
                baitap.bai4();
                break;
            case 5:
                baitap.bai5();
                break;
            case 6:
                baitap.bai6();
                break;
            case 7:
                baitap.bai7();
                break;
            case 8:
                baitap.bai8();
                break;
        }


    }
}



