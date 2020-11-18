package com.tugasPBO;
/*Nama      : Argya Aulia Fauzandika
  NIM       : 10119035
  Kelas     : PBO1 / IF1
  Deskripsi : menampilkan warna dan titik koordinat dari kelas parent yang di wariskan
* */

public class Main {
    public static void main(String[] args){
        WarnaKoordinat warna = new WarnaKoordinat(10,4, "Jingga");
        System.out.println("Warna Koordinat : "+warna.getNamaWarna());
        System.out.println("Koordinat sumbu x : "+warna.getx()+" y : "+warna.getY());

    }
}
