import java.util.HashMap;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
     
               // Second pass: find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) {
                return i; // Return index of first unique character
            }
        }
      
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
