package DungPham;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Hoc_Sinhs {
	Queue<Hoc_Sinh>hs ;
	public Hoc_Sinhs () {
		super();
		hs = new LinkedList <Hoc_Sinh>();
		
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
}
