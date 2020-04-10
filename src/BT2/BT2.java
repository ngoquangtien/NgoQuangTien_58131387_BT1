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
public class BT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NhanVien nhanvien = new NhanVien();
        nhanvien.ten="tien";
        nhanvien.tuoi=20;
        nhanvien.diaChi="K7";
        nhanvien.tienLuong=100.000;
        nhanvien.sumGioLam=210;
        System.out.println("nhan vien "+nhanvien.getThongTin());
        //tinhThuong(sumGioLam);
    }

    
    
}
