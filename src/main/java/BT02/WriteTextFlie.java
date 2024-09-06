/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class WriteTextFlie {
    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        ds.add(new SanPham("SP01", "Gao", 30000));
        ds.add(new SanPham("SP02", "Duong", 45000));
        ds.add(new SanPham("SP03", "Sua", 25000));
        ds.add(new SanPham("SP04", "Dau", 15000));
        ds.add(new SanPham("SP05", "Mi", 65000));
        ds.add(new SanPham("SP06", "CoCa", 25000));
        ds.add(new SanPham("SP07", "Pesi", 25000));
        ds.add(new SanPham("SP08", "Thuoc", 35000));
        try {
            FileOutputStream fos = new FileOutputStream("sanpham.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ds);
            oos.close();
            fos.close();
            System.out.println("Ghi file thành công.");
        } catch (IOException ex) {
            System.out.println("Thất bại: " + ex.getMessage());
        }
     } 
}
