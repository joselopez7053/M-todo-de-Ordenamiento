/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodo.ordemaniento;

/**
 *
 * @author DELL
 */import java.util.Scanner;
public class MetodoOrdemaniento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); 

        
        System.out.print("¿Cuantos numeros quieres ingresar? ");
        int cantidad = teclado.nextInt();

        int[] numeros = new int[cantidad]; 

       
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        
        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                  
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
    }
    
}

        
        System.out.println("Arreglo ordenado en orden ascendente:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numeros[i]);
        }
        }
    }