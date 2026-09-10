import java.util.*;
class sb{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//0
        sb.append("java");
        System.out.println(sb);
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//4
        sb.append("is a programming language");
        System.out.println(sb);
        System.out.println(sb.capacity());//
        System.out.println(sb.length());//
        

        
    }
}