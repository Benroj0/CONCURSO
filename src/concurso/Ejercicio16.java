/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

public class Ejercicio16 {
//Dado un listado de números, encuentra el SEGUNDO más grande
    
public static int encontrarSegundoMayor(int[] arr) {
        int mayor = Integer.MIN_VALUE;
        int segundoMayor = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > mayor) {
                segundoMayor = mayor;
                mayor = num;
            } else if (num > segundoMayor && num != mayor) {
                segundoMayor = num;
            }
        }
        return segundoMayor;
    }

    public static void main(String[] args) {
        int[] numeros = {4, 1, 7, 3, 9, 5};
        int resultado = encontrarSegundoMayor(numeros);
        System.out.println("El segundo número más grande es: " + resultado);
    }
}
