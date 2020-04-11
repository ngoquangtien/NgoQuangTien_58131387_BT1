/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author quang
 */
public class NhanVien {
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int sumGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int sumGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.sumGioLam = sumGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getSumGioLam() {
        return sumGioLam;
    }

    public void setSumGioLam(int sumGioLam) {
        this.sumGioLam = sumGioLam;
    }
    
    public String ToString(){
        return ten+" "+tuoi+" "+diaChi+" "+tienLuong+" "+sumGioLam;
    };
    public double tinhThuong(int s){
        double thuong = 0;
        if(s >= 200)
           thuong=tienLuong*20/100;
        if(s<200 && s>=100)
           thuong=tienLuong*10/100;
        if(s<100)
            thuong=0;
        return thuong;
    };
}
