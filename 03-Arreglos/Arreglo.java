public class Arreglo {

    // Arreglos:
    // 1. Tamaño fijo
    // 2. Sólo puede contener elementos de un mismo tipo
    // Puede almacenar datos primitivos o referencias a objetos

    // Declaracion
    /*
     * int numeros[];
     * numeros = new int[5];
     * int numeros[] = new int[5];
     * int a[] = new int[5], int b[] = new int[3];
     * int a[] = { 3, 64, -1, 20, 55 };
     */

    // Asignacion de valores
    /*
     * int a[] = new int[3];
     * a[0] = 19
     * a[1] = 29
     * a[2] = 39
     * 
     */
    public static void main(String[] args) {
        int a[] = new int[5];

        a[0] = 99;
        a[1] = 19;
        a[2] = 29;
        a[3] = 39;
        a[4] = 49;

        for (int value : a) {
            System.out.println(value);
        }

        boolean b[] = new boolean[3];
        for (boolean v : b) {
            System.out.println(v);
        }
    }
}
