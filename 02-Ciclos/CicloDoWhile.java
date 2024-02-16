public class CicloDoWhile {
    public static void main(String[] args) {
        // El código se ejecutara por lo menos una vez

        // do {

        // sentencia
        // } while (condición);

        int i = 0;

        do {
            // System.out.println(i);
            i++;
            if (i % 2 == 0) {
                // break;
                continue;
            }
            System.out.println("Estoy despues de continue: " + i);
        } while (i < 10);

    }
}
