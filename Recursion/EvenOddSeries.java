public class EvenOddSeries {
    static void series(int n){
        if(n==0) return;

        series(n-1);
        if(n%2!=0){ //odd series
            System.out.print(n + " ");
        }
        else{ //even series
            System.out.print("-"+n + " ");
        }
    }
    public static void main(String[] args) {
        series(15);
    }
}
