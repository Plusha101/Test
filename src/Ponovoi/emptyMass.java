package Ponovoi;

public class emptyMass {
    public static void main(String[] args) {
        int[] scores = new int[3];
        scores[0] = 54;
        scores[1] = 43;
        scores[2] = 65;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = i * i;
        }
    }
}
