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
        QuanLyNhanVien ql = new QuanLyNhanVien();
        
        NhanVien nv1;
        nv1= new NhanVien("Ngo Quang Tien",20,"Quang Tri",20000,200);
        nv1.getThongTin();
        NhanVien nv2;
        nv2= new NhanVien("Luu Van Non",20,"Đak Nong",20000,100);
        nv2.getThongTin();
        NhanVien nv3;
        nv3= new NhanVien("Dang Thi Mai Trinh",21 ," Dien Khanh", 20000, 120);
        nv3.getThongTin();
        //tinhThuong(sumGioLam);
        System.out.println(nv1.tinhThuong(nv1.sumGioLam));
        System.out.println(nv1.tinhThuong(nv2.sumGioLam));
        System.out.println(nv1.tinhThuong(nv3.sumGioLam));
        NhanVien nv4;
        nv4= new NhanVien("Ngo Nhat Nam",28 ," Quang Tri", 20000, 120);
        NhanVien nv5;
        nv5= new NhanVien("Ngo Anh Duong",50 ," Quang Tri", 20000, 120);
        ql.them(nv4);
        ql.them(nv5);
        ql.inDS();
    }

    
    
}
