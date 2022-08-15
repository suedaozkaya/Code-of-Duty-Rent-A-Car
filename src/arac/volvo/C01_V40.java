package arac.volvo;

public class C01_V40 extends P_Volvo {
    public C01_V40() {
        super.model = "V40";
        super.yakitTipi = "benzin";
        super.vites = "yari otomatik";
        super.gunlukUcret = 150;
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
