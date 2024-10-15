public class RemoveDuplicates {
    static StringBuilder helperFunRemoveDuplicate(String str, int i, StringBuilder sb ,boolean[] map){
        if(i==str.length()-1){
            return sb;
        }
        char currentChar = Character.toLowerCase(str.charAt(i));
        if(!map[currentChar -'a']){  // character not present in map array
            map[currentChar -'a'] = true;
            sb.append(currentChar);
            return helperFunRemoveDuplicate(str, i+1, sb, map);
        }else{ // character present in map array
           return helperFunRemoveDuplicate(str, i+1, sb, map);
        }
    }
    static String removeDuplicateChar(String str){
        boolean map[] = new boolean[26];
        StringBuilder sb = new StringBuilder();

        // recursively remove duplicates
        return helperFunRemoveDuplicate(str, 0, sb, map).toString();

        //  // Iterative solution
        // for(int i=0; i<str.length(); i++){
        //     char ch = Character.toLowerCase(str.charAt(i));
        //     if(!map[ch-'a']){
        //         map[ch-'a'] = true;
        //         sb.append(ch);
        //     }
        // }
        // return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicateChar("GeekForGeek"));
        System.out.println(removeDuplicateChar("LeetCode"));
        System.out.println(removeDuplicateChar("HackerRank"));
    }
}
