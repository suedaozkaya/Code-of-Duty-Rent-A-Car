package arac;

import arac.opel.P_Opel;

public class EkAracTalebi extends P_Opel {

    public EkAracTalebi(String marka,String model,String yakitTipi,String vites){
        super.marka = marka;
        super.model = model;
        super.yakitTipi = yakitTipi;
        super.vites = vites;
        super.gunlukUcret = 300;
    }

    @Override
    public String toString() {
        return
                "marka: " + marka +
                "\nmodel: " + model +
                "\nyakit tipi: " + yakitTipi +
                "\nvites: " + vites +
                "\ngunluk ucret: " + gunlukUcret;

    }
}
