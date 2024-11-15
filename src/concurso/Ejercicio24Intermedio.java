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
public class Ejercicio24Intermedio {
 //*Una persona enferma, que pesa 70 kg, se encuentra en reposo y desea saber cuántas calorías consume su cuerpo durante todo
// el tiempo <-- Desea saber cuantas calorias consume su cuerpo que realice una misma actividad. Las actividades que
//tiene permitido realizar son únicamente dormir o estar sentado en reposo. Los datos que tiene son que 
 //estando dormido consume 1.08 calorías por minuto y estando sentado en reposo consume 1.66 
//calorías por minuto.
    
     public void calcularCalorias(String actividad, int minutos) {
        double caloriasPorMinuto = 0;

        if (actividad.equalsIgnoreCase("dormir")) {
            caloriasPorMinuto = 1.08;
        } else if (actividad.equalsIgnoreCase("sentado")) {
            caloriasPorMinuto = 1.66;
        } else {
            System.out.println("Actividad no válida.");
            return;
        }

        double caloriasTotales = caloriasPorMinuto * minutos;
        System.out.println("Calorías consumidas por " + actividad + " durante " + minutos + " minutos: " + caloriasTotales);
    }

    public static void main(String[] args) {
        Ejercicio24Intermedio obj = new Ejercicio24Intermedio();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la actividad (dormir/sentado): ");
        String actividad = sc.nextLine();

        System.out.print("Ingrese los minutos: ");
        int minutos = sc.nextInt();

        obj.calcularCalorias(actividad, minutos);
    }
}