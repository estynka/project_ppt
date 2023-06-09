package main;

import java.util.Map;


public class Slovnik {

    public void addItem(Map slovnik, int id , String value){
        slovnik.put(id, value);
    }

    public String getValue(Map slovnik, int id){
        return (String) slovnik.get(id);
    }

    public void removeItem(Map slovnik, int id){
        slovnik.remove(id);
    }

    public int getSize(Map slovnik){
        return slovnik.size();
    }

    public static void tisk(Map slovnik){
        System.out.println(slovnik);
    }
}