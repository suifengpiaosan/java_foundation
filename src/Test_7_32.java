import java.util.Scanner;

public class Test_7_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list: ");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0 ;i <list.length;i++)
            list[i] = input.nextInt();

        partition(list);

        for (int i = 0;i< list.length;i++)
            System.out.println(list[i]+"");
    }

    public static int partition(int[] list){
        int[] newlist = new int[list.length-1];
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 1;i<list.length;i++){
            if (list[i]<list[0]){
               newlist[temp1] = list[i];
               temp1++;
            }
            else {
                newlist[newlist.length-temp2-1] = list[i];
                temp2++;
            }
        }
        return 1;

    }
}
