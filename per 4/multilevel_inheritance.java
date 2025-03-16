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
class kucing extends hewan{
    void suara(){
        System.out.println("meow!");
    }
}
class kucing_anggora extends kucing{
    void jenis(){
        System.out.println("ini adalah kucing anggora");
    }
}

        
public class multilevel_inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kucing_anggora anggora = new kucing_anggora();
        anggora.makan();//dari super class hewan
        anggora.suara();//dari subclass kucing
        anggora.jenis();//dari subclass kucing_anggora
        // TODO code application logic here
    }
}
