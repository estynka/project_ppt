package com.company;

// importujeme třídy pro práci s kolekcemi a testy
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// definujeme třídu pro reprezentaci otázky a odpovědi
class Question {
    // atributy třídy
    private String question; // text otázky
    private String answer; // správná odpověď

    // konstruktor třídy
    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // metody pro získání hodnot atributů
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}

// definujeme třídu pro práci s výukovým testem
class Test {
    // atribut třídy - seznam otázek a odpovědí
    private List<Question> questions;

    // konstruktor třídy - naplníme seznam otázkami a odpověďmi
    public Test() {
        questions = new ArrayList<>();

        // přidáme otázky a odpovědi o metodě indexOf
        questions.add(new Question("Co dělá metoda indexOf na datové kolekci List?", "Vrací index prvního výskytu zadaného prvku v listu nebo -1, pokud se prvek v listu nenachází."));
        questions.add(new Question("Jakou hodnotu vrátí metoda indexOf na listu [\"a\", \"b\", \"c\", \"d\"] pro argument \"c\"?", "2"));
        questions.add(new Question("Jakou hodnotu vrátí metoda indexOf na listu [\"a\", \"b\", \"c\", \"d\"] pro argument \"e\"?", "-1"));

        // přidáme otázky a odpovědi o slovníku (Map)
        questions.add(new Question("Jak se v jazyce Java jmenuje třída reprezentující slovník?", "HashMap"));
        questions.add(new Question("Jaké jsou hlavní metody třídy HashMap?", "put, get, containsKey, containsValue, remove, size"));
        questions.add(new Question("Co dělá metoda put na slovníku HashMap?", "Přidá nebo aktualizuje pár klíč-hodnota do slovníku."));
        questions.add(new Question("Co dělá metoda get na slovníku HashMap?", "Vrací hodnotu asociovanou s daným klíčem nebo null, pokud klíč není v slovníku."));
    }

    // metoda pro spuštění testu na konzoli
    public void run() {
        // vytvoříme instanci třídy Scanner pro načítání uživatelského vstupu
        Scanner scanner = new Scanner(System.in);

        // inicializujeme proměnnou pro počet správných odpovědí
        int correct = 0;

        // pro každou otázku zobrazíme její text a načteme uživatelskou odpověď
        for (Question question : questions) {
            System.out.println(question.getQuestion()); // zobrazit otázku
            String userAnswer = scanner.nextLine(); // načíst odpověď

            // porovnáme uživatelskou odpověď se správnou odpovědí
            if (userAnswer.equalsIgnoreCase(question.getAnswer())) {
                // pokud se shodují, zvýšíme počet správných odpovědí a zobrazíme gratulaci
                correct++;
                System.out.println("Správně!");
            } else {
                // pokud se neshodují, zobrazíme správnou odpověď
                System.out.println("Špatně. Správná odpověď je: " + question.getAnswer());
            }

            // zobrazíme oddělovací čáru
            System.out.println("--------------------");
        }

        // zobrazíme výsledek testu - počet správných odpovědí a procentuální úspěšnost
        System.out.println("Výsledek testu:");
        System.out.println("Správných odpovědí: " + correct + " z " + questions.size());
        System.out.println("Úspěšnost: " + (correct * 100.0 / questions.size()) + " %");
    }
}

// definujeme hlavní třídu programu
public class Main {
    // definujeme hlavní metodu programu
    public static void main(String[] args) {
        // vytvoříme instanci třídy Test
        Test test = new Test();

        // spustíme test na konzoli
        test.run();
    }
}

