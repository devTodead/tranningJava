package Buoi2_Bai1;

import java.util.Scanner;

public class ChiTieu {
	public String tenKhoanChi;
	public String xepLoaiKhoanChi;
	public int doUuTien;
	public double soTienCanChi;
	
	Scanner scanner = new Scanner(System.in);
	
	public void xuat() {
		System.out.println("\n==Thông tin chi tiêu==");
		System.out.println("Tên khoản chi: "+tenKhoanChi);
		System.out.println("Xếp loại khoản chi: "+xepLoaiKhoanChi);
		System.out.println("Độ ưu tiên: "+doUuTien);
		System.out.println("Số tiền cần chi: "+soTienCanChi);
	}
	
	public void nhap() {
		System.out.print("Nhập tên khoản chi: ");
		tenKhoanChi = scanner.nextLine();
		System.out.print("Nhập xếp loại khoản chi: ");
		xepLoaiKhoanChi = scanner.nextLine();
		System.out.print("Nhập độ ưu tiên: ");
		doUuTien = scanner.nextInt();
		System.out.print("Nhập số tiền cần chi: ");
		soTienCanChi = scanner.nextDouble();
	}
}
