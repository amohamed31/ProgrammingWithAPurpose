public class ThreeSort {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);

        double max = Math.max(num1, num2);
        max = Math.max(max, num3);

        double min = Math.min(num1, num2);
        min = Math.min(min, num3);

        double middle = (num1 + num2 + num3) - (max + min);

        System.out.println(max + " " + middle + " " + min);
    }
}
