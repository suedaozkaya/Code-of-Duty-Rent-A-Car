package arac.opel;

public class C01_Astra extends P_Opel {
    public C01_Astra() {
        super.model = "Astra";
        super.yakitTipi = "dizel";
        super.vites = "otomatik";
        super.gunlukUcret = 100;
    }

    @Override
    public String toString() {
        return "marka: " + marka +
                "\nmodel: " + model +
                "\nyakit tipi: " + yakitTipi +
                "\nvites: " + vites +
                "\ngunluk ucret: " + gunlukUcret;
    }

}
