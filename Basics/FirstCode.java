import java.util.Scanner;

class FirstCode{
    public static void main(String[] args){
        // output
        System.out.print("Hello World\n");
        System.out.println(3 + 2);

        // Input
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Your int input is: " + n);

        Scanner scn1 = new Scanner(System.in);
        String s = scn1.nextLine();
        System.out.println(s);

        // read the input only until a space(” “) 
        s = scn1.next();
        System.out.println(s);
        s = scn1.next();
        System.out.println(s);
        scn.close();
        scn1.close();

        // reassigning values - int
        int num2 = 2;
        num2 = 10;
        System.out.println(num2 + 100);
    }
}