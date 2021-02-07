package tcore_3;

import java.util.Arrays;

import static tcore_3.Element.swap;

public class Main {

    public static void main(String[] args) {
        /* Задание 1 */
        Integer[] intArr = new Integer[2];

        intArr[0] = 33;
        intArr[1] = 66;


        System.out.println(Arrays.deepToString(intArr));
        swap(intArr, 0, 1);
        System.out.println(Arrays.deepToString(intArr));


        /* Задание 2 */
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();


        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> appleBox = new Box<>(apple1, apple2);
        Box<Apple> appleBox2 = new Box<>(new Apple(), new Apple());

        appleBox.takeAllFromBox(appleBox2);

        boolean testEmpty = appleBox2.getItems().isEmpty();
        boolean testItems = (appleBox.getItems().size() == 4);



        Box<Orange> orangeBox = new Box<>(orange1, orange2);


        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());


    }


}

