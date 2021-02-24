package lesson6;

import java.util.Arrays;

public class Split {

    public static void main(String[] args) {
        int[] array = {4, 2, 4, 0, 5, 5};
        arraySplit(array);
        int[] arrayOneAndFour = {1, 4, 4, 4, 4, 4};
        System.out.println();
        System.out.println(arrayOneAndFour(arrayOneAndFour));
    }

    public static boolean arrayOneAndFour(int[] arrayOneAndFour) {

        for (int i = 0; i < arrayOneAndFour.length; i++) {
            if (arrayOneAndFour[i] != 1 && arrayOneAndFour[i] != 4) {
                return false;
            }
        }

        int firstElement = arrayOneAndFour[0];

        for (int i = 1; i < arrayOneAndFour.length; i++) {
            if (arrayOneAndFour[i] != firstElement){
                return  true;
            }
        }return false;
    }

    public static int[] arraySplit(int[] array) {

        System.out.println("Входной массив: " + Arrays.toString(array));

        int index = -1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            throw new RuntimeException("Число 4 отсутствует");
        }

        int[] newArray = new int[array.length - 1 - index];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[index + 1];
            index++;
        }

        System.out.println("Новый массив: " + Arrays.toString(newArray));
        return newArray;
    }
}
