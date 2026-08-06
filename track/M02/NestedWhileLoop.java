public class NestedWhileLoop {
     public static void main(String[] args) {
        int i=0;
        while(i<=5){
            // System.out.println();
           int  j=1;
            while(j<=5){
                System.out.println(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
