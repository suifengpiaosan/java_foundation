package chapter13;

import java.util.ArrayList;

public class Test_13_2 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();
        list.add(15);
        list.add(12);
        list.add(13);
        list.add(11);
        list.add(5);
        list.add(1);
        shuffle(list);
        for (int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }

    }
    public static void shuffle(ArrayList<Number> list){
        for (int i = 0;i<list.size() -1 ;i++){
            int index = (int)(Math.random()*list.size());
            Number temp = list.get(i);
            list.set(i,list.get(index));
            list.set(index,temp);
        }
    }
}
