/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author USER
 */
interface hewan{
    void makan();
}
interface mamalia{
    void menyusui();
}
class kucing implements hewan, mamalia{
    public void makan(){
        System.out.println("kucing makan ikan");
    }
    public void menyusui(){
        System.out.println("kucing menyusui anaknya");
    }
}

public class multiple_inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        kucing kucing = new kucing();
        kucing.makan();
        kucing.menyusui();
        // TODO code application logic here
    }
}
