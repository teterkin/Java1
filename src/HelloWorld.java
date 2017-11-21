public class HelloWorld {
    public static void main(String[] args) {
        /*
            Warnings:
                Warning:(14, 28) Value 'f' is always 'true'
                Warning:(15, 13) Condition 'd<10' is always 'false'
                Warning:(23, 16) Access can be private
         */
        int b;
        int a = 5;
        b = a + 2;
        double d = 12.21;
        char c = 'J';
        boolean f = true;
        System.out.println("Hello World!");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        if (d<10) {
            System.out.println("d <10");
        } else {
            System.out.println("d >=10");
        }
        System.out.println("a + b = " + add(a,b));
    }

    static int add (int a, int b) {
        return a + b;
    }
}
