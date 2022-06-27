import java.util.Scanner;
public class OOP {
    public static void main(String [] args) {
        System.out.println("Welcome to Loralai Shopping Mall.");
        Scanner sn = new Scanner(System.in);
        char choice = sn.next().charAt(0);
        System.out.println("YOur Entered String is :" + choice);
        switch (choice) {
            case 'a':
            System.out.println("Welcome in Electronics Branch.");
            break;
            case 'b':
            System.out.println("Welcome in the Mobile Shop.");
            break;
            case 'x':
            break;
            // exit(1);
        }
    }
}