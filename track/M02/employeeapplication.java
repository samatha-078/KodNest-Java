class Employee{
    int id;
    String name;
    void work (){
        System.out.println("working");
    }
}
public class employeeapplication{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 11;
        e1.name = "kushi";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();
        Employee e2;
        e2=e1;
        e2.id=7;
        e2.name="sam";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();
        System.out.println(e2.id);
        System.out.println(e2.name);
        e2.work();
    }
}