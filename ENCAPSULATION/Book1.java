public class Book1 {
    private int pageNum;
    public void setData(int x){
        if(x>0){
            pageNum=x;
        }else{
            System.out.println("Invalid");
        }
    }
    public void getData(){
        System.out.println(pageNum);
    }
}
