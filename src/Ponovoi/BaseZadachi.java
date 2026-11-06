
package IzGita.src.Ponovoi;

public class BaseZadachi {

    // Объявление переменных типа int
    int x = 15;
    int y = 20;

    // Присваивание значения переменной типа double
    double PI = 3.14;

    // Сложение двух чисел
    int c = x + y;

    // Соединение двух строк
    String a = "privet";
    String b = " privet!";

    String string = a + b;

    // Однострочный комментарий

    /*
       Многострочный комментарий.
       Он может занимать несколько строк.
    */

    // Определение всех примитивных типов
    int h = 1;
    boolean isJava = true;
    short sh = 15300;
    long lo = 10000000L;
    float fl = 4.3f;
    double g = 5.232543;
    char letter = 'A';
    byte by = 127;

    // Метод выводит Hello, World!
    public static void printHello() {
        System.out.println("Hello, World!");
    }

    // Метод принимает два числа и возвращает их сумму
    public static int sum(int p, int r) {
        return p + r;
    }

    public static void main(String[] args) {

        // Вызов метода printHello
        printHello();

        // Цикл выводит числа от 1 до 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Вызов метода sum
        int result = sum(3, 4);
        System.out.println("Сумма: " + result);

        // Вызов make и year из класса Car
        Car myCar = new Car();
        myCar.make = "BMW";
        myCar.year = 1998;

        myCar.displayInfo();

//        Использование методов класса String,
//таких как length().
//Задание: Выведите длину строки "Hello, world!".

        String hello = "Hello, world!";

        int count = 0;

        for (int i = 0; i < hello.length(); i++) {
        count++;
        }
        System.out.println(count);

//      Или проще
        String hel = "Hello, world!";

        System.out.println(hel.length());


//      Преобразование всех символов строки в
//      верхний регистр.
//      Задание: Преобразуйте строку "hello, world" в верхний регистр.

        System.out.println(hello.toUpperCase());


    }
}
