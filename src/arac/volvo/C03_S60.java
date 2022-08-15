package arac.volvo;

public class C03_S60 extends P_Volvo {
    public C03_S60() {
        super.model = "S60";
        super.yakitTipi = "hybrid";
        super.vites = "otomatik";
        super.gunlukUcret = 200;
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
