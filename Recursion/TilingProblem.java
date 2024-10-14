public class TilingProblem{
    static int findWaysToArrange(int n){
        if(n==0||n==1) return 1;
        return findWaysToArrange(n-1) + findWaysToArrange(n-2);
    }
    public static void main(String[] args) {
        System.out.println(findWaysToArrange(5));
    }
}