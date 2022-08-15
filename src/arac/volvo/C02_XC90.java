package arac.volvo;

public class C02_XC90 extends P_Volvo {
    public C02_XC90() {
        super.model = "XC90";
        super.yakitTipi = "dizel";
        super.vites = "otomatik";
        super.gunlukUcret = 180;
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
