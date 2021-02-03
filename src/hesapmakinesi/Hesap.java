/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesapmakinesi;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
class Hesap {
    double sayi1;
    double sayi2;
    String islem; 
    double sonuc;
}
        class SayiGir extends Hesap{
        public SayiGir(){
        Scanner Say1 = new Scanner(System.in);
        System.out.println("1.sayıyı gir:");
        sayi1=Say1.nextInt(); 
        Scanner Islem = new Scanner(System.in);
        System.out.println("Yapılacak İşlem:");
        islem=Islem.next(); 
        Scanner Say2 = new Scanner(System.in);
        System.out.println("2.sayıyı gir:");
        sayi2=Say2.nextInt(); 
       
            }
        } 
       
    

    class Hesaplama extends SayiGir{
                public Hesaplama(){
               if ("+".equals(islem)) {
                sonuc=sayi1+sayi2;
                System.out.println(sonuc);
               }
            
                if ("-".equals(islem)) {
                sonuc=sayi1-sayi2;
                System.out.println(sonuc);
        
                    }
                if ("*".equals(islem)) {
                         sonuc=sayi1*sayi2;
        System.out.println(sonuc);
                   }
                if ("/".equals(islem)) {
                         sonuc=sayi1/sayi2;
        System.out.println(sonuc);
        
                   }
        
                
            }
               
        }
    


   