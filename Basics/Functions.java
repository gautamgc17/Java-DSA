import java.util.Scanner;

public class Functions {

    public static int factorial(int n){
        int num = 1;
        for (int i=2; i<=n; i++){
            num *= i;
        }
        return num;
    }

    public static boolean isPrime(int n){
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void increment(int val){
        val += 1;
    }

    // Function Overloading: Change no of arguments and data type of args; not on the basis of return type
    // Which function to call is decided at the run-time
    // No default parameters are supported
    public static int add(int n1, int n2, int n3, int n4){
        return n1+n2+n3+n4;
    }

    public static int add(double n1, int n2){
        return (int)(n1 + n2);
    }

    // pass by value happens - isPrime.n = main.p is copied
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int p = s.nextInt();
        int val = s.nextInt();

        boolean res = isPrime(p);

        int num = factorial(n);
        int den1 = factorial(r);
        int den2 = factorial(n-r);
        int ans = num/(den1 * den2);
        System.out.println(ans);

        System.out.println(res);

        increment(val);
        System.out.println(val);

        int result = add(1, 2, 3, 4);
        System.out.println(result);
    }
}
