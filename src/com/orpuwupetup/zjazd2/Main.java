package com.orpuwupetup.zjazd2;

import com.orpuwupetup.zjazd2.samochod.Samochod;
import com.orpuwupetup.zjazd2.samochod.tesla.ElectricVehicle;
import com.orpuwupetup.zjazd2.samochod.tesla.Tesla;
import com.orpuwupetup.zjazd2.samochod.tesla.modelS.ModelS;
import com.orpuwupetup.zjazd2.shapes.Kwadrat;
import com.orpuwupetup.zjazd2.shapes.Shape;

public class Main {

    public static void main(String[] args) {
        System.out.println("zjazd 2");

        Kwadrat foo = new Kwadrat(5, 5);
        System.out.println("pole kwadratu to: " + foo.pole());

        Shape kwadrat = new Shape() {
            @Override
            public void tellName() {
                System.out.println("Kwadrat");
            }
        };

        kwadrat.tellName();

        ModelS modelS = new ModelS();
        Samochod modelS2 = new ModelS();
        ElectricVehicle evInterface = new Tesla();

        ElectricVehicle anonymous = new ElectricVehicle() {
            @Override
            public void charge() {
                System.out.println("Charge anonymously");
            }
        };

        ElectricVehicle anonymousWithLambda = () -> System.out.println("Charge anonymously with lambda");

        modelS.charge();
        evInterface.charge();
        anonymous.charge();
        anonymousWithLambda.charge();
    }
}
