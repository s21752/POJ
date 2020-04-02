package com.orpuwupetup.zjazd3.zoo;

import com.orpuwupetup.zjazd3.zoo.zwierzeta.Zwierze;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Zwierze> zwierzeta = new ArrayList<>();

    public void dodajZwierze(Zwierze zwierze) {
        this.zwierzeta.add(zwierze);
    }

    public List<Zwierze> getZwierzeta() {
        return zwierzeta;
    }

    public void setZwierzeta(List<Zwierze> zwierzeta) {
        this.zwierzeta = zwierzeta;
    }
}
