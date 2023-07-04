package Dz2ExcepionJava;

import java.util.InputMismatchException;
import java.util.Scanner;

//   Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//   и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
//   необходимо повторно запросить у пользователя ввод данных.
public class Dz1Exception {

    public static void askingUserFractionalNumber() {
        try {
            System.out.println("Введите дробное число. ");
            Scanner scanner = new Scanner(System.in);
            float number = scanner.nextFloat();
            System.out.println(number);

        } catch (InputMismatchException e) {
            askingUserFractionalNumber();
        }

    }
}