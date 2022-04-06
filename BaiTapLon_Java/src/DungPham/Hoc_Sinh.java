package DungPham;

import java.util.Scanner;

public class Hoc_Sinh {
	private String HoTen;
	private String Lop;
	private String MSHS;
	private String Dia_Chi;
	private int Ngay;
	private int Thang;
	private int Nam;
	private float Diem_Toan;
	private float Diem_Ly;
	private float Diem_Hoa;
	private float Diem_Van;
	private float Diem_Su;
	private float Diem_Dia;
	public Hoc_Sinh () {
		super ();
		HoTen = "";
		Lop = "";
		MSHS = "";
		Dia_Chi = "";
		Ngay = 1;
		Thang = 1;
		Nam = 2006;
		Diem_Toan = 0;
		Diem_Ly = 0;
		Diem_Hoa = 0;
		Diem_Van = 0;
		Diem_Su = 0;
		Diem_Dia = 0;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getLop() {
		return Lop;
	}
	public void setLop(String lop) {
		Lop = lop;
	}
	public String getMSHS() {
		return MSHS;
	}
	public void setMSHS(String mSHS) {
		MSHS = mSHS;
	}
	public String getDia_Chi() {
		return Dia_Chi;
	}
	public void setDia_Chi(String dia_Chi) {
		Dia_Chi = dia_Chi;
	}
	public int getNgay() {
		return Ngay;
	}
	public void setNgay(int ngay) {
		Ngay = ngay;
	}
	public int getThang() {
		return Thang;
	}
	public void setThang(int thang) {
		Thang = thang;
	}
	public int getNam() {
		return Nam;
	}
	public void setNam(int nam) {
		Nam = nam;
	}
	public float getDiem_Toan() {
		return Diem_Toan;
	}
	public void setDiem_Toan(float diem_Toan) {
		Diem_Toan = diem_Toan;
	}
	public float getDiem_Ly() {
		return Diem_Ly;
	}
	public void setDiem_Ly(float diem_Ly) {
		Diem_Ly = diem_Ly;
	}
	public float getDiem_Hoa() {
		return Diem_Hoa;
	}
	public void setDiem_Hoa(float diem_Hoa) {
		Diem_Hoa = diem_Hoa;
	}
	public float getDiem_Van() {
		return Diem_Van;
	}
	public void setDiem_Van(float diem_Van) {
		Diem_Van = diem_Van;
	}
	public float getDiem_Su() {
		return Diem_Su;
	}
	public void setDiem_Su(float diem_Su) {
		Diem_Su = diem_Su;
	}
	public float getDiem_Dia() {
		return Diem_Dia;
	}
	public void setDiem_Dia(float diem_Dia) {
		Diem_Dia = diem_Dia;
	}
	public int Tinh_Tuoi () {
		int tuoi = 0;
		return tuoi = 2022- Nam;
	}
	public float Tinh_DiemTB() {
		float tb = (Diem_Toan + Diem_Ly +Diem_Hoa + Diem_Van + Diem_Su + Diem_Dia)/6;
		return tb;
	}
	public void Nhap_Thong_Tin_Hoc_Sinh () {
		Scanner sc = new Scanner (System.in);
		// Nhập thông tin cơ bản của một học sinh
		System.out.println("Nhap Thong Tin Hoc Sinh!!!");
		System.out.print("Nhap Ma So: ");
		MSHS = sc.nextLine();
		System.out.print("Nhap Ho Va Ten: ");
		HoTen = sc.nextLine();
		System.out.print("Nhap Lop Hoc: ");
		Lop = sc.nextLine();
		System.out.print("Nhap Dia Chi (Thanh Pho): ");
		Dia_Chi = sc.nextLine();
		System.out.print("Nhap Ngay Sinh: ");
		Ngay = sc.nextInt();
		System.out.print("Nhap Thang Sinh: ");
		Thang = sc.nextInt();
		System.out.print("Nhap Nam Sinh: ");
		Nam = sc.nextInt();
		
		// Nhập thông tin điểm các môn của học sinh
		System.out.println("Nhap Diem Hoc Sinh!!!");
		System.out.print("Nhap Diem Toan: ");
		Diem_Toan = sc.nextFloat();
		System.out.print("Nhap Diem Ly: ");
		Diem_Ly = sc.nextFloat();
		System.out.print("Nhap Diem Hoa: ");
		Diem_Hoa = sc.nextFloat();
		System.out.print("Nhap Diem Van: ");
		Diem_Van = sc.nextFloat();
		System.out.print("Nhap Diem Su: ");
		Diem_Su = sc.nextFloat();
		System.out.print("Nhap Diem Dia: ");
		Diem_Dia = sc.nextFloat();
	}
	public void Xuat_Thong_Tin_Hoc_Sinh () {
		System.out.println("MSHS: " + MSHS +" || Ten: "+ HoTen +" || Lop: "+ Lop + " || Dia chi: "+ Dia_Chi + " || Ngay Thang Nam Sinh: "+Ngay +"/"+Thang+ "/"+Nam+" || Tuoi: "+Tinh_Tuoi()+" || Toan: "+Diem_Toan+" || Ly: "+Diem_Ly+" || Hoa: "+Diem_Hoa+" || Van: "+Diem_Van+" || Su: "+Diem_Su+" || Dia: "+Diem_Dia + " || Diem Trung Binh: " + Tinh_DiemTB());
	}
}
