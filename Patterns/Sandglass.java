public class Sandglass {
    public static void halwe(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" "); //spaces
            }
            for(int j=n;j>=i;j--){
                System.out.print("*"+" "); //star
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){ //reverseing the outerloop
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        halwe(15);
    }
}
