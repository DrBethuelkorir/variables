import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double totalAmount;
        double principle;
        int rate;
        double compoundPeriods;
        double Years;


        System.out.println("Enter the principal amount:");
        principle = scanner.nextDouble();

        System.out.println("Enter the interest rate (as a percentage):");
        rate = scanner.nextInt();

        System.out.println("Enter the number of compound periods per year:");
        compoundPeriods = scanner.nextDouble();

        System.out.println("Enter the number of years:");
        Years = scanner.nextDouble();

        totalAmount = principle * Math.pow(1 + (rate / 100.0) / compoundPeriods, compoundPeriods * Years);

        System.out.println("The total amount after " + Years + " years is $" + totalAmount);

        scanner.close();
    }
}

