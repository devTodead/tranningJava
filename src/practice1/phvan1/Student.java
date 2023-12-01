package practice1.phvan1;

import java.util.Scanner;

public class Student {
    public String name;
    public Double point;
    public String hocluc;
    public void Ham() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Nhập họ và tên sinh viên:");
        name = SC.next();
        System.out.println("Nhập điểm của sinh viên");
        point = SC.nextDouble();
        if (point >= 0 && point < 5) {
            hocluc = "Học lực yếu";
            //System.out.println("Họ và tên: " + name + "; Điểm: " + point + "; " + hocluc);
        } else if (point >= 5 && point <= 6.5) {
            hocluc = "Học lực trung bình";
            //System.out.println("Họ và tên: " + name + "; Điểm: " + point + "; " + hocluc);
        } else if (point > 6.5 && point < 8) {
            hocluc = "Học lực  khá";
            //System.out.println("Họ và tên: " + name + "; Điểm: " + point + "; " + hocluc);
        } else if (point >= 8 && point < 9) {
            hocluc = "Học lực  giỏi";
            //System.out.println("Họ và tên: " + name + "; Điểm: " + point + "; " + hocluc);
        } else if (point >= 9 && point <= 10) {
            hocluc = "Học lực  giỏi";
            //System.out.println("Họ và tên: " + name + "; Điểm: " + point + "; " + hocluc);
        } else {
            System.out.println("điểm không hợp lệ");
        }
    }
}

