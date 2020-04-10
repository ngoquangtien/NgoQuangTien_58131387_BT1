/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;
import java.util.ArrayList;
/**
 *
 * @author quang
 */
public class QLDS implements IQLDS{
    
    ArrayList<Canhan> dscanhan;

    public QLDS(ArrayList<Canhan> dscanhan) {
        this.dscanhan = dscanhan;
    }
    
    @Override
    public int them(Canhan p) {
       dscanhan.add(p);
       return 1;
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int xoa(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inDS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
