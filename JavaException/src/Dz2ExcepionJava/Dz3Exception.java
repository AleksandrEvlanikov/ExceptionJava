package Dz2ExcepionJava;
//   Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//   Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dz3Exception {
    public static void errorEmptyLine() {
            System.out.println("Введите строку. ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("") | input.equals(" ")) {
                try {
                    throw new Exception("Пустую строку вводить нельзя");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Вы вели " + input);
            }
    }
}
