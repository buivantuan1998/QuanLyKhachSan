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
public class DichVu {
    private String maDV;
    private String tenDV;
    private float giaTien;

    public DichVu() {
    }

    public DichVu(String maDV, String tenDV, float giaTien) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.giaTien = giaTien;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }
    
    
}
