public class BinaryStringPrblm {
    public static void printbinarystring(int n, String str, int lastplace) {
        // base case
        // n ki value kam hote hote 0 hojaegi toh hum apni string{str} ko print
        // karwalenge
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // --------------------------------------------------------------------
        // KAAM karne ka tarika (1)
        // --------------------------------------------------------------------
        // if(lastplace==0){
        // mene ish line me bata diya ki mene apne last me 0 ko bitha diya hai
        // printbinarystring(n-1, str.append("0"), 0);
        // mene ish line me bata diya ki mene apne last me 1 ko bitha diya hai
        // printbinarystring(n-1, str.append("1"), 1);
        // }
        // else{
        // agar mera last digit 1 hai toh me apne age 0 hi bithaunga toh mene wohi
        // bataya hai mere code ko
        // printbinarystring(n-1, str.append("0"), 0);
        // }
        // ------------------------------------------------------------------------
        // uper wale code ko hum ese bhi likh sakte hai so its direct bat chit
        // ------------------------------------------------------------------------
        // zero toh hum har bar likh hi rhe hai
        // so we check agar humara last wala digit zero hai toh agli digit hum 1 bhi
        // bitha sakte hai
        printbinarystring(n - 1, str + "0", 0);

        if (lastplace == 0) {
            printbinarystring(n - 1, str + "1", 1);
        }
    }

    public static void main(String arg[]) {
        printbinarystring(3, "", 0);
    }
}
