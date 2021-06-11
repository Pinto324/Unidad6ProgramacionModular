
package src;

public class Ejercicio7 {
    public static void main(String[] args){
    Ejercicio7 ej = new Ejercicio7();
    }    
    int[][] Matriz = new int[4][3];
    public Ejercicio7(){
        LlenarMatriz();
        System.out.println(SumarFilas());
    }
        public void LlenarMatriz(){
            for(int x = 0 ; x < 4 ; x++){
                for(int y = 0 ; y < 3 ; y++){
                    Matriz[x][y] = (int) Math.round(Math.random()*555);
                }
            }    
        }
        public String SumarFilas(){
            System.out.println("la matriz generada es:");
            System.out.println(Matriz[0][0]+" "+Matriz[1][0]+" "+Matriz[2][0]+" "+Matriz[3][0]);
            System.out.println(Matriz[0][1]+" "+Matriz[1][1]+" "+Matriz[2][1]+" "+Matriz[3][1]);
            System.out.println(Matriz[0][2]+" "+Matriz[1][2]+" "+Matriz[2][2]+" "+Matriz[3][2]);
            int Suma = Matriz[0][1]+Matriz[1][1]+Matriz[2][1]+Matriz[3][1];
            return "La suma de la fila par es de: "+Suma;
        }
}
