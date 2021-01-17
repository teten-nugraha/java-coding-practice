package id.ten.latihan.findDuplicateValue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Coba3 {
    public static void main(String[] args) {
        int[]numbers = new int[]{1,1,2,2,3,4,5};
        printDuplicateValues(numbers);
    }

    private static void printDuplicateValues(int[] numbers) {
        int count = numbers.length;

        Map<Integer, Integer> result = new HashMap<>();

        for(int i: numbers) {
            if(result.containsKey(i)) {
                // update
                result.put(i, result.get(i)+1);
            }else{
                //create
                result.put(i, 1);
            }
        }

        // print
        Set<Map.Entry<Integer, Integer>> sets = result.entrySet();
        for(Map.Entry<Integer, Integer> entry: sets){
            if(entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
}
