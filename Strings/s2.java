    
class s2{
    public static void main(String[] args){
        String s3 = new String("java");
        String s4 = new String("java");
        if(s3==s4){
            System.out.println("ref are eqaual");
        }else{
            System.out.println("ref are not eqaual");
        }
        if(s3.equals(s4)){
            System.out.println("content are eqal");
        }else{
            System.out.println("content are not eqal");
        }
    }
}
      

    