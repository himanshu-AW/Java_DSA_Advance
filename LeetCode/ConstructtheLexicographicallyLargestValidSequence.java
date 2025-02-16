public class ConstructtheLexicographicallyLargestValidSequence {
            // Recursive function to solve the sequence construction
            private boolean solve(int i, int n, int[] result, boolean[] used){
                // If we have filled the entire result array, return true
                if(i >= result.length){
                    return true;
                }
        
                // If current position is already filled, move to the next one
                if(result[i] != -1){
                    return solve(i+1, n, result, used);
                }
        
                // Try placing numbers from n to 1
                for(int num = n; num >= 1; num--){
                    if(used[num]){
                        continue;
                    }
        
                    // Mark the number as used
                    used[num] = true;
                    result[i] = num;
        
                    // If num is 1, it only occupies one position
                    if(num == 1){
                        if(solve(i+1, n, result, used)){
                            return true;
                        }
                    }
                    // Otherwise, it needs to occupy two positions
                    else{
                        int j = i + num;
                        // Check if the second position is within bounds and empty
                        if(j < result.length && result[j] == -1){
                            result[j] = num;
                            if(solve(i+1, n, result, used)){
                                return true;
                            }
                            // Backtrack: Undo the choice for the second position
                            result[j] = -1;
                        }
                    }
                    
                    // Backtrack: Undo the choice for the current position
                    used[num] = false;
                    result[i] = -1;
                }
        
                // If no valid position found
                return false;
            }
            
            public int[] constructDistancedSequence(int n) {
                int[] result = new int[2 * n - 1];
                // Initialize result array with -1 
                for(int i = 0; i < result.length; i++){
                    result[i] = -1;
                }
        
                // Initialize used array with false(default)
                boolean[] used = new boolean[n + 1];
        
                // Start recursive backtracking
                solve(0, n, result, used);
        
                return result;
            }
        
            
            public static void main(String[] args) {
                ConstructtheLexicographicallyLargestValidSequence sol = new ConstructtheLexicographicallyLargestValidSequence();
        
                
                int n1 = 3;
                int n2 = 4;
                int n3 = 5;
        
                System.out.println("Result for n = " + n1 + ":");
                printArray(sol.constructDistancedSequence(n1));
                
                System.out.println("Result for n = " + n2 + ":");
                printArray(sol.constructDistancedSequence(n2));
                
                System.out.println("Result for n = " + n3 + ":");
                printArray(sol.constructDistancedSequence(n3));
            }
        
            
            public static void printArray(int[] arr) {
                for(int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        
        
    
}
