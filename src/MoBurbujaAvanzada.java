public class MoBurbujaAvanzada {
    public int[] sortBubbleAvanzado(int[] arreglo){
        int n = arreglo.length;
        boolean intercambio;
        for(int i = 0; i < n; i++){
            intercambio = false;
            System.out.println("Pasada " + i);
            for(int j = 0; j < n - 1 - i; j++){
                System.out.println("j=" + j + " [j]=" + arreglo[j] + " j+1=" 
                + (j + 1) + " [j+1]=" + arreglo[j+1]);
                //Intercambio
                if(arreglo[j] > arreglo[j + 1]){
                    System.out.println("Si hay cambio");
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                    intercambio = true;
                } 
            }
            if(!intercambio){
                break;
            }
        }
        //Si no hubo ningun cambio es porque ya esta ordenado 
        // y no deberia preguntar mas
        return arreglo;
    }

    public void printArreglo(int[] arreglo){
        for(int elemento : arreglo){
            System.out.print(elemento + " , ");
        }
    }

    public void validacionIngreso(int [] arreglo){
        
    }
}
