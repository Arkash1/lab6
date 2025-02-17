package com.company;

public class Reader {
    // Поля класса
    private String fullName;
    private int ticketNumber;
    private String faculty;
    private String birthDate;
    private String phone;

    // Конструктор
    public Reader(String fullName, int ticketNumber, String faculty, String birthDate, String phone) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    // Метод для взятия книг по количеству
    public void takeBook(int bookCount) {
        System.out.println(fullName + " взял " + bookCount + " книги.");
    }

    // Метод для взятия книг по названиям
    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        System.out.println(String.join(", ", bookTitles));
    }

    // Метод для возврата книг по количеству
    public void returnBook(int bookCount) {
        System.out.println(fullName + " вернул " + bookCount + " книги.");
    }

    // Метод для возврата книг по названиям
    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        System.out.println(String.join(", ", bookTitles));
    }

    // Метод для вывода информации о читателе
    public void printInfo() {
        System.out.println("Читатель: " + fullName + ", номер билета: " + ticketNumber +
                ", факультет: " + faculty + ", дата рождения: " + birthDate + ", телефон: " + phone);
    }

}
class Main {
    public static void main(String[] args) {
        // Создаем массив из 5 объектов Reader
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Петров В. В.", 101, "Филология", "15.03.1990", "123-456-789");
        readers[1] = new Reader("Иванов И. И.", 102, "Математика", "10.05.1985", "987-654-321");
        readers[2] = new Reader("Сидоров А. А.", 103, "История", "23.06.1992", "111-222-333");
        readers[3] = new Reader("Козлов П. П.", 104, "Информатика", "30.01.1993", "444-555-666");
        readers[4] = new Reader("Морозова Е. С.", 105, "Экономика", "12.09.1991", "777-888-999");

        // Демонстрация работы методов
        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");

        readers[0].returnBook(3);
        readers[0].returnBook("Приключения", "Словарь", "Энциклопедия");

        // Вывод информации о читателях
        System.out.println("\nИнформация о всех читателях:");
        for (Reader reader : readers) {
            reader.printInfo();
        }
    }
}
