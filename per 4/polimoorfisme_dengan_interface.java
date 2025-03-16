/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gungg
 */
interface kendaraan{
    void berjalan();
    
}
//implementasi pertama
class mobil implements kendaraan{
    public void berjalan(){
        System.out.println("mobil berjalan dengan 4 roda.");
        
    }
}
//implementasi ke2
class motor implements kendaraan{
    public void berjalan(){
        System.out.println("motor berjalan dengan 2 roda.");
        
    }
}
public class polimoorfisme_dengan_interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kendaraan kendaraan1=new mobil();
        kendaraan kendaraan2=new motor();
        
        kendaraan1.berjalan();
        kendaraan2.berjalan();
        // TODO code application logic here
    }
}
