package id.ten.latihan.array.again;

public class RotateRightArray {
    public static void main(String[] args) {

        final int[]inputs = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        final int k = 4;

        int[]rotateArrayRight = rotateRight(inputs, k);

    }

    private static int[] rotateRight(int[] inputs, int count) {
        for (int i = 0; i < count; i++) {
            int lastValue = inputs[inputs.length-1];

            for (int j = inputs.length-1; j >0 ; j--) {
                inputs[j] = inputs[j-1];
            }

            inputs[0] = lastValue;
        }
        return inputs;
    }
}
