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
public class LoaiPhong {
    private String maLP;
    private String tenLP;
    private float giaPhong;

    public LoaiPhong() {
    }

    public LoaiPhong(String maLP, String tenLP, float giaPhong) {
        this.maLP = maLP;
        this.tenLP = tenLP;
        this.giaPhong = giaPhong;
    }

    public String getMaLP() {
        return maLP;
    }

    public void setMaLP(String maLP) {
        this.maLP = maLP;
    }

    public String getTenLP() {
        return tenLP;
    }

    public void setTenLP(String tenLP) {
        this.tenLP = tenLP;
    }

    public float getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(float giaPhong) {
        this.giaPhong = giaPhong;
    }
    
    
}
