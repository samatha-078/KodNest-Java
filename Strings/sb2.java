public class sb2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("sam");
        System.out.println(sb);
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        sb.append("hello" );
        System.out.println(sb); 
    }
}
