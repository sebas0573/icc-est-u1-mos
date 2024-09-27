public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo de ordenamiento Seleccion: ");

        MetodosOrdenamiento mOrdenamiento = new MetodosOrdenamiento();

        
        int[] arreglo = {10, 5, 8, 2, 0};
        mOrdenamiento.sortBySeleccion(arreglo);
        mOrdenamiento.printArreglo(arreglo);
        System.out.println("");
       
        mOrdenamiento.sortBySeleccionDesOrasc(arreglo, true);
        mOrdenamiento.printArreglo(arreglo);
        System.out.println("");

        int[] arreglos = {10, 5, 8, 2, 0};
        mOrdenamiento.sortBySeleccionDesOrasc(arreglos, false);
        mOrdenamiento.printArreglo(arreglos);
        
    }
}
