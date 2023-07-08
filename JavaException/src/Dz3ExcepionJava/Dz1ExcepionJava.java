package Dz3ExcepionJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Dz1ExcepionJava{


    private String surname;
    private String firstName;
    private String patronymic;
    private String dateOfBirth;
    private long phoneNumber;
    private char gender;

    public Dz1ExcepionJava(String surname, String firstName, String patronymic, String dateOfBirth, long phoneNumber, char gender) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public void saveToFile() {
        String fileName = surname + ".txt";
        try (BufferedWriter writer = new BufferedWriter( new FileWriter(fileName, true))) {
            writer.write(surname + " " + firstName + " " + patronymic + " " + dateOfBirth + " " + phoneNumber + " "
            + gender);
            writer.newLine();
            System.out.println("Данные записаны в файл. " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи.");
            throw new RuntimeException(e);
        }
    }
    public static boolean checkNameFormat(String text) {
        String regex = "^[a-zA-Z\\-]{2,}$";
        return text.matches(regex);
    }
}
