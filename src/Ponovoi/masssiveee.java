package Ponovoi;

public class masssiveee {
    public static void main(String[] args) {
        int[] number = {34, 43, 21, 54};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }

        System.out.println("Сумма: " + sum);
    }
}
