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
	Hoc_Sinh.sort(Hoc_Sinh, new Comparator<Hoc_Sinhs>() {

        public int compare(Hoc_Sinh t, Hoc_Sinh t1) {
            int comp = t.getHoTen().compareTo(t1.getHoTen());
            if (comp != 0) {    // names are different
                return comp;
            }
            return t.Tinh_Tuoi() - t1.Tinh_Tuoi();
        }
    };
}
