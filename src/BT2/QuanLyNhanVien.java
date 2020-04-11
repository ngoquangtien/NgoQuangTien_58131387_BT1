/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import BT2.IQuanLy;
import BT2.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author quang
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> dsnhanvien;

    public QuanLyNhanVien(ArrayList<NhanVien> dsnhanvien) {
        this.dsnhanvien = dsnhanvien;
    }

    @Override
    public void them(NhanVien nv) {
         dsnhanvien.add(nv);
    }

    @Override
    public void inDS() {
        System.out.println("nhan vien"+dsnhanvien);
    }

    
}
