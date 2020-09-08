/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author VM-User
 */
public class Estudiante {
    private Scanner teclado;
    private String Nombre;
    private String Apellido;
    private String Materia[];
    public void Insertar(){
       teclado= new Scanner(System.in);
       Materia=new String[5];
       System.out.print("Inserte el nombre");
       Nombre=teclado.next();
       System.out.print("Inserte el Apellido");
       Apellido=teclado.next();
       System.out.print("Inserte la primera materia");
       Materia[0]=teclado.next();
       System.out.print("Inserte la segunda materia");
       Materia[1]=teclado.next();
       System.out.print("Inserte la tercera materia");
       Materia[2]=teclado.next();
       System.out.print("Inserte la cuarta materia");
       Materia[3]=teclado.next();
       System.out.print("Inserte la quinta materia");
       Materia[4]=teclado.next();}
   public void escribir() {
        System.out.println(Nombre);
        System.out.println(Apellido);
    for(int i=0;i<5;i++){
        System.out.println(Materia[i]);
        }
      }
   public static void main(String[]ar){
       Estudiante Estudiante1;
       Estudiante1=new Estudiante();
       Estudiante1.Insertar();
       Estudiante1.escribir();
      }       
}


