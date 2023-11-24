package lesson2.phvan1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /*chitieu ct= new chitieu();
        Scanner sc= new Scanner(System.in);
        System.out.printf("Nhập ten khoan chi: ");
        ct.tenkhoanchi= sc.nextLine();
        System.out.printf("Nhập xep loai thứ: ");
        ct.xeploaikhoanchi= sc.nextInt();
        sc.nextLine();
        System.out.printf("Nhập độ ưu tiên: ");
        ct.douutien=sc.nextLine();
        System.out.printf("Nhập Số tiền: ");
        ct.sotiencanchi= sc.nextFloat();
        System.out.println("Khoản chi: "+ ct.tenkhoanchi);
        System.out.println("Xếp loại khoản chi: "+ ct.xeploaikhoanchi);
        System.out.println("Độ ưu tiên: "+ ct.douutien);
        System.out.print("Số tiền cần chi: "+ ct.sotiencanchi);*/
        Student main1 = new Student();
        //main1.Input();
        //main1.ThongTinSinhVien();
        // 1.Nhập số lượng sinh viên cần quản lý
        Scanner SL = new Scanner(System.in);
        System.out.println("Nhập số sinh viên cần quản lý= ");
        int Soluong = SL.nextInt();
        System.out.println("Số nhân viên cần quản lý = " + Soluong);
        // 2. Nhập thông tin cho các sinh viên
        /* for (int i = 1; i <= Soluong; i++) {
            main1.Input();
            main1.ThongTinSinhVien();
        }*/
        // 3. Nhập vào họ và tên: in ra thông tin của sinh viên tương ứng
        System.out.println("================");
        Student[] main2 = new Student[Soluong];
        // Lần lượt nhập thông tin cho n sinh viên
        for (int i = 0; i < Soluong; i++) {
            System.out.println("Sinh viên " + (i + 1));

            // khởi tạo từng sinh viên trong danh sách
            main2[i] = new Student();

            // nhập thông tin sinh viên
            main2[i].Input();
            main2[i].ThongTinSinhVien();
        }

        Scanner SL1 = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên cần tìm kiếm= ");
        String Tentimkiem = SL1.nextLine();
        // gọi hàm tìm kiếm
        Student sinhVienCanTim = TimKiem(main2, Tentimkiem);
        // nếu kết quả hàm tìm kiếm tra về null thì in không tìm thấy
        if (sinhVienCanTim == null) {
            System.out.print("Không tìm thấy");
        } else {
            // nếu khác null => tìm thấy thì in ra thông tin sinh viên
            sinhVienCanTim.ThongTinSinhVien();
        }
    }

    /**
     * @param nguon   danh sách sinh viên đầu vào
     * @param hoVaTen họ và tên sinh viên cần tìm
     */
    public static Student TimKiem(Student[] nguon, String hoVaTen) {
        Student sinhVienCanTim = null;
        // duyệt từ đầu đến cuối danh sách sinh viên để tìm
        for (int i = 0; i < nguon.length; i++) {
            // nếu khớp họ và tên thì gán vào kết quả trả về
            // phép toán so sánh bằng của 2 số là a == b, còn đối với String thì là a.equals(b)
            if (nguon[i].Ten.equals(hoVaTen)) {
                sinhVienCanTim = nguon[i];
                break;
            }
        }
        // trả về kết quả tìm được
        return sinhVienCanTim;
            }
        }





        /*if (Tentimkiem== null) {
            System.out.println("Không tìm thấy thông tin sinh viên");
        }
        else {
            for (int i =0; i <=Soluong; i++ ) {
                if (Tentimkiem.equals(main1.Ten)) {
                    Tentimkiem=;
                }
            }
        }*/



