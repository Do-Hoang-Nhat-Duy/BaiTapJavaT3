
package BaiTap2;

public class ThanhToanMain {
    public static void main(String[] args) {
        GioHang gh1 = new GioHang();
        GioHang gh2 = new GioHang();
        
        gh1.setHinhThucTT(new ThanhToanOnline());
        gh2.setHinhThucTT(new ThanhToanCOD());
        
        HangHoa hh1 = new HangHoa("Noi ap suat", 850000, "Noi ap suat cuc re");
        HangHoa hh2 = new HangHoa("Bo chen su", 450000, "Bo chen su voi hoa van dep");
        HangHoa hh3 = new HangHoa("Tivi", 2000000, "Tivi led mau");
        HangHoa hh4 = new HangHoa("May loc nuoc", 1200000, "May loc nuoc hieu qua");
        
        System.out.println("Gio hang 1");
        gh1.them(hh4);
        gh1.inDS();
        System.out.println("\nTong tien hang: " + gh1.tinhTienHang() + "\nTien khach hang tra: " + gh1.tinhTienTra());
        
        System.out.println("Gio hang 2");
        gh2.them(hh2);
        gh2.them(hh1);
        gh2.them(hh3);
        gh2.inDS();
        System.out.println("\nTong tien hang: " + gh2.tinhTienHang() + "\nTien khach hang tra: " + gh2.tinhTienTra());
        
    }
}
