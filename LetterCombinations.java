// Full version for self testing
import java.util.*;

public class LetterCombinations {
    public static void main(String args[]) {
        LetterCombinations lc = new LetterCombinations();
        // Test
        List<String> result = lc.letterCombinations("2");
    }


    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits == null || digits.length() == 0 || digits.equals("")) return result;
        result.add("");
        
        Map<Character, String[]> map = new HashMap<Character, String[]>();
        map.put('0', new String[]{""});
        map.put('1', new String[]{""});
        map.put('2', new String[]{"a", "b", "c"});
        map.put('3', new String[]{"d", "e", "f"});
        map.put('4', new String[]{"g", "h", "i"});
        map.put('5', new String[]{"j", "k", "l"});
        map.put('6', new String[]{"m", "n", "o"});
        map.put('7', new String[]{"p", "q", "r", "s"});
        map.put('8', new String[]{"t", "u", "v"});
        map.put('9', new String[]{"w", "x", "y", "z"});
        
        //String[][] map = {{""}, {""}, {"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, {"j", "k", "l"}, {"m", "n", "o"}, {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}};
        for (int i = 0; i < digits.length(); i++) {
            String[] temp = map.get(digits.charAt(i));
            List<String> prev = result;
            List<String> cur = new ArrayList<String>();
            for (String s1: prev) {
                for (String s2: temp) {
                    cur.add(s1+s2);
                }
            }
            result = cur;
        }
        return result;
    }
}