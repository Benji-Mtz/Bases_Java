public class Operadores {
    public static void main(String[] args) {
        // Asignación
        /* int a =2 ;

        int b;
        b = 2 + 2 + 3;
        System.out.println(b); */

        /* 
        // Preincremento
        int a = 0;
        ++a;
        System.out.println(a); // 1

        // Postincremento
        int b = 0;
        b++;
        System.out.println(b); // 1
        */

        // Preincremento y Postincremento
        int a  = 3;
        int b = 2;

        // int c = a * ++b; //9
        int c = a * b++; // 6

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
