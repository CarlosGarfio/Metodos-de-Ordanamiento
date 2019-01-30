package metodosdeordenamiento;

import Arreglo.Arreglo;

public class MetodosDeOrdenamiento {
    
    public static void main(String[] args) {
        Arreglo arreglo = new Arreglo(3, 3);
        System.out.println("Metodos de ordenamiento.\n-------------------------");
        System.out.println("Matriz generada:");
        arreglo.fill(1,10);
        arreglo.print();
        System.out.println("-------------------------");
        System.out.println("Metodo Insercion(Garfio y Diana): "+arreglo.Insercion());
        
    }
}
