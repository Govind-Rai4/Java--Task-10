import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        String Color =obj.nextLine();

        switch (Color) {
            case "Green":
                System.out.println("Go");
                break;
            case "Yellow":
                System.out.println("Get Ready");
                break;
            case "Red":
                System.out.println("Stop");
                break;
            default:
                System.out.println("invailed");
                break;
        }
    }
}