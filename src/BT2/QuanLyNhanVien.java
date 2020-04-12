/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.util.ArrayList;

/**
 *
 * @author quang
 */
public class QuanLyNhanVien implements IQuanLy {
    ArrayList<NhanVien> dsnhanvien= new ArrayList();

    @Override
    public void them(NhanVien nv) {
         dsnhanvien.add(nv);
    }

    @Override
    public void inDS() {
        for(int i = 0;i < dsnhanvien.size(); i++)
        System.out.println(dsnhanvien.get(i).toString());
    }

    
}
