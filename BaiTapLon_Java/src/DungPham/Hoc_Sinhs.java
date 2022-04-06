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
			Hoc_Sinh st = new Hoc_Sinh ();
			st.Nhap_Thong_Tin_Hoc_Sinh();
			hs.add(st);
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
//					t = hs.elementAt(i);
//					hs.elementAt(i) = hs.elementAt(j);
//					hs.elementAt(j) = t;
				}
			}
		}
	}
	public void search_MS() {
		Collections.swap(hs, 0, 0);
	}
}