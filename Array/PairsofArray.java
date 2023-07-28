public class PairsofArray {
    public static void pair(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<(num.length);j++){
                System.out.print("("+num[i]+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        int num[]={1,2,3,4,5,6,7,8,9};
        
        pair(num);
    }
}
