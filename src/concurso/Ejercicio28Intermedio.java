/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurso;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio28Intermedio {
//Crea un programa que sea capaz de solicitarte un número y se encargue de imprimir su tabla de multiplicar entre el 1 y el 10.
//Debe visualizarse qué operación se realiza y su resultado.
    
  public void imprimirTabla(int numero) {
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        Ejercicio28Intermedio obj = new Ejercicio28Intermedio();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número para obtener su tabla de multiplicar: ");
        int numero = sc.nextInt();

        obj.imprimirTabla(numero);
    }
}