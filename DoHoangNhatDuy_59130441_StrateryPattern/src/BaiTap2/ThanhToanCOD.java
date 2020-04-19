
package BaiTap2;

public class ThanhToanCOD implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang > 2000000) return (double)tienHang * 0.98;
        else 
            return tienHang;
    }
    
    
}
