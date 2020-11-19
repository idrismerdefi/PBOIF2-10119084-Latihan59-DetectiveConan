/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan59.detectiveconan;
/**
NAMA : MUHAMMAD IDRIS MERDEFI
KELAS : PBOIF2
NIM : 10119084
DESKRIPSI PROGAM : PROGRAM INI BERISI PROGRAM detective conan
 */
public class Karakter extends DetectiveConan {
        private String keahlian;

    public Karakter(String keahlian, String nama, String asal, boolean detective) {
        super(nama, asal, detective);
        this.keahlian = keahlian;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void tampilKarakter() {
        System.out.println("Nama\t\t : " +nama);
        System.out.println("Dari\t\t : " +asal);
        if(detective) {
            System.out.println("Detective\t : Iya");
        } else {
            System.out.println("Detective\t : Tidak");
        }
        System.out.println("Keahlian\t : " +keahlian);
        System.out.println();
}
}