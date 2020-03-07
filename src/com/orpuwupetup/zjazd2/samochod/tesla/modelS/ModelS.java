package com.orpuwupetup.zjazd2.samochod.tesla.modelS;

import com.orpuwupetup.zjazd2.samochod.czesci.Drzwi;
import com.orpuwupetup.zjazd2.samochod.czesci.Kierownica;
import com.orpuwupetup.zjazd2.samochod.czesci.Kolo;
import com.orpuwupetup.zjazd2.samochod.tesla.Tesla;

public class ModelS extends Tesla {

    private int iloscKoniMechanicznych = 700;

    public ModelS() {
    }

    public ModelS(Kolo[] kola, Drzwi[] drzwi, Kierownica kierownica) {
        super(kola, drzwi, kierownica);
    }

    public int getIloscKoniMechanicznych() {
        return iloscKoniMechanicznych;
    }

    public void setIloscKoniMechanicznych(int iloscKoniMechanicznych) {
        this.iloscKoniMechanicznych = iloscKoniMechanicznych;
    }
}
