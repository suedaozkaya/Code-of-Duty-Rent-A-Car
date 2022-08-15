package genel;

import arac.AracOlusturma;

import java.util.Scanner;

public class Menu {
    /*
    ===HOSGELDİNİZ===
    arabaları listeleyelim
    Marka       Model       Vites       Yakıt       Günlük Ücreti
    1-opel      astra       manuel      dizel       100tl
    2-opel      corsa       otomatik    benzin       80tl
    2-toyota
    3-volvo
    0-Çıkış

    hangisini istiyorsa seçsin
     */
    static Scanner scan = new Scanner(System.in);


    public static void girisPaneli(){
        System.out.println("***CodeOfDuty Rent-A-Car***");
        System.out.println("========HOSGELDINIZ========");
        System.out.println("   Marka:    Model:    Yakit:      Vites:       Gunluk Ucret:"+
                         "\n1- Opel      Astra     dizel       manuel          100tl"+
                         "\n2- Opel      Corsa     benzin      otomatik         80tl"+
                         "\n3- Opel      Insigna   benzin      otomatik        120tl"+
                         "\n4- Toyota    Corolla   benzin      yari otomatik   110tl"+
                         "\n5- Toyota    Yaris     benzin      manuel           90tl"+
                         "\n6- Toyota    Auris     benzin&LPG  otomatik        130tl"+
                         "\n7- Volvo     V40       benzin      yari otomatik   150tl"+
                         "\n8- Volvo     XC90      dizel       otomatik        180tl"+
                         "\n9- Volvo     S60       hybrid      otomatik        200tl"+
                         "\n10- ek arac talebiniz                              300tl");
        System.out.print("Araba tercihinizin numarasini giriniz : ");
        int arabaTercih = scan.nextInt();

        switch (arabaTercih) {
            case 1 -> {
                System.out.print("Opel Astra sectiniz. Devam etmek istediginize emin misiniz? (E/H):");
                secim(arabaTercih);
            }
            case 2 -> {
                System.out.print("Opel Corsa sectiniz. Devam etmek istediginize emin misiniz? (E/H):");
                secim(arabaTercih);
            }
            case 3 -> {
                System.out.print("Opel Insigna sectiniz. Devam etmek istediginize emin misiniz? (E/H):");
                secim(arabaTercih);
            }
            case 4 -> {
                System.out.print("Toyota Corolla sectiniz. Devam etmek istediginize emin misiniz? (E/H):");
                secim(arabaTercih);
            }
            case 5 -> {
                System.out.print("Toyota Yaris sectiniz. Devam etmek istediginize emin misiniz? (E/H):");
                secim(arabaTercih);
            }
            case 6 -> {
                System.out.print("Toyota Auris sectiniz. Devam etmek istediginize emin misiniz? (E/H):");
                secim(arabaTercih);
            }
            case 7 -> {
                System.out.print("Volvo V40 sectiniz. Devam etmek istediginize emin misiniz? (E/H):");
                secim(arabaTercih);
            }
            case 8 -> {
                System.out.print("Volvo XC90 sectiniz. Devam etmek istediginize emin misiniz? (E/H):");
                secim(arabaTercih);
            }
            case 9 -> {
                System.out.print("Volvo S60 sectiniz. Devam etmek istediginize emin misiniz? (E/H):");
                secim(arabaTercih);
            }
            case 10 -> {
                System.out.print("Liste disi arac talep ettiniz. Devam etmek istediginize emin misiniz? (E/H):");
                secim(arabaTercih);
            }
            default -> {
                System.out.println("Lutfen gecerli bir secim yapiniz");
                girisPaneli();
            }
        }

    }
    static void secim(int arabaTercih){
        String secim = scan.next().toUpperCase();
        if (secim.equals("E")){
            AracOlusturma.aracOlustur(arabaTercih);
        }else if (secim.equals("H")){
            System.out.println("Lutfen farkli bir secim yapiniz");
            girisPaneli();
        }else {
            System.out.println("Gecersiz giris yaptiniz");
            girisPaneli();
        }
    }

}
