import java.util.Scanner;
public class min {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements");
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("min: "+min);
        sc.close();
    }
    
}
