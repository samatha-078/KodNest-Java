class stgpool{
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "Java";
        if(s1==s2){
            System.out.println("ref are eqaual");
        }else{
            System.out.println("ref are not eqaual");
        }
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("content are eqal");
        }else{
            System.out.println("content are not eqal");
        }
    }
} 