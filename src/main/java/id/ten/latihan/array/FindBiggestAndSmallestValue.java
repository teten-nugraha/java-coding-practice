package id.ten.latihan.array;

public class FindBiggestAndSmallestValue {
    public static void main(String[] args) {
        printSmallAndBiggestArray(new int[]{100, 10, 1, 99, 800, 9000});
    }

    private static void printSmallAndBiggestArray(int[] ints) {
        if(ints == null || ints.length > 0) {
            System.out.println("Array is empty");
        }

        int max_value =  ints[0];
        int min_value =  ints[0];

        for(int i=1; i < ints.length; i++) {
            if(ints[i] < min_value) {
                min_value = ints[i];
            }
            if(ints[i] > max_value) {
                max_value = ints[i];
            }
        }

        System.out.println("Min Value is "+ min_value);
        System.out.println("Max Value is "+ max_value);
    }
}
