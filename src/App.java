import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MoBurbujaAvanzada mO = new MoBurbujaAvanzada();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamanio del arreglo");
        int tamanio = leerEnteroValido(scanner, "Ingrese el tamanio", false);


        int [] arreglo = new int[tamanio];
        for(int k = 0; k < tamanio; k++ ){
            System.out.println("Ingrese el valor de la posicion " + (k+1));
            arreglo[k] = leerEnteroValido(scanner, "Ingrese el valor de la posicion", true);
        }
    }


    public static int leerEnteroValido(Scanner scanner, String mensaje, boolean permitirNegativo){
        int numero;
        do{
            System.out.println(mensaje);
            while(!scanner.hasNextInt()){   
                System.out.println("Ingrese un entero valido");
                System.out.println(mensaje);
                scanner.next();
            }
            numero = scanner.nextInt();
            if(!permitirNegativo && numero < 0 ){
                System.out.println("El tamanio debe ser entero positivo");
            }
        }while(!permitirNegativo && numero < 0);
        return numero;
    }


}
