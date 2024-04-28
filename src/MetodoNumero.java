import java.util.Scanner;
//Nombre : Angel Gabriel Sanchez Cajina
//Numero de carnet: 2024-1640U
//Grupo 1M7-S
public class MetodoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
//Se utiliza un bloque try-catch para manejar posibles excepciones
// cuando se intenta convertir la entrada del usuario en números enteros.
// Esto garantiza que el programa no se bloquee si el usuario ingresa algo que no sea un número entero.

        try {
            System.out.println("Ingrese el primer número entero:");
            int num1 = ObtenerNumeroEntero(scanner);
            System.out.println("Ingrese el segundo número entero:");
            int num2 = ObtenerNumeroEntero(scanner);
            System.out.println("Ingrese el tercer número entero:");
            int num3 = ObtenerNumeroEntero(scanner);

            int suma = SumaDelosDosMaspequeños(num1, num2, num3);
            int diferencia = DiferenciaDelosdosMasGrandes(num1, num2, num3);
            int mayor = ElMayordeTodos(num1, num2, num3);

            System.out.println("La suma de los dos números más pequeños es: " + suma);
            System.out.println("La diferencia entre los dos números más grandes es: " + diferencia);
            System.out.println("El número mayor es: " + mayor);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese solo números enteros.");
        }
    }

    // Método para obtener la entrada del número entero
    private static int ObtenerNumeroEntero(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese solo números enteros. Inténtelo de nuevo:");
            }
        }
    }


    // Método para calcular la suma de los dos números más pequeños
    private static int SumaDelosDosMaspequeños(int a, int b, int c) {
        return Math.min(Math.min(a, b), c) + Math.min(Math.max(a, b), c);
    }

    // Método para calcular la diferencia entre los dos números más grandes
    private static int DiferenciaDelosdosMasGrandes(int a, int b, int c) {
        return Math.max(Math.max(a, b), c) - Math.min(Math.max(a, b), c);
    }

    // Método para encontrar el número mayor
    private static int ElMayordeTodos(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
