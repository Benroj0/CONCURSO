/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

public class Ejercicio15 {
//Crea una función que imprima los 30 próximos años bisiestos siguientes a uno dado.
    //- Utiliza el menor número de líneas para resolver el ejercicio.

    public static void imprimirBisiestos(int añoInicial) {
        int contador = 0;
        while (contador < 30) {
            if ((añoInicial % 4 == 0 && añoInicial % 100 != 0) || (añoInicial % 400 == 0)) {
                System.out.println(añoInicial);
                contador++;
            }
            añoInicial++;
        }
    }

    public static void main(String[] args) {
        int anio = 2024; // Cambiar por el año deseado
        System.out.println("Próximos 30 años bisiestos a partir de " + anio + ":");
        imprimirBisiestos(anio);
    }
}
