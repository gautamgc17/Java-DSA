public class Arrays {

    public static void fun(int[] arr){
        arr[1] = 20;
        arr[2] = 30;
    }

    public static void jagged(int[][] jarr){
        jarr[0][0] = 11;
        jarr[0][1] = 12;
        jarr[1][0] = 21;
        jarr[1][1] = 22;
        jarr[1][2] = 23;
    }

    public static void main(String[] args){
        
        // create array of strings
        String[] names = {"Gautam" , "Parth"};
        System.out.println(names);

        for (int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }

        // 2nd way of creating arrays - all initialized with 0
        int[] arr = new int[5];
        arr[0] = 10;
        // changes are reflected in main since arr contains the base address which is getting copied (pass by value of memory reference)
        fun(arr);
        // for each
        for(int val: arr){
            System.out.println(val);
        }

        // 2D arrays
        int[][] arr2 = new int[2][2];
        arr2[0][0] = 11;
        arr2[0][1] = 21;
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                arr2[i][j] = (int)(Math.random()*10);
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged Arrays
        int[][] jarr = new int[2][];
        jarr[0] = new int[2];
        jarr[1] = new int[4];

        jagged(jarr);
        jarr[1][2] = (int)(Math.random()*10);

        for(int[] i: jarr){
            System.out.println(i);
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for(int i=0; i<jarr.length; i++){
            for (int j=0; j<jarr[i].length; j++){
                System.out.print(jarr[i][j] + " ");
            }
            System.out.println();
        }

        // 3D Arrays
        int[][][] arr3 = new int[2][2][2];

        // Array of Objects
        class Student{
            String name;
            int rollno;
        }

        Student s1 = new Student();
        s1.name = "MSD";
        s1.rollno = 07;

        Student s2 = new Student();
        s2.name = "ABD";
        s2.rollno = 17;

        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2;
        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name + " " + students[i].rollno);
        }

        for(Student val: students){
            System.out.println(val.name + " " + val.rollno);
        }
    }
}
