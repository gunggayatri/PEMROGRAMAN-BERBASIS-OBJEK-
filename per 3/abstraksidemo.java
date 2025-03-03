/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gungg 
*/
abstract class kendaraan{
    String nama;
    //construktor 
    public kendaraan(String nama){
    this.nama=nama;
    }
    //metode abstrak (harus diimplementasikan oleh sub bab)
    abstract void bergerak();
    //metode konkret (bisa langsung digunakan )
    public void info(){
    System.out.println(nama+" adalah kendaraan.");
            }
    
}
//sub class yang mebgimplementasikan method abstak 
class Mobil extends kendaraan{
    public Mobil(String nama){
            super(nama);
}
    //implementasi method abstrak 
    @Override 
    void bergerak(){
    System.out.println(nama+" bergerak dengan roda");
    }
}
class kapal extends kendaraan{
public kapal(String nama){
    super(nama);
        }
//implementasi metode abstrak
@Override
void bergerak(){
System.out.println(nama + " bergerak di air.");
}
}
//main class untuk menjalankan program

public class abstraksidemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kendaraan Mobil = new Mobil("toyota");
        kendaraan kapal = new kapal("titanic");
        
        Mobil.info();
        Mobil.bergerak();
        
        kapal.info();
        kapal.bergerak();
        // TODO code application logic here
    }
}
