/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuresrepetitivesobucles;
import java.util.Scanner;
/**
 *
 * @author Bagner i Yamila
 */
public class Act1For {
    
    public static void main(String[] args) {
        
        int numero;
        int potencia;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Introdueix un nombre: ");
        numero = lector.nextInt();
        
        System.out.print("A quina potència vols calcular? ");
        potencia = lector.nextInt();
        
        int resultat = numero;
        
        if (potencia > 0){
            
            for (int i = 1; i < potencia; i++) {
                resultat *= numero;
            }
            System.out.println("La potència de " + numero + " a " + potencia + " és igual a: " + resultat);
            
        } else {
            System.out.println("La potència introduïda és negativa. No es pot realitzar el càlcul.");
        }
        
    }
    
}
