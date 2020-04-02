package com.orpuwupetup.zjazd3;

import com.orpuwupetup.zjazd3.scanner.XYZ;
import com.orpuwupetup.zjazd3.student.Student;
import com.orpuwupetup.zjazd3.trycatch.TryCatch;
import com.orpuwupetup.zjazd3.zoo.Zoo;
import com.orpuwupetup.zjazd3.zoo.zwierzeta.Zwierze;
import com.orpuwupetup.zjazd3.zoo.zwierzeta.drapiezniki.koty.KotDomowy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

//        Zoo zoo = new Zoo();
//
//        zoo.dodajZwierze(new KotDomowy("szary"));
//        zoo.dodajZwierze(new KotDomowy("niebieski"));
//
//        zoo.getZwierzeta().forEach(Zwierze::odezwijSie);

//        Scanner scanner = new Scanner(System.in);
//        TryCatch tryCatch = new TryCatch();
//        System.out.println("Wprowadź pierwsza liczbe");
//        while (scanner.hasNextInt()) {
//            int firstNumber = scanner.nextInt();
//            System.out.println("Wprowadź druga liczbe");
//            int secondNumber = scanner.nextInt();
//            try {
//                tryCatch.printNumbers(firstNumber, secondNumber);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//
//        XYZ scanner = new XYZ();
//
//        scanner.startScanning();
        List<Student> studenci = new ArrayList();

        for (int i = 0; i < 20; i++) {
            studenci.add(new Student(i));
        }

        List<Integer> listaIndexow = studenci.stream()
                .map(Student::getLuckyNumber)
                .filter(integer -> integer > 10)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(listaIndexow);

    }
}
