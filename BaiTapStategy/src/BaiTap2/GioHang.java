
package BaiTap2;

import java.util.ArrayList;

public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> danhSachHH = new ArrayList<>();

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    public void them(HangHoa hh){
        danhSachHH.add(hh);
    }
    
    public int tinhTienHang(){
        int s = 0;
        for(int i = 0; i < danhSachHH.size(); i++){
            s = s + danhSachHH.get(i).getGia();
        }
        return s;
    }
    
    public double tinhTienTra(){
        return hinhThucTT.thanhToan(tinhTienHang());
    }
    
    public void inDS(){
        for(int i = 0; i < danhSachHH.size(); i++){
            System.out.println("\n");
            danhSachHH.get(i).thongTinHangHoa();
        }
    }
}
