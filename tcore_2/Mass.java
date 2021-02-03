package tcore_2;

import java.util.Arrays;
import java.util.stream.Stream;

public class Mass {

    public static void main(String[] args) {

        String[][] arrays = new String[][] {
                {" 1 ", " 2 ", " 3 ", " 4 "},
                {" 2 ", " 2 ", " 2 ", " 3 "},
                {" 1 ", " 2 ", " 2 ", " 2 "},
                {" 2 ", " 2 ", " 2 ", " 2 "}
        };

        try {
            processArray(arrays);
        } catch (MyArraySizeException e) {
            System.out.println("Array size is not correct. Not 4 X 4 matrix");
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void processArray(String[][] arrays) throws MyArraySizeException, MyArrayDataException {
        checkArrayDimension(arrays);
        calcSum(arrays);
    }

    private static void calcSum(String[][] arrays) throws MyArrayDataException {
        for (int i = 0; i < arrays.length; i++) {
            int[] toInt = new int[4];

            String[] subArray = arrays[i];

            for (int j = 0; j < subArray.length; j++) {
                try {
                    int integer = Integer.parseInt(subArray[j].trim());
                    toInt[j] = integer;
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(String.format("Not int in the position: %d%d", i, j));
                }
            }

            int sum = Arrays.stream(toInt).sum();
            System.out.printf("Sum of %s = %d%n", Arrays.toString(toInt),  sum);
        }
    }

    private static void checkArrayDimension(String[][] arrays) throws MyArraySizeException {
        if (arrays.length != 4) {
            throw new MyArraySizeException();
        }

        for (String[] arr : arrays) {
            if (arr.length != 4) {
                throw new MyArraySizeException();
            }
        }
    }


}






