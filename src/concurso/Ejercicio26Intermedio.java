/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio26Intermedio {
//Crea una función que encuentre todas las combinaciones de los números de una lista que suman el valor objetivo.
// - La función recibirá una lista de números enteros positivos y un valor objetivo.
//Para obtener las combinaciones sólo se puede usar una vez cada elemento de la lista (pero pueden existir elementos repetidos en ella).
//Ejemplo: Lista = [1, 5, 3, 2],  Objetivo = 6
//Soluciones: [1, 5] y [1, 3, 2] (ambas combinaciones suman 6)
// (Si no existen combinaciones, retornar una lista vacía)

    public void encontrarCombinaciones(List<Integer> lista, int objetivo) {
        List<List<Integer>> resultado = new ArrayList<>();
        encontrarCombinacionesRecursivo(lista, objetivo, 0, new ArrayList<>(), resultado);

        if (resultado.isEmpty()) {
            System.out.println("No hay combinaciones.");
        } else {
            System.out.println("Combinaciones que suman " + objetivo + ": " + resultado);
        }
    }

    private void encontrarCombinacionesRecursivo(List<Integer> lista, int objetivo, int inicio, List<Integer> combinacion, List<List<Integer>> resultado) {
        if (objetivo == 0) {
            resultado.add(new ArrayList<>(combinacion));
            return;
        }

        for (int i = inicio; i < lista.size(); i++) {
            if (i > inicio && lista.get(i) == lista.get(i - 1)) {
                continue;  // Evitar duplicados
            }
            if (lista.get(i) <= objetivo) {
                combinacion.add(lista.get(i));
                encontrarCombinacionesRecursivo(lista, objetivo - lista.get(i), i + 1, combinacion, resultado);
                combinacion.remove(combinacion.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio26Intermedio obj = new Ejercicio26Intermedio();
        List<Integer> lista = List.of(1, 5, 3, 2); // Lista de números
        int objetivo = 6; // Valor objetivo
        obj.encontrarCombinaciones(lista, objetivo);
    }
}
