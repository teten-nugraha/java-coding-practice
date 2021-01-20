package id.ten.latihan.array;

public class RotateArray {
    public static void main(String[] args) {
        final int[]inputs = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        final int k = 4;

        System.out.println("Before ");
        for (int input : inputs) {
            System.out.print(input+" ");
        }

//        int[]rotateArrayLeft = rotateLeft2(inputs, k);
//
//        System.out.println("After ");
//        for (int input : rotateArrayLeft) {
//            System.out.print(input+" ");
//        }

        int[]rotateArrayRight = rotateRight2(inputs, k);

        System.out.println("After ");
        for (int input : rotateArrayRight) {
            System.out.print(input+" ");
        }
    }

    private static int[] rotateLeft(int[] inputs, int count) {
        for(int i=0; i < count; i++) {

            // ambil nilai pertama
            int first = inputs[0];

            for(int j=0; j < inputs.length-1; j++) {
                inputs[j] = inputs[j+1];
            }

            // simpan nilai first ke tempat paling akhir array
            inputs[inputs.length-1] = first;
        }
        return inputs;
    }

    private static int[] rotateLeft2(int[] inputs, int count) {
        for (int i = 0; i < count; i++) {
            // ambil nilai pertama
            int temp = inputs[0];
            for (int j = 0; j < inputs.length-1; j++) {
                inputs[j] = inputs[j+1];
            }

            // simpan nilai temp ke array terakhir
            inputs[inputs.length-1] = temp;
        }
        return inputs;
    }

    private static int[] rotateRight(int[] inputs, int count) {
        for (int i = 0; i < count; i++) {

            // ambil nilari array terakhir
            int nilaiTerakhir = inputs[inputs.length-1];

            for (int j = inputs.length-1; j > 0; j--) {
                inputs[j] = inputs[j-1];
            }

            // simpan nilaiTeakhir ke dalam array pertama
            inputs[0] = nilaiTerakhir;
        }
        return inputs;
    }

    private static int[] rotateRight2(int[] inputs, int count) {
        for (int i = 0; i < count; i++) {
            // ambil nilai array terakhir
            int lastValue = inputs[inputs.length-1];

            for (int j = inputs.length-1; j > 0; j--) {
                inputs[j] = inputs[j-1];
            }

            // simpan lastValue ke array pertama
            inputs[0] = lastValue;
        }
        return inputs;
    }
}
