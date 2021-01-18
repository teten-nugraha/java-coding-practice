package id.ten.latihan.array;

//input: [1, 2, 3, 4, 5, 6, 7, 8]

//        first output: [5, 6, 7, 8, 1, 2, 3, 4]
//        second output: [1, 2, 3, 4, 5, 6, 7, 8]

public class RotateArrayLeftAndRight {
    public static void main(String[] args) {

        final int[]inputs = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        final int k = 4;

        int[]rotateArrayLeft = rotateLeft(inputs, 4);
        int[]rotateArrayRight = rotateRight(rotateArrayLeft, 4);
    }

    private static int[] rotateRight(int[] inputs, int numOfRotations) {
        for (int i = 0; i < numOfRotations; i++) {

            // take out the last element
            int temp = inputs.length - 1;
            for (int j = inputs.length - 1; j > 0; j--) {

                // shift array elements towards right by one place
                inputs[j] = inputs[j - 1];
            }
            inputs[0] = temp;
        }
        return inputs;
    }

    private static int[] rotateLeft(int[] input,  int numOfRotations) {
        for (int i = 0; i < numOfRotations; i++) {

            // take out the first element
            int temp = input[0];
            for (int j = 0; j < input.length - 1; j++) {

                // shift array elements towards left by 1 place
                input[j] = input[j + 1];
            }
            input[input.length - 1] = temp;
        }
        return input;
    }
}
