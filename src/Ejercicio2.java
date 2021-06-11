public class Ejercicio2 {
    public static void main(String[] args) {
        Ejercicio2 m = new Ejercicio2();
    }
    int [] numAleatorio = new int[10];
    int numMayor = 0;
    int numMenor= 99;
    public Ejercicio2(){
        for(int i = 0; i<numAleatorio.length;i++){
            llenarArray(i);
        }
        for(int i = 0;i<numAleatorio.length;i++){
            mostrarArray(i);
        }
        for(int i=0;i<numAleatorio.length;i++){
            mayor(i);
        }
        System.out.println("El numero mayor es: "+numMayor);
        System.out.println("El numero maenor es: "+numMenor);
    }
    public void llenarArray(int l){
        numAleatorio[l] = (int)(Math.random()*99);
       }
    public void mostrarArray(int l){
        System.out.println("El numero aleatorio es: "+numAleatorio[l]);
    }
    public void mayor(int l){
        for(int i=0; i<numAleatorio.length; i++){
            if(numAleatorio[l]>numMayor){
                numMayor = numAleatorio[i];
            }
            else if(numAleatorio[i]<numMenor){
                numMenor = numAleatorio[l];
            }
        }
    }
}
