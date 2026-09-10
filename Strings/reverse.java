import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        char arr[] = s.toCharArray();
        
        char newarray[] = new char[arr.length];
        int j = newarray.length-1;
        for(int i = 0; i < arr.length;i++){
            newarray[j] =arr[i];
            j--;
        }
        
        String rev = new String(newarray); 
        System.out.println(rev);
      

    }
}
