/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructuresrepetitivesobucles;
import java.util.Scanner;
/**
 *
 * @author Bagner i Yamila
 */
public class Act3DoWhile {

    public static void main(String[] args) {
        
        int numero; //Declarem una variable int, que serà el valor del número introduit.
        int factorial = 1; //Declarem una variable int, que serà per calcular el factorial.
        
        Scanner lector = new Scanner(System.in); /*Declarem una varieble de tipus
        Scanner perquè l'usuari puguin introduir un valor.*/
        System.out.print("Introdueix un número: "); //Sout per preguntar per un número.
        numero = lector.nextInt(); //Ordre per introduir un número.
        
        //Declarem la variable i per fer de comptador del primer DoWhile.
        int i = 1;
        int n = numero; /*Declarem la variable n per fer de comptador del segon DoWhile.
        Aquest és igual a la variable numero per no passar-se del valor que
        introdueix l'usuari.*/
        
        if (numero >= 0){ //If que comprova si el valor introduit no és negatiu.
            
            //Sout per donar la primer part de la resposta.
            System.out.print("El fatorial de " + numero + " és: " + numero + "! = " + numero);
            
            //DoWhile per calcular el factorial fins arribar al valor introduit.
            do {
                factorial = factorial * i;
                i += 1; //Incrementador
            } while (i <= numero);
            
            //DoWhile per que s'imprimeixi el següent.
            do {
                /*Aquest sout, va incrementant el valor de n, perquè aparegui la
                seqüència del factorial*/
                //Per exemple: 5! = 5 * 4 * 3 * 2 * 1
                System.out.print(" x " + (n - 1));
                n -= 1; //Desincrementador
            } while (1 < n);
            
            //Fem l'últim sout, per introduir el factorial calculat.
            System.out.println(" = " + factorial);
        } else { //Si el nombre és negatiu executa el següent.
            
            System.out.println("Entrada no vàlida.");/*Sout per indicar que el
            l'entrada no és válida.*/
            
        }
    }
}
