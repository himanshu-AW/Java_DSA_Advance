package BackTracking;

public class GridWays {
    public static int findGridWays(int n,int m,int i, int j){
        if(i==n-1 && j==m-1){  //condition for last cell
            return 1;
        }else if(i==n || j==m){ //condition for crossing boundary
            return 0;
        }
        return findGridWays(n, m, i+1, j) + findGridWays(n, m, i, j+1);
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(findGridWays(n,m,0,0));
    }
}
