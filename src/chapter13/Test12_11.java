package chapter13;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test12_11 {
    public static void main(String[] args) {
        String filename = "C:\\Users\\Rain\\Desktop\\java_foundation\\temp_dir\\childdir\\grandChild\\temp.txt";
        String str = "ha";
        java.io.File file = new java.io.File(filename);
        Scanner file_input  = null;
        try {
            file_input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (file_input.hasNextLine()){
            String line  = file_input.nextLine();
            String newline = line.replace(str,"");
            stringBuilder.append(newline);
        }

        System.out.println(stringBuilder.toString());
        file_input.close();

    }
}
