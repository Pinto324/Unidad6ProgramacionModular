import java.util.*;
public class Ejercicio1{
    public static void main(String[] args) {
        Ejercicio1 e = new Ejercicio1();
        
    }
    int [] elementros = new int[5];
    Scanner sn = new Scanner(System.in);
    public Ejercicio1(){
         for(int i = 0;i<5;i++){
             pedirValor(i);
         }
         for(int i = 0;i<5;i++){
            mostrarDato(i);
        }
        double promedio = getPromedio();
        System.out.println("El Promedio es "+promedio);
    }
    public double getPromedio(){
        int total = 0;
        for(int i = 0;i<5;i++){
            total += elementros[i];
        }
        double promedio = (double)total/5;
        return promedio;
    }
    public void mostrarDato(int numero){
        System.out.println("El indice es "+numero+" el valor es: "+elementros[numero]);
    }
    public void pedirValor(int numero){
        System.out.println("Ingrese el valor No."+numero+":");
        elementros[numero] = sn.nextInt();
    }
}
