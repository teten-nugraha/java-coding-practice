package id.ten.latihan.leetcode.easy.Array;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInArray {
    public static void main(String[] args) {
        printMissingNumber(new int[]{1, 2, 3, 5, 6}, 6);
    }

    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(6);

        for (int number : numbers) {
            bitSet.set(number - 1);
        }

        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                Arrays.toString(numbers), count);
        int lastMissingIndex = 0;

        for(int i=0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }
}
