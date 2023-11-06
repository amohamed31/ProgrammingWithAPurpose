import java.text.DecimalFormat;
import java.util.Random;

public class UniRandNumbers {
    public static void main(String[] args) {
        Random rand = new Random();

        double num1 = rand.nextDouble();
        double num2 = rand.nextDouble();
        double num3 = rand.nextDouble();
        double num4 = rand.nextDouble();
        double num5 = rand.nextDouble();

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String roundedNumber1 = decimalFormat.format(num1);
        String roundedNumber2 = decimalFormat.format(num2);
        String roundedNumber3 = decimalFormat.format(num3);
        String roundedNumber4 = decimalFormat.format(num4);
        String roundedNumber5 = decimalFormat.format(num5);

        num1 = Double.parseDouble(roundedNumber1);
        num2 = Double.parseDouble(roundedNumber2);
        num3 = Double.parseDouble(roundedNumber3);
        num4 = Double.parseDouble(roundedNumber4);
        num5 = Double.parseDouble(roundedNumber5);

        System.out.println("Random Num 1: " + roundedNumber1);
        System.out.println("Random Num 2: " + roundedNumber2);
        System.out.println("Random Num 3: " + roundedNumber3);
        System.out.println("Random Num 4: " + roundedNumber4);
        System.out.println("Random Num 5: " + roundedNumber5);

        double avg = (num1 + num2 + num3 + num4 + num5) / 5;

        double max = Math.max(num1, num2);
        max = Math.max(max, num3);
        max = Math.max(max, num4);
        max = Math.max(max, num5);

        double min = Math.min(num1, num2);
        min = Math.min(min, num3);
        min = Math.min(min, num4);
        min = Math.min(min, num5);

        System.out.println("\nAverage: " + decimalFormat.format(avg));

        System.out.println("\nMax: " + decimalFormat.format(max));

        System.out.println("\nMin: " + decimalFormat.format(min));



    }
}
