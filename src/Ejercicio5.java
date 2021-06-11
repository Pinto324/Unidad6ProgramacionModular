public class Ejercicio5 {
    public static void main(String[] args) {
            Ejercicio5 P = new Ejercicio5();
        }
        public Ejercicio5(){
            numeroDeNotas = (int)(Math.random()*100+1);
            System.out.println("El numero de notas a generar es de: "+numeroDeNotas);
            inicializarArregloNotas(numeroDeNotas);
            for(int i=0; i<numeroDeNotas; i++){
                mostrarNotas(i);
            }
            hallarMedia();
        }
        int[] notaIngresada = new int[100];
        int numeroDeNotas=0, notaMedia=0, ultimaPosicion=0, sumatoriaNotas=0;
        public void inicializarArregloNotas(int numeroNotas){
            for(int i=0; i<(numeroNotas-1); i++){
                notaIngresada[i] = (int)(Math.random()*10);
            }
            notaIngresada[numeroNotas-1] = -50;
        }
        public void mostrarNotas(int posicion){
            System.out.println("La nota "+(posicion+1)+" es de: "+notaIngresada[posicion]);
        }
        public void hallarMedia(){
            for(int i=0; i<(numeroDeNotas-1); i++){
                sumatoriaNotas += notaIngresada[i];
            }
            notaMedia = sumatoriaNotas/(numeroDeNotas-1);
            System.out.println("La Media de las Notas es de: "+notaMedia);
        }
    }