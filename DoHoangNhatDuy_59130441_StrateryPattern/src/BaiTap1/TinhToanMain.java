
package BaiTap1;

public class TinhToanMain {
    public static void main(String[] args) {
        context contxt = new context();
        contxt.setTinhToan(new Cong());
        System.out.println("Ket Qua Phep Tinh 75 + 12 = " + contxt.tinh(75, 12));
        
        contxt.setTinhToan(new Tru());
        System.out.println("Ket Qua Phep Tinh 54 - 78 = " + contxt.tinh(54, 78));
    }

}
