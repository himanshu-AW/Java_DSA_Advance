public class SubstringComparion{
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        
       
        for(int left = 0,right=k;left<s.length()-k && right<s.length();left++,right++){
            String s1 = s.substring(left,right);
            String s2 = s.substring(right,right+k);
            if(s1.charAt(0)>s2.charAt(0) ){
                // first case when largest is empty
                if(largest==null && smallest==null){
                     largest=s1;
                     smallest=s2;
                }
                else if(s1.charAt(0)>largest.charAt(0)){
                    largest=s1;
                }
            }else{
                 if(largest==null && smallest==null){
                     smallest=s1;
                     largest=s2;
                }
                else if(s1.charAt(0)<smallest.charAt(0)){
                    smallest=s1;
                }
            }
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        String[] arr = {"YES", "leading", "spaces", "are", "valid", "problemsetters", "are", "evillllll"};
        String temp = "";
        
        for (String x : arr) {
            temp += x+" " ;// This adds each element of arr separated by space
        }
        
        System.out.println(temp);
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}