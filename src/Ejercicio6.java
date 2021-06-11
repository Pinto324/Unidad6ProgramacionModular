import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {
          Ejercicio6 H = new Ejercicio6();    
    }
    int Num[][] = new int[3][3];
    int a,b = 0;
    Scanner sn = new Scanner(System.in);

    public Ejercicio6(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Ingresar(i, j);
                Multiplicar(i, j);
            }
        }
        Mostrar();
    }

    public void Ingresar(int h,int j){
            System.out.println("Ingrese un Valor ");
            Num[h][j] =  sn.nextInt();
    }

    public void Multiplicar(int h,int j){
                Num[h][j] *= 2;
    }

    public void Mostrar(){
        for (int i = 0; i < 3; i++) {
            System.out.print(Num[0][i]+" ");
        }
        System.out.print("\n");
        for (int i = 0; i < 3; i++) {
            System.out.print(Num[1][i]+" ");
        }
        System.out.print("\n");
        for (int i = 0; i < 3; i++) {
            System.out.print(Num[2][i]+" ");
        }
    }
}

