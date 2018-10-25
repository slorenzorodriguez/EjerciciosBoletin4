/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author slorenzorodriguez
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo Circulo1 = new Circulo(10d);
        System.out.println("La circunferencia es = "+ Circulo1.calcularLongitud());
        System.out.println("El area es "+Circulo1.calcularArea());
    }
    
}
