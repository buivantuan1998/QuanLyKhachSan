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
public class SuDungDichVu {
    private int soLuong;
    private float donGia;
    private String maP;
    private String maDV;

    public SuDungDichVu() {
    }

    public SuDungDichVu(int soLuong, float donGia, String maP, String maDV) {
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.maP = maP;
        this.maDV = maDV;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getMaP() {
        return maP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }
    
    
}
