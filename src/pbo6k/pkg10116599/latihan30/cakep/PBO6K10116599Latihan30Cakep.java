/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program yang berisi pertanyaan dengan menggunakan tulisan berwarna.
 * 
 */
public class PBO6K10116599Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini?");
        System.out.println((char)27+"[01;31m Kamu"+(char)27+"[00;00m" +(char)27+"[01;32m ngerjain sendiri"+(char)27+"[00;00m"
        +(char)27+"[01;33m latihan 17 sampe"+(char)27+"[00;00m" +(char)27+"[01;34m latihan 30 ini?"+(char)27+"[00;00m");
        
        // input jawaban
        System.out.print((char)27+"[01;34m Jawab"+(char)27+"[00;00m" +(char)27+"[01;35m (Yoi/Enngak) : "+(char)27+"[00;00m");
        Scanner scan = new Scanner(System.in);
        String jawab = scan.next();
        
        // output pernyataan
        if (jawab.equalsIgnoreCase("Yoi")) {
            System.out.println();
            //System.out.println("Cakep Bener. Good Job.");
            System.out.println((char)27+"[01;31m Cakep Bener."+(char)27+"[00;00m"+(char)27+"[01;35m Good Job."+(char)27+"[00;00m");
        } else {
            System.out.println();
            //System.out.println("Tetep cakep sih.");
            System.out.println((char)27+"[01;31m Tetep cakep sih."+(char)27+"[00;00m");
            //System.out.println("Sing penting paham konsepnya yee.");
            System.out.println((char)27+"[01;36m Sing penting paham konsepnya yee."+(char)27+"[00;00m");
            //System.out.println("Keep the code works dude.");
            System.out.println((char)27+"[01;37m Keep the code works dude."+(char)27+"[00;00m");
        }
           
    }
    
}
