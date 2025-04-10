/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuresrepetitivesobucles;
import java.util.Scanner;
/**
 * Classe Act2DoWhile.
 * Imprimeix varis cops la frase a escriure en la pissarra.
 * @author Bagner i Yamila
 */
public class Act2DoWhile {
    
    public static void main(String[] args) {
        
        //Declarem una variable int, que serà el valor del número introduit.
        int numero;
        /* Declarem una variable int, que farà de comprovant de número gran i
        instanciador. */
        int i = 1;
        //Declarem un final int per tenir un mínim de vegades obligatori.
        final int MINIM_VEGADES = 500;
        //eclarem un final int per tenir una frase constant.
        final String FRASE_COPIAR = ". Estaré atent a classe.";
        
        Scanner lector = new Scanner(System.in); /*Declarem una varieble de
        tipus Scanner perquè l'usuari puguin introduir un valor.*/
        
        //Missatge per preguntar per un número.
        System.out.print("Introdueix un número gran: ");
        numero = lector.nextInt(); //Ordre per introduir un número.
        
        //DoWhile per preguntar de nou si no és un número gran l'introduit.
        do {
            //If que comprova si és gran el número.
            if (numero >= MINIM_VEGADES){
                //DoWhile per imprimir el número de vegades la frase.
                do {
                    //Missatge que mostra el número de la frase i la frase.
                    System.out.println(i + FRASE_COPIAR);
                    i = i + 1; //Incrementador.
                } while (i <= numero);
            } else { /* Si no és un número gran, mostra un missatge per tornar-lo
                     a escriure. */
                System.out.println("És un número massa petit. Torna'l a escriure. -> ");
                numero = lector.nextInt(); //Ordre per introduir un número.
            }
        } while (i == 1);
    }
}
