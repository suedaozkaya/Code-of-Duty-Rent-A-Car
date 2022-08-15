package arac.toyota;

public class C01_Corolla extends P_Toyota {
    public C01_Corolla() {
        super.model = "Corolla";
        super.yakitTipi = "benzin";
        super.vites = "yari otomatik";
        super.gunlukUcret = 110;
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
