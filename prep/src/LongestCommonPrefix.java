public class LongestCommonPrefix {
    /*
    Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
     */

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        String result = strs[0];
        for(int j=1;j<strs.length; j++) {
            result = commonstring(result, strs[j]);
        }

        System.out.println("result :: " + result);

//        String f = commonstring(s1, s2);
//        System.out.println("Common str: " + f);

    }

    static String commonstring(String s1, String s2) {
        int minLen = Math.min(s1.length(), s2.length());
        StringBuilder commStr = new StringBuilder();
        for(int i=0;i<minLen;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                commStr.append(s1.charAt(i));
            } else {
                break;
            }
        }

        return  commStr.toString();
    }
}
