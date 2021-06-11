
package src;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
    Ejercicio9 ej = new Ejercicio9();
    }
    int[][] Matriz1;
    int[][] Matriz2;
    int[][] MatrizSumada;
    int C1;
    int F1;
        public Ejercicio9(){
        FilasyColum();
        LlenarMatriz();
        Suma();
        }
        public void FilasyColum(){
            Scanner sc = new Scanner(System.in);
            System.out.println("ingrese el numero de filas para ambas matrices");
            F1 = sc.nextInt();
            System.out.println("ingrese el numero de columnas para ambas matrices");
            C1 = sc.nextInt();
            Matriz1 = new int[C1][F1];
            MatrizSumada = new int[C1][F1];
            Matriz2 = new int[C1][F1];
        }
        public void LlenarMatriz(){
        System.out.println("\ningrese los datos para la matriz 1");    
        Scanner sc = new Scanner(System.in);
        for(int x = 0 ; x < C1 ; x++){
            for(int y = 0 ; y < F1 ; y++){                
                System.out.println("ingrese el dato que irá en el espacio, x: "+(x+1)+" y: "+(y+1));
                Matriz1[x][y] = sc.nextInt();
            }
        }
        System.out.println("\ningrese los datos para la matriz 2");
        for(int x = 0 ; x < C1 ; x++){
            for(int y = 0 ; y < F1 ; y++){             
                System.out.println("ingrese el dato que irá en el espacio, x: "+(x+1)+" y: "+(y+1));
                Matriz2[x][y] = sc.nextInt();
            }
        }
    }
        public void Suma(){
           for(int x = 0 ; x < C1 ; x++){
            for(int y = 0 ; y < F1 ; y++){ 
                MatrizSumada[x][y] = Matriz1[x][y] + Matriz2[x][y];
            }
           }
           System.out.println("\nla suma de las matrices da");
           for(int x = 0 ; x < C1 ; x++){
            for(int y = 0 ; y < F1 ; y++){ 
               System.out.println("\nel valor en la matriz sumada en la posición x: "+(x+1)+" y: "+(y+1)+" es:");
               System.out.println(MatrizSumada[x][y]);
            }
           }
        }
        
}
