package id.ten.latihan.findDuplicateValue;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Coba1 {
    public static void main(String[] args) {
        final String input= "Unana";
        printDuplicate(input);
    }

    private static void printDuplicate(String input) {
        if(Objects.isNull(input) || input.isEmpty()) {
            return;
        }

        final char[] chars = input.toCharArray();
        Map<Character, Integer> result = new HashMap<Character, Integer>();
        for(Character c: chars) {
            if(result.containsKey(c)) {
                result.put(c, result.get(c)+1);
            }else{
                result.put(c, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entryset = result.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", input);
        for(Map.Entry<Character, Integer> entry: entryset) {
            if(entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
}
