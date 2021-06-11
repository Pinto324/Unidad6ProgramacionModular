
package src;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
    Ejercicio8 ej = new Ejercicio8();
    }    
    String[] Matriz1 = new String[5];
    String[] Matriz2 = new String[5];
        public Ejercicio8(){
        LlenarMatriz();
        System.out.println(comparar());
        }
        public void LlenarMatriz(){
            System.out.println("\ningrese los datos para la matriz 1");
            Scanner sc = new Scanner(System.in);
                for(int x = 0 ; x < 5 ; x++){
                        System.out.println("ingrese el dato que irá en el espacio, x: "+(x+1));
                        Matriz1[x] = sc.nextLine();                       
                    }
                System.out.println("\ningrese los datos para la matriz 2");
                for(int x = 0 ; x < 5 ; x++){
                        System.out.println("ingrese el dato que irá en el espacio, x: "+(x+1));
                        Matriz2[x] = sc.nextLine();                       
                    }
        }
        public String comparar(){
            int Tamano1 = Matriz1[0].length();
            int Tamano2 = Matriz2[0].length();
                if(Tamano1 == Tamano2){
                    return "La palabra de ambas matrices en el indice 1 tiene un tamanio de "+Tamano1+" y si son iguales";
                }else{
                    return "La palabra de ambas matrices en el indice 1 tiene un tamanio de arreglo 1=  "+Tamano1+" y el arreglo 2 tiene = "+Tamano2+ " por lo tanto: No son iguales";
                }
        }
            
}
