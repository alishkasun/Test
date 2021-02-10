package tcore_4;

import java.util.*;


public class Words {

    public static void main(String[] args) {
        /* Задание 1*/
        String[] words = {"lesson","apple", "cat","box","pan", "father", "lesson", "box", "mother", "sister", "son", "lesson", "box", "house","garden", "lesson"};

        Set<String> uniq = new TreeSet<String>();
        uniq.addAll(Arrays.asList(words));
        System.out.println("uniq:" + uniq);

        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : words) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        System.out.println(wordsCount);

        /* Задание 2*/
        Phonebook phonebook= new Phonebook();

        phonebook.add("Сидоров", 123123);
        phonebook.add("Иванов", 222222);
        phonebook.add("Петров", 123143);
        phonebook.add("Козлов", 232222);
        phonebook.add("Сидоров", 123123);
        phonebook.add("Лето", 222222);
        phonebook.add("Капишена", 1266123);
        phonebook.add("Иванов", 222222);


        phonebook.sms();

        System.out.println("У Капишеной номер:" + phonebook.get("Капишена"));

             }
    }
