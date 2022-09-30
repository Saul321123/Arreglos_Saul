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
public class Ejercicio_Arreglos_5 {//inicia el metodo
public static void main(String[] args) {//inicia metodo main
//restamos La posicion mayor (Z, añadiendole 1) a la posicion menor
char abecedario[]=new char[91-65];
//creamos el abecedario
for(int i=65, indice=0;i<91;i++, indice++){
abecedario[indice]=(char)i;//agregamos los valores para la variable for y crear el bucle
}
Scanner sn=new Scanner(System.in);
//Pedimos un numero, que serán posiciones del array
System.out.println("inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
int num=sn.nextInt();
String cadena="";
while(num!=-1){
//Comprobamos que el número es correcto
if(num>=0 && num<abecedario.length){//creamos la variable if
cadena+=abecedario[num];
System.out.println("inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
}else{
System.out.println("Numero no valido inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
}
num=sn.nextInt(); //lo pedimos de nuevo
}
//Resultado final
System.out.println("La cadena resultante es "+cadena);
}
}