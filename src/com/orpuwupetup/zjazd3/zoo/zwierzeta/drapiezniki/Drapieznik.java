package com.orpuwupetup.zjazd3.zoo.zwierzeta.drapiezniki;

import com.orpuwupetup.zjazd3.zoo.zwierzeta.Zwierze;

public abstract class Drapieznik implements Zwierze {

    @Override
    public void jedz() {
        System.out.println("jem mięso");
    }


}
