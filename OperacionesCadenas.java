import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class OperacionesCadenas {

    // El Filtro Selectivo
    public static void eliminarCadenas(ArrayList<String> cadenas, String letra){
        cadenas.removeIf(c -> c.startsWith(letra) || c.length() < 4);
    }

    // Conversor de Mayusculas
    public static ArrayList<String> convertirMayusculas(ArrayList<String> palabras) {
        return palabras.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toCollection(ArrayList::new)); 
    }

    //Mapa Longitudes
    public static Map<String,Integer> mapaDeLongitudes(ArrayList<String> palabras){
        return palabras.stream()
        .collect(Collectors.toMap(p -> p, p -> p.length()));
    }

    //Modificador de Inventario
    public static void inventarioModificador(HashMap<String,Double> inventario){
        inventario.forEach((producto,precio) -> System.out.println(producto + ":" + (precio * 0.90)));
    }

    //Contador de frecuencias 
    public static Map<String,Integer> contadorFrecuencias(ArrayList<String> palabras){
        Map<String, Integer> contador = new HashMap<>();
        palabras.forEach(p -> contador.merge(p, 1, (viejo, nuevo) -> viejo + nuevo));
        return contador;
    }

    // Clasificador de Palabras
    public static ArrayList<String> clasificadorPalabras(HashMap<String, Integer> frecuencias, int limite) {
        return frecuencias.entrySet().stream()
                .filter(entrada -> entrada.getValue() < limite)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // Deduplicacion de Palabras
    public static HashSet<String> deduplicacionPalabras(String frase, int limiteLetras) {
        return Arrays.stream(frase.split(" "))
                .filter(p -> p.length() < limiteLetras)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(HashSet::new));
    }
}