package Dz2ExcepionJava;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;

// Если необходимо, исправьте данные коды
public class Dz2Exception {

    public static void errorCodFirstExample(){
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
            int d = 0;
            double catchedRes1;
            catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

    public static void errorCodTwoExample() {

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;

        } catch (ArithmeticException ex) {
            System.out.println("Делить на ноль нельзя.");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

        public static void printSum(Integer a, Integer b) {
            System.out.println(a + b);
        }



}
