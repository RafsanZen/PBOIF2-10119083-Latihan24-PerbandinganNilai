/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan24.perbandingannilai;

import java.util.Scanner;

/**
 *
 * Nama : Rafsan Zen Mustaofa 
 * NIM  : 10119083
 * Kelas: IF-2
 * Deskripsi: Menamplkan Perbandingan Nilai 
 */
public class PBOIF210119083Latihan24PerbandinganNilai {
    
public static void banding(int nilai1,int nilai2) {
    if (nilai1==nilai2){
        System.out.println("Hasil : " + nilai1 + " sama dengan" + nilai2);
    }else if(nilai1>nilai2){
        System.out.println("Hasil : " + nilai1 + " Lebih besar dari" + nilai2);
    }else{
        System.out.println("Hasil : " + nilai1 + " Lebih kecil dari" + nilai2);
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int nilai1 = 0;
        int nilai2 = 0;
        String ulang;
        boolean kondisi;
        
        System.out.println("======Program Perbandingan Nilai======");
        Scanner input = new Scanner (System.in);
        
        do {
                System.out.print("Masukan nilai pertama : ");
                nilai1 = input.nextInt();
                System.out.print("Masukan nilai pertama : ");
                nilai2 = input.nextInt();
                banding(nilai1,nilai2);
                System.out.println("");
                System.out.println("Ulangi Aktifitas ? (Ya/Tidak) : ");
                ulang = input.next();
                kondisi = "Ya".equals(ulang);
                System.out.println(kondisi);
        }while(kondisi ==true);
        
        System.out.println("====================================");
        System.out.println("Developed by : Rafsan Zen Mustaofa");
    }    

    }
    

