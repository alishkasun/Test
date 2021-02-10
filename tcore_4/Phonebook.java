package tcore_4;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    HashMap<String, ArrayList> phonebook = new HashMap<>();

    public void add(String name, int phone) {
        ArrayList<Integer> phoneList = phonebook.get(name);
        if (phoneList == null) phoneList = new ArrayList<>();
        phoneList.add(phone);
        phonebook.put(name, phoneList);
//        System.out.println(phonebook.get(phone) + "-" + phonebook.get(name));
        //Как вывести в столбец? если раскоментить, то что выше,то будет столбец, но значение name = null. И еще
//        почему в консоли {} [] при печати заданий?


    }

    public ArrayList<String> get(String name) {
        return phonebook.get(name);
    }

    public void sms() {
  System.out.println(phonebook);
    }
}
