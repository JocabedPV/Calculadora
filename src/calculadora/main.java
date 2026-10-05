/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author jocab
 */
public class main {
    public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    
    System.out.println("Sumar dos parametros (5 + 8) es igual a " + calc.sumar(5,3));
    System.out.println("Restar dos parametros (10 - 4) es igual a " + calc.restar(10,4));
    System.out.println("Multiplicar dos parametros (20 x 10) es igual a " + calc.multiplicar(20,10));
    System.out.println("Division dos parametros (50 ÷ 5) es igual a " + calc.dividir(50,5));
    
    }
    
    
}


