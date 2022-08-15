package arac.toyota;

public class C03_Auris extends P_Toyota {
    public C03_Auris() {
        super.model = "Auris";
        super.yakitTipi = "benzin&LPG";
        super.vites = "otomatik";
        super.gunlukUcret = 130;
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
