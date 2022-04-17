package HomeWork;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        ScannerPerson personScanner = new ScannerPerson(person);
        personScanner.fillSecondSurname();
        personScanner.fillFirstName();
        personScanner.filleFirstPatronymic();
        personScanner.fillAge();
        personScanner.closeScan();

        FileWriter fileWriter = new FileWriter();
        fileWriter.writePersonToFile(person);


    }
}
