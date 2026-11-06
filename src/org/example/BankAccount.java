package org.example;

public class BankAccount {
        private String owner; // спрятано: доступно только внутри класса
        private int balance; // спрятано

    // Теперь поля owner и balance защищены: код из других классов не может ни прочитать, ни изменить их напрямую.

    // К private-полю нельзя обратиться снаружи напрямую. Такой код не скомпилируется:
    // account.balance = -1000; → ошибка: balance has private access.
    // Чтобы читать и менять приватные поля, классу нужны специальные методы — геттеры и сеттеры.
    }

