package arac;

import arac.opel.C01_Astra;
import arac.opel.C02_Corsa;
import arac.opel.C03_Insigna;
import arac.toyota.C03_Auris;
import arac.toyota.C01_Corolla;
import arac.toyota.C02_Yaris;
import arac.volvo.C03_S60;
import arac.volvo.C01_V40;
import arac.volvo.C02_XC90;
import genel.Menu;
import kullanici.MusteriBilgileri;

import java.util.Scanner;

public class AracOlusturma {


    // secilen arabaya gore obje olsturacagiz
    static Scanner scan = new Scanner(System.in);
    public static MusteriBilgileri musteri = new MusteriBilgileri();
    public static void aracOlustur(int arabaTercih){


        switch (arabaTercih) {
            case 1 -> {
                C01_Astra astraKiralik = new C01_Astra();
                musteri.fiyatlar.add(astraKiralik.gunlukUcret);
                musteri.aracBilgisi = astraKiralik.toString();
            }
            case 2 -> {
                C02_Corsa corsaKiralik = new C02_Corsa();
                musteri.fiyatlar.add(corsaKiralik.gunlukUcret);
                musteri.aracBilgisi = corsaKiralik.toString();
            }
            case 3 -> {
                C03_Insigna insignaKiralik = new C03_Insigna();
                musteri.fiyatlar.add(insignaKiralik.gunlukUcret);
                musteri.aracBilgisi = insignaKiralik.toString();
            }
            case 4 -> {
                C01_Corolla corollaKiralik = new C01_Corolla();
                musteri.fiyatlar.add(corollaKiralik.gunlukUcret);
                musteri.aracBilgisi = corollaKiralik.toString();
            }
            case 5 -> {
                C02_Yaris yarisKiralik = new C02_Yaris();
                musteri.fiyatlar.add(yarisKiralik.gunlukUcret);
                musteri.aracBilgisi = yarisKiralik.toString();
            }
            case 6 -> {
                C03_Auris aurisKiralik = new C03_Auris();
                musteri.fiyatlar.add(aurisKiralik.gunlukUcret);
                musteri.aracBilgisi = aurisKiralik.toString();
            }
            case 7 -> {
                C01_V40 v40Kiralik = new C01_V40();
                musteri.fiyatlar.add(v40Kiralik.gunlukUcret);
                musteri.aracBilgisi = v40Kiralik.toString();
            }
            case 8 -> {
                C02_XC90 xc90Kiralik = new C02_XC90();
                musteri.fiyatlar.add(xc90Kiralik.gunlukUcret);
                musteri.aracBilgisi = xc90Kiralik.toString();
            }
            case 9 -> {
                C03_S60 s60Kiralik = new C03_S60();
                musteri.fiyatlar.add(s60Kiralik.gunlukUcret);
                musteri.aracBilgisi = s60Kiralik.toString();
            }
            case 10 -> {
                ekArac();

            }
        }
        KiralamaBilgileri.tarihSaat();
    }

    public static void ekArac(){
        System.out.println("Lutfen ek arac talebinizin bilgilerini giriniz: ");
        System.out.print("Marka giriniz: ");
        String marka = scan.nextLine();
        System.out.print("Model giriniz: ");
        String model = scan.nextLine();
        System.out.print("Yakit tipi giriniz: ");
        String yakitTipi = scan.nextLine();
        System.out.print("Vites tipi giriniz: ");
        String vitesTipi = scan.nextLine();

        EkAracTalebi ekArac = new EkAracTalebi(marka,model,yakitTipi,vitesTipi);
        System.out.println(ekArac);

        System.out.println("Lutfen menuden secim yapiniz");
        System.out.println("1-Devam" + "\n2-Yeni arac secimi" + "\n3-Ana menu");
        int secim = scan.nextInt();

        boolean flag=true;
        while (flag){
            switch (secim) {
                case 1:
                    musteri.fiyatlar.add(ekArac.gunlukUcret);
                    musteri.aracBilgisi = ekArac.toString();
                    flag = false;
                    break;
                case 2:
                    ekArac();
                    flag = false;
                break;
                case 3:
                    Menu.girisPaneli();
                    flag = false;
                    break;
                default:
                    System.out.println("Gecerli giris yapiniz");
                }
        }

    }


}
