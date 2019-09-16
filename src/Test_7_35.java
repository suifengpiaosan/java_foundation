import java.io.*;
import java.util.Scanner;

public class Test_7_35 {
    public static void main(String[] args) {

        File file = new File("");
        String line = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((line=br.readLine())!=null){
                line.toLowerCase();
                String str[] = line.split(" ");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException i){
            i.printStackTrace();
        }

        Scanner input = new Scanner(System.in);

        String[] words = {"hello","good","welcome"};

        int index = (int)(Math.random()*words.length);
        String word = words[index];

        char c[] = new char[word.length()];
        for(int i = 0;i<word.length();i++){
            c[i] = '*';
        }

        System.out.println(c.length);
        int count = 0;
        while (c.length>count){
            System.out.println("Enter a letter in word ");
            String s = input.next();
            char c1 = s.charAt(0);
            if (word.charAt(count) == c1){
                c[count] = c1;
                count++;

                for(int i = 0;i<c.length;i++){
                    System.out.print(c[i]+" ");
                }
                System.out.println();

            }
            else {
                System.out.println("Wrong");
                for(int i = 0;i<c.length;i++){
                    System.out.print(c[i]+" ");
                }
                System.out.println();
            }
        }

    }
}
