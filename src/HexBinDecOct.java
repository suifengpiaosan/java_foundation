public class HexBinDecOct {
    public static void main(String[] args) {
        String hex = "A1";

        System.out.println(HexToDecimal(hex));


    }
    private static int HexToDecimal(String hex){
        int decimal = 0;
        for (int i = 0;i<hex.length();i++){
            decimal += decimal*16 + hexCharToDecimal(hex.charAt(i));
        }
        return decimal;
    }
    private static int hexCharToDecimal(char ch) {
        if (ch>= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
