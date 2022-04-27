package DungPham;

import java.util.Comparator;
import java.util.Vector;

public class HS_Chuyens {
	Vector<Hoc_Sinh_Chuyen>hsc ;
	public HS_Chuyens () {
		super();
		hsc = new Vector<Hoc_Sinh_Chuyen>();
	}
	public void add(Hoc_Sinh_Chuyen a) {
		// TODO Auto-generated method stub
		hsc.add(a);
	}
	public void Xuat_HS_Chuyen() {
		for (int i = 0;i <hsc.size();i++) {
			hsc.elementAt(i).Xuat_Hoc_Sinh_Chuyen();
		}
	}
}
