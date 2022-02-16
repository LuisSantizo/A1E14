import java.util.Scanner;

public class A1E14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //declarar variables
        int Primero;
        int Segundo;
        int Divisibre;

        //ingrear datos
        System.out.print("Ingrese el primer numero: ");
        Primero = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        Segundo = scanner.nextInt();

        Divisibre = Segundo % Primero;

        if (Divisibre == 0) {

            System.out.println("Es divisible");

        } else {

            System.out.println("No es divisible");

        }
    }

}
