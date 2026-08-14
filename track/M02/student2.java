public class student2 {
    String name;
    int age;
    double height;
    student2(){
        name=name;
        age=age;
        height=height;
    }
    student2(String name){
        this.name=name;
        age=0;
        height=0.0;
    }
    student2(String name,int age){
        this.name=name;
        this.age=age;
       
    }
    student2(String name,int age,double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
