package main;

import java.util.List;

public class Seznam{

    public void addItem(List seznam, String item){
        seznam.add(item);
    }

    public void removeItem(List seznam, String item){
        seznam.remove(item);
    }
    public static int getIndex(List seznam, String item){
        return seznam.indexOf(item);
    }

    public static void tisk(List seznam, String item){
        System.out.println(seznam);
        //System.out.println(getIndex(seznam, item));
    }
}
