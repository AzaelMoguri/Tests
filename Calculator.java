import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Whats the first number?");
    int fn = sc.nextInt();
    System.out.println("Whats the next number?");
    int sn = sc.nextInt();

boolean option =true;
int menu;


    while (option) {
        menu = 0;
        System.out.println("What operation you want to do?");
        System.out.println("Press 1 if you want to do an adittion");
        System.out.println("Press 2 if you want to do a substraction");
        System.out.println("Press 3 if you want to do a multiplication");
        System.out.println("Press 4 if you want to do division");
        System.out.println("Press 5 to exit the calculator");
        menu = sc.nextInt();

    switch (menu) {
        case 1:
            System.out.println("The answer is: " +(fn +sn ));
            break;
        case 2:
            System.out.println("The answer is: " +(fn -sn ));
            break;
        case 3:
            System.out.println("The answer is: " +(fn *sn ));
            break;
        case 4:
            System.out.println("The answer is: " +(fn / sn));
            break;
        case 5:
        option = false;

        default:
            break;
    }

    }

}
}


