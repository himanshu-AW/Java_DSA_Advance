package BackTracking;

public class RateInMaze {
    public static boolean isSafe(int[][] maze, int i, int j, int n){
        if(i>=0 && i<n && j>=0&&j<n && maze[i][j]==1){
            return true;
        }else{
            return false;
        }
    }
    public static boolean solveMaze(int[][]maze, int[][]output, int i, int j ,int n){
        // Base Case
        if(i==n-1 && j==n-1 && maze[i][j]==1){
            return true;
        }

        if(isSafe(maze,i,j,n)){
            if(output[i][j]==1){
                return true;
            }
            output[i][j] = 1;
            // for forword direaction
            if(solveMaze(maze, output, i, j+1, n)){
                return true;
            }
            // for downward direaction
            if(solveMaze(maze, output, i+1,j,n)){
                return true;
            }
            // while we dont found any path then Backward direaction
            output[i][j] = 0;
            return false;
        }else{
            return false;
        }
    }
    public static void printOutput(int[][] output){
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int maze[][] = {{ 1, 0, 0, 0 },
        //                 { 1, 1, 0, 1 },
        //                 { 0, 1, 0, 0 },
        //                 { 1, 1, 1, 1 }};
        // int n=maze.length;
        // int output[][] = new int[n][n];
        // if(solveMaze(maze,output,0,0,n)){
        //     printOutput(output);
        // }else
        // {
        //     System.out.println("Soulution does not exist:");
        // }

        // int digit=4;
        // System.out.println(digit+ " is of type " + ((Object)digit).getClass().getSimpleName()); 
        
        int a = 1;
        System.out.println(a+ " is of type " + ((Object)a).getClass().getSimpleName()); 
        char b = (char) (a+48);
        System.out.println(b+ " is of type " + ((Object)b).getClass().getSimpleName()); 
      
        
        // int c = '1';
        // char d = (char) c;
        // System.out.println(d+ " is of type " + ((Object)d).getClass().getSimpleName()); 
        // // c++;
        // System.out.println(c-48+ " is of type " + ((Object)c).getClass().getSimpleName()); 

    }
}
