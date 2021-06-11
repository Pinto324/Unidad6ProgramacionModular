
package src;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
    Ejercicio10 ej = new Ejercicio10();
    }
    int[][] Matriz1 = new int[4][3];
    int[][] Matriz2 = new int[3][4];
    public Ejercicio10(){
        LlenarMatriz();
        MatrizT();
        Impresion();
    }
    public void LlenarMatriz(){
        for(int x = 0 ; x < 4 ; x++){
            for(int y = 0 ; y < 3 ; y++){
                Scanner sc = new Scanner(System.in);
                System.out.println("ingrese el dato que irá en el espacio, x: "+x+" y: "+y);
                Matriz1[x][y] = sc.nextInt();
            }
        }
    }
    public void MatrizT(){
        for(int x = 0 ; x < 3 ; x++){
            for(int y = 0 ; y < 4 ; y++){
                Matriz2[x][y] = Matriz1[y][x];
            }
        }
    }
    public void Impresion(){
    System.out.println("La primera matriz tiene forma: ");
    System.out.println(Matriz1[0][0]+" "+Matriz1[1][0]+" "+Matriz1[2][0]+" "+Matriz1[3][0]);
    System.out.println(Matriz1[0][1]+" "+Matriz1[1][1]+" "+Matriz1[2][1]+" "+Matriz1[3][1]);
    System.out.println(Matriz1[0][2]+" "+Matriz1[1][2]+" "+Matriz1[2][2]+" "+Matriz1[3][2]);
    System.out.println("La segunda matriz tiene forma: ");
    System.out.println(Matriz2[0][0]+" "+Matriz2[1][0]+" "+Matriz2[2][0]);
    System.out.println(Matriz2[0][1]+" "+Matriz2[1][1]+" "+Matriz2[2][1]);
    System.out.println(Matriz2[0][2]+" "+Matriz2[1][2]+" "+Matriz2[2][2]);
    System.out.println(Matriz2[0][3]+" "+Matriz2[1][3]+" "+Matriz2[2][3]);
    }
}
