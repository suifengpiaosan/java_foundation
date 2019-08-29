public class PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        PrintPrimes(NUMBER_OF_PRIMES);
    }
    private static void PrintPrimes(int count){
        int cout = 0;
        int number = 2;
        final int NUMBER_OF_PRINTS_PER_LINE = 10;
        while(cout < count){
            if(isprime(number)){
                cout++;
                if(cout%NUMBER_OF_PRINTS_PER_LINE==0){
                    System.out.println(number);
                }else {
                    System.out.print(number + " ");
                }
            }
            number++;
        }
    }
    private static boolean isprime(int num){
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;

    }
}
