/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ReadTextFile{
     public static void main(String[] args) {
        // Đọc danh sách sản phẩm từ tệp sanpham.bin
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sanpham.bin"))) {
            // Đọc đối tượng từ tệp
            @SuppressWarnings("unchecked")
            ArrayList<SanPham> ds = (ArrayList<SanPham>) ois.readObject();

            // In danh sách sản phẩm ra màn hình
            for (SanPham sp : ds) {
                System.out.println(sp);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi lớp không tìm thấy: " + e.getMessage());
        }
    }
}
    