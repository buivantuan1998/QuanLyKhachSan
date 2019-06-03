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
public class Phong {
    private String maP;
    private String tenP;
    private float giaThue;
    private int trangThai;
    private String maLP;

    public Phong() {
    }

    public Phong(String maP, String tenP, float giaThue, int trangThai, String maLP) {
        this.maP = maP;
        this.tenP = tenP;
        this.giaThue = giaThue;
        this.trangThai = trangThai;
        this.maLP = maLP;
    }

    public String getMaP() {
        return maP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public String getTenP() {
        return tenP;
    }

    public void setTenP(String tenP) {
        this.tenP = tenP;
    }

    public float getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(float giaThue) {
        this.giaThue = giaThue;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaLP() {
        return maLP;
    }

    public void setMaLP(String maLP) {
        this.maLP = maLP;
    }
    
    
}
