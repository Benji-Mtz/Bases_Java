public class CicloFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                // break;
                continue;
            }
            // Aqui se hace otro proceso muy largo
            System.out.println("Este numero no entro al continue porque es impar: " + i);
        }
    }
}
