package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class a3b2c3usingmap {
    public static void main(String[] args) {
        String input = "aaabbccc";
        char[] inputCharArray = input.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : inputCharArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        map.forEach((a, b) -> {
            System.out.print(a + "" + b);
        });
    }
}
