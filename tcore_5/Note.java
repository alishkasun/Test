package tcore_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Note {

    public static void main(String[] args) {
        String outputFileName = "file.cvs";

        String delimeter = ";";

        String[] header = {"Заголовок_1", "Заголовок_2", "Заголовок_3"};

        int[][] data = {
                {111, 222, 333},
                {444, 555, 666}
        };

        AppData appData = new AppData(header, data);



        /*запись*/


        try (Writer writer = new BufferedWriter(new FileWriter(outputFileName))) {

            for (String value : appData.getHeader()) {
                writer.write(value + delimeter);
            }

            writer.write("\n");

            for (int i = 0; i < appData.getData().length; i++) {

                for (int j = 0; j <= appData.getData().length; j++) {
                    writer.write(data[i][j] + delimeter);
                }

                writer.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*Чтение*/

        System.out.println("Start reading 1 ...");
        try (BufferedReader reader = new BufferedReader(new FileReader("file.cvs"))) {
            reader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println();
//        System.out.println("Start reading 2 ...");
//        StringBuilder sb = new StringBuilder();
//        try (BufferedReader reader = new BufferedReader(new FileReader("file.cvs"))) {
//            String line;
//
//            while ( (line = reader.readLine()) != null ) {
//                sb.append(line)
//                        .append("\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(sb.toString());
//
    }

}

