public class Loops {
    public static void main(String []args){
        
        // If Else If Else
        int marks = 75;
        if(marks >= 25 && marks < 50){
            System.out.println("Average");
        }
        else if(marks >=50 && marks < 75){
            System.out.println("Good");
        }
        else if(marks >= 75 && marks <= 100){
            System.out.println("Badiya");
        }
        else{
            System.out.println("Invalid");
        }

        // tertiary operator
        int n1 = 20, n2 = 10, max;
        max = n1 > n2 ? n1 : n2;
        System.out.println(max);

        // switch statement
        int n = 5;
        switch(n){
            case 1:
                System.out.println("Monday");
                break; 
            case 2:
                System.out.println("Tuesday");
                break; 
            case 3:
                System.out.println("Wednesday");
                break; 
            case 4:
                System.out.println("Thursday");
                break; 
            case 5:
                System.out.println("Friday");
                // break; 
            case 6:
                System.out.println("Saturday");
                // break; 
            default:
                System.out.println("Sunday");
        }

        // do-while
        do{
            System.out.println(n);
            n++;
        } while(n<=7);

        // for loop
        for(int i=1; i<=5; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
