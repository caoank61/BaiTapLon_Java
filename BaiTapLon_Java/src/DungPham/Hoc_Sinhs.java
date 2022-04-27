package DungPham;


import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Hoc_Sinhs implements Comparator<Hoc_Sinh>{
	Vector<Hoc_Sinh>hs ;
	public Hoc_Sinhs () {
		super();
		hs = new Vector<Hoc_Sinh>();
	}
	public void Nhap_Nhieu_Hs() {
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.print("Nhap So Luong Hoc Sinh:");
		n = sc.nextInt();
		
		for (int i = 0; i < n ;i++) {
			Hoc_Sinh sd;
				do {
					sd = new Hoc_Sinh ();
					sd.Nhap_Thong_Tin_Hoc_Sinh();
					if (check (sd.getMSHS())) {
						System.out.println();
						System.out.println("Ma So Hoc Sinh Da Ton Tai !");
						System.out.println("Vui Long Nhap Lai Thong Tin!");
					}
				}while(check (sd.getMSHS()));
				hs.add(sd);
		}
	}
	public void Xuat_Nhieu_Hs () {
		for (Hoc_Sinh i:hs) {
			i.Xuat_Thong_Tin_Hoc_Sinh();
		}
	}
	@Override
	public int compare(Hoc_Sinh o1, Hoc_Sinh o2) {
		int comp = o1.getHoTen().compareTo(o2.getHoTen());
        if (comp != 0) {    // names are different
            return comp;
        }else {
        	if ( o1.Tinh_Tuoi() > o2.Tinh_Tuoi())
        		return 1;
        	else return -1;
        }
	}
	public void sortName_HS() {
		Collections.sort(hs,new Hoc_Sinhs());
	}
	public void sortDiem_TB() {
		Hoc_Sinh t = new Hoc_Sinh();
		for(int i = 0 ;i < hs.size()-1;i++){
			for(int j = i+1; j< hs.size();j++ ){
				if(hs.elementAt(i).Tinh_DiemTB() > hs.elementAt(j).Tinh_DiemTB()){
					Collections.swap(hs, i, j);
				}
			}
		}
	}
	public boolean check (String h){
	    for (int i = 0; i < hs.size() ; i++){
	        if (h.equals(hs.elementAt(i).getMSHS()))
	         return true;
	    }
	    return false;
	}
	public void search_MS(String h) {
		int count = 0;
		for(int i = 0 ;i < hs.size();i++){
			if(h.equals(hs.elementAt(i).getMSHS())){
				hs.elementAt(i).Xuat_Thong_Tin_Hoc_Sinh();
				count ++;
			   	break;
			}
		}
		if (count == 0) {
			System.out.println("Khong Ton Tai Ma So " + h + " Trong Danh Sach!");
		}
	}
	public void Them_hs() {
			Hoc_Sinh sd;
				do {
					sd = new Hoc_Sinh ();
					sd.Nhap_Thong_Tin_Hoc_Sinh();
					if (check (sd.getMSHS())) {
						System.out.println();
						System.out.println("Ma So Hoc Sinh Da Ton Tai !");
						System.out.println("Vui Long Nhap Lai Thong Tin!");
					}
				}while(check (sd.getMSHS()));
				hs.add(sd);
	}
	public void Sua_hs(String h) {
		Xoa_hs(h);
		Them_hs ();
	}
	public void Xoa_hs(String h) {
		int count = 0;
		for(int i = 0 ;i < hs.size();i++){
			if (hs.elementAt(i).getMSHS().equals(h)) {
				hs.remove(hs.elementAt(i));
				count ++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Khong Ton Tai Hoc Sinh Can Xoa!");
		}
	}
	public int size() {
		return hs.size();
	}
	public Object elementAt(int i) {
		return hs.elementAt(i);
	}
	public void Phan_Loai_Hoc_Sinh ()	{
		System.out.println("***DANH SACH PHAN LOAI SINH VIEN***");
		int lc = 0;
		Scanner sc = new Scanner (System.in);
		lc = sc.nextInt();
		switch(lc)
		{	
			case 1:
			{
				System.out.println("1.DANH SACH SINH VIEN GIOI");
				for(int i =0;i< hs.size();i++)
				{
					if(hs.elementAt(i).Tinh_DiemTB() >=8)
					{
						hs.elementAt(i).Xuat_Thong_Tin_Hoc_Sinh();
						System.out.println("DUOC LEN LOP");
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("3.DANH SACH SINH VIEN KHA");
				for(int i =0;i< hs.size();i++)
				{
					if(hs.elementAt(i).Tinh_DiemTB() >=6.5)
					{
						hs.elementAt(i).Xuat_Thong_Tin_Hoc_Sinh();
						System.out.println("DUOC LEN LOP");
					}
				}
				break;
			}
			case 3:
			{
				System.out.println("4.DANH SACH SINH VIEN TRUNG BINH");
				for(int i =0;i<hs.size();i++)
				{
					if(hs.elementAt(i).Tinh_DiemTB() >=5)
					{
						hs.elementAt(i).Xuat_Thong_Tin_Hoc_Sinh();
						System.out.println("DUOC LEN LOP");
					}
				}
				break;
			}
			case 4:
			{
				System.out.println("5.DANH SACH SINH VIEN YEU");
				for(int i =0;i<hs.size();i++)
				{
					if(hs.elementAt(i).Tinh_DiemTB() >=3.5)
					{
						hs.elementAt(i).Xuat_Thong_Tin_Hoc_Sinh();
						System.out.println("THI LAI");
					}
				}
				break;
			}
		}
	}
}

//	public void Out_File () {
//		//E:\HKII (2021_2022)\BaiTapLon_Java\BaiTapLon_Java\src
//		FileWriter fw = new FileWriter("D:\\testout.txt");
//        fw.write("Welcome to java.");
//        fw.close();
//	}
//}