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
public class Arreglos_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        int[] numeros=new int[100];
         
        int suma=0;
        double media;
         
        for(int i=0;i<numeros.length;i++){
            numeros[i]=i+1;
            suma+=numeros[i];
        }
         
        System.out.println("La suma es "+suma);
         
        media=(double)suma/numeros.length;
         
        System.out.println("La media es "+media);
         
    }
     
}
