/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author TUAN
 */
public class ThietBi {
    private String maTB;
    private String tenTB;
    private String ghiChu;

    public ThietBi() {
    }

    public ThietBi(String maTB, String tenTB, String ghiChu) {
        this.maTB = maTB;
        this.tenTB = tenTB;
        this.ghiChu = ghiChu;
    }

    public String getMaTB() {
        return maTB;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }

    public String getTenTB() {
        return tenTB;
    }

    public void setTenTB(String tenTB) {
        this.tenTB = tenTB;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
