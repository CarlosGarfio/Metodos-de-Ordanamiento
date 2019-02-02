package metodosdeordenamiento;

import Arreglo.Arreglo;

public class MetodosDeOrdenamiento {
    
    public static void main(String[] args) {
        Arreglo arreglo = new Arreglo(3, 3);
        System.out.println("Metodos de ordenamiento.\n-------------------------");
        System.out.println("Metodo de inserción:");
        System.out.println("Matriz generada:");
        arreglo.fill(0,11);
        arreglo.print();
        System.out.println("Matriz ordenada:");
        long orden=arreglo.Insercion();
        arreglo.print();
        System.out.println("Metodo Insercion(Garfio y Diana): "+orden);
        System.out.println("-------------------------");
        
    }
}
