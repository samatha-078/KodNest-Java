import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the value of byte :");
        Byte a =sc.nextByte();
        System.out.println("The byte value is : " + a);

        System.out.println("Enter the value of short :");
        Short b =sc.nextShort();
        System.out.println("The short value is : " + b);

        System.out.println("Enter the value of Integer :");
        int c =sc.nextInt();
        System.out.println("The integer  value is : " + c);
        

        System.out.println("Enter the value of double :");
        double d =sc.nextDouble();
        System.out.println("The double value is : " + d);

        System.out.println("Enter the value of float :");
        float  e=sc.nextFloat();
        System.out.println("The float value is : " + e);

        System.out.println("Enter the value of Boolean :");
        boolean f =sc.nextBoolean();
        System.out.println("The Boolean value is : " + f);

        System.out.println("Enter the value of long :");
        long g =sc.nextLong();
        System.out.println("The long value is : " + g);

        
    }
}
