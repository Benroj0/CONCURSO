/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

public class Ejercicio22Intermedio {
    //* Crea un programa que analice texto y obtenga:
    //- Número total de palabras.
    //- Longitud media de las palabras.
    //- Número de oraciones del texto (cada vez que aparecen un punto).
// - Encuentre la palabra más larga.
//Todo esto utilizando un único bucle.

    public void analizarTexto(String texto) {
        int totalPalabras = 0, longitudTotal = 0, totalOraciones = 0;
        String palabraMasLarga = "", palabraActual = "";

        for (char c : texto.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                palabraActual += c;
            } else {
                if (!palabraActual.isEmpty()) {
                    totalPalabras++;
                    longitudTotal += palabraActual.length();
                    if (palabraActual.length() > palabraMasLarga.length()) {
                        palabraMasLarga = palabraActual;
                    }
                    palabraActual = "";
                }
                if (c == '.') {
                    totalOraciones++;
                }
            }
        }

        // Procesar última palabra si existe
        if (!palabraActual.isEmpty()) {
            totalPalabras++;
            longitudTotal += palabraActual.length();
            if (palabraActual.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabraActual;
            }
        }

        double longitudMedia = totalPalabras > 0 ? (double) longitudTotal / totalPalabras : 0;
        System.out.println("Palabras: " + totalPalabras + ", Longitud media: " + longitudMedia);
        System.out.println("Oraciones: " + totalOraciones + ", Palabra más larga: " + palabraMasLarga);
    }

    public static void main(String[] args) {
        Ejercicio22Intermedio obj = new Ejercicio22Intermedio();
        String texto = "El sol brilla. La luna está llena. La vida es bella.";
        obj.analizarTexto(texto);
    }
}
