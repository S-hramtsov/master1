package lesson10;

import java.io.*;

public class Reading {
    public static void main(String[] args) {
        /**
         * BufferedReader - Чтение из файла путём буферризации
         * FileWriter - Запись в новый файл
         */
        try (BufferedReader br = new BufferedReader(new FileReader("test_data.txt"));
             FileWriter fw = new FileWriter("result_data.txt")) {
            String st;
            /**
             * while - Цикл на чтения и разбив на массив данных из файла
             * @param split - Деление считанных строк из файла на состовляющие массива
             * @param parseInt - Преобразование строки в целочисленное значение
             */
            while ((st = br.readLine()) != null) {
                String[] list = st.split("\\|");
                String fio = list[0];
                String gender = list[1];
                int age = Integer.parseInt(list[2]);
                String phone = list[3];
                /**
                 * Отлов данных по заданным условиям
                 * @param equals - Отлов условия эквивалентно заданному параметру
                 * @param write - запись в фаил конечный результат
                 */
                if (gender.equals("М") && age >= 65 || gender.equals("Ж") && age >= 60) {
                    fw.write(fio + " " + phone + "\n");
                }
            }
        } catch (IOException ex) {
            System.out.println("IO error!" + ex);
        }
    }
}
