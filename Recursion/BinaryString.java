public class BinaryString {
    private static void printBinaryStrHelper(int n, int lastDigit,String binaryStr) {
        if(n==0) {
            System.out.println(binaryStr);
            return;
        }
        printBinaryStrHelper(n-1, 0, binaryStr+"0");
        if(lastDigit == 0){
            printBinaryStrHelper(n-1,1,binaryStr+"1");
        }
    }
    public static void printBinaryStr(int n) {
       printBinaryStrHelper(n,0,"");
    }
    public static void main(String[] args) {
        System.out.println("++++++ BINARY STRING +++++++++");
       printBinaryStr(3);
    //    printBinaryStr(4);
    }
}