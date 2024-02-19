/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

/**
 *
 * @author Hikmah
 * 
 * Buatlah algoritma dalam Bahasa Java Anda akan diberi hadiah jika rangking 1 dikelas
 * dan naik kelas, yang dapat ditulis sebagai ekspresi: (rangking == 1) && (naikKelas)
 * 
 * 
 */
public class FungsiIF {
    
        public static void main(String[] args) {
        
        int rangking = 1;
        boolean naikKelas = true;
        
        if(rangking == 1 && naikKelas) {
            System.out.println("Selamat Anda mendapatkan hadiah karena mendapatkan rangking 1 dan naik kelas ");
        } else {
            System.out.println("Maaf Anda tidak berhak mendapatkan hadiah");
        }
        
    }
    
}
