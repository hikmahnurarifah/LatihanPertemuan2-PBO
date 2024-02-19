/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

import java.util.Scanner;

/**
 *
 * @author Hikmah
 * 
 * Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan
 * pecahan dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan!
* 
* 
 */

public class OperasiTigaBilangan {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Bilangan Pembilang Ke-1: ");
        int a1 = input.nextInt();
        System.out.println("Masukkan Bilangan Penyebut Ke-1: ");
        int b1 = input.nextInt();
        
        System.out.println("Masukkan Bilangan Pembilang Ke-2: ");
        int a2 = input.nextInt();
        System.out.println("Masukkan Bilangan Penyebut Ke-2 ");
        int b2 = input.nextInt();
        
        System.out.println("Masukkan Bilangan Pembilang Ke-3: ");
        int a3 = input.nextInt();
        System.out.println("Masukkan Bilangan Penyebut Ke-3: ");
        int b3 = input.nextInt();
        
        int hasilPenjumlahanPembilang = (a1 * b2 * b3) + (a2 * b1 * b3) + (a3 * b1 * b2);
        int hasilPenguranganPembilang = (a1 * b2 * b3) - (a2 * b1 * b3) - (a3 * b1 * b2);
        int hasilKaliPembilang = a1 * a2 * a3;
        int hasilKaliPenyebut = b1 * b2 * b3;
        int hasilBagiPembilang = a1 * b2 * b3;
        int hasilBagiPenyebut = b1 * a2 * a3;
        
        float hasilOperasiPenjumlahan = (float) hasilPenjumlahanPembilang / hasilKaliPenyebut;
        float hasilOperasiPengurangan = (float) hasilPenguranganPembilang / hasilKaliPenyebut;
        float hasilOperasiPerkalian = (float) hasilKaliPembilang / hasilKaliPenyebut;
        float hasilOperasiPembagian = (float) hasilBagiPembilang/hasilBagiPenyebut;
        
        
        System.out.println("Bilangan pecahan yang Anda masukkan yaitu: " + a1 + "/" + b1 + " + " + a2 + "/" + b2 + " + " + a3 + "/" + b3);
                  
        System.out.println("Hasil penjumlahan ketiga pecahan adalah " + hasilPenjumlahanPembilang + "/" + hasilKaliPenyebut + " = " + hasilOperasiPenjumlahan);
        System.out.println("Hasil pengurangan ketiga pecahan adalah " + hasilPenguranganPembilang + "/" + hasilKaliPenyebut + " = " + hasilOperasiPengurangan);
        System.out.println("Hasil perkalian ketiga pecahan adalah " + hasilKaliPembilang + "/" + hasilKaliPenyebut + " = " + hasilOperasiPerkalian);
        System.out.println("Hasil pembagian ketiga pecahan adalah " + hasilBagiPembilang + "/" + hasilBagiPenyebut + " = " + hasilOperasiPembagian);
        
    }
    
}
