
package BaiTap3;

import java.util.ArrayList;
import java.util.Collections;

public class QLSV {
    ISoSanh soSanh;
    ArrayList<SinhVien> dS = new ArrayList<>();

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
    
    public void them(SinhVien sv){
        dS.add(sv);
    }
    
    public void sapXep(){
        for(int i = 0; i< dS.size()-1; i++)
            for(int j = i + 1; j< dS.size(); j++){
                if(soSanh.soSanh(dS.get(i), dS.get(j)) > 0){
                    Collections.swap(dS, i, j);
                }
            }
    }
    
    public void inDS(){
        for(int i = 0; i < dS.size(); i++){
            dS.get(i).hienthiTT();
        }
    }
}
