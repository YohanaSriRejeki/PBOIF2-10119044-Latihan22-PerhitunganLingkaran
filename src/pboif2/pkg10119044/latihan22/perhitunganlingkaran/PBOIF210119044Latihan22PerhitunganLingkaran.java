/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan22.perhitunganlingkaran;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan hasil perhitungan
 * lingkaran, dengan diameter yang diinputkan oleh user
 */

public class PBOIF210119044Latihan22PerhitunganLingkaran {
    static Scanner sc = new Scanner(System.in);
            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PHI = 3.14;
        
        System.out.println("======Perhitungan Lingkaran======");
        System.out.print("Masukkan nilai diameter lingkaran : ");  
        double diameter = GetDiameter();
        
        System.out.println();
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.println("Jari-jari Lingkaran : "+ hitungJariJari(diameter)+" cm");
        System.out.println("Luas Lingkaran : "+ hitungLuas(diameter,PHI)+" cm");
        System.out.println("Keliling Lingkaran : "+ hitungKeliling(diameter,PHI)+" cm");
        
    }
    
    //method dengan nilai balik pembatasan hanya integer yang dapat diinputkan
    public static double GetDiameter(){
        while (true) {
           try{
            return sc.nextInt();
           }
           catch (InputMismatchException ex){
            sc.next();
            System.out.println("Nilai diameter tidak sesuai");
            System.out.println();
            System.out.print("Masukkan nilai diameter lingkaran : ");
            }     
        }       
    }
    
    //Method dengan nilai balik untuk menghitung jari-jari
    public static double hitungJariJari(double diameter){
        int jari = (int) (diameter/2);
        
        return jari;
    }

    /**
     *
     * @param diameter
     * @param PHI
     * @return
     */
    
    //Method dengan nilai balik untuk menghitung luas
    public static double hitungLuas(double diameter, final double PHI){
        double luas;
        
        luas = PHI*1/4*diameter*diameter;
        return luas;
    }
    
    //Method dengan nilai balik untuk menghitung keliling
    public static double hitungKeliling(double diameter, final double PHI){
        double keliling;
 
        keliling = PHI*diameter;
        return keliling;
    }
}
