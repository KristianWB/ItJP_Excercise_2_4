import java.util.Scanner;

public class ConvertSquaremeterIntoPing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define the amount of square meters
        System.out.print("Type in the amount of square meter to convert into ping: ");
        double squareMeter = input.nextDouble();

        // Calculate and print out the converted number in ping with 2 decimals

        // 1. we calculate the unargumented ping value
        double unargumentedPing = squareMeter * 0.3025;

        // 2. We calculate the argumented pingvalue with 2 decimals in 3 steps a and b and c, where a is the predecimal part and b is the post decimal part

        // part a. Predecimal Ping
        double preDecimalPing = (int)unargumentedPing;

        //Part b. PostDecimal Ping
        double var1 = unargumentedPing % 1;
        double var2 = var1 * 100;
        double var3 = (int)var2;
        double postDecimalPing = var3 / 100;

        //Part c. Assemble pre and post decimal pingvalue into the complete argumented pingvalue
        double argumentedPing = postDecimalPing + preDecimalPing;

        System.out.print("The number in ping is: " + argumentedPing);
    }
}
