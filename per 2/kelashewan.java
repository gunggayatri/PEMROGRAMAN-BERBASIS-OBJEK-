/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gungg
 */
class hewan {
    //atribut
private String namahewan;
private String jenishewan;
private int umur;

//konstrukstor
public hewan(String namahewan, String jenishewan, int umur){
    this.namahewan = namahewan;
    this.jenishewan = jenishewan;
    this.umur = umur;
    
}
// metode menampilkan info hewan 
public void tampilkaninfo(){
    System.out.println("nama hewan : "+namahewan+", jenis hewan : "+jenishewan+", umur hewan : "+ umur);
    
        }

//metode menambahkan umur hewan
public void bertambahumur(int tahun){
    this.umur += tahun;
    System.out.println(namahewan+" telah bertambah umur menjadi: "+umur+"tahun");
}
//metode menampilkan suara hewan
public void suarahewan(){
    if(namahewan.equalsIgnoreCase("kucing")){
    System.out.println(namahewan+": meong!");}
    else if(namahewan.equalsIgnoreCase("anjing")){
    System.out.println(namahewan+": guk guk!");}
    else {
    System.out.println(namahewan+" suara tidak diketahui!!");}
}
}
public class kelashewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //membuat objek hewan
        hewan hewan1 = new hewan("kucing","mamalia",3);
        hewan hewan2 = new hewan("anjing","mamalia",2);
        
        //menampilkan informasi awal
        hewan1.tampilkaninfo();
        hewan1.tampilkaninfo();
        hewan1.bertambahumur(2);
        hewan1.tampilkaninfo();
        
        System.out.println();//pemisah output
        
        hewan2.tampilkaninfo();
        hewan2.suarahewan();
        hewan2.bertambahumur(3);
        hewan2.tampilkaninfo();
        
        
        
    }
}
