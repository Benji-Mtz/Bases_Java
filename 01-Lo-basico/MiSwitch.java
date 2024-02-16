public class MiSwitch {
    public static void main(String[] args) {
        int dia = 1;

        switch (dia) {
            case 1:
                // Puede tener varias lineas
                System.out.println("Lunes");
                break;

            case 2:
                // Puede tener varias lineas
                System.out.println("Martes");
                break;

            case 3:
                // Puede tener varias lineas
                System.out.println("Miercoles");
                break;

            case 4:
                // Puede tener varias lineas
                System.out.println("Jueves");
                break;

            case 5:
                // Puede tener varias lineas
                System.out.println("Viernes");
                break;

            case 6:
                // Puede tener varias lineas
                System.out.println("Sabado");
                break;

            case 7:
                // Puede tener varias lineas
                System.out.println("Domingo");
                break;

            default:
                System.out.println("No existe ese día");
                break;
        }
    }
}
