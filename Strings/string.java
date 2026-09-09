class string{
    public static void main(String args[]){
        String s = "Hello";
        char arr[] = s.toCharArray();
        for(int i = 0;i < arr.length;i++){
        System.out.println(arr[i]);
        }
        String res = new String(arr);
        System.out.println(res);
    }
}   