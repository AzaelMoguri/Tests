import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Whats the size of the array");
            int tam =sc.nextInt();
            int array[] = new int [tam];
        System.out.println("Enter the numbers of the array");

        for(int i =0; i<tam; i++){
        System.out.println("Number " +(i+1) +":");
        array[i] = sc.nextInt();

   }
   for(int l=0; l<tam; l++){
    System.out.println("This is your array: " +array[l]);
   }
   sc.close();
}
}