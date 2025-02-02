import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q3");
        System.out.println("Enter the number(1-100) : ");
        int num1 = scanner.nextInt();
    if (num1 < 1 || num1 > 100) {
    System.out.println("Invalid number");
}
 else {
    String words = "";
    switch (num1 / 10) {
        case 0 -> {
            switch (num1) {
                case 1 -> words = "One";
                case 2 -> words = "Two";
                case 3 -> words = "Three";
                case 4 -> words = "Four";
                case 5 -> words = "Five";
                case 6 -> words = "Six";
                case 7 -> words = "Seven";
                case 8 -> words = "Eight";
                case 9 -> words = "Nine";
            }
        }
        case 1 -> {
            switch (num1) {
                case 10 -> words = "Ten";
                case 11 -> words = "Eleven";
                case 12 -> words = "Twelve";
                case 13 -> words = "Thirteen";
                case 14 -> words = "Fourteen";
                case 15 -> words = "Fifteen";
                case 16 -> words = "Sixteen";
                case 17 -> words = "Seventeen";
                case 18 -> words = "Eighteen";
                case 19 -> words = "Nineteen";
            }
        }
        case 2 -> words = "Twenty";
        case 3 -> words = "Thirty";
        case 4 -> words = "Forty";
        case 5 -> words = "Fifty";
        case 6 -> words = "Sixty";
        case 7 -> words = "Seventy";
        case 8 -> words = "Eighty";
        case 9 -> words = "Ninety";
        case 10 -> words = "One Hundred";
    }
    if (num1 > 20 && num1 < 100) {
        switch (num1 % 10) {
            case 1 -> words += "-One";
            case 2 -> words += "-Two";
            case 3 -> words += "-Three";
            case 4 -> words += "-Four";
            case 5 -> words += "-Five";
            case 6 -> words += "-Six";
            case 7 -> words += "-Seven";
            case 8 -> words += "-Eight";
            case 9 -> words += "-Nine";
        }
    }
    System.out.println(words);

}
System.out.println("");
System.out.println("");
}
}
