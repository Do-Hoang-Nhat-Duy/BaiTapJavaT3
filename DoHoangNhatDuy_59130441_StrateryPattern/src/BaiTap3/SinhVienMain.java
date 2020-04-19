
package BaiTap3;

import java.text.SimpleDateFormat;

public class SinhVienMain {
    public static void main(String[] args) throws Exception{
        QLSV dsSinhVien = new QLSV();
        SinhVien sv1 = new SinhVien("Do Hoang Nhat Duy", new SimpleDateFormat("dd/MM/yyyy").parse("05/08/1999"), 7);
        SinhVien sv2 = new SinhVien("Le The Dung", new SimpleDateFormat("dd/MM/yyyy").parse("12/11/1998"), 10);
        SinhVien sv3 = new SinhVien("Truong Hoang Khoa", new SimpleDateFormat("dd/MM/yyyy").parse("24/04/1999"), 6);
        
        dsSinhVien.them(sv1);
        dsSinhVien.them(sv2);
        dsSinhVien.them(sv3);
        System.out.println("Danh sach sinh vien luc dau->");
        dsSinhVien.inDS();
        
        dsSinhVien.setSoSanh((ISoSanh) new SoSanhTheoTen());
        dsSinhVien.sapXep();
        System.out.println("Danh sach sinh vien so sanh theo ten->");
        dsSinhVien.inDS();
        
        dsSinhVien.setSoSanh((ISoSanh) new SoSanhTheoDiem());
        dsSinhVien.sapXep();
        System.out.println("Danh sach sinh vien so sanh theo diem->");
        dsSinhVien.inDS();
    }
}
