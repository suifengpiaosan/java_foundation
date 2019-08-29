public class array_func {
    public static void main(String[] args) {
        int[] buf = {1,20,31,4};
        printValueOfArray(getMaxValueOfArray(buf));

    }
    private static int[] getMaxValueOfArray(int[] args){

        int[] result = new int[2];
        for(int i = 0 ;i<args.length;i++){
            if(args[i] > result[0]){
                result[0] = args[i];
                result[1] = i;
            }
        }
        return result;
    }
    private static void printValueOfArray(int[] args){
        for (int value:args
             ) {
            System.out.print(value + " ");
        }
    }
}
