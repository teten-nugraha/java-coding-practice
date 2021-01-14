package id.ten.latihan.findDuplicateValue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Coba2 {
    public static void main(String[] args) {
        final String input = "Jokowi";
        printDuplicateValue(input);
    }

    private static void printDuplicateValue(String input) {
        if((input == null) || (input.isEmpty())) return;

        final char[] chars = input.toCharArray();

        Map<Character, Integer> temp = new HashMap<Character, Integer>();
        for(Character c: chars) {
            if(temp.containsKey(c)) {
                temp.put(c, temp.get(c) + 1);
            }else{
                temp.put(c, 1);
            }
        }

        // loop for result
        Set<Map.Entry<Character, Integer>> entrySet = temp.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", input);
        for(Map.Entry<Character, Integer> entry: entrySet) {
            if(entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
}
