package id.ten.latihan.array;

public class SmallestAndBiggest {
    public static void main(String[] args) {
        printSmallAndBiggestArray(new int[]{100, 10, 1, 99, 800, 9000});
    }

    private static void printSmallAndBiggestArray(int[] ints) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int number : ints) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Biggest is "+largest);
        System.out.println("Smallest is "+smallest);
    }
}
