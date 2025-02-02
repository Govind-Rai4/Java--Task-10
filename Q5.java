import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numbers = obj.nextInt();       
        switch ((numbers > 0) ? 1:  (numbers < 0) ? -1 :0) {
            case 1:
                System.out.println(numbers + " is positive.");
                break;
            case -1:
                System.out.println(numbers + " is negative.");
                break;
                case 0:
                System.out.println(numbers + " Zero ");
                break;
            default:
                System.out.println("Enter the correct number!.. ");
                break;
        }
    }
}

