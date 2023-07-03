public class Student {
    // default modifier - only wthin the package
    String name;
    private int rollNumber;

    // final keyword is used to make var, class, method non-changeable once value is assigned (inherit or override)
    public final static double CONVERSIONFACTOR = 0.95;

    // static keyword - to make variable/methods belong to class; shared by all instances;
    static int totalStudents;

    // constructors
    public Student(){
        System.out.println("Constructor-1 called");
        totalStudents++;
    }

    public Student(String name, int rollNumber){
        System.out.println("Constructor-2 called");
        this.name = name;
        this.rollNumber = rollNumber;
        totalStudents++;
    }

    // static methods can only access static variables
    public static int getTotalStudents(){
        return totalStudents;
    }

    public void print(){
        System.out.println(name + "  " + rollNumber);
    }

    // getters and setters - provide more control
    public int getRollNumber(){
        return rollNumber;
    }
    public void setRollNumber(int rollNumber){
        // this - reference to current object;
        System.out.println(this);
        this.rollNumber = rollNumber;
    }
}
