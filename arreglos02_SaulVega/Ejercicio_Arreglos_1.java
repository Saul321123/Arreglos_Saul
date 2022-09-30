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
public class Ejercicio_Arreglos_1 {//inicia el metodo

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//iniciar metodo main
        // TODO code application logic here
//Creo el array
int[] numeros=new int[100];
//Lo recorro y le asigno números
for(int i=0;i<numeros.length;i++){
numeros[i]=i+1;//se suma cada ver un valor 
System.out.println(numeros[i]);//imprimir el numero cada vez que sume 
}
}
}
