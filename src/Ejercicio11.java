
package src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio11 {
    float[] Cal = new float[6];
    String[] Nombres = new String[6];
    String[] Notas = {"Suspenso", "Bien","Notable","Sobresaliente"};
    DecimalFormat formato = new DecimalFormat("#.00");
    public static void main(String[] args){
    Ejercicio11 ej = new Ejercicio11();
    }
    public Ejercicio11(){
        for(int i = 0; i<6; i++){
        PedirDatos(i);        
        }
        for(int i = 0; i<6; i++){
        ImprimirNotas(i);        
        }
    }
    
    public void PedirDatos(int No){
        Scanner scanner = new Scanner(System.in);
        Scanner no = new Scanner(System.in);
        boolean indicador;
        System.out.println("Ingrese el nombre No."+(No+1)+":");
        Nombres[No] = scanner.nextLine();
        System.out.println("Ingrese la nota No."+(No+1)+":");
        float p = no.nextFloat();
        do{
            if(p >= 0 && p<11){
            Cal[No] = p;
            indicador = false;
            }else{
            System.out.println("La nota no es valida");
            indicador = true;
            System.out.println("Ingrese una nota valida:");
            p = scanner.nextFloat();
            }
        }while(indicador);    
    }
    
    public void ImprimirNotas(int No){
        System.out.println("El alumno: "+Nombres[No]+" con nota de: "+Cal[No]+" tiene examen "+ CalculoResultado(Cal[No]));
    }
    
    public String CalculoResultado(float Nota){
        if(Nota>=0&&Nota<5.00){
            return Notas[0];
        }else if (Nota>=5&&Nota<7.00){
            return Notas[1];
        }else if (Nota>=7&&Nota<9.00){
            return Notas[2];
        }else if (Nota>=9&&Nota<10.01){
            return Notas[3];
        }
    return "ocurrio un fallo";    
    }
    
}
