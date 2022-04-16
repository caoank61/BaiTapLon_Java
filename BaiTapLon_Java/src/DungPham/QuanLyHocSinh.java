package DungPham;

import java.util.Scanner;

public class QuanLyHocSinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hoc_Sinhs a = new Hoc_Sinhs ();
//		a.Nhap_Thong_Tin_Hoc_Sinh();
//		a.Xuat_Thong_Tin_Hoc_Sinh();
//		Hoc_Sinh_Chuyen b = new Hoc_Sinh_Chuyen();
//		b.Nhap_Hoc_Sinh_Chuyen();
//		b.Xuat_Hoc_Sinh_Chuyen();
		String h;
		
		a.Nhap_Nhieu_Hs();
//		
		
		a.Xuat_Nhieu_Hs();
//		a.search_MS (h);
//		a.Them_hs();
//		System.out.println("Danh Sach Sau Khi Them Hoc Sinh!");
//		a.Xuat_Nhieu_Hs();
		System.out.print("Nhap ma so can Xoa: ");
		Scanner sc = new Scanner (System.in);
		h = sc.nextLine();
		a.Xoa_hs(h);
		System.out.println("Danh Sach Sau Khi Xoa Hoc Sinh!");

		a.Xuat_Nhieu_Hs();

//		
	}

}
