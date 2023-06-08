package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> list = new ArrayList();
        Map<Integer, String> mapa = new HashMap();

        //práce se seznamem bez trídy
        list.add("audi");
        list.add("skoda");
        int index = list.indexOf("audi");
        System.out.println(list);
        System.out.println(index);

        //práce se seznamem a trídou
        Seznam seznam = new Seznam();
        String item = "volvo";
        seznam.addItem(list, item);
        seznam.addItem(list, "renault");
        seznam.removeItem(list, item);
        seznam.getIndex(list, item);
        seznam.tisk(list, item);


        //práce se slovnikem (mapou)
        Slovnik slovnik = new Slovnik();
        int id = 123;
        String value = "Honza";
        slovnik.addItem(mapa, id, value);
        slovnik.addItem(mapa, 124, "Petr");
        slovnik.getValue(mapa, 123);
        slovnik.removeItem(mapa, 123);
        slovnik.getSize(mapa);
        slovnik.tisk(mapa);










    }
}
