import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MoBurbujaAvanzada mO = new MoBurbujaAvanzada();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamanio del arreglo");
        int tamanio = 0;

        
        do{
            System.out.println("Ingrese el tamanio que sea entero positivo");
            while(!scanner.hasNextInt()){   
                System.out.println("Ingrese un entero valido");
                scanner.next();
            }
            tamanio = scanner.nextInt();
            if(tamanio <= 0 ){
                System.out.println("El tamanio debe ser entero positivo");
            }
        }while(tamanio <= 0);

        int [] arreglo = new int[tamanio];
        for(int k = 0; k < tamanio; k++ ){
            System.out.println("Ingrese el valor de la posicion " + (k+1));
            arreglo[k] = scanner.nextInt();
        }

        System.out.println(arreglo);
        
    }
}
