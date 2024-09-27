public class ArrayDiff {

//    Написать метод, который принимает на вход массив целых чисел и возвращает разницу между суммой
//    элементов, находящихся под чётными
//    индексами и суммой элементов, находящихся под нечётными индексами.
//        Например, для массива [4, 11, 5, -6, 8] результат будет (4 + 5 + 8) - (11 + (-6)) = 12
//
//    Проверить работу метода для массивов чётного и нечётного размера, а также для массивов
////    размера 1 и пустого массива. Для пустого должен
//    возвращаться результат 0.


        public static int arrayDifference(int[] arr) {

            int sumEven = 0;
            int sumOdd = 0;

            if (arr.length == 0) {
                return 0;
            }


            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    sumEven += arr[i];
                } else {
                    sumOdd += arr[i];
                }
            }

            return sumEven - sumOdd;
        }

        public static void main(String[] args) {

            int[] array1 = {4, 11, 5, -6, 8};
            int[] array2 = {3, 1, 4, 1, 5, 9};
            int[] array3 = {1};
            int[] array4 = {};

            System.out.println(arrayDifference(array1));
            System.out.println(arrayDifference(array2));
            System.out.println(arrayDifference(array3));
            System.out.println(arrayDifference(array4));
        }
    }


