public class StringBuilderClass {
    public static void main(String[] args){

        // allows modification of strings
        StringBuilder sb = new StringBuilder("Hellow");

        // get
        char ch = sb.charAt(2);
        System.out.println(ch);

        // set
        sb.setCharAt(0 , 'y');
        System.out.println(sb);

        // insert
        sb.insert(0, 'z');
        System.out.println(sb);

        sb.append(97);
        System.out.println(sb);

        // delete
        sb.deleteCharAt(2);
        System.out.println(sb);

        // reverse string
        sb.reverse();
        System.out.println(sb);

        // better complexity
        int cnt = 10000;
        String m = "";
        StringBuilder n = new StringBuilder();

        long start = System.currentTimeMillis();
        for(int i=0; i<cnt; i++){
            m += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        long start2 = System.currentTimeMillis();
        for(int i=0; i<cnt; i++){
            n.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);

        // StringBuffer
        StringBuffer ssb = new StringBuffer();
        System.out.println(ssb.capacity());
        ssb.append("hello world in string buffer");
        System.out.println(ssb.capacity());

        ssb.insert(5, " java");

        ssb.deleteCharAt(0);
        System.out.println(ssb);

        // String ns = ssb.toString();

    }
}
