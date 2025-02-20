package com.company;

import java.util.Scanner;

class Reader {
    private String fullName;
    private String cardNumber;
    private String faculty;
    private String birthDate;
    private String phone;

    public Reader(String fullName, String cardNumber, String faculty, String birthDate, String phone) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public void takeBook(int bookCount) {
        System.out.println(fullName + " взял " + bookCount + " книг");
    }

    public void takeBook(String... bookNames) {
        System.out.println(fullName + " взял книг: " + String.join(", ", bookNames));
    }

    public void returnBook(int bookCount) {
        System.out.println(fullName + " вернул " + bookCount + " книг");
    }

    public void returnBook(String... bookNames) {
        System.out.println(fullName + " вернул книг: " + String.join(", ", bookNames));
    }
}

public class Main {
    private static Reader[] readers = new Reader[0]; // Начальный пустой массив

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите данные нового читателя (или 'stop' для завершения):");

            System.out.print("ФИО: ");
            String fullName = scanner.nextLine();
            if (fullName.equalsIgnoreCase("stop")) break;

            System.out.print("Номер читательского билета: ");
            String cardNumber = scanner.nextLine();

            System.out.print("Факультет: ");
            String faculty = scanner.nextLine();

            System.out.print("Дата рождения: ");
            String birthDate = scanner.nextLine();

            System.out.print("Телефон: ");
            String phone = scanner.nextLine();

            addReaders(new Reader(fullName, cardNumber, faculty, birthDate, phone));
        }

        // Пример использования методов
        if (readers.length > 0) {
            readers[0].takeBook(3);
            if (readers.length > 1) readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");
            if (readers.length > 2) readers[2].returnBook(2);
            if (readers.length > 3) readers[3].returnBook("Детектив", "Фантастика");
        }

        scanner.close();
    }

    public static void addReaders(Reader... newReaders) {
        int oldSize = readers.length;
        int newSize = oldSize + newReaders.length;

        Reader[] temp = new Reader[newSize];
        System.arraycopy(readers, 0, temp, 0, oldSize);
        System.arraycopy(newReaders, 0, temp, oldSize, newReaders.length);

        readers = temp;
    }
}
