import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        /*
            Задача 1:
            Задать целочисленный массив, состоящий из элементов 0 и 1.
            Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
            С помощью цикла и условия заменить 0 на 1, 1 на 0.
         */
        System.out.println("\nЗадача 1:");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Оригинальный массив:");
        System.out.println(Arrays.toString(arr1));
        // Замена нулей на еденицы и наоборот
        for (int i = 0; i < arr1.length; i++) {
            switch (arr1[i]) {
                case 0:
                    arr1[i] = 1;
                    break;
                case 1:
                    arr1[i] = 0;
                    break;
                default:
                    System.out.println("Что-то не так с массивом!");
                    return;
            }
        }
        System.out.println("Измененный массив:");
        System.out.println(Arrays.toString(arr1));

        /*
            Задача 2:
            Задать пустой целочисленный массив размером 8.
            С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.
         */
        System.out.println("\nЗадача 2:");
        int[] arr2 = new int[8];
        //System.out.println(Arrays.toString(arr2));
        for (int i = 0, j = 0; i < arr2.length; i++, j+=3) {
            //System.out.println(i + " " + j);
            arr2[i] = j;
        }
        System.out.println(Arrays.toString(arr2));

        /*
            Задача 3:
            Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
            пройти по нему циклом, и числа меньшие 6 умножить на 2.
         */
        System.out.println("\nЗадача 3:");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Оригинальный массив:");
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i]<6) arr3[i] *= 2;
        }
        System.out.println("Измененный массив:");
        System.out.println(Arrays.toString(arr3));

        /*
            Задача 4:
            ** Создать квадратный двумерный целочисленный массив
            (количество строк и столбцов одинаковое),
            и с помощью цикла(-ов) заполнить его диагональные элементы единицами.
         */
        System.out.println("\nЗадача 4:");
        // Длинна и ширина массива
        final int arrS = 4;
        int[][] arr4 = new int[arrS][arrS];
        // System.out.println(Arrays.deepToString(arr4));
        for (int i = 0; i < arrS; i++) {
            arr4[i][i] = 1;
        }
        System.out.println("Полученная еденичная матрица:");
        System.out.println(Arrays.deepToString(arr4));
        System.out.println("Для красоты:");
        System.out.print("  ");
        for (int i = 0; i < arrS; i++) {
            for (int j = 0; j < arrS; j++) {
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
            System.out.print("  ");
        }

        /*
            Задача 5:
            ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
            (без помощи интернета).
         */
        System.out.println("\nЗадача 5:");
        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Оригинальный массив:");
        System.out.println(Arrays.toString(arr5));
        int minIdx = 0;
        int maxIdx = 0;
        int minNum = arr5[0];
        int maxNum = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i]<minNum) {
                minNum = arr5[i];
                minIdx = i;
            }
            if (arr5[i]>maxNum) {
                maxNum = arr5[i];
                maxIdx = i;
            }
        }
        System.out.println("Минимальное число — " + minNum +
                ". Оно идёт " + (minIdx + 1) + "-ым по счёту.");
        System.out.println("Максимальное число — " + maxNum +
                ". Оно идёт " + (maxIdx + 1) + "-ым по счёту.");



    } // main
} // class
