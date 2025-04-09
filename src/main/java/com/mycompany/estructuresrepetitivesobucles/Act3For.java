/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructuresrepetitivesobucles;
import java.util.Scanner;
/**
 *
 * @author Bagner i Yamila
 */
public class Act3For {

    public static void main(String[] args) {
        
        int numero; //Declarem una variable int, que serà el valor del número introduit.
        int factorial = 1; //Declarem una variable int, que serà per calcular el factorial.
        
        Scanner lector = new Scanner(System.in); /*Declarem una varieble de tipus
        Scanner perquè l'usuari puguin introduir un valor.*/
        System.out.print("Introdueix un número: "); //Sout per preguntar per un número.
        numero = lector.nextInt(); //Ordre per introduir un número.
             
        if (numero >= 0){
            
            //Sout per donar la primer part de la resposta.
            System.out.print("El fatorial de " + numero + " és: " + numero + "! = " + numero);
            
            for (int i = 1; i <= numero; i++){ //Primer for per calcular el factorial.
                factorial = factorial * i;
                /*El valor i va incrementant de 1 en 1, llavors el factorial es
                multiplicant per i per arribar el factorial.*/
            }
            
            for (int n = numero; 1 < n; n--) { /*Segon for per fer la segona part
                de l'enunciat.*/
                /*Aquest sout, va incrementant el valor de n, perquè aparegui la
                seqüència del factorial*/
                //Per exemple: 5! = 5 * 4 * 3 * 2 * 1
                System.out.print(" x " + (n - 1));
            }
            
            System.out.println(" = " + factorial); /*Fem l'últim sout, per
            introduir el factorial calculat.*/
            
        } else {
            System.out.println("Entrada no vàlida."); /*Sout per indicar que el
            l'entrada no és válida.*/
        } 
    }
}
