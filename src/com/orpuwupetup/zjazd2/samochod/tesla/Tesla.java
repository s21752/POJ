package com.orpuwupetup.zjazd2.samochod.tesla;

import com.orpuwupetup.zjazd2.samochod.Samochod;
import com.orpuwupetup.zjazd2.samochod.czesci.Drzwi;
import com.orpuwupetup.zjazd2.samochod.czesci.Kierownica;
import com.orpuwupetup.zjazd2.samochod.czesci.Kolo;
import com.orpuwupetup.zjazd2.samochod.czesci.Ladowarka;

public class Tesla extends Samochod implements ElectricVehicle{

    private Ladowarka ladowarka;

    public Tesla() {
    }

    public Tesla(Kolo[] kola, Drzwi[] drzwi, Kierownica kierownica) {
        super(kola, drzwi, kierownica);
        this.ladowarka = new Ladowarka();
    }

    @Override
    public void charge() {
        laduj();
    }

    public void laduj() {
        System.out.println("Ladowanie");
    }

    public Ladowarka getLadowarka() {
        return ladowarka;
    }

    public void setLadowarka(Ladowarka ladowarka) {
        this.ladowarka = ladowarka;
    }
}
