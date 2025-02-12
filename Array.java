import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");
            int tam =sc.nextInt();
            int array[] = new int [tam];
        System.out.println("Ingrese los elementos del arreglo");

        for(int i =0; i<tam; i++){
        System.out.println("elemento " +(i+1) +":");
        array[i] = sc.nextInt();

   }
   for(int l=0; l<tam; l++){
    System.out.println("El arreglo queda de la siguiente forma " +array[l]);
   }
}
}