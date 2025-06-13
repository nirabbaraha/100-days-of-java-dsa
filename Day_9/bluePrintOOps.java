package Day_9;

public class bluePrintOOps {
   public static void main(String[] args) {
     pen p1=new pen();
     p1.changeColor("Red");
     System.out.println((p1.penColor));
     p1.penColor="blue";
     System.out.println(p1.penColor);
     p1.changeTip(5);
     System.out.println(p1.penTip);
   }
}

class pen{
    String penColor;
    int penTip;

    void changeColor(String Color){
        penColor=Color;
    }
    void changeTip(int tip){
        penTip=tip;
    }
}