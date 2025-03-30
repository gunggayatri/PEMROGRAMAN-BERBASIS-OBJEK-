/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gungg
 */
import java.util.Random;
import java.util.Scanner;
public class tebak_angka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int angkarahasia = random.nextInt(100)+1;//memilih angka dari 1 hingga seratus
        int percobaan =0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selamat Datang di Permainan Tebak Angka");
        System.out.println("Saya telah memilih angka dari 1-100");
        System.out.println("Coba tebak atau 0 untuk keluar");
        
        while (true){
            System.out.println("Masukkan Tebakan Anda : ");
            int tebakan;
            
            //validasi input agar menerima data
            if(scanner.hasNextInt()){
                tebakan = scanner.nextInt();
            }else{
                System.out.println("mohon masukkan angka yang valid");
                scanner.next();//membersihkan input yang salah
                continue;
            }
            if (tebakan==0){
                System.out.println("terimakasih telah bermain!");
                break;
            }
            percobaan ++;
        if(tebakan>angkarahasia){
            System.out.println("terlalu besar!! coba lagi");
            
        }else if(tebakan<angkarahasia){
            System.out.println("terlalu kecil!! coba lagi");
        }else {
            System.out.println("selamat!! Anda berhasil menebak angka dengan benar dalam:"+percobaan+" percobaan");
            break;
        }
        }
        scanner.close();
            
                
    }
}
