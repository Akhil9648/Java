public class Try_catch02{
    public static void main(String [] args){
        int []a={1,2,3};
        try{
            a[5]=6;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
