/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gungg
 */
class mahasiswa{
    private String nama;
    //construktor
    public mahasiswa(String nama){
        this.nama=nama;
    }
    //getter untuk mengakses nama
    public String getnama(){
        return nama;
        
    }
}
public class membatasi_aksesbilitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mahasiswa mhs=new mahasiswa("adi");
        //System.out.println(mhs.nama);//error akses bersifat private
        System.out.println(mhs.getnama());//akses melalui metode getter
                
        // TODO code application logic here
    }
}
