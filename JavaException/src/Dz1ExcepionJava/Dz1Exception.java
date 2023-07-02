package Dz1ExcepionJava;

import java.io.File;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Dz1Exception {

    public static void main(String[] args) {
//        String name = null;
//        System.out.println(name.length());
//        // метод 1 NullPointerException

//        Object object = new String("123");
//        File file = (File) object;
//        System.out.println(file);
        // метод 2 ClassCastException

        String number = "123qwe";
          int result = Integer.parseInt(number);
          System.out.println(result);
        // метод 3 NumberFormatException

    }
    }

