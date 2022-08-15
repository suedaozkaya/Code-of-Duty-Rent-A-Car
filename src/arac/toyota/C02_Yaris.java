package arac.toyota;

public class C02_Yaris extends P_Toyota {
    public C02_Yaris() {
        super.model = "Yaris";
        super.yakitTipi = "benzin";
        super.vites = "manuel";
        super.gunlukUcret = 90;
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
