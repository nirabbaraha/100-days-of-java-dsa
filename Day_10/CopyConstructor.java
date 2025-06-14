public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(); // default constructor is called
        s1.name = "Nirab";
        s1.roll = 20212212;
        s1.password = "xuuio321";
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 98;

        Student s2 = new Student(s1); // copy constructor

        // Changing s1 to test deep copy
        s1.marks[0] = 0;

        System.out.println("\nCopied Student Marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]); // Should still print 100, 99, 98
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int[] marks;

    // ✅ Copy Constructor (Deep Copy)
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        this.marks = new int[3];
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // ✅ Default Constructor
    Student() {
        marks = new int[3]; // Initialize array to avoid NullPointerException
        System.out.print("Constructor is called");
    }

    // Constructor with name
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    // Constructor with roll number
    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
