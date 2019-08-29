public class VarArgsDemo {
    public static void main(String[] args) {

    }
    private static void printMax(double...numbers){
        if (numbers.length==0){
            System.out.println("No args");
            return;
        }
        double result = numbers[0];

        for (int i =1;i<numbers.length;i++){
            if (numbers[i]>result)
                result = numbers[i];
        }

    }
}
