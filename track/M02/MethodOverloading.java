class Addition{
   int add(int a,int b){
    return a+b;
   }
    double add(double a,int b){
    return a+b;
   }
    double add(double a,double b){
    return a+b;
   }
}
public class MethodOverloading{
    public static void main(String[] args) {
        Addition a = new Addition();
        double res =a.add(5.5,7);
        System.out.println(res);
    }
}
