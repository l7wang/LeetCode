public class Solution {
    public int myAtoi(String str) {
        if (str.length() == 0) return 0;
        
        String temp = str.trim();
        boolean negative = false;
        boolean shift = false;
        double result = 0;
        
        if (temp.charAt(0) == '+' || temp.charAt(0) == '-') {
            negative = temp.charAt(0) == '-' ? true : false;
            shift = true;
        }
        
        for (int i = shift == true ? 1 : 0; i < temp.length(); i++) {
            if (!Character.isDigit(temp.charAt(i))) {
                if (negative) result = -result;
                return (int)result;
            }
            result = result*10 + temp.charAt(i) - '0';
        }
        
        if (negative) result = -result;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        
        return (int)result;
    }
}