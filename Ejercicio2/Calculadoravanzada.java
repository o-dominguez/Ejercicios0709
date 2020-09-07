/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapoo;

/**
 *
 * @author lando
 */
public class Calculadoravanzada {
    
    public double potencia(double number1, double number2){
    double resulta2 = 0;
    resulta2 = Math.pow(number1,number2);
    return resulta2;
    }
    public int opuesto(int numero1){
    int resultado = 0;
    resultado = numero1 * -1;
    return resultado;
    }
    public int factorial(int numero1){
    int resultado =0;
    int fact = 1;
    for(int i=1; i<=numero1;i++){
        fact*=i;
    }
     return resultado = fact;
    }
}
