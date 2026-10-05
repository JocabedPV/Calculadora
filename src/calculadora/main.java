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
    
    //con dos parametros
    System.out.println();
    System.out.println("====DOS PARAMETROS====");
    System.out.println();
    
    System.out.println("Sumar dos parametros (5 + 8) es igual a " + calc.sumar(5,3));
    System.out.println("Restar dos parametros (10 - 4) es igual a " + calc.restar(10,4));
    System.out.println("Multiplicar dos parametros (20 x 10) es igual a " + calc.multiplicar(20,10));
    System.out.println("Division dos parametros (50 / 5) es igual a " + calc.dividir(50,5));
    
    
        //con tres parametros
    System.out.println();
    System.out.println("====TRES PARAMETROS====");
    System.out.println();
    

    System.out.println("Sumar tres parametros (9 + 6 + 4) es igual a " + calc.sumar(9,6,4));
    System.out.println("Restar tres parametros (71 - 6 - 250) es igual a " + calc.restar(71,6,250));
    System.out.println("Multiplicar tres parametros (5 x 80 x 12) es igual a " + calc.multiplicar(5,80,12));
    
    //con cuatro parametros
    System.out.println();
    System.out.println("====CUATRO PARAMETROS====");
    System.out.println();
    

    System.out.println("Sumar cuatro parametros (25 + 40 + 80 + 30) es igual a " + calc.sumar(25,40,80,30));
    System.out.println("Restar cuatro parametros (22 - 67 - 94 - 13) es igual a " + calc.restar(22,67,94,13));
    System.out.println("Multiplicar cuatro parametros (57 * 90 * 102 * 35) es igual a " + calc.multiplicar(57,90,102,35));

    
    }
    
    
}


