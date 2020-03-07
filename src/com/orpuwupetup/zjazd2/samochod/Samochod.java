package com.orpuwupetup.zjazd2.samochod;

import com.orpuwupetup.zjazd2.samochod.czesci.Drzwi;
import com.orpuwupetup.zjazd2.samochod.czesci.Kierownica;
import com.orpuwupetup.zjazd2.samochod.czesci.Kolo;

public class Samochod {

    private Kolo[] kola;
    private Drzwi[] drzwi;
    private Kierownica kierownica = new Kierownica();

    public Samochod(Kolo[] kola, Drzwi[] drzwi, Kierownica kierownica) {
        this.kola = kola;
        this.drzwi = drzwi;
        this.kierownica = kierownica;
    }

    public Samochod() {}

    public Kolo[] getKola() {
        return kola;
    }

    public void setKola(Kolo[] kola) {
        this.kola = kola;
    }

    public Drzwi[] getDrzwi() {
        return drzwi;
    }

    public void setDrzwi(Drzwi[] drzwi) {
        this.drzwi = drzwi;
    }

    public Kierownica getKierownica() {
        return kierownica;
    }

    public void setKierownica(Kierownica kierownica) {
        this.kierownica = kierownica;
    }
}
