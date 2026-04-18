# Colecciones y Lambdas en Java

Proyecto de Java que practica el uso de ArrayList, HashSet y HashMap combinados con expresiones lambda y Streams.

## Métodos

1. **multiplicarLista** - Multiplica cada elemento de un ArrayList por un factor usando replaceAll()
2. **eliminarCadenas** - Elimina cadenas que comiencen con cierta letra o tengan longitud menor a 4 usando removeIf()
3. **convertirMayusculas** - Convierte una lista de palabras a mayusculas usando Stream y map()
4. **cuadradosUnicos** - Regresa un HashSet con los cuadrados de los numeros pares de una lista
5. **mapaDeLongitudes** - Crea un HashMap donde la clave es la palabra y el valor su longitud
6. **inventarioModificador** - Imprime un inventario aplicando 10% de descuento a cada precio
7. **contadorFrecuencias** - Cuenta cuantas veces aparece cada palabra en una lista usando merge()
8. **clasificadorPalabras** - Filtra palabras cuya frecuencia sea menor a un limite dado
9. **deduplicacionPalabras** - Divide una frase, filtra palabras cortas y elimina duplicados en un HashSet
10. **topeFrecuencias** - Limita las frecuencias de un HashMap a un valor maximo usando replaceAll()

## Compilacion y ejecucion

```
javac OperacionesNumeros.java OperacionesCadenas.java Main.java
java Main
```

## Ejemplo de salida

```
--- Ejercicio 1 ---
Original: [1, 2, 3, 4, 5]
Multiplicada: [3, 6, 9, 12, 15]

--- Ejercicio 2 ---
Cadena original [cat, negro, cadenita]
Modificada [cadenita]

--- Ejercicio 3 ---
Array original [maria, sucio, limpio, alto, mediano, bajo]
Array convertido [MARIA, SUCIO, LIMPIO, ALTO, MEDIANO, BAJO]

--- Ejercicio 4 ---
Lista original [2, 2, 3, 3, 6, 6, 7, 8, 1, 10, 50, 40, 30, 15]
Lista solo con los pares modificados [1600, 900, 2500, 4, 64, 100, 36]

--- Ejercicio 5 ---
{Pedro=5, camion=6, basquetbolista=14, cabra=5}

--- Ejercicio 6 ---
Manzana:90.0
Leche:180.0
Pan:360.0

--- Ejercicio 7 ---
{warriors=4, suns=1, escuela=3, balon=1, eliminado=1}

--- Ejercicio 8 ---
Frecuencias originales: {estrella=10, sol=2, luna=5, cielo=1}
Palabras con frecuencia menor a 4: [sol, cielo]

--- Ejercicio 9 ---
Frase original: El veloz murcielago hindu comia feliz cardillo y kiwi El veloz murcielago
Palabras de menos de 6 letras, unicas y en minusculas: [el, y, kiwi, feliz, comia, hindu, veloz]

--- Ejercicio 10 ---
Frecuencias antes del tope: {rojo=15, azul=3, verde=8}
Frecuencias con tope en 5: {rojo=5, azul=3, verde=5}
```
