/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete04;

/**
 *
 * @author utpl
 */
public class Problema033 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            for (int contador = 1; contador <= i; contador++) {
                
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int contador = 1; contador <= i; contador++) {
                
                System.out.printf("%s", "*");   
            }
            System.out.println();
        }
    }
}
