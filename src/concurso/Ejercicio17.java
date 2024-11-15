/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;
//Crea un programa se encargue de transformar un número binario a decimal 
//sin utilizar funciones propias del lenguaje que lo hagan directamente.

public class Ejercicio17 {
  public void convertirYMostrarDecimal(String binario) {
        int decimal = 0;
        int longitud = binario.length();

        for (int i = 0; i < longitud; i++) {
            if (binario.charAt(longitud - 1 - i) == '1') {
                decimal += Math.pow(2, i);
            }
        }

        System.out.println("El número decimal es: " + decimal);
    }

    public static void main(String[] args) {
        Ejercicio17 obj = new Ejercicio17();
        String binario = "1101"; // Cambiar por el valor binario deseado
        obj.convertirYMostrarDecimal(binario);
    }
}