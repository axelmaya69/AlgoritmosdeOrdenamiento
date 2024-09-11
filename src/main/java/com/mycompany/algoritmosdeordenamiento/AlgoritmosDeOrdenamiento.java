package com.mycompany.algoritmosdeordenamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author axelmaya
 */
public class AlgoritmosDeOrdenamiento {

    int i, j, temporal;

    public AlgoritmosDeOrdenamiento() {
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
    }

    /*  
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
        }*/
    public void mostrar(int[] arreglo) {
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.print(" " + arreglo[k] + " ");
        }
        System.out.println();
    }

    public void radix(int[] arreglo) {
        int x, y, j;
        for (x = Integer.SIZE - 1; x > 0; x--) {
            int auxiliar[] = new int[arreglo.length];
            j = 0;
            for (int i = 0; i < arreglo.length; i++) {
                boolean mover = arreglo[i] << x >= 0; //indica la cantidad de bits a desplazarse
                if (x == 0 ? !mover : mover) { //
                    auxiliar[j] = arreglo[i];
                    j++;
                } else {
                    arreglo[i - j] = arreglo[i];
                }
            }
            for (i = j; i < auxiliar.length; i++) {
                auxiliar[i] = arreglo[i - j];
            }
            arreglo = auxiliar;
        }
        System.out.println("Ordenamiento con radix: ");
        mostrar(arreglo);
    }

    public void quicksort(int[] arreglo, int primero, int ultimo) {
        int i, j, pivote, auxiliar;
        i = primero;
        j = ultimo;

        pivote = arreglo[(primero + ultimo) / 2];

        do {

            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            if (i <= j) {
                auxiliar = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = auxiliar;
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            quicksort(arreglo, primero, j);
        }
        if (i < ultimo) {
            quicksort(arreglo, i, ultimo);

        }
        mostrar(arreglo);
    }

    public void insercion(int[] arreglo, int n) {
        int i, j, auxiliar;
        for (i = 1; i < n; i++) {
            auxiliar = arreglo[i];
            j = i - 1;
            while (j >= 0 && arreglo[j] > auxiliar) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = auxiliar;
        }
        mostrar(arreglo);
        
    }
    
    public void shell(int [] arreglo){
        int salto,i,j,k,auxiliar;
        salto= arreglo.length/2;
        
        while(salto>0){
            for (i=salto;i<arreglo.length; i++) {
                j=i-salto;
                while(j>=0){
                    k=j+salto;
                    if(arreglo[j]<=arreglo[k]){
                        j=-1;
                    }else{
                        auxiliar=arreglo[j];
                        arreglo[j]=arreglo[k];
                        arreglo[k]=auxiliar;
                        j-=salto;
                    }
                }
                
            }
            salto=salto/2;
        }
        mostrar(arreglo);
        
    }

    public static void main(String[] args) {
        //AlgoritmosDeOrdenamiento burbuja = new AlgoritmosDeOrdenamiento();
        //AlgoritmosDeOrdenamiento radix = new AlgoritmosDeOrdenamiento();
        //AlgoritmosDeOrdenamiento quicksort = new AlgoritmosDeOrdenamiento();
        //AlgoritmosDeOrdenamiento insercion = new AlgoritmosDeOrdenamiento();
        AlgoritmosDeOrdenamiento shell = new AlgoritmosDeOrdenamiento();
        int numeros[] = {12, 23, 43, 1, 2, 3, 54, 5, 65, 11, 5};
        
        
        shell.shell(numeros);
        // burbuja.burbuja(numeros);
        //burbuja.mostrar(numeros);
        //radix.radix(numeros);
        //quicksort.quicksort(numeros, 0, numeros.length-1);
      /*  int tam;
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Numeros "));
        int vector[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa: " + i));
            insercion.insercion(vector, i+1);
        }
*/
    }
}
