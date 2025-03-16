/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author USER
 */

//kelas induk superclass
class hewan{
    String nama;
    void makan(){
        System.out.println(nama+"sedang makan.");
    }
}
//kelas anak (subclass)yg mewarisi dari hewan
class kucing extends hewan{
    void suara(){
        System.out.println(nama+"mengeong: meow!");
    }
}
//main class untuk menjalankan program
public class pewarisan{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kucing kucing1 = new kucing();
        kucing1.nama = "tom ";
        kucing1.makan();//memanggill medtode dari superclass
        kucing1.suara();//memanggil metode dari subclass
        // TODO code application logic here
    }
}
