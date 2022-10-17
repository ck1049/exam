import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

        /*public static void main(String[] args) {

            char[] letters = new char[26];
            letters[0] = 'A';
            for (int i = 1; i < 26; i++){
                letters[i] = (char) (letters[i-1] + 1);
            }
            Scanner sc = new Scanner(System.in);
            String sentence = sc.nextLine();
            for (int i = 0; i < letters.length; i++) {
                String newWord = sentence.replace("" + letters[i], "");
                int count = sentence.length() - newWord.length();
                System.out.println(letters[i] + ":" + count);
            }
        }*/

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 2, 1, 0, 1,3, 2, 1, 2, 1};
        int max = Integer.MIN_VALUE;
        int maxNum = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxNum = i;
            }
        }
        int leftCount = 0;
        int rightCount = 0;
        int leftPow = 0;
        int rightPow = 0;
        for (int i = 0; i < a.length; i++) {
            if (i < maxNum + 1) {
                if (a[i] > leftPow) {
                    leftPow = a[i];
                    continue;
                }
                if (a[i] <= leftPow) {
                    leftCount += leftPow;
                    leftCount -= a[i];
                }
            }
        }
        for (int i = a.length - 1; i >= 0; i--) {
            if (i > maxNum - 1) {
                if (a[i] > rightPow) {
                    rightPow = a[i];
                    continue;
                }
                if (a[i] <= rightPow) {
                    rightCount += rightPow;
                    rightCount -= a[i];
                }
            }
        }
        System.out.println(leftCount + rightCount);
    }

}
