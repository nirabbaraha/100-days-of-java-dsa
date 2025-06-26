package Day_12;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator cl= new Calculator();
        System.out.println(cl.sum((float)1.09,(float)2.31));
        System.out.println(cl.sum(1,2));
        System.out.println(cl.sum(1,2,4));
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}
