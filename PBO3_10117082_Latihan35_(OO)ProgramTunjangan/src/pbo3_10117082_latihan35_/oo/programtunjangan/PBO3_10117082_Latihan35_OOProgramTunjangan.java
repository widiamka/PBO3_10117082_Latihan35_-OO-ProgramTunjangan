/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan35_.oo.programtunjangan;
import java.util.Scanner;
/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan tunjangan
* dari gaji dengan menggunakan oop
 */
public class PBO3_10117082_Latihan35_OOProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        GajiKaryawan gk = new GajiKaryawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa Gaji Pokok Anda Perbulan ? : Rp. ");
        gk.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        gk.status = scn.next();

        gk.HasilHitung(gk.status,gk.gajiPokok);

    }
    
}
