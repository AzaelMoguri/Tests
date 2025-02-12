import java.util.Scanner;

public class ArrayS {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("How many people are in the classroom");
            int tam =sc.nextInt();
            sc.nextLine();
            String array[] = new String[tam];
        System.out.println("Insert the name of ");

        for(int i =0; i<tam; i++){

        System.out.println("Name " +(i+1) +":");
        array[i] = sc.nextLine();
   }
   for(int l=0; l<tam; l++){
    System.out.println("The list is: " +array[l]);
   }
   sc.close();
}
}