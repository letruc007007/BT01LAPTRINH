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
        ds.add(new SanPham("SP03", "Sua", 75000));
        ds.add(new SanPham("SP03", "Dau", 75000));
        ds.add(new SanPham("SP03", "Mi", 75000));
        ds.add(new SanPham("SP03", "CoCa", 75000));
        ds.add(new SanPham("SP03", "Sua", 75000));
        ds.add(new SanPham("SP03", "Sua", 75000));
        ds.add(new SanPham("SP03", "Sua", 75000));
        ds.add(new SanPham("SP03", "Sua", 75000));
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
