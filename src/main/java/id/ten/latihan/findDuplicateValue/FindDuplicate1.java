package id.ten.latihan.findDuplicateValue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicate1 {
    public static void main(String[] args) {
        final String input = "unana";
        findDuplicate(input);
    }

    private static void findDuplicate(String input) {
        if(input == null || input.isEmpty())
            System.out.println("value is empty");

        char[]values = input.toCharArray();
        HashMap<Character, Integer> maps = new HashMap<>();
        for (char c: values) {
            if(maps.containsKey(c)) {
                // update
                maps.put(c, maps.get(c)+1);
            }else{
                // create
                maps.put(c, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> lll = maps.entrySet();
        for (Map.Entry<Character, Integer> temp: lll) {
            if(temp.getValue() > 1) {
                System.out.print(" "+ temp.getKey());
            }
        }
    }
}
