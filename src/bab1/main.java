/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab1;

/**
 *
 * @author nand
 */
public class main {
    public static void main(String[] args) {
        // Membuat objek Menu tunggal
        menu menu1 = new menu();

        // Menggunakan setter untuk mengatur nilai atribut
        menu1.setNama("Nasi Goreng");
        menu1.setHarga(25000);
        menu1.setJenis("Makanan Berat");

        // Menampilkan menu
        System.out.println("Menu di Restoran:");
        menu1.tampilkanMenu();
    }
}
