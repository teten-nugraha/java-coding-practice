package id.ten.latihan.leetcode.easy.Array;

import java.util.HashSet;
import java.util.Set;

// from 1,1,1,2,2,3,4,4
// to 1,2,3,4
public class latihan2 {
    public static void main(String[] args) {
        Integer[]values = new Integer[]{1,1,1,2,2,3,4,4};

        int size = values.length;
        Set<Integer> unique = new HashSet<Integer>();
        for(int i=0; i < size; i++) {
            unique.add(values[i]);
        }
        System.out.println(unique.toString());

    }
}
