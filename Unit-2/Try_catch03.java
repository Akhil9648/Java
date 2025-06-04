public class Try_catch03 {
    public static void main(String[] args) {
        try {
            int result=devide(10,0);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("The Number can't be devided by Zero "+e.getMessage());
        }
        finally{
            System.out.println("Finally the Code ends");
        }
        System.out.println("Bye");
    }
    public static int devide(int a,int b){
        return a/b;
    }
}
