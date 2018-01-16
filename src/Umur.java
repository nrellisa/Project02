/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer_User
 */
import java.util.Scanner;
public class Umur {
public static void main (String[] args) {
    
    int umur;
    String Ulasan;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Sila masukkan umur anda : ");
    umur = input.nextInt();
    
    if (umur <= 45){
        Ulasan="Anda masih muda dan cantik";
    }else {
        Ulasan="Anda sudah tua dan perlukan rehat";
}
    System.out.println(""+Ulasan);
}
}

