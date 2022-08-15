package arac.opel;

public class C02_Corsa extends P_Opel {
    public C02_Corsa() {
        super.model = "Corsa";
        super.yakitTipi = "benzin";
        super.vites = "otomatik";
        super.gunlukUcret = 80;
    }

    @Override
    public String toString() {
        return  "marka: " + marka +
                "\nmodel: " + model +
                "\nyakit tipi: " + yakitTipi +
                "\nvites: " + vites +
                "\ngunluk ucret: " + gunlukUcret;
    }
}
