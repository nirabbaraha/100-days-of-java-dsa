package Day_12;

public class PracticeQ2 {
    //WHich veriable can class person access?
    //name, weight.
}

class person{
    String name;
    int weight;
}
class Student extends person{
    int rollNumber;
    String SchoolName;
}