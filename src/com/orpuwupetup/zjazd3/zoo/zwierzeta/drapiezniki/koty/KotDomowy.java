package com.orpuwupetup.zjazd3.zoo.zwierzeta.drapiezniki.koty;

import com.orpuwupetup.zjazd3.zoo.zwierzeta.drapiezniki.Drapieznik;

public class KotDomowy extends Drapieznik {

    private String kolor;

    public KotDomowy(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public void odezwijSie() {
        System.out.println("Miau");
    }

    @Override
    public void biegnij() {
        System.out.println("Biegam po drzewie!");
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
}
