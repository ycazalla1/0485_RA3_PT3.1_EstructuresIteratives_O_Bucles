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
public class Act2For {
    
    public static void main(String[] args) {
        
        int numero;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Introdueix un número gran: ");
        numero = lector.nextInt();
        
        for (int j = 0; j == 0;) {
           if (numero >= 100){
                for (int i = 1; i <= numero; i++) {
                    System.out.println(i + ". Estaré atent classe.");
                    j = j + 1;
                } 
            } else {
                System.out.println("És un número massa petit. Torna'l a escriure. -> ");
                numero = lector.nextInt();
            }
        
        }
    }
}
