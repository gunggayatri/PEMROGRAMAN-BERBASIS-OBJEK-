/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gungg
 */
//super class 
class hewan{
    void bersuara(){
        System.out.println("hewan bersuara..");
        
    }
}
//sub class
class kucing extends hewan{
    @Override 
    void bersuara(){
        System.out.println("meow,meow!!");
    }
}
// subclass lain
class anjing extends hewan{
    @Override 
    void bersuara(){
        System.out.println("guk,guk!!");
    }
}

public class polimorfisme_runtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hewan hewan1 = new kucing();//polimorfisme
        hewan hewan2 = new anjing();//polimorfisme
        
        hewan1.bersuara();//memanggil metode bersuara()dari kucing
        hewan2.bersuara();//memanggil metode bersuara dari anjing
        // TODO code application logic here
    }
}
