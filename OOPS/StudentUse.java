public class StudentUse {
    public static void main(String[] args){
        // create a new object which is reference to the class (s1 in static memory and referenced class in heap memory);
        // everytime student class is called, a new block of memory is allocated for the object with its own properties - s1;
        Student s1 = new Student();
        Student s2;                // this line only creates object and not reference
        s2 = new Student("Gerry", 100);
        System.out.println(s2);
        s2.print();

        System.out.println(s1);
        s1.print();
        s1.name = "Harry";
        s1.setRollNumber(10);
        System.out.println(s1.name + " " + s1.getRollNumber());
        
        // accessing static variables by class or object
        System.out.println(Student.totalStudents);
        System.out.println(s2.totalStudents);

        System.out.println(Student.getTotalStudents());
    } 
}
