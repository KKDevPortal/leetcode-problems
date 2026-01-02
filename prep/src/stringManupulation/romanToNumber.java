package stringManupulation;

public class romanToNumber {
    public static void main(String[] args) {
        String s = "LVIII";
        int len = s.length();
        int sum = 0;

        for(int i=0; i<len; i++) {
            char ch = s.charAt(i);

            if((i+1<len) && (getValue(ch)<getValue(s.charAt(i+1)))) {
                sum = sum - getValue(ch);
            }else {
                sum = sum + getValue(ch);
            }
        }

        System.out.println("Value of " + s + " is " + sum);


    }

    /*
        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
     */
    static int getValue(char ch) {
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

}
