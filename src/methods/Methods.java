package methods;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {

    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    public static void printData(float[] arrays) {
        System.out.println("Mang " + Arrays.toString(arrays));
    }

    public static float findMax2(float[] arrays) {
        float gtln = arrays[0];
        float Max2 = arrays[1];
        if (gtln < Max2) {
            float k;
            k = Max2;
            Max2 = gtln;
            gtln = k;
        }
        for (int i = 0; i < arrays.length; i++) {
            if (gtln < arrays[i]) {
                Max2 = gtln;
                gtln = arrays[i];
            } else {if (gtln!=arrays[i]&&Max2 < arrays[i]) {
                Max2 = arrays[i];
            }
            }
        }

        return Max2;
    }

    public static void deleteOddNumber(float[] arrays) {
        int k = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                k++;
            }
        }
        float[] newarrays = new float[arrays.length - k];
        int h = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                newarrays[h] = arrays[i];
                h++;
            }
        }
        System.out.println("Mang moi sau khi xoa phan tu le: " + Arrays.toString(newarrays));
    }

    public static void main(String[] args) {
        float[] arrays = new float[5];
        arrays = importData(arrays);
        printData(arrays);
        float max2 = findMax2(arrays);
        System.out.println("Gia tri lon thu 2 trong mang la: " + max2);
        deleteOddNumber(arrays);
    }
}
