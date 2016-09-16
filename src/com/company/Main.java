package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello World!");

        Coche jaguar = new Coche("Jaguar","XF","2342WRD",4000,80000.0);
        Coche mercedes = new Coche("Mercedes","hdagadfh","3234RRD",8000,160000.0);
        Coche bmw = new Coche("BMW","dfasdg","7453DRE",5000,60000.0);

        List<Coche> cocheList = new ArrayList<>();

        cocheList.add(jaguar);
        cocheList.add(mercedes);
        cocheList.add(bmw);

        System.out.println("Muestro el Jaguar: "+cocheList.get(0));



    }
}
