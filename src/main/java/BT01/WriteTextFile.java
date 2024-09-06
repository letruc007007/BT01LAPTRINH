/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT01;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class WriteTextFile {
    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        ds.add(new SanPham("SP01", "Gao", 30000));
        ds.add(new SanPham("SP02", "Duong", 45000));
        ds.add(new SanPham("SP03", "Sua", 75000));
        try {
            FileWriter fw = new FileWriter("sanpham.txt");
            PrintWriter pw = new PrintWriter(fw);
            for (SanPham sp : ds) {
                pw.println(sp. getMaso() + ";" + sp.getTen() + ";" + sp.getGia());
            }
            pw.close();
            fw.close();
            System.out.println("Ghi file thành công.");
        } catch (Exception ex) {
            System.out.println("Lỗi ghi file: " + ex.toString());
        }
    }
}
