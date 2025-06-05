interface calculator{
    static int add(int a,int b){
        return a+b;
    }
    static int difference(int a,int b){
        return a-b;
    }
}
public class Static_interface {
public static void main(String[] args) {
    int add=calculator.add(10,5);
    int difference=calculator.difference(10,5);
    System.out.println("Sum:"+add);
    System.out.println("Diffrence:"+difference);
}
    
}