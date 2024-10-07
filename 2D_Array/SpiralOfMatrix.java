
public class SpiralOfMatrix {

    public static void printSpiral(int matrix[][]){
        int sr=0;
        int er=matrix.length-1;
        int sc=0;
        int ec=matrix[0].length-1;

        while(sc<=ec && sr<=er){
            // top boundary
            for(int c=sc;c<=ec;c++){
                System.out.print(matrix[sr][c]+" ");
            }

            // right boundary
            for(int r=sr+1;r<=er;r++){
                System.out.print(matrix[r][ec]+" ");
            }

            // bottom boundary
            for(int c=ec-1;c>=sc;c--){
                if(sr==er) break;
                System.out.print(matrix[er][c]+" ");
            }

            // left boundary
            for(int r=er-1;r>=sr+1;r--){
                if(sc==ec) break;
                System.out.print(matrix[r][sc]+" ");
            }

            sc++;
            sr++;
            er--;
            ec--;
        }
    }

    public static void printMatrix(int matrix[][]) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        
        System.out.println("Original Matrix");
        printMatrix(matrix);
        System.out.println("Spiral Order Traversal");
        printSpiral(matrix);

    }
}
