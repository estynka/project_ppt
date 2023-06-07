package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * definice třídy DataTable pro práci s tabulkou
 */
public class DataTable {

    private List<DataType> dataTypes; // atribut třídy - seznam datových typů

    // konstruktor třídy - naplníme seznam datovými typy jazyka Java
    /**
     * Vytvoří novou instanci třídy DataTable s naplněným seznamem datových typů jazyka Java.
     */
    public DataTable() {
        dataTypes = Arrays.asList(
                new DataType("byte", "Byte", Byte.BYTES, Byte.MIN_VALUE + " to " + Byte.MAX_VALUE),
                new DataType("short", "Short", Short.BYTES, Short.MIN_VALUE + " to " + Short.MAX_VALUE),
                new DataType("int", "Integer", Integer.BYTES, Integer.MIN_VALUE + " to " + Integer.MAX_VALUE),
                new DataType("long", "Long", Long.BYTES, Long.MIN_VALUE + " to " + Long.MAX_VALUE),
                new DataType("float", "Float", Float.BYTES, Float.MIN_VALUE + " to " + Float.MAX_VALUE),
                new DataType("double", "Double", Double.BYTES, Double.MIN_VALUE + " to " + Double.MAX_VALUE),
                new DataType("char", "Character", Character.BYTES, "A single character, or a number from ASCII"),
                new DataType("boolean", "Boolean", 1, "false or true") // velikost booleanu není pevně stanovena v Javě, zvolil jsem 1 byte pro jednoduchost
        );
    }

    // metoda pro zobrazení tabulky na konzoli
    /**
     * Zobrazí tabulku datových typů jazyka Java na konzoli ve formátované podobě.
     */
    public void display() {
        // definujeme formátovací řetězce pro zarovnání sloupců tabulky
        String formatName = "%-10s"; // název datového typu - zarovnáno vlevo na 10 znaků
        String formatWrapper = "%-15s"; // název obalovací třídy - zarovnáno vlevo na 15 znaků
        String formatSize = "%-15s"; // velikost proměnné - zarovnáno vlevo na 10 znaků
        String formatRange = "%-40s"; // rozsah hodnot - zarovnáno vlevo na 40 znaků

        // zobrazíme hlavičku tabulky s názvy sloupců
        System.out.println(String.format(formatName, "Type") +
                String.format(formatWrapper, "Wrapper") +
                String.format(formatSize, "Size (bytes)") +
                String.format(formatRange, "Range"));

        // zobrazíme oddělovací čáru
        System.out.println(String.format(formatName, "----------") +
                String.format(formatWrapper, "---------------") +
                String.format(formatSize, "----------------") +
                String.format(formatRange, "---------------------------------------------"));

        // seřadíme seznam datových typů podle velikosti proměnné
        dataTypes.sort(Comparator.comparingInt(DataType::getSize));

        // pro každý datový typ zobrazíme jeho údaje v jednom řádku tabulky
        for (DataType dataType : dataTypes) {
            System.out.println(String.format(formatName, dataType.getName()) +
                    String.format(formatWrapper, dataType.getWrapper()) +
                    String.format(formatSize, dataType.getSize()) +
                    String.format(formatRange, dataType.getRange()));
        }
    }
}
