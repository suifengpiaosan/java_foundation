import java.util.Scanner;
import java.io.*;
import java.util.SplittableRandom;

public class Test_18_31 {
    //java Exercise18_31 dirName oldWord newWord
    public static void main(String[] args) {
//        System.out.println("n");
        File dir = new File(args[0]);
        Replace_word(dir,args[1],args[2]);
    }


    private  static void Replace_word (File dir,String oldWord,String newWord){

        File[] files=dir.listFiles();
        for(File file :files)
        {
            if(file.isFile())//如果是文件，则输出文件名字
            {
                try {
                    Scanner input = new Scanner(file);
                    while (input.hasNext()){
                        String s1 = input.nextLine();
                        String s2 = s1.replace(oldWord,newWord);
                        System.out.println(s2);
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }else if(file.isDirectory())//如果是文件夹，则输出文件夹的名字，并递归遍历该文件夹
            {

                Replace_word(file,oldWord,newWord);
            }
        }
    }

}


