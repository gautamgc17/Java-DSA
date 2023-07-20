public class Variables {
    public static void main(String []args){
        
        // byte and short values
        byte by = 12;
        short sh = 125;
        System.out.println(by + " " + sh);

        // bydefault it has double format
        double d = 12.25567;
        System.out.println("Double Val: " + d);
        
        // to specify float values, put f 
        float f = 6.45f;
        System.out.println("Float Val: " + f);

        // to specify long values, put l
        long num = 123456l;
        System.out.println("Long Val: " + num);

        // bool values
        boolean val = true;

        // we can increment character  
        char ch = 'a';
        ch++;
        System.out.println(ch);

        // binary numbers
        int num1 = 0b101;
        System.out.println("Binary Val: " + num1);

        // hexadecimal numbers
        int num2 = 0x7E;
        System.out.println("Hexadecimal Val: " + num2);

        // work in terms of e
        double num3 = 12e10;
        System.out.println("Double Val with e: " + num3);

        // ignore underscore
        double num4 = 1_00_00_000;
        System.out.println("Double Val with e: " + num4);

        // type conversion and casting
        byte h = 127;
        int i = h;
        System.out.println(i);

        // here modulus operation with the range is performed
        int m = 257;
        byte n = (byte) m;
        System.out.println(n);

        // here decimal will be truncated
        float v = 12.56f;
        int x = (int) v;
        System.out.println(x);

        // decimal operation
        float x1 = 12.5f;
        int x2 = 6;
        // int ans = (int)(x1/x2);
        System.out.println(x1/x2);

        //1. Post-Increment Operator
        int a = 5;
        int b = 7;
        
        int c = a++ + b; //Here 'a' will not incremented immediately, a++ will still return value 5.
        //  c = 5   + 7 and this will evaluate to 12.
        
        System.out.println("Post- Increment \n c = "+ c);
        
        //2. Pre-Increment Operator
        
        int A = 5;
        int B = 7;
        
        int C = ++A + B; //Here 'a' will be incremented immediately, and ++a will return value 6.
        //  C =  6  + 7   and this will evaluate to 13.
        
        System.out.println("Pre- Increment \n C = "+ C);
        
        //Example-
        int y = 1, z = 2;
        
        int o = y++ + z + ++y; // It goes like m++ = 1, n = 2, ++m = 1+ incremented 'm' from m++ = 1 + (1+m) = 1+ (1+1) = 3
        //  o = 1   + 2 +   3 = 6 
        System.out.println("Example \n o = "+ o);

        // Relational Operators
        System.out.println(A < B && y > z);
    }
}
