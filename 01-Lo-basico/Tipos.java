class Tipos {
    public static void main(String[] args) { // String ...args
        final float PIConstante = 3.1416f;
        var datoInferido = 255;

        byte a = 8;
        byte b = 2;
        // casting (byte) (a+b+c+d+e+....N)
        byte c = (byte) (a + b);

        System.out.printf("Valor de PI: %s\n", PIConstante);
        System.out.printf("Valor de Dato Inferido: %s\n", datoInferido);
        System.out.println(c);

        // Cast double to float
        float d = 10.5f;
        float e = 1.5f;

        float f = d + e;

        System.out.println(f);

        int num1 = 5;
        int num2 = 2;
        float res = (float) num1 / (float) num2;

        System.out.println(res);
    }
}
