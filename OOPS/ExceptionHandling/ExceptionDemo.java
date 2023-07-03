package ExceptionHandling;

public class ExceptionDemo {

    public static int fact(int n) throws NegativeNumberException{
        if(n<0){
            throw new NegativeNumberException();
        }
        int ans = 1;
        for(int i=2; i<=n; i++){
            ans *= i;
        }
        return ans;
    }

    // throws is used in function signature to pass the exception
    public static int divide(int a , int b) throws DivideByZeroException{
        // raise Exception
        if(b==0){
            throw new DivideByZeroException();
        }
        return a/b;
    }
    public static void main(String[] args){
        // handle the passed exception
        try {
            divide(10, 10);
            System.out.println(fact(-5));
            System.out.println("Within the Try Block");
        } catch (DivideByZeroException e) {
            System.out.println("Division By Zero Occcured");
            System.out.println("1: " + e.toString());
            System.out.println("2: " + e.getMessage());
        } catch (NegativeNumberException e) {
            System.out.println("Negative Number Exception Occcured");
            System.out.println("1: " + e.toString());
            System.out.println("2: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception using Multiple catch blocks");
        } finally {
            System.out.println("Finally");
        }
    }
}
