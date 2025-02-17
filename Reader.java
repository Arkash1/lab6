package com.company;

public class Reader {
    //поля класса
    private String fullName;
    private int ticketNumber;
    private String faculty;
    private String birthDate;
    private String phone;

    public Reader(String fullName, int ticketNumber, String faculty, String birthDate, String phone) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }
    //взятие книг по количеству
    public void takeBook(int bookCount) {
        System.out.println(fullName + "взял" + bookCount + "книги.");
    }

    //взятие книг по названию
    public void takeBook(String...bookTitles) {
        System.out.print(fullName + "взял книги: ");
        System.out.println(String.join(",", bookTitles));
    }

    //возврат книг по количеству
    public void returnBook(int bookCount) {
        System.out.println(fullName + " вернул " + bookCount + "книги.");
    }

    //возврат книг по названию
    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        System.out.println(String.join(",", bookTitles));
    }

    //информация о читателе
    public void printInfo() {
        System.out.println("Читатель: " + fullName + ", номер билета: " + ticketNumber + ", факультет: " + faculty + ", дата рождения: " + birthDate + ", телефон: " + phone);
    }



    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Петров В.В.", 101, "Филология", "15.03.1990", "123-456-789");
        readers[1] = new Reader("Иванов И.И.", 102, "Математика", "10.05.1985", "987-654-321");
        readers[2] = new Reader("Сидоров А.А.", 103, "История", "23.06.1992", "111-222-333");
        readers[3] = new Reader("Козлов П.П.", 104, "Информатика", "30.01.1993", "444-555-777");
        readers[4] = new Reader("Морозова Е.М.", 105, "Экономика", "12.09.1991", "000-888-999");

        //Работа методов
        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");

        readers[0].returnBook(3);
        readers[0].returnBook("Приключения", "Словарь", "Энциклопедия");

        System.out.println("\nИнформация о всех читателях:");
        for(Reader reader : readers) {
            reader.printInfo();
        }

    }
}
