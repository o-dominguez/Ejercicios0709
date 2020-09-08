/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author O-Dominguez
 */
import javax.swing.JOptionPane;
public class Mascotas {
    private String nombre;
    private String edad;
    private String alimento;
    

 public void mostrardatos(){

JOptionPane.showMessageDialog(null,nombre +" "+edad+" "+alimento);
 }
public void ingresodatos()
{
nombre=JOptionPane.showInputDialog("Ingrese el Nombre");
edad=JOptionPane.showInputDialog("Ingrese la edad");
alimento=JOptionPane.showInputDialog("Ingrese el alimento");
}


public static class Canino extends Mascotas {
String color_pelaje;
public void mostrarperro()
{
mostrardatos();
JOptionPane.showMessageDialog(null,color_pelaje);

}
public void ingresoperro()
{
ingresodatos();
color_pelaje=JOptionPane.showInputDialog("Ingrese el color del pelaje");
}
}
public static class Gatuno extends Mascotas{
    String color_ojos;
    public void mostrargato()
{
mostrardatos();
JOptionPane.showMessageDialog(null,color_ojos);
}
public void ingresogato()
{
ingresodatos();
color_ojos=JOptionPane.showInputDialog("Ingrese el color de los ojos");
}
}
public static class Ave extends Mascotas{
 String color_plumaje;
 public void mostrarave(){
 mostrardatos();
 JOptionPane.showMessageDialog(null,color_plumaje);
 }
 public void insertarave()
 {
     ingresodatos();
     color_plumaje=JOptionPane.showInputDialog("Ingrese el color del plumaje");
 }
}
 public static class Roedor extends Mascotas{
     int num_piojos;
 public void mostrarroedor(){
 mostrardatos();
 JOptionPane.showMessageDialog(null,num_piojos);
 
 }
 public void insertarRoedor(){
 ingresodatos();
     String P;
P=JOptionPane.showInputDialog("Ingrese el numnero de piojos");
num_piojos=Integer.parseInt(P);
 }
 }
 
public static void main(String[]args){
    int opc=0;
    String o=JOptionPane.showInputDialog("Ingrese el numnero animal 1-caninos,2-gatos"
            + ", 3 aves, 4 roedores.");
    opc=Integer.parseInt(o);
            switch(opc){
            
                case 1:{
                    Canino perro=new Canino();
                    perro.ingresoperro();
                    perro.mostrarperro();
                    break;
                }
                case 2:{
                    Gatuno Gatunos=new Gatuno();
                    Gatunos.ingresogato();
                    Gatunos.mostrargato();
                break;
                }
                case 3:{
                    Ave gallina=new Mascotas.Ave();
                    gallina.insertarave();
                    gallina.mostrarave();
                    break;}
                case 4:{
                    Roedor hamster=new Roedor();
                    hamster.insertarRoedor();
                    hamster.mostrarroedor();
                    break;}
            }       
    
    

  }
}





