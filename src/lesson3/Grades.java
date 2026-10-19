package lesson3;

public class Grades {
    public static void main(String[] args) {

        int[] grades = {85, 42, 91, 67, 55, 78, 34, 90, 61, 73};

        int maxScore = grades[0];
        int minScore = grades[0];
        int sum = 0;
        int passedClass = 0;
        boolean allPassed = true;

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
                passedClass++;
            } else {
                allPassed = false;
            }
        }

        int average = sum / grades.length;

        System.out.println("Максимальная оценка: " + maxScore);
        System.out.println("Минимальная оценка: " + minScore);
        System.out.println("Среднее оценка: " + average);
        System.out.println("Сдали экзамен: " + passedClass + " из " + grades.length);
        System.out.println("Весь класс сдал: " + allPassed);

        char[] letterGrades = new char[grades.length];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 90) {
                letterGrades[i] = 'A';
            } else if (grades[i] >= 75) {
                letterGrades[i] = 'B';
            } else if (grades[i] >= 60) {
                letterGrades[i] = 'C';
            } else {
                letterGrades[i] = 'F';
            }
        }
        System.out.println();
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i] + " -> " + letterGrades[i]);
        }
    }
}