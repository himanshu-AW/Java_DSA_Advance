public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // int minLength = Integer.MAX_VALUE;
        // for (String str : strs) {
        //     if (str == null || str == "")
        //         return "";
        //     minLength = Math.min(minLength, str.length());
        // }
        // for (int i = 0; i < minLength; i++) {
        //     char cur = strs[0].charAt(i);
        //     for (int j = 1; j < strs.length; j++) {
        //         if (strs[j].charAt(i) != cur) {
        //             return strs[0].substring(0, i);
        //         }
        //     }
        // }
        // return strs[0].substring(0, minLength);


        // OR

        if(strs.length == 0) return "";
        String baseStr = strs[0];
        for(int i=0;i<baseStr.length();i++){
            for(int j=1; j<strs.length;j++){
                String word = strs[j];
                if(i == word.length() || baseStr.charAt(i)!=word.charAt(i)){
                    return baseStr.substring(0,i);
                }
            }
        }
        return baseStr;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
