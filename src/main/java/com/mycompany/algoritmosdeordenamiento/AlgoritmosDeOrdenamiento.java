 

package com.mycompany.algoritmosdeordenamiento;

/**
 *
 * @author axelmaya
 */
public class AlgoritmosDeOrdenamiento {
    int i,j,temporal;
    
    public AlgoritmosDeOrdenamiento(){ 
        this.i=0;
        this.j=0;
        this.temporal=0;
    }
    
    
    public void burbuja(int [] arreglo) {
        for ( i = 0; i < arreglo.length; i++) {
            for ( j = i+1; j <arreglo.length ; j++) {
                if (arreglo[i]>arreglo[j]) {
                     temporal=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temporal;
                }
                    
                }
            }
        }
    public void mostrar(int[] arreglo){
        int k;
        for (k=0; k<arreglo.length;k++) {
            System.out.print(" "+arreglo[k]+" ");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) { 
       AlgoritmosDeOrdenamiento burbuja = new AlgoritmosDeOrdenamiento();
       int numeros[]={12,23,43,1,2,3,54,5,65,11,5};
               
       burbuja.burbuja(numeros);
       burbuja.mostrar(numeros);
        
        
        
        
        
        
    }
}
