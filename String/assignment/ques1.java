
public class ques1 {
    public static int times(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char pchar = word.charAt(i);
            if (pchar == 'a' || pchar == 'e' || pchar == 'i' || pchar == 'o' || pchar == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String arg[]) {
        String word = "i love you";
        System.out.print(times(word));
    }
}