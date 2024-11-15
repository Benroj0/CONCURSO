package concurso;

public class Ejercicio14 {
//Crea una función que ordene y retorne una matriz de números.
//- La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro  adicional "Asc" o "Desc" para 
    //indicar si debe ordenarse de menor a mayor o de mayor a menor.
//- No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.

    public static int[] ordenar(int[] arr, String orden) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((orden.equals("Asc") && arr[i] > arr[j]) || (orden.equals("Desc") && arr[i] < arr[j])) {
                    // Intercambio de valores
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] matriz = {10, 8, 7, 3, 13};
        String orden = "Asc"; // Cambiar a "Desc" para orden descendente
        int[] resultado = ordenar(matriz, orden);

        System.out.print("Matriz ordenada: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}
