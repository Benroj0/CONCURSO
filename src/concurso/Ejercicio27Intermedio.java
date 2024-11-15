/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio27Intermedio {
//Crea una función que encuentre todos los triples pitagóricos (ternas) menores o iguales a un número dado. Debes buscar información sobre qué es un triple pitagórico. *formula del tiple Pitágoras : a^2+b^2=c^2  ---> 3^2+4^2=5^2 --> 9+16 = 25  
//La función únicamente recibe el número máximo que puede aparecer en el triple.
//Ejemplo: Los triples menores o iguales a 10 están formados por (3, 4, 5) y (6, 8, 10).

    public void encontrarTriplesPitagoricos(int max) {
        List<List<Integer>> triples = new ArrayList<>();

        for (int a = 1; a <= max; a++) {
            for (int b = a; b <= max; b++) {
                for (int c = b; c <= max; c++) {
                    if (a * a + b * b == c * c) {
                        List<Integer> triple = List.of(a, b, c);
                        triples.add(triple);
                    }
                }
            }
        }

        if (triples.isEmpty()) {
            System.out.println("No se encontraron triples pitagóricos.");
        } else {
            System.out.println("Triples pitagóricos menores o iguales a " + max + ": " + triples);
        }
    }

    public static void main(String[] args) {
        Ejercicio27Intermedio obj = new Ejercicio27Intermedio();
        int max = 10; // Número máximo
        obj.encontrarTriplesPitagoricos(max);
    }
}
