public class RemoveAllOccuranceOfSubString {
    public static String removeOccurrences(String s, String part) {
        if (!s.contains(part)) return s;
        s = s.replaceFirst(part, "");
        return removeOccurrences(s, part);
    
        // while (s.contains(part)) {
        //      s = s.replaceFirst(part, ""); 
        // }
        // return s;
        
    }
    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
        System.out.println(removeOccurrences("axxxxyyyyb", "xy"));
    }
}
