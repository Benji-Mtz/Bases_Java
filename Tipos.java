class Tipos {
    public static void main(String[] args) {
        byte a = 8;
        byte b = 2;
        // casting
        byte c = (byte) (a + b);

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
