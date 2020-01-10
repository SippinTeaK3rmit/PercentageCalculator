import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter a number");
        int number;
        number = input.nextInt();
        System.out.println("Enter the percentage");
        double percentage;
        percentage = input.nextInt();
        double answer;
        answer = (percentage * number);
        System.out.println(answer/100);

    }
}
