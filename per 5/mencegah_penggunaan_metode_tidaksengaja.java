/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gungg
 */
class mesin{
    private void cekbahanbakar(){
        System.out.println("cek bahan bakae sebelum menyalakan mesin...");
        
    }
    public void nyalakanmesin(){
        cekbahanbakar();//bisa dipanggil di dalam kelas
        System.out.println("mesin menyala!");
    }
}
public class mencegah_penggunaan_metode_tidaksengaja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mesin mobil=new mesin();
        mobil.nyalakanmesin();
       // mobil.cekbahanbakar();//error cek bahan bakar bersifat private
        // TODO code application logic here
    }
}
