/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sfauzi.projectphone;

import java.util.Scanner;

/**
 *
 * @author S FAUZI
 * SYAHRUL FAUZI - 21103015
 * S1SI-05-A
 */
public class ProjectPhone {

    public static void main(String[] args) {
        // membuat objek HP
        Phone RedmiNote8 = new Xiaomi();
        Phone F12 = new Oppo();
        Phone J2Prime = new Samsung();
        Phone Pro12max = new iPhone();
        
        // membuat objek user
        PhoneUser fauzi = new PhoneUser(F12);

        // kita coba nyalakan HP-nya
        fauzi.turnOnThePhone();       
        Scanner input = new Scanner(System.in);
        String aksi; 
        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();            
            if(aksi.equalsIgnoreCase("1")){
                fauzi.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                fauzi.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                fauzi.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                fauzi.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}
