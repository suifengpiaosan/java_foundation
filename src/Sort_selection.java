public class Sort_selection {
    public static void main(String[] args) {
        double buf[] = {19,20.1,3,4,5.1};
        selectionsort(buf);


    }
    private static void printValueOfArray(double[] args){
        for (double value:args
        ) {
            System.out.print(value + " ");
        }


    }
    public static void selectionsort(double[] list){
        double temp = 0;
        for(int i = 0;i < list.length;i++){
            for (int y = i;y < list.length;y++){
                if(list[y]<list[i]) {
                    temp = list[i];
                    list[i] = list[y];
                    list[y] = temp;
                }
            }
        }
        printValueOfArray(list);
    }


}
