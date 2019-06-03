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
public class ChiTietHoaDon {
    private String maHD;
    private String maP;
    private float giamGia;
    private String ngayNhan;
    private String ngayTra;
    private float tongTien;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String maHD, String maP, float giamGia, String ngayNhan, String ngayTra, float tongTien) {
        this.maHD = maHD;
        this.maP = maP;
        this.giamGia = giamGia;
        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;
        this.tongTien = tongTien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaP() {
        return maP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

    public String getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(String ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }
    
    
}
