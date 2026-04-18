import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class OperacionesNumeros {

    // El Multiplicador
    public static void multiplicarLista(ArrayList<Integer> lista, int factor) {
        lista.replaceAll(n -> n * factor);
    }

    //Cuadrados Unicos
    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> numeros){
        return numeros.stream()
        .filter(p -> p % 2 == 0)
        .map(p -> p * p)
        .collect(Collectors.toCollection(HashSet :: new));
    }

    // El Tope de Frecuencias
    public static void topeFrecuencias(HashMap<String, Integer> frecuencias, int maximo) {
        frecuencias.replaceAll((palabra, valor) -> valor > maximo ? maximo : valor);
    }
}