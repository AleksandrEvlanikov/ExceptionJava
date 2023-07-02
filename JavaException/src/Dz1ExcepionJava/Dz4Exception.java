package Dz1ExcepionJava;

//    * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//    каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//    Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно:
//    При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class Dz4Exception {

    public static void differenceElementsTwoArrays2() {

        int[] arraysOne = new int[] { 1, 5, 6 ,3 };
        int[] arraysTwo = new int[] { 3, 4, 1, 0 };


        if (arraysOne.length != arraysTwo.length) {
            try {
                throw new Exception("Массивы разные");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < arraysOne.length; i++) {
            int result;
            if (arraysTwo[i] == 0) {
                throw new RuntimeException("Деление на ноль нельзя");

            }
            result = arraysOne[i] / arraysTwo[i];
            System.out.println(result);
        }
    }
}
