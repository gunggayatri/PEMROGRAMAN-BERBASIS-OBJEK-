/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author USER
 */
class hewan{
   
    void makan(){
        System.out.println("hewan sedang makan");
    }
}
//mewarisi dari superclass
class kucing extends hewan{
    void suara(){
        System.out.println("meow!");
    }
}

//mewarisi dari superclass
class anjing extends hewan{
    void suara(){
        System.out.println("guk guk!!");
    }
}


public class hierarchical_inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kucing anggora = new kucing();
        anjing kintamani = new anjing();
        
        anggora.makan();//dari super class hewan
        anggora.suara();//dari subclass kucing
        
        
        kintamani.makan();//dari superclass hewan
        kintamani.suara();//dari subclass anjing 
        
       
    }
}
