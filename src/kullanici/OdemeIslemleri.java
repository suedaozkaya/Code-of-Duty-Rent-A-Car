package kullanici;

import arac.AracOlusturma;

import java.util.Scanner;

public class OdemeIslemleri {

    public static void odemeBilgi(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kredi karti uzerindeki bilgileri giriniz: ");
        System.out.print("Ad soyad: ");
        String adSoyad = scan.nextLine();
        System.out.print("Kredi karti numarasi: ");
        String kartNo = scan.nextLine();
        System.out.print("Son kullanim tarihi(AA/YY): ");
        String sonKullanim = scan.nextLine();
        System.out.print("CVC: ");
        String cvc = scan.nextLine();
        System.out.print("Dogrulama kodunu giriniz: ");
        String dogrulama = scan.nextLine();

        System.out.println("Odemeniz alinmistir.");
        bilgiFisi();

    }
    static void bilgiFisi(){
        System.out.println("*****BILGI FISI*****");
        System.out.println(AracOlusturma.musteri.aracBilgisi);
        System.out.println(AracOlusturma.musteri.toString());
    }

}
