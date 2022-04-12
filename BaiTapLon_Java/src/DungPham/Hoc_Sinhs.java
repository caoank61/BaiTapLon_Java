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
			Hoc_Sinh sd = new Hoc_Sinh ();
				do {
					sd.Nhap_Thong_Tin_Hoc_Sinh();
					if (check (sd.getMSHS()) == true) {
						System.out.println("Ma So Hoc Sinh Da Ton Tai !");
						System.out.println("Vui Long Nhap Lai Thong Tin!");
					}
				}while(check (sd.getMSHS()) == true);
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
	        if (h == hs.elementAt(i).getMSHS())
	         return true;
	    }
	    return false;
	}
	public void search_MS(String h) {
		for(int i = 0 ;i < hs.size();i++){
			if(hs.elementAt(i).getMSHS()==h){
				hs.elementAt(i).Xuat_Thong_Tin_Hoc_Sinh();
			   	break;
			}else {
				System.out.println("Khong Ton Tai Ma So " + h + " Trong Danh Sach!");
			}
		}
		
	}
}