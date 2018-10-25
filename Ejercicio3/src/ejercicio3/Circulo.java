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
public class Circulo {
    private double radio;
    private final double PI = 3.14;
    
public Circulo(){
   
}

    
public Circulo(double radio){
    this.radio=radio;
      
}
public void setradio (double radio){
    this.radio = radio;
}
public double getradio(){
    return radio;
}
public double calcularArea(){
   
    double area = PI* Math.pow(radio, 2);
    return area;
 //   return PI*Math.pow(radio, 2);
  
}
public double calcularLongitud(){
    return 2*PI*radio;
 //  double longitud = 2*PI*radio;
 //   return longitud;
}
}
