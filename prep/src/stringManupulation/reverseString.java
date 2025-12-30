package stringManupulation;

public class reverseString {
    /*
    Input: ['h','e','l','l','o']
    Output: ['o','l','l','e','h']
    */
    public static void main(String[] args) {
        String str = "hello";

        String[] splitStr = str.split("");

        String revStr = "";
        for(int i=splitStr.length-1;i>=0; i--) {
            revStr += "" + splitStr[i];
        }

        if(revStr.equalsIgnoreCase(str))

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + revStr);



    }
}
