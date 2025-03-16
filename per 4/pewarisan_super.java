/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gungg
 */

class hewan{
    String nama;
    
    hewan(String nama){
   this.nama=nama;
}
    void info(){
        System.out.println("Nama: "+nama);
    }
}

class kucing extends hewan{
    kucing(String nama){
        super(nama);//memanggil konstruktor superclass
    }
}

public class pewarisan_super {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        kucing kucing = new kucing("mia");
        kucing.info();
        
        
        
        
        // TODO code application logic here
    }
}
