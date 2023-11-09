package lesson2.nthang4;
public class Bai_Tap {
    public int c;

    public static void main (String[] args) {
        int a = 19;
        int b = 9;
        System.out.printf ("a + b = ");
        System.out.println(a+b);

        System.out.printf ("a - b = ");
        System.out.println(a-b);

        System.out.printf ("a * b = ");
        System.out.println(a*b);

        System.out.printf ("a / b = ");
        System.out.println(a/b);

        if (a>b) {
            System.out.printf("max (a;b) = ");
            System.out.println(a);
        } else {
            System.out.printf("max (a;b) = ");
            System.out.println(b);
        }

        System.out.printf("max (a;b) = ");
        System.out.println(Math.max(a,b));

        if (a>b) {
            System.out.printf("min (a;b) = ");
            System.out.println(b);
        } else {
            System.out.printf("min (a;b) = ");
            System.out.println(a);
        }

        System.out.printf("min (a;b) = ");
        System.out.println(Math.min(a,b));

        System.out.printf ("Lũy thừa của a và b = ");
        System.out.println(Math.pow(a,b));

        Double c = 10.12345;
        System.out.printf ("Làm tròn của a và b = ");
        System.out.println((double) Math.round(c*100)/100);

    }
}

