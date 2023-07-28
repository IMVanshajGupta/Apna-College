public class RemoveDupli {
    public static String removeDupli(String x, int i) {
        if (i >= x.length()) {
            return "";
        }

        if (i == 0) {
            System.out.print(x.charAt(0));
        } else if (x.charAt(i) != x.charAt(i - 1)) {
            System.out.print(x.charAt(i));
        }

        return removeDupli(x, i + 1);
    }

    public static void main(String[] args) {
        String x = "aaaa";
        removeDupli(x, 0);
    }
}
