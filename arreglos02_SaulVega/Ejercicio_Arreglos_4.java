/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datos_apps_saul;

/**
 *
 * 
 */
import java.util.Scanner;

public class Ejercicio_Arreglos_4 {//inicia el metodo

public static void main(String[] args) {//creamos el metodo main

Scanner sn=new Scanner(System.in);

//Pedimos una longitud
System.out.println("Inserte una longitud");
int longitud=sn.nextInt();//introducido por usuario

//creo un array con esa longitud
int numeros[]=new int[longitud];//creamos la variable int para numeros enteros

//recorro el arreglo y uso la funcion para crear un aleatorio
for(int i=0;i<numeros.length;i++){//creamos la variable if
numeros[i]=generaNumeroAleatorio(0,10);
System.out.println("En la posicion "+i+" esta el valor: "+numeros[i]);
}

}

//Crea un numero aleatorio, entre un minimo y un maximo
public static int generaNumeroAleatorio(int minimo, int maximo){

return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));

}

}
  