package org.example;

import org.example.car.Car;

public class Main {
    public static void main(String[] args) {
       // Cat cat = new Cat(); // создали объект-кота по классу Cat. Здесь Cat cat — это переменная типа Cat, а new Cat() создаёт сам объект.
       // cat.name = "Макс"; // задали значение поля

       // System.out.println(cat.name);

       // Cat barsik = new Cat();
        //barsik.name = "Барсик";

       // Cat murka = new Cat();
        //murka.name = "Мурка";

       //  System.out.println(barsik.name); // Барсик
       // System.out.println(murka.name);  // Мурка

        //Имена классов в Java пишут с заглавной буквы в стиле PascalCase: Cat, Library, BankAccount.
        // Если имя из нескольких слов — каждое слово с большой буквы, без подчёркиваний.
        // А вот имена переменных и полей — с маленькой (cat, userName).

        Car bmw = new Car();
        bmw.setColor("Red");
        bmw.setModel("Bmw");


        Car audi = new Car();
        audi.setColor("Black");
        audi.setModel("Audi");

        String str = "Test";
        str.toUpperCase();

        System.out.println(bmw.getInfo());
        System.out.println(audi.getInfo());
    }
}