import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Ejercicio 1 - El Multiplicador
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int factor = 3;
        System.out.println("Original: " + numeros);
        OperacionesNumeros.multiplicarLista(numeros, factor);
        System.out.println("Multiplicada: " + numeros);

        // Edge: lista vacia
        ArrayList<Integer> listaVacia = new ArrayList<>();
        System.out.println("Lista vacia antes: " + listaVacia);
        OperacionesNumeros.multiplicarLista(listaVacia, 5);
        System.out.println("Lista vacia despues: " + listaVacia);

        // Edge: multiplicar por 0
        ArrayList<Integer> numerosZero = new ArrayList<>(Arrays.asList(10, 20, 30));
        OperacionesNumeros.multiplicarLista(numerosZero, 0);
        System.out.println("Multiplicado por 0: " + numerosZero);


        // Ejercicio 2 - El Filtro Selectivo
        ArrayList<String> cadenas = new ArrayList<>(Arrays.asList("cat", "negro", "cadenita"));
        String letra = "n";
        System.out.println("Cadena original " + cadenas);
        OperacionesCadenas.eliminarCadenas(cadenas, letra);
        System.out.println("Modificada " + cadenas);

        // Edge: lista vacia
        ArrayList<String> cadenasVacias = new ArrayList<>();
        System.out.println("Lista vacia: " + cadenasVacias);
        OperacionesCadenas.eliminarCadenas(cadenasVacias, "a");
        System.out.println("Modificada " + cadenasVacias);


        // Ejercicio 3 - Conversor de Mayusculas
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("maria","sucio", "limpio","alto","mediano","bajo"));
        System.out.println("Array original " + palabras);
        ArrayList<String> palabrasMayusculas = OperacionesCadenas.convertirMayusculas(palabras);
        System.out.println("Array convertido " + palabrasMayusculas);

        // Edge: lista vacia
        ArrayList<String> sinPalabras = new ArrayList<>();
        System.out.println("Lista vacia convertida: " + OperacionesCadenas.convertirMayusculas(sinPalabras));


        // Ejercicio 4 - Cuadrados Unicos
        ArrayList<Integer> numerosDuplicados = new ArrayList<>(Arrays.asList(2,2,3,3,6,6,7,8,1,10,50,40,30,15));
        System.out.println("Lista original " + numerosDuplicados);
        HashSet<Integer> cuadradosFiltro = OperacionesNumeros.cuadradosUnicos(numerosDuplicados);
        System.out.println("Lista solo con los pares modificados " + cuadradosFiltro);

        // Edge: solo impares
        ArrayList<Integer> soloImpares = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        System.out.println("Solo impares: " + OperacionesNumeros.cuadradosUnicos(soloImpares));


        // Ejercicio 5 - Mapa de Longitudes
        ArrayList<String> palabras2 = new ArrayList<>(Arrays.asList("Pedro","camion","basquetbolista","cabra"));
        Map<String,Integer> mapaLongitudes = OperacionesCadenas.mapaDeLongitudes(palabras2);
        System.out.println(mapaLongitudes);

        // Edge: lista vacia
        System.out.println("Lista vacia: " + OperacionesCadenas.mapaDeLongitudes(new ArrayList<>()));


        // Ejercicio 6 - Modificador de Inventario
        HashMap<String, Double> inventario = new HashMap<>(Map.of(
            "Manzana", 100.00,
            "Leche", 200.00,
            "Pan", 400.00
        ));
        OperacionesCadenas.inventarioModificador(inventario);

        // Edge: inventario vacio
        System.out.println("Inventario vacio:");
        OperacionesCadenas.inventarioModificador(new HashMap<>());


        // Ejercicio 7 - Contador de Frecuencias
        ArrayList<String> palabritas = new ArrayList<>(Arrays.asList("warriors","warriors","warriors","warriors","suns","escuela","escuela","escuela","balon","eliminado"));
        Map<String, Integer> ejemplo = OperacionesCadenas.contadorFrecuencias(palabritas);
        System.out.println(ejemplo);

        // Edge: lista vacia
        System.out.println("Lista vacia: " + OperacionesCadenas.contadorFrecuencias(new ArrayList<>()));


        // Pruebas de los ultimos metodos
        System.out.println("\n--- Ejercicio 8 ---");
        HashMap<String, Integer> mapaFrecuencias = new HashMap<>(Map.of("sol", 2, "luna", 5, "estrella", 10, "cielo", 1));
        System.out.println("Frecuencias originales: " + mapaFrecuencias);
        ArrayList<String> filtradas = OperacionesCadenas.clasificadorPalabras(mapaFrecuencias, 4);
        System.out.println("Palabras con frecuencia menor a 4: " + filtradas);

        // Edge: limite 0 (ninguna cumple)
        System.out.println("Limite 0: " + OperacionesCadenas.clasificadorPalabras(mapaFrecuencias, 0));


        System.out.println("\n--- Ejercicio 9 ---");
        String fraseLarga = "El veloz murcielago hindu comia feliz cardillo y kiwi El veloz murcielago";
        System.out.println("Frase original: " + fraseLarga);
        HashSet<String> palabrasUnicas = OperacionesCadenas.deduplicacionPalabras(fraseLarga, 6);
        System.out.println("Palabras de menos de 6 letras, unicas y en minusculas: " + palabrasUnicas);

        // Edge: frase vacia
        System.out.println("Frase vacia: " + OperacionesCadenas.deduplicacionPalabras("", 6));


        
        HashMap<String, Integer> frecTope = new HashMap<>(Map.of("rojo", 15, "azul", 3, "verde", 8));
        System.out.println("Frecuencias antes del tope: " + frecTope);
        OperacionesNumeros.topeFrecuencias(frecTope, 5);
        System.out.println("Frecuencias con tope en 5: " + frecTope);

        // Edge: mapa vacio
        HashMap<String, Integer> mapaVacio = new HashMap<>();
        OperacionesNumeros.topeFrecuencias(mapaVacio, 5);
        System.out.println("Mapa vacio con tope: " + mapaVacio);
    }
}