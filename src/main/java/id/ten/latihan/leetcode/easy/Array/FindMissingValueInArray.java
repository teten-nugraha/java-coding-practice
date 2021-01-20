package id.ten.latihan.leetcode.easy.Array;

import java.util.BitSet;

/**
 * dalam hal ini value dalam array nya harus sudah terurut
 */
public class FindMissingValueInArray {
    public static void main(String[] args) {
        printMissingNumber(new int[]{1,2,4}, 4);
    }

    private static void printMissingNumber(int[] ints, int count) {
        int missingCount = count - ints.length;

        BitSet bitSet = new BitSet(count);
        for (int i: ints) {
            bitSet.set(i-1);
        }

        int missingIndex = 0;
        for (int i=0; i < missingCount; i++) {
            missingIndex = bitSet.nextClearBit(i);
            System.out.println(++missingIndex);
        }
    }

    private static void printMissingNumber2(int[] ints, int count) {
        int missingCount = count - ints.length;

        BitSet bitSet = new BitSet(count);
        for(int i: ints) {
            bitSet.set(i-1);
        }

        int lastMissingValue=0;
        for (int i = 0; i < missingCount; i++) {
            lastMissingValue = bitSet.nextClearBit(i);
            System.out.println(--lastMissingValue);
        }
    }
}
