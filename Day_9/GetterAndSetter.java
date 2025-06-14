package Day_9;



public class GetterAndSetter {
    public static void main (String[] args){
            pen p1= new pen();
            p1.setColor("Yelllow");
            System.out.println(p1.getColor());
    }


    
}
class pen{
    String color;
    int tip;
    //setter
    void setColor(String color){
        this.color=color;
    }
    void setTip(int tip){
        this.tip=tip;
    }
    // getter
 String getColor(){
        return this.color;

    }
    int getTip(){
        return this.tip;
    }
}
