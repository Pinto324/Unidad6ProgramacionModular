import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        Ejercicio3 p = new Ejercicio3();
    }
    int numero [] = new int[8];
    Scanner sn = new Scanner(System.in);
    boolean siesta;
    public Ejercicio3(){
        IngresarNumero();
        for(int i = 0;i<numero.length;i++){
            BuscarNumero(i);
        }

    }
    public void IngresarNumero(){
        for(int i = 0; i < numero.length;i++){
            System.out.print("Ingrese un numero al arreglo: ");
            numero[i] = sn.nextInt();
        }
    }
    public void BuscarNumero(int j){
         System.out.println("Ingrese el numero que desea buscar");
         int o = sn.nextInt();
             if (numero[j] == o){
                 System.out.println("VERDADERO, el numero si esta en el arreglo");
             }else{
              if (numero[j] != o){
                System.out.println("FALSO, el numero no esta en el arreglo");
              }
            }
        }
    }
