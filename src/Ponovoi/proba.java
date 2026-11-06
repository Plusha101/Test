package Ponovoi;

public class proba {
    public static void main(String[] args) {
        //   String a = "trenirovka";
        // char[] chares = a.toCharArray();
        //  chares[0] = 'T';
        //  a = new String(chares);
        //  System.out.println(a);

        String s = "Trenirovka";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;

            left++;
            right--;


        }
        System.out.println(new String(chars));
    }
}
