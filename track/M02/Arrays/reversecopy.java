import java.util.Scanner;

public class reversecopy {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("array a is");
        for(int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }
        
        int b[] = new int[a.length];
        int j =b.length-1;
        for(int i=0;i<=a.length-1;i++){
            b[j]=a[i];  
            j--;
        }
       
        System.out.println("array b is");
        for(int i=0;i<=b.length-1;i++){ 
            System.out.println(b[i]);
        }
    }
}