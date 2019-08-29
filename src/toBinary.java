import java.util.Scanner;

public class toBinary {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int value_l = scan.nextInt();
        System.out.println(sum(10,16));
    }
    public static int sum(int i1, int i2){
        int result = 0 ;
        for(int i  = i1;i<= i2;i++){
            result +=i;
        }
        return result;
    }

}
