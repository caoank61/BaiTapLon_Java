package DungPham;

import java.util.Scanner;

public class Hoc_Sinh_Chuyen extends Hoc_Sinh{
	private String Mon_Chuyen;
	private float Diem_Mon_Chuyen;
	public  Hoc_Sinh_Chuyen() {
		super();
		Mon_Chuyen = "";
		Diem_Mon_Chuyen = 0;
	}
	public void Nhap_Hoc_Sinh_Chuyen () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap Mon Chuyen: ");
		Mon_Chuyen = sc.nextLine();
		System.out.println("Nhap Diem Mon Chuyen: ");
		Diem_Mon_Chuyen = sc.nextFloat();
	}
	public void Xuat_Hoc_Sinh_Chuyen() {
		System.out.print(" Chuyen Mon: "+ Mon_Chuyen + " || Diem: "+Diem_Mon_Chuyen);
	}

}
