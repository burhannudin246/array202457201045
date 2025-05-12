/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bangundatar;

/**
 *
 * @author P15s
 */
import javax.swing.JOptionPane;

public class Bangundatar {

    public static void main(String[] args) {
        // Input dan perhitungan persegi panjang
        double panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang:"));
        double lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi panjang:"));
        double luasPersegiPanjang = hitungLuasPersegiPanjang(panjang, lebar);
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang: " + luasPersegiPanjang);

        // Input dan perhitungan segitiga
        double alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga:"));
        double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga:"));
        double luasSegitiga = hitungLuasSegitiga(alas, tinggi);
        JOptionPane.showMessageDialog(null, "Luas Segitiga: " + luasSegitiga);

        // Input dan perhitungan lingkaran
        double jariJari = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran:"));
        double luasLingkaran = hitungLuasLingkaran(jariJari);
        JOptionPane.showMessageDialog(null, "Luas Lingkaran: " + luasLingkaran);
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }
}

