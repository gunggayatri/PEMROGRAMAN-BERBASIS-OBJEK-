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
    private int umur;
    //construktor 
    public mahasiswa(String nama, int umur){
        this.nama=nama;
        this.umur=umur;
    }
    //getter
    public String getnama(){
        return nama;
    }
    public int getumur(){
        return umur;
    }
    //setter 
    public void setnama(String nama){
        this.nama=nama;
    }
    public void setumur(int umur){
        if(umur>0){//validasi
            this.umur=umur;
        }else{
            System.out.println("umur tidak valid");
        }
    }
}
public class encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("adi",22);
        //mengakses data melalui getter
        System.out.println("Nama: "+mhs.getnama());
        System.out.println("Umur: "+mhs.getumur());
        //mengubah data dengan setter
        mhs.setnama("budi");
        mhs.setumur(25);
        
        System.out.println("Naama Baru: "+mhs.getnama());
        System.out.println("Umur baru: "+mhs.getumur());
        // TODO code application logic here
    }
}
