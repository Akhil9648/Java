public class Calc{
public int add(int a,int b){
    return a+b;
}
public int add(int a,int b,int c){
    return a+b+c;
}
public int add(int a){
    return a;
}
public static void main(String [] args){
    Calc c=new Calc();
    int sum1=c.add(4,5);
    System.out.println(sum1);
    System.out.println(c.add(4,5,6));
    System.out.println(c.add(4));
}
}
