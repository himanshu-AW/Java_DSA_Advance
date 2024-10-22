package BackTracking;

public class SubsetOFStr {
    private static void subsets(String str, StringBuilder ans, int i){
        // base case
        if(i == str.length()){
            if(ans.length() == 0) 
            System.out.println("null");
            else
            System.out.println(ans);
            return;
        }
        // kaam 
        // not considered current character
        subsets(str, ans, i+1);
        // consider current character
        ans.append(str.charAt(i));
        subsets(str, ans, i+1);
        // remove current character
        ans.deleteCharAt(ans.length()-1);

    }
    public static void findSubsets(String str){
        subsets(str, new StringBuilder(), 0);
        return;
    }
    public static void main(String[] args) {
        findSubsets("abc");
    }
}
