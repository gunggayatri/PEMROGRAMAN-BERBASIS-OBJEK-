/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gungg
 */
class kalkulator{
    //metode pertama : menjumlahkan dua angka
    int tambah(int a, int b){
        return a+b;
    }
    //metode kedua: mejumlahkan 3 angka 
    //(Overloading)
            int tambah(int a, int b, int c){
                return a+b+c;
            }
    //metode 3 : menjumlahkan dua anga desimal
     //(overloading)
    double tambah(double a, double b){
        return a+b;
    }
}
public class polimorfisme_kompilasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kalkulator k = new kalkulator();
        
        System.out.println(k.tambah(5, 10));//meanggil metode pertama
        System.out.println(k.tambah(4, 10, 15));//memanggil metode ke 2
        System.out.println(k.tambah(5.5, 2.5));
        
        
        // TODO code application logic here
    }
}
