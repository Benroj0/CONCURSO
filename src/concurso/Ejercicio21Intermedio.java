
package concurso;

import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio21Intermedio {
//Crea 3 funciones, cada una encargada de detectar si una cadena de texto es un heterograma, un isograma o un pangrama.
// - Debes buscar la definición de cada uno de estos términos
    public void esHeterograma(String texto) {
        HashSet<Character> caracteres = new HashSet<>();
        boolean esHeterograma = true;

        for (char c : texto.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if (caracteres.contains(c)) {
                    esHeterograma = false;
                    break;
                }
                caracteres.add(c);
            }
        }

        System.out.println("Heterograma: " + esHeterograma);
    }

    public void esIsograma(String texto) {
        HashMap<Character, Integer> conteo = new HashMap<>();
        boolean esIsograma = true;

        for (char c : texto.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                conteo.put(c, conteo.getOrDefault(c, 0) + 1);
            }
        }

        int valorRepeticiones = -1;
        for (int repeticiones : conteo.values()) {
            if (valorRepeticiones == -1) {
                valorRepeticiones = repeticiones;
            } else if (repeticiones != valorRepeticiones) {
                esIsograma = false;
                break;
            }
        }

        System.out.println("Isograma: " + esIsograma);
    }

    public void esPangrama(String texto) {
        HashSet<Character> letras = new HashSet<>();

        for (char c : texto.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                letras.add(c);
            }
        }

        boolean esPangrama = letras.size() == 26; // Hay 26 letras en el alfabeto inglés
        System.out.println("Pangrama: " + esPangrama);
    }

    public static void main(String[] args) {
        Ejercicio21Intermedio obj = new Ejercicio21Intermedio ();
        String texto = "Hola me llamo Benjamin cómo estás"; // Cambiar por el texto deseado

        obj.esHeterograma(texto);
        obj.esIsograma(texto);
        obj.esPangrama(texto);
    }
}