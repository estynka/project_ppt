package com.company;

/**
 * definice tridy DataType pro reprezentaci datovych typu
 */
public class DataType {

    // atributy třídy
    private String name; // název datového typu
    private String wrapper; // název obalovací třídy
    private int size; // velikost proměnné v paměti v bytech
    private String range; // rozsah hodnot pro celočíselné typy

    // konstruktor třídy
    /**
     * Vytvoří novou instanci třídy DataType s danými údaji o datovém typu.
     * @param name název datového typu
     * @param wrapper název obalovací třídy
     * @param size velikost proměnné v paměti v bytech
     * @param range rozsah hodnot pro celočíselné typy
     */
    public DataType(String name, String wrapper, int size, String range) {
        this.name = name;
        this.wrapper = wrapper;
        this.size = size;
        this.range = range;
    }

    // metody pro získání hodnot atributů
    /**
     * Vrátí název datového typu.
     * @return název datového typu
     */
    public String getName() {
        return name;
    }

    /**
     * Vrátí název obalovací třídy.
     * @return název obalovací třídy
     */
    public String getWrapper() {
        return wrapper;
    }

    /**
     * Vrátí velikost proměnné v paměti v bytech.
     * @return velikost proměnné v paměti v bytech
     */
    public int getSize() {
        return size;
    }

    /**
     * Vrátí rozsah hodnot pro celočíselné typy.
     * @return rozsah hodnot pro celočíselné typy
     */
    public String getRange() {
        return range;
    }
}
