package id.ten.latihan.leetcode.easy.Array;

public class latihan {
    public static void main(String[] args) {
        int[]values = new int[]{1,1,2,3,3,3};
        int unique = removeDuplicates(values);
        System.out.println(unique);
    }

    private static int removeDuplicates(int[] values) {
        if(values.length == 0) return 0;

        int i=0;
        for(int j=1; j < values.length; j++) {
            if(values[j] != values[i]) {
                i++;
                values[i] = values[j];
            }
        }
        return i +1;
    }
}
