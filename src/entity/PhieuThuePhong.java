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
public class PhieuThuePhong {
    private String soPhieu;
    private String maKH;
    private String maP;
    private String ngayNhan;

    public PhieuThuePhong() {
    }

    public PhieuThuePhong(String soPhieu, String maKH, String maP, String ngayNhan) {
        this.soPhieu = soPhieu;
        this.maKH = maKH;
        this.maP = maP;
        this.ngayNhan = ngayNhan;
    }

    public String getSoPhieu() {
        return soPhieu;
    }

    public void setSoPhieu(String soPhieu) {
        this.soPhieu = soPhieu;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaP() {
        return maP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public String getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(String ngayNhan) {
        this.ngayNhan = ngayNhan;
    }
    
    
}
