/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan35_.oo.programtunjangan;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan tunjangan
* dari gaji dengan menggunakan oop
 */
public class GajiKaryawan {
    public String status;
    public double gajiPokok;
    public double tunjangan;

    public double HitungTunjangan(String parStatus, double parGajiPokok){
    return tunjangan=(parStatus.equals("Menikah")?0.35*parGajiPokok:0); }

    public double HitungTotalGaji(double parGajiPokok, double parTunjangan){
    return tunjangan = parGajiPokok+parTunjangan;}

    public void HasilHitung(String parStatus, double parGajipokok){
        System.out.println("\n=========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok \t: Rp "+gajiPokok);
        System.out.println("Tunjangan \t: Rp "+HitungTunjangan(parStatus,parGajipokok));
        System.out.println("Total Gaji \t: Rp "+HitungTotalGaji(parGajipokok,tunjangan));
        System.out.println("(Developed by : Rizki Adam Kurniawan)");
    }
}
