package lesson2.phvan1;

public class BTB2 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=2;
        int d=5;
        //+ - x chia
        int tong = a+b+c+d;
        int hieu = b-a;
        int nhan = b*a;
        int chia = b/a;
        System.out.println("Tổng= " + tong);
        System.out.println("Hiệu= "+hieu);
        System.out.println("Nhân= "+ nhan);
        System.out.println("Thương= "+chia);
        //min
        int MinInt1 = Math.min(a,b);
        int a1= MinInt1;
        int MinInt2 = Math.min(c,d);
        int a2= MinInt2;
        int Min = Math.min(a1,a2);
        System.out.println("Gía trị nhỏ nhất a,b,c,d ="+ Min);
        //max
        int MaxInt1 = Math.max(a,b);
        int b1= MaxInt1;
        int MaxInt2 = Math.max(c,d);
        int b2= MaxInt2;
        int Max = Math.max(b1,b2);
        System.out.println("Gía trị lớn nhất a,b,c,d ="+ Max);
        //lũy thừa
        double luythua = Math.pow(c,d);
        System.out.println("c^d ="+ luythua);
        //làm tròn
        double lamtron= Math.round(3.5145);
        System.out.println("Làm tròn 3.5145="+ lamtron);






    }



}
