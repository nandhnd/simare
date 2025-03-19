/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab1;

/**
 *
 * @author nand
 */
public class menu {
    //atribut
    private String nama;
    private double harga;
    private String jenis;

    // Getter dan Setter untuk nama makanan
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk harga
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Getter dan Setter untuk jenis makanan
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Method untuk menampilkan informasi makanan
    public void tampilkanMenu() {
        System.out.println("Nama Makanan: " + nama);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Jenis Makanan: " + jenis);
    }
}
