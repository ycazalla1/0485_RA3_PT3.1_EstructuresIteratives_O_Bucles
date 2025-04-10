/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuresrepetitivesobucles;
import java.util.Scanner;
/**
 * Classe Act1For.
 * Calcula la potència utilitzant el bucle for.
 * @author Bagner i Yamila
 */
public class Act1For {
    
    public static void main(String[] args) {
        
        //Declarem una variable int, que serà el valor del número introduit.
        int numero;
        //Declarem una variable int, que serà per obtenir la potencia.
        int potencia;
        
        Scanner lector = new Scanner(System.in); /*Declarem una varieble de
        tipus Scanner perquè l'usuari puguin introduir un valor.*/
        
        //Missatge per preguntar per un número.
        System.out.print("Introdueix un nombre: ");
        numero = lector.nextInt(); //Ordre per introduir un número.
        
        //Missatge per preguntar per la potència a la que es vol elevar.
        System.out.print("A quina potència vols calcular? ");
        potencia = lector.nextInt(); //Ordre per introduir una potència.
        
        //Declarem una variable int per guardar el numero en el resultat.
        int resultat = numero;
        
        //If que comprova si el valor introduit no és negatiu.
        if (potencia > 0){
            //For per calcular la potència
            for (int i = 1; i < potencia; i++) {
                //Es va incrementant el resultat multiplicant-se pel número.
                resultat *= numero;
            }
            
            //Missatge que mostra el resultat de la potència.
            System.out.println("La potència de " + numero + " elevat a "
                    + potencia + " és igual a: " + resultat);
            
        } else { //Si el nombre és negatiu executa el següent.
            //Missatge per indicar que el l'entrada no és válida.
            System.out.println("La potència introduïda és negativa. No es pot"
                    + " realitzar el càlcul.");
        }
        
    }
    
}
