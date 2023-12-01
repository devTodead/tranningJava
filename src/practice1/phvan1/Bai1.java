package practice1.phvan1;

import java.util.Random;
import java.util.Scanner;

public class   Bai1 {
    public void bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị của x:");
        double x = sc.nextDouble();
        boolean laSoNguyen = true;
        //Làm tròn lên = làm tròn xuống => số nguyên
        if (Math.ceil(x) == Math.floor(x)) {
            laSoNguyen = false;
            System.out.println(x + " là Số nguyên");
        } else {
            System.out.println(x + " không phải là Số nguyên");
        }
        //Số nguyên tố: x/2 vì để không chia cho chính nó

        if (laSoNguyen || x < 2) {
            System.out.println(x + " Không phải là số nguyên tố");
        } else if (x >= 2) {
            boolean laSoNguyenTo = true;
            for (double i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    System.out.println(x + " Không phải là số nguyên tố");
                    laSoNguyenTo = false;
                    break;
                }
            }
            if (laSoNguyenTo) {
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
        for (int i = x; 0 < i; i--) {
            if (x % i == 0 && y % i == 0) {
                System.out.println("UCLN của " + x + " và " + y + " là: " + i);
                break;
            }
        }
        //tìm bội chung nhỏ nhất
        for (int i = 1; i <= y * x; i++) {
            if (i % x == 0 && i % y == 0) {
                System.out.println("BCNN của " + x + " và " + y + " là: " + i);
                break;
            }
        }
    }

    public void bai3() {
        Scanner bai3 = new Scanner(System.in);
        System.out.println("Nhập giờ vào:");
        int giovao = bai3.nextInt();
        System.out.println("Nhập giờ ra:");
        int giora = bai3.nextInt();
        int bagiodau = 150000;
        double saubagio = 0.7 * bagiodau;
        double tongtien;
        if (giovao >= 12 && giovao <= 23 && giora <= 23 && giora >= 12 && (giora - giovao) >= 0) {
            if ((giora - giovao) < 3) {
                tongtien = (giora - giovao) * bagiodau;
            } else {
                tongtien = 3 * bagiodau + (giora - giovao - 3) * saubagio;
            }
            System.out.println("Tổng số tiền cần thanh toán= " + tongtien);
        } else {
            System.out.println("giờ vào, giờ ra không hợp lệ");
        }
    }

    public void bai4() {
        Scanner bai4 = new Scanner(System.in);
        System.out.println("Nhập số điện sử dụng");
        int sodien = bai4.nextInt();
        int tiendien = 0;
        int bac1 = 1678;
        int bac2 = 1734;
        int bac3 = 2014;
        int bac4 = 2536;
        int bac5 = 2834;
        int bac6 = 2927;
        if (sodien <= 50 && sodien >= 0) {
            tiendien = sodien * bac1;
        } else if (sodien <= 100 && sodien >= 51) {
            tiendien = 50 * bac1 + (sodien - 50) * bac2;
        } else if (sodien <= 200 && sodien >= 101) {
            tiendien = 50 * bac1 + 50 * bac2 + (sodien - 100) * bac3;
        } else if (sodien <= 300 && sodien >= 201) {
            tiendien = 50 * bac1 + 50 * bac2 + 100 * bac3 + (sodien - 200) * bac4;
        } else if (sodien <= 400 && sodien >= 301) {
            tiendien = 50 * bac1 + 50 * bac2 + 100 * bac3 + 100 * bac4 + (sodien - 300) * bac5;
        } else if (sodien >= 401) {
            tiendien = 50 * bac1 + 50 * bac2 + 100 * bac3 + 100 * bac4 + 100 * bac5 + (sodien - 400) * bac6;
        } else {
            System.out.println("Số tiền điện không hợp lệ");
        }
        System.out.println("Tiền điện" + tiendien);
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
        for (int i = 0; i < soto.length; i++) {
            if (soto[i] > 0) {
                System.out.println(soto[i] + " tờ loại tiền " + loaitien[i]);
            }
        }
    }

    public void bai6() {
        Scanner bai6 = new Scanner(System.in);
        System.out.println("Nhập số tiền vay kỳ hạn 12 tháng- 5%");
        int sotiencanvay = bai6.nextInt();
        int tiengoccantra1m = 0;
        int laiphaitra = 0;
        int[] tienlai = new int[12];
        for (int i = 0; i < tienlai.length; i++) {
            tiengoccantra1m = sotiencanvay / 12;
            laiphaitra = (sotiencanvay - tiengoccantra1m * i) / 100 * 5;
            System.out.println("Số tiền lãi tháng " + (i + 1) + " là: " + laiphaitra + " tiền lãi và " + tiengoccantra1m + " tiền gốc.");
        }
    }

    public void bai7() {
        Scanner bai7 = new Scanner(System.in);
        System.out.println("Nhập số tiền vay kỳ hạn 24 tháng");
        double tienvay = bai7.nextDouble();
        System.out.println("Nhập tỷ lệ trả trước");
        double ratetratruoc = bai7.nextDouble();
        System.out.println("Số tiền lần đầu trả= " + tienvay * ratetratruoc / 100);
        double tienconno = tienvay / 100 * (100 - ratetratruoc);
        double tiengoccantra1m = 0;
        double[] tienlai = new double[24];
        for (int i = 0; i < tienlai.length; i++) {
            tiengoccantra1m = tienconno / 24;
            double laiphaitra = (tienconno - tiengoccantra1m * i) * 72 / 12000;
            System.out.println("Số tiền lãi tháng " + (i + 1) + " là: " + laiphaitra + " tiền lãi và " + 1.0 * tiengoccantra1m + " tiền gốc.");
        }
    }
    public void bai8() {
        Scanner bai8 = new Scanner(System.in);
        System.out.println("Nhập số sinh viên trong danh sách:");
        int count = bai8.nextInt();
        //gọi mảng để khai báo 2 sinh viên
        Student[] danhsach = new Student[count];
        for (int i = 0; i < count; i++) {
            danhsach[i] = new Student();
            danhsach[i].Ham();
        }
        // hàm sap xep tăng dần
        for (int i = 0; i < count; i++) {
             for (int j = i + 1; j < count; j++) {
                    if (danhsach[i].point > danhsach[j].point) {
                        var temp = danhsach[j];
                        danhsach[j] = danhsach[i];
                        danhsach[i] = temp;
                    }
                }
            }
        System.out.println("Sắp xếp học sinh theo thứ tự điểm giảm dần như sau:");
        for (int i = 0; i < count; i++) {
            System.out.println("Họ và tên: "+ danhsach[i].name + "- Điểm: "+ danhsach[i].point + "- Học lực: "+ danhsach[i].hocluc +";");
        }
    }
    public void bai9() {
        Scanner bai9 = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất:");
        int So1 = bai9.nextInt();
        System.out.println("Nhập số thứ hai");
        int So2 = bai9.nextInt();
        int[] random = new int[2];
        for (int i = 0; i < 2; i++) {
            Random rand = new Random();
            int ranNum = rand.nextInt(15) + 1;
            System.out.println("Số thứ " + (i + 1) + " ngẫu nhiên được chọn từ 0-15 là: " + ranNum + ";");
            random[i] = ranNum;
        }
        if (So1 != random[0] && So1 != random[1] && So2 != random[0] && So2 != random[1]) {
            System.out.println("Chúc bạn may mắn lần sau");
        } else if (So1 == random[0] && So2 == random[1] || So2 == random[0] && So1 == random[1]) {
            System.out.println("Chúc bạn đã trúng giải nhất");
        } else {
            System.out.println("Chúc bạn đã trúng giải nhì");
        }
    }
    public void bai10() {
        Scanner bai10 = new Scanner(System.in);
        System.out.println("Nhập tử và mẫu của phân số thứ nhất:");
        int tu1 = bai10.nextInt();
        int mau1 = bai10.nextInt();
        System.out.println("Nhập tử và mẫu của phân số thứ hai");
        int tu2 = bai10.nextInt();
        int mau2 = bai10.nextInt();
        //tính tổng
        double x = tu1 * mau2 + tu2 * mau1;
        double y = mau1 * mau2;
        //rút gọn: tìm ước chung => rút gọn
        for (double i = x; 0 < i; i--) {
            if (x % i == 0 && y % i == 0) {
                System.out.println("Tổng 2 phân số là " + (int) (x / i) + "/" + (int) (y / i));
                break;
            }
        }
        //tính hiệu
        double c = tu1 * mau2 - tu2 * mau1;
        double d = mau1 * mau2;
        //rút gọn: tìm ước chung => rút gọn
        for (double i = c; 0 < i; i--) {
            if (c % i == 0 && d % i == 0) {
                System.out.println("Hiệu 2 phân số là " + (int) (c / i) + "/" + (int) (d / i));
                break;
            }
        }
        //tính tích
        double e = tu1 * tu2;
        double f = mau1 * mau2;
        //rút gọn: tìm ước chung => rút gọn
        for (double i = e; 0 < i; i--) {
            if (e % i == 0 && f % i == 0) {
                System.out.println("Tích 2 phân số là " + (int) (e / i) + "/" + (int) (f / i));
                break;
            }
        }
        //tính thương
        double g = tu1 * mau2;
        double h = mau1 * tu2;
        //rút gọn: tìm ước chung => rút gọn
        for (double i = g; 0 < i; i--) {
            if (g % i == 0 && h % i == 0) {
                System.out.println("Thương 2 phân số là " + (int) (g / i) + "/" + (int) (h / i));
                break;
            }
        }
    }


}



