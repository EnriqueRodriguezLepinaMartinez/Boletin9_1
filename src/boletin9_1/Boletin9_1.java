/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author Ricky
 */
public class Boletin9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //Ejercicio 1
        Scanner sc = new Scanner(System.in);
        int positivo =0, negativo =0, neutro =0;
        int[] array = new int[10];
        
         for (int i=0; i<10; i++) {
            System.out.print("numeros[" + i + "]= ");
            array[i] = sc.nextInt();
        }
        
        for(int i=0;i<10;i++){
            if(array[i]>0)
                positivo++;
            else if(array[i]==0)
                neutro++;
            else
                negativo++;
        }
        
        System.out.println("Positivos = " + positivo + " Neutros = " + neutro + " Negativo = " + negativo);
    }
}
