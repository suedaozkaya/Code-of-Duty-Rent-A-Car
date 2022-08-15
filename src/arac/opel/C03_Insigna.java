package arac.opel;

public class C03_Insigna extends P_Opel {
    public C03_Insigna() {
        super.model = "Insigna";
        super.yakitTipi = "benzin";
        super.vites = "otomatik";
        super.gunlukUcret = 120;
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
