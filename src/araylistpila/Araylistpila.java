
package araylistpila;
import java.util.ArrayList;
import java.util.Scanner;

public class Araylistpila {

   
    public static void main(String[] args) {
        
      //capturar informacion que introduce con teclado
      Scanner ca=new Scanner(System.in); 
      
       //declaracion de variables
      int dato;
      int res;
      String nombre;
      
      ArrayList Lista=new ArrayList();
      
      //if es la  instrucció de control
      do{
          //es para mostrar el nombre
      System.out.println("ingresar nombre");
       // lee el primer nombre
      nombre=ca.next();
      Lista.add(nombre);
      
      //es para mostrar la edad
      System.out.println("ingresar edad");
      //lee la edad
      dato=ca.nextInt();
      Lista.add(dato);
      
      //System.out.println, método tamaño de una variable 
      System.out.println("desea continuar 1, 0 para salir");
      res=ca.nextInt();
      
      }
      //while es mientras
      while(res!=0); 
      //for es un siclo
      for (int i=0; i<Lista.size();i++)
      {
          
          System.out.println(Lista.get(i));
      }
    }
 
}
