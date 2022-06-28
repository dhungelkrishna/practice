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
            System.out.println("Which Mobile do you want? ");
            String mobile = sn.next();
            switch(mobile) {
                System.out.println("Enter 'y' to buy phone or Enter 'n' to Exit from it. ");
                Char input = sn.next().charAt();
                case "samsung" :
                System.out.println("There is only one Mobile in the Database. Samsung.");
                yesno(input);
                break;
                case "iphone" :
                System.out.println("There is Iphone in the Database.");
                yesno(input);
            }

            case 'x':
            break;
            // exit(1);
        }

    }
    Char y = 'x';
    static void yesno(y) {
        if(y == 'y') {
            System.out.println("Bought Successfully.");
            break;
        }
        if(y = 'n') {
            System.out.println("Okay, you're Returning.");
            break;
        }
    }
    void returnfunc() {
        System.out.println("Hello Progaram.");
    }
}
// 9741862183  driver 
// 3264 dolakha darshan