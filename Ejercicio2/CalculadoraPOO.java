/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapoo;

import java.util.Scanner;

/**
 *
 * @author Pablo Landos
 */
public class CalculadoraPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadorabasica persona = new Calculadorabasica();
        Calculadoravanzada persona2 = new Calculadoravanzada();
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        double number1;
        double number2;
        double resulta2;
        int resultado;
        int opcion;

        boolean op = true;
        while (op) {
            System.out.println("Calculadoras");
            System.out.println("1.Calculadora Basica");
            System.out.println("2.Calculadora Avanzada");
            System.out.print("Digite la opcion: ");
            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.println("1.Suma");
                System.out.println("2.Resta");
                System.out.println("3.Multiplicacion");
                System.out.println("4.Division");
                System.out.println("5.salir");
                System.out.print("Ingrese su respuesta: ");
                opcion = teclado.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el primer valor: ");
                        numero1 = teclado.nextInt();
                        System.out.print("Ingrese el segundo valor: ");
                        numero2 = teclado.nextInt();
                        resultado = persona.sumar(numero1,numero2);
                        System.out.println("La Suma es: "+ resultado);
                        break;
                    case 2:
                        System.out.print("Ingrese el primer valor: ");
                        numero1 = teclado.nextInt();
                        System.out.print("Ingrese el segundo valor: ");
                        numero2 = teclado.nextInt();
                        resultado = persona.restar(numero1,numero2);
                        System.out.print("La Resta es: "+ resultado);
                        break;
                    case 3:
                        System.out.print("Ingrese el primer valor: ");
                        numero1 = teclado.nextInt();
                        System.out.print("Ingrese el segundo valor: ");
                        numero2 = teclado.nextInt();
                        resultado = persona.multiplicar(numero1,numero2);
                        System.out.print("La Multiplicacion es: "+ resultado);
                        break;
                    case 4:
                        System.out.print("Ingrese el primer valor: ");
                        numero1 = teclado.nextInt();
                        System.out.print("Ingrese el segundo valor: ");
                        numero2 = teclado.nextInt();
                        resultado = persona.dividir(numero1,numero2);
                        System.out.print("La Division es: "+ resultado);
                        break;
                    case 5:
                        op = false;
                        break;
                     default:
                        System.out.println("Solo números entre 1 y 4");
                }

            } else {
                
                System.out.println("1.Potencia");
                System.out.println("2.Opuesto");
                System.out.println("3.Factorial");
                System.out.println("4.salir");
                System.out.print("Ingrese su respuesta: ");
                opcion = teclado.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese  valor: ");
                        number1 = teclado.nextInt();
                        System.out.print("Ingrese el valor de la potencia: ");
                        number2 = teclado.nextInt();
                        resulta2 = persona2.potencia(number1,number2);
                        System.out.println("La Potencia es: "+ resulta2);
                        break;
                    case 2:
                        System.out.print("Ingrese valor: ");
                        numero1 = teclado.nextInt();
                        resultado = persona2.opuesto(numero1);
                        System.out.print("La Resta es: "+ resultado);
                        break;
                    case 3:
                        System.out.print("Ingrese el valor: ");
                        numero1 = teclado.nextInt();
                        resultado = persona2.factorial(numero1);
                        System.out.print("El factorial es: "+ resultado +"\n");
                        break;
                    case 4:
                       op = false;
                        break;
                     default:
                        System.out.println("Solo números entre 1 y 4");
                }
                
            }
        }

    }

}
