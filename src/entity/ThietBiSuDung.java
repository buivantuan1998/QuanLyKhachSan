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
public class ThietBiSuDung {
    private int soLuong;
    private String maP;
    private String maTB;

    public ThietBiSuDung() {
    }

    public ThietBiSuDung(int soLuong, String maP, String maTB) {
        this.soLuong = soLuong;
        this.maP = maP;
        this.maTB = maTB;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaP() {
        return maP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public String getMaTB() {
        return maTB;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }
    
    
}
