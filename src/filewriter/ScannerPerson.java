package filewriter;

import java.util.Scanner;

public class ScannerPerson {
    private Scanner s = new Scanner(System.in);

    private final Person person;

    public ScannerPerson(Person person) {
        this.person = person;
    }

    public void fillSecondSurname() {
        System.out.println("Ведите фамилию: ");
        String rawSurname = s.nextLine();
        if (!TextValidation.checkFIO(rawSurname)) {
            fillSecondSurname();
        }
        person.setSurname(rawSurname);
    }

    public void fillFirstName() {
        System.out.println("Введите имя: ");
        String rawFirstName = s.nextLine();
        if (!TextValidation.checkFIO(rawFirstName)) {
            fillFirstName();
        }
        person.setName(rawFirstName);
    }

    public void fillFirstPatronymic() {
        System.out.println("Введите отчество: ");
        String rawFirstPatronymic = s.nextLine();
        if (!TextValidation.checkFIO(rawFirstPatronymic)) {
            fillFirstPatronymic();
        }
        person.setPatronymic(rawFirstPatronymic);
    }

    public void fillAge() {
        boolean isValid = true;
        while (isValid) {
            try {
                System.out.println("Введите возраст: ");
                String rawAge = s.nextLine();
                int age = Integer.parseInt(rawAge);
                if (age > 0 && age <= 120) {
                    person.setAge(rawAge);
                    isValid = false;
                } else {
                    System.out.println("Ошибка валидации возраста");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число");
            }
        }
    }

    public void closeScan() {
        s.close();
    }
}

