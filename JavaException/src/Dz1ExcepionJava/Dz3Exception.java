package Dz1ExcepionJava;

import java.lang.reflect.Array;
import java.util.Arrays;

//        Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//        каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Dz3Exception {

    public static void differenceElementsTwoArrays() {
       int[] arraysOne = new int[] { 1, 5, 6 ,7, 2 };
       int[] arraysTwo = new int[] { 3, 4, 1, 2 };


        if (arraysOne.length != arraysTwo.length) {
            try {
                throw new Exception("Массивы разные");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

            for (int i = 0; i < arraysOne.length; i++) {
                   int result;
                   result = arraysOne[i] - arraysTwo[i];
                   System.out.println(result);
           }
           }
       }


