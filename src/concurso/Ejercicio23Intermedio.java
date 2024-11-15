/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

public class Ejercicio23Intermedio {
// Crea un programa que realize el cifrado César de un texto y lo imprima. 
// debe ser capaz de descifrarlo cuando así se lo indiquemos.

    //Te recomiendo que busques información para conocer en profundidad cómo realizar el cifrado. 
    //Esto también forma parte del reto.
    
    
    public void cifrarOCesar(String texto, int desplazamiento, boolean cifrar) {
        StringBuilder resultado = new StringBuilder();
        desplazamiento = cifrar ? desplazamiento : -desplazamiento;

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - base + desplazamiento + 26) % 26 + base); // Ajusta el rango para letras
            }
            resultado.append(c);
        }

        System.out.println(cifrar ? "Texto cifrado: " : "Texto descifrado: " + resultado.toString());
    }

    public static void main(String[] args) {
        Ejercicio23Intermedio obj = new Ejercicio23Intermedio ();
        String texto = "Hola Mundo"; // Texto de entrada
        int desplazamiento = 3; // Desplazamiento para el cifrado

        obj.cifrarOCesar(texto, desplazamiento, true);  // Cifrar el texto
        obj.cifrarOCesar("Khoor Pxqgr", desplazamiento, false); // Descifrar el texto
    }
}
