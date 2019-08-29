public class sum_list {
    public static void main(String[] args) {
        int NUM = 97;
        float SUM= 0;
        for(int i=0;1+i*2<=NUM;i++){
            SUM+=(float)(1+i*2)/(float)(3+i*2);
        }
        System.out.println(SUM);
    }

}
