/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ReadTextFile {
    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        try {
            FileReader fr = new FileReader("sanpham.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(";");
                SanPham sp = new SanPham(arr[0], arr[1], (int) Float.parseFloat(arr[2]));
                ds.add(sp);
            }
            br.close();
            fr.close();
        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex.toString());
        }
        for (SanPham x : ds) {
            System.out.println(x);
        }
    }
    
}
