package com.company;

/**
 * Hlavni trida -> vytvori novy objekt tabulky a zobrazi ji
 * @author Ester Durcova alias Bing AI
 * @version 1.0
 * @since 7.6.2023
 */

public class Main {
    // definujeme hlavní metodu programu
    /**
     * Vytvori a zobrazi instanci tridy DataTable.
     * @param args argumenty predane programu (nejsou pouzity)
     */
    public static void main(String[] args) {

        DataTable dataTable = new DataTable(); // vytvoříme instanci třídy DataTable

        dataTable.display(); // zobrazíme tabulku na konzoli
    }
}
