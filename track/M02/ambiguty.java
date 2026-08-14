class A{
    short m(short a ,short b){
        return a+b;
    }
    int m(int a,int b){
        return a+b;
        }
}
    public class ambiguty {
        public static void main(String[] args) {
            A a = new A();
            System.out.println(a.m(10,10));
        }
  
}
