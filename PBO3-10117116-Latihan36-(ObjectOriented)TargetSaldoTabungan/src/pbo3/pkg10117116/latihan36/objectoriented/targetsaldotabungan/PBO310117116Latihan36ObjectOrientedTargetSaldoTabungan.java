/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan36.objectoriented.targetsaldotabungan;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Target Saldo Tabungan berbasis 
 * objek
 *  
 */
public class PBO310117116Latihan36ObjectOrientedTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SaldoTabungan tabung = new SaldoTabungan();

        tabung.saldo = 3500000;
        tabung.bunga = 8;
        int saldoTarget = 6000000;

        tabung.hitungLamaSaldoTarget(tabung.saldo,saldoTarget);
    }
    
}
