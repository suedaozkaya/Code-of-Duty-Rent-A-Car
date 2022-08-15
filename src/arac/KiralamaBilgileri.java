package arac;

import genel.Menu;
import kullanici.MusteriBilgileri;
import kullanici.OdemeIslemleri;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KiralamaBilgileri {
        /*
    String alinacakSehir;
    String alinacakGun; (MM,dd--> ay gun formatında olmalı)
    double alisSaati;

    String teslimGunu;  (MM,dd--> ay gun formatında olmalı) bize söylicek
    double teslimSaati;

     */
    static Scanner scan = new Scanner(System.in);

    public static void tarihSaat() {

        System.out.print("Kiralamak istediginiz sehri giriniz: ");
        AracOlusturma.musteri.alinacakSehir = scan.next();

        System.out.println("Kiralama baslangic tarihi icin:");
        System.out.print("Ay numarasi giriniz: ");
        int ay = scan.nextInt();
        System.out.print("Gun numarasi giriniz: ");
        int gun = scan.nextInt();
        System.out.print("Saati giriniz (00-23): ");
        AracOlusturma.musteri.alisSaati = scan.nextInt();
        AracOlusturma.musteri.alisTarihi = LocalDate.of(2022,ay,gun);

        System.out.println("Teslim tarihi icin:");
        System.out.print("Ay numarasi giriniz: ");
        ay = scan.nextInt();
        System.out.print("Gun numarasi giriniz: ");
        gun = scan.nextInt();
        System.out.print("Saati giriniz (00-23): ");
        AracOlusturma.musteri.teslimSaati = scan.nextInt();
        AracOlusturma.musteri.teslimTarihi = LocalDate.of(2022,ay,gun);
        fiyatHesaplama();

    }

    public static void fiyatHesaplama() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Period period =Period.between(AracOlusturma.musteri.alisTarihi,AracOlusturma.musteri.teslimTarihi);

        double hesap = period.getMonths()*30+period.getDays();
        if (AracOlusturma.musteri.teslimSaati> AracOlusturma.musteri.alisSaati){
            hesap++;
        }
        hesap*=AracOlusturma.musteri.fiyatlar.get(0);
        System.out.println("Alis zamani: " + dtf.format(AracOlusturma.musteri.alisTarihi)+" "+AracOlusturma.musteri.alisSaati+":00");
        System.out.println("Teslim zamani: " +dtf.format(AracOlusturma.musteri.teslimTarihi)+" "+AracOlusturma.musteri.teslimSaati+":00");
        System.out.println("Toplam kiralama bedeli: " + hesap + " TL");
        AracOlusturma.musteri.fiyatlar.add(hesap);
        devam();

    }

    static void devam(){
        System.out.println("Lutfen menuden secim yapiniz");
        System.out.println("1-Devam" + "\n2-Bilgileri yeniden gir" + "\n3-Ana menu");
        int secim = scan.nextInt();

        switch (secim){
            case 1:
                MusteriBilgileri.musteriBilgi();
                OdemeIslemleri.odemeBilgi();
            break;
            case 2:
                tarihSaat();
                break;
            case 3:
                Menu.girisPaneli();
            break;
            default:
                System.out.println("Gecerli giris yapiniz");
                devam();
        }

    }





}
