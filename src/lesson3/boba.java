package lesson3;

public class boba {
    public static void main(String[] args) {

    String[] names = {"alice", "BOB", "  Charlie  ", "david123", "Eva", "FRANK", "", "grace"};
    int validCount = 0;

    for (String name : names) {
        String cleaned = name.trim();

        if (cleaned.isEmpty()) {
            System.out.println("(пустое имя пропущено)");
            continue;
        }

        String firstLetter = cleaned.substring(0, 1).toUpperCase();
        String restLetters = cleaned.substring(1).toLowerCase();
        String formatted = firstLetter + restLetters;

        boolean hasDigits = false;
        for (int i = 0; i < cleaned.length(); i++) {
            char c = cleaned.charAt(i);
            if (c >= '0' && c <= '9') {
                hasDigits = true;
                break;
            }
        }

        if (hasDigits) {
            System.out.println(formatted + " - ОШИБКА: содержит цифры");
        } else {
            System.out.println(formatted + " - OK");
            validCount++;
        }
    }

    System.out.println("Валидных имён: " + validCount);
}
}

