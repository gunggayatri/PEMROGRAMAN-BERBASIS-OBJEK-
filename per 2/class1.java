/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gungg
 */
class mahasiswa {
    private String nama;
    private int nim;
    
    public mahasiswa(String nama, int nim) {
        this.nama=nama;
        this.nim=nim;
}
    public void tampilkaninfo(){
    System.out.println("nama: "+nama+" nim:"+nim);
}
    }

  public class class1 {
    public static void main(String args[]) {
        mahasiswa mhs1 = new mahasiswa("budi", 20001);
        mahasiswa mhs2 = new mahasiswa("sita", 20002);
        
        mhs1.tampilkaninfo();
        mhs2.tampilkaninfo();
        // TODO code application logic here
    }
}
