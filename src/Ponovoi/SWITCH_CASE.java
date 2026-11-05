package Ponovoi;

public class SWITCH_CASE {
    public static void main(String[] args) {
        int a = 23;

        String s = switch (a) {
            case 2 -> "two";
            default -> "Default";
        };
        System.out.println(s);
    }
}
