/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;
import java.util.Scanner;
/**
 *
 * @author petik
 */
public class KalkulatorZakat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          {Scanner scanner = new Scanner(System.in);
        System.out.println("Kalkulator Zakat");
        System.out.println("Pililah Jenis pemmbayaran");
        String days[]= {"null","Zakat Fitrah","Zakat Mal","Zakat Profesi","Zakat Perhiasan (emas & perak)",
        "Zakat Rikaz","Fidyah","Zakat Programmer"};
        for (int i=1 ; i < days.length ; i++){
        System.out.println(i +
        ". " + days[i]);
    }
        int pilihan = scanner.nextInt();
        
        switch(pilihan){
            case 1 : 
                System.out.println("Zakat Fitrah");
                double zakat_beras = 3.5;
                int harga_rata_rata_beras = 10000;
                System.out.println("Berapa Orang ?");
                int jumlah_muzakki = scanner.nextInt();
                System.out.println("Total Zakat Fitrah Adalah Sebesar = Rp" + (zakat_beras * harga_rata_rata_beras) * jumlah_muzakki);
                break;
            case 2 : 
                System.out.println("Zakat Mal");
                double zakat_mal = 2.5 / 100;
                System.out.println("Masukkan Penghasilan Anda Selama Setahun !");
                int penghasilan_setahun = scanner.nextInt();
                System.out.println("Total Zakat Mal Anda adalah : Rp" + (penghasilan_setahun * zakat_mal));
                break;
            case 3 : 
                System.out.println("Zakat Profesi");
                double nasab_profesi = 6240000;
                double zakat_profesi = 2.5 / 100;
                System.out.println("Masukkan Penghasilan Anda Sebulan");
                double gaji_profesi = scanner.nextDouble();
                if (gaji_profesi < nasab_profesi){
                System.out.println("Maaf, Total gaji anda belum mencukupi nasab");
                }else if (gaji_profesi >= nasab_profesi){
                System.out.println("Total Zakat Profesi Anda Adalah : Rp" + (gaji_profesi * zakat_profesi));
                }
                break;
            case 4 : 
                System.out.println("Zakat Perhiasan (emas & perak)");
                System.out.println("Pililah Jenis Perhiasan nya !");
                System.out.println("1. Emas");
                System.out.println("2. Perak");
                int jenis_zakat_mal = scanner.nextInt();
                if (jenis_zakat_mal == 1){
                double nasab_emas = 85;
                double zakat_emas = 2.5 / 100;
                double harga_emas_gram = 1000000;
                System.out.println("Masukkan jumlah berat emas");
                double berat_emas = scanner.nextDouble();
                if (berat_emas < nasab_emas){
                System.out.println("Maaf, berat emas belum mencukupi nasab");
                }else if (berat_emas >= nasab_emas){
                System.out.println("Total Zakat Mal Emas Adalah : " + (berat_emas * zakat_emas) + " gram, dalam jumlah uang : Rp" + ((berat_emas * zakat_emas) * harga_emas_gram));
                }
                
                }else if (jenis_zakat_mal == 2){
                double nasab_perak = 595;
                double zakat_perak = 2.5 / 100;
                double harga_perak_gram = 13000;
                System.out.println("Masukkan jumlah berat perak");
                double berat_perak = scanner.nextDouble();
                if (berat_perak < nasab_perak){
                System.out.println("Maaf, berat perak belum mencukupi nasab");
                }else if (berat_perak >= nasab_perak){
                System.out.println("Total Zakat Mal perak Adalah : " + (berat_perak * zakat_perak) + " gram, dalam jumlah uang : Rp" + ((berat_perak * zakat_perak) * harga_perak_gram));
                }
                }
                break;
                
            case 5 :
               System.out.println("Zakat Rikaz");
               int nisab_rikaz = 85000000;
//            double zakat_rikaz = 20 / 100;
               System.out.println("Masukkan Harga Barang Temuan");
               int harga_rikaz = scanner.nextInt();
               if (harga_rikaz < nisab_rikaz){
               System.out.println("Maaf, nisab barang temuan belum mencukupi");
               }else if (harga_rikaz >= nisab_rikaz) {
               System.out.println("Total Zakat Rikaz Anda Adalah : Rp" + harga_rikaz * 2 / 10 );
               }
               break;
               
            case 6 : 
                System.out.println("Fidyah");
                int bayar_fidyah = 45000;
                System.out.println("Masukkan Jumlah Hari Puasa Tertinggal !");
                int utang_puasa = scanner.nextInt();
                System.out.println("Berapa Orang ?");
                int jumlah_orang = scanner.nextInt();
                System.out.println("Total Fidyah Adalah : Rp" + bayar_fidyah * utang_puasa * jumlah_orang);
                break;
                
            case 7 : 
                System.out.println("Zakat Programmer");
                double zakat_programmer = 2.5 / 100;
                System.out.println("Masukkan Nilai Project Program !");
                double nilai_project = scanner.nextDouble();
                System.out.println("Total Zakat Programmer Adalah : Rp" + nilai_project * zakat_programmer);
                break;
        }
            
        }
        
    }  
       
    }
    

        
    
    

