public class Permutationofstrng {
    public static void permutationstrng(String str, String ans) {
        // basecase
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        // ab hum har ek element pr jaenge or use apni nai string ans me dal lenge str
        // se and use str se remove kardenge
        // thn we call our function again so that har ek element ke liyeh yeh hota jae!
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // element removal way
            // abcdef {remove c}
            // "ab"+"def"
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            // yeh new string kyu pass ki abb humne ?
            // yehhumne ish liyeh pass ki bcs hum str ke element remove karte ja rhe hai as
            // for loop me toh str ki length ja rhi hai toh humara for loop bhi proper way
            // me work nahi karega as str ka size reduce hota ja rha hai har callke bad
            // isliyeh humne new string pass ki hai jis se sare elements travis hojae !
            permutationstrng(Newstr, ans + curr);
        }
    }

    public static void main(String arg[]) {
        String str = "abc";
        permutationstrng(str, "");
    }
}
