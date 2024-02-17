public class ForEach {
    public static void main(String[] args) {

        // ForEach: Sirve para recorrer listas mapas y arrays

        int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String[] nombres = new String[] { "Alvaro", "Beto", "Alexys", "Mircha", "Alejo1", "Alejo2" };

        for (int v : a) {
            System.out.println(v);
        }

        for (String name : nombres) {
            System.out.println(name);
        }

    }
}
