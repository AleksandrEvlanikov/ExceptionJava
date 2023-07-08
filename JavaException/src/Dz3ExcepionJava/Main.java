package Dz3ExcepionJava;

import java.util.Scanner;

import static Dz3ExcepionJava.Dz1ExcepionJava.checkNameFormat;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в формате через пробел: Фамилия Имя Отчество датарождения номертелефона пол");
        String inputData = scanner.nextLine();

        String[] dataParts = inputData.split(" ");
        if (dataParts.length != 6) {
            System.out.println("Неверное количество данных.");
            System.exit(1);
        }

         String surname = dataParts[0];
         String firstName = dataParts[1];
         String patronymic = dataParts[2];
         String dateBirth = dataParts[3];
         long numberTell = 0;
         char gender = 0;

        try {
            numberTell = Long.parseLong(dataParts[4]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат номера телефона.");
            System.exit(1);
        }

        if (dataParts[5].length() != 1 || (!dataParts[5].equals("f") && !dataParts[5].equals("m"))) {
            System.out.println("Неверный формат пола.");
            System.exit(1);
        }else {
            gender = dataParts[5].charAt(0);
        }
        if (!checkNameFormat(surname) || !checkNameFormat(firstName) || !checkNameFormat(patronymic)) {
            System.out.println("Неверный формат фамилии, имени или отчества.");
            System.exit(1);
        }


        Dz1ExcepionJava person = new Dz1ExcepionJava(surname, firstName, patronymic, dateBirth, numberTell, gender);

        person.saveToFile();
        scanner.close();




    }
}
