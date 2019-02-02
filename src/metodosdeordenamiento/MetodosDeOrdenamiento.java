package metodosdeordenamiento;

import Arreglo.Arreglo;

public class MetodosDeOrdenamiento {
    static Arreglo arreglo = new Arreglo(3, 3);
    static long orden;
    public static void main(String[] args) {
        System.out.println("Metodos de ordenamiento.\n-------------------------");
        System.out.println("Metodo de inserción:");
        System.out.println("Matriz generada:");
        arreglo.fill(0,11);//Se llena la matriz
        arreglo.print();//Se imprime
        System.out.println("Matriz ordenada:");
        orden=arreglo.Insercion();//Se ordena
        arreglo.print();
        System.out.println("Metodo Insercion(Garfio y Diana): "+orden);
        System.out.println("-------------------------");
        //Formato (Copien y peguen eso)
        System.out.println("Metodo de :");
        System.out.println("Matriz generada:");
        arreglo.fill(0,11);//Se llena la matriz
        arreglo.print();//Se imprime
        System.out.println("Matriz ordenada:");
        orden=arreglo.Insercion();//Se ordena
        arreglo.print();
        System.out.println("Metodo Insercion(Integrantes): "+orden);
        System.out.println("-------------------------");
    }
}
