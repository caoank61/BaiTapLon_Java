package DungPham;

import java.util.Scanner;

public class ChucNang {
	Hoc_Sinhs sds = new Hoc_Sinhs();// sds: Students
	Hoc_Sinh_Chuyen hsc = new Hoc_Sinh_Chuyen(); //hsc : Hoc Sinh Chuyen
	HS_Chuyens hscs = new HS_Chuyens ();
	public void Them_HocSinh_Chuyen () {
		sds.Nhap_Nhieu_Hs();
		sds.Xuat_Nhieu_Hs();
		int count = 0;
		int c = 1 ;
		String machuyen;
		do {
		Scanner sc = new Scanner (System.in);
		System.out.print("Nhap Ma So Hoc Sinh Chuyen:");
		machuyen = sc.nextLine();
		for (int i = 0;i < sds.size();i++) {
			if (machuyen.equals(((Hoc_Sinh) sds.elementAt(i)).getMSHS())) {
				hsc.setHoTen(((Hoc_Sinh) sds.elementAt(i)).getHoTen());
				hsc.setLop(((Hoc_Sinh) sds.elementAt(i)).getLop());
				hsc.setMSHS(((Hoc_Sinh) sds.elementAt(i)).getMSHS());
				hsc.setDia_Chi(((Hoc_Sinh) sds.elementAt(i)).getDia_Chi());//
				hsc.setNgay(((Hoc_Sinh) sds.elementAt(i)).getNgay());
				hsc.setThang(((Hoc_Sinh) sds.elementAt(i)).getThang());
				hsc.setNam(((Hoc_Sinh) sds.elementAt(i)).getNam());
				hsc.setDiem_Toan(((Hoc_Sinh) sds.elementAt(i)).getDiem_Toan());
				hsc.setDiem_Ly(((Hoc_Sinh) sds.elementAt(i)).getDiem_Ly());
				hsc.setDiem_Hoa(((Hoc_Sinh) sds.elementAt(i)).getDiem_Hoa());
				hsc.setDiem_Van(((Hoc_Sinh) sds.elementAt(i)).getDiem_Van());
				hsc.setDiem_Su(((Hoc_Sinh) sds.elementAt(i)).getDiem_Su());
				hsc.setDiem_Dia(((Hoc_Sinh) sds.elementAt(i)).getDiem_Dia());
				hsc.Nhap_Hoc_Sinh_Chuyen();
				count ++;
				hscs.add(hsc);
				break;
			}
		}
		if (count == 0) {
			System.out.println("Khong Ton Tai Hoc Sinh Co Ma So:  "+ machuyen);
		}
		
		System.out.println("Con Hoc Sinh Chuyen Khong ?");
        c = sc.nextInt();
		}while (c != 0);
	}
	public void Xuat_HS() {
		sds.Xuat_Nhieu_Hs();
	}
	public void Xuat_HS_Chuyens() {
		hscs.Xuat_HS_Chuyen();
	}
}