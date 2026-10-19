package lesson3;

public class Strings {
    public static void main(String[] args) {


//        String text = " Hello ";

//        System.out.println(text.trim());
//        System.out.println(text.toLowerCase());
//        System.out.println(text.toUpperCase());
//        System.out.println(text.isEmpty());
//        System.out.println(text.length());
//        System.out.println(text.trim().charAt(0));
//        System.out.println(text.substring(0, 3));

//        String name = "aleksey";
//        String name1 = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
//        System.out.println(name1);

//        int result = sum(3, 5);
//        System.out.println(result);
//        System.out.println(sum(10, 20));


//    public static int sum(int a, int b) {
//        return a + b;

        String[] names = {"alice", "BOB", "  Charlie  ", "david123", "Eva", "FRANK", "", "grace"};

        int validCount = 0;

        for (String name : names) {
            name = name.trim();

            if (name.isEmpty()) {
                System.out.println("пустое имя пропущено");
            } else {
                String result = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

                boolean hasDigits = false;
                for (int i = 0; i < name.length(); i++) {
                    char ch = name.charAt(i);
                    if (Character.isDigit(ch)) {
                        hasDigits = true;
                    }
                }

                if (hasDigits) {
                    System.out.println(result + " - ОШИБКА: содержит цифры");
                } else {
                    System.out.println(result + " - OK");
                    validCount++;
                }
            }
        }

        System.out.println("Валидных имён: " + validCount);
    }
}