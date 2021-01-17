package id.ten.latihan.leetcode.easy.Array;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberArray2 {
    public static void main(String[] args) {
//        printMissingNumber(new int[]{1, 2, 3, 5, 6}, 6);
        printMissingNumber(new int[]{1, 2, 3, 4, 5, 6, 8, 9}, 9);
    }

    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for (int i : numbers) {
            bitSet.set(i - 1);
        }

        int lastMissingIdx = 0;
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                Arrays.toString(numbers), count);

        for (int i = 0; i < missingCount; i++) {
            lastMissingIdx = bitSet.nextClearBit(i);
            System.out.println(++lastMissingIdx);
        }

    }
}
