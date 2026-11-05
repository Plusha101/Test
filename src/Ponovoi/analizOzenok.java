package Ponovoi;

public class analizOzenok {
    public static void main(String[] args) {
        int[] grades = {85, 42, 91, 67, 55, 78, 34, 90, 61, 73};

        int maxScore = grades[0];
        int minScore = grades[0];
        int sum = 0;
        int countPassed = 0;
        boolean AllPassed = true;

        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (grade > maxScore) {
                maxScore = grade;
            }
            if (grade < minScore) {
                minScore = grade;
            }
            sum = sum + grade;

            if (grade >= 60) {
                countPassed++;
            } else {
                AllPassed = false;
            }
        }

        int average = sum / grades.length;

        System.out.println("Максимальная оценка: " + maxScore);
        System.out.println("Минимальная оценка: " + minScore);
        System.out.println("Средняя оценка: " + average);
        System.out.println("Сдали экзамен: " + countPassed + " из " + grades.length);
        System.out.println("Весь класс сдал: " + AllPassed);
    }
}
