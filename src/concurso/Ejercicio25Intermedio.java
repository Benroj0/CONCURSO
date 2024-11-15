/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

public class Ejercicio25Intermedio {
    //Crea las funciones capaces de transformar colores HEX a RGB y viceversa.
//Ejemplos:
//RGB a HEX: r: 0, g: 0, b: 0 -> #000000
//HEX a RGB: hex: #000000 -> (r: 0, g: 0, b: 0)

    public String rgbAHex(int r, int g, int b) {
        return String.format("#%02X%02X%02X", r, g, b);
    }

    // Función para convertir HEX a RGB
    public void hexARgb(String hex) {
        if (hex.startsWith("#")) {
            hex = hex.substring(1); // Eliminar el símbolo #
        }

        int r = Integer.parseInt(hex.substring(0, 2), 16);
        int g = Integer.parseInt(hex.substring(2, 4), 16);
        int b = Integer.parseInt(hex.substring(4, 6), 16);

        System.out.println("RGB: (" + r + ", " + g + ", " + b + ")");
    }

    public static void main(String[] args) {
        Ejercicio25Intermedio obj = new Ejercicio25Intermedio();

        // Ejemplo: Convertir RGB a HEX
        String hex = obj.rgbAHex(255, 0, 0); // Rojo
        System.out.println("HEX: " + hex);

        // Ejemplo: Convertir HEX a RGB
        obj.hexARgb("#FF0000"); // Rojo
    }
}
