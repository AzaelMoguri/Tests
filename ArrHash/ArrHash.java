import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ArrHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> hm = new HashMap<>();
         ArrayList <String> al = new ArrayList<>();
         al.add("HELLO");
         al.add("World!");
         al.add("idk");
         
         hm.put(1, "You");
         hm.put(2, "smell");
         hm.put(3, "funky");

        boolean menu = true;
        int option = 0;
         while (menu) {
            System.out.println("""
                    Select an option
                    
                    1 See the ArrayList
                    2 See the HashMap
                    3 Exit

                    """);
            System.out.println("Which option you want: ");
            option =sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("This is the ArrayList: " +al);
                    break;
                case 2:
                    System.out.println("This is the HashMap: " +hm);
                    break;
                case 3:
                    sc.close();
                    break;
                default:
                System.out.println("Number not valid");
                    break;
            }
            
         }

    }

    }
