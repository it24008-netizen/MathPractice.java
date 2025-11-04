
public class MathPractice {
    public static void main(String[] args) {
        System.out.println("=== Practicing Java Math Class Methods ===\n");

        // 1️⃣ Equation 1: Finding the square root of a number
        double num1 = 49;
        double result1 = Math.sqrt(num1);
        System.out.println("1. √" + num1 + " = " + result1);

        // 2️⃣ Equation 2: Finding power (x^y)
        double base = 5, exponent = 3;
        double result2 = Math.pow(base, exponent);
        System.out.println("2. " + base + "^" + exponent + " = " + result2);

        // 3️⃣ Equation 3: Finding absolute value
        double num2 = -18.9;
        double result3 = Math.abs(num2);
        System.out.println("3. |" + num2 + "| = " + result3);

        // 4️⃣ Equation 4: Finding maximum and minimum
        int a = 25, b = 40;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println("4. Max(" + a + ", " + b + ") = " + max);
        System.out.println("   Min(" + a + ", " + b + ") = " + min);

        // 5️⃣ Equation 5: Using trigonometric function (sin)
        double angle = 30; // degree
        double radians = Math.toRadians(angle);
        double result5 = Math.sin(radians);
        System.out.println("5. sin(" + angle + "°) = " + result5);

        // Extra Example: Rounding a decimal value
        double value = 9.8765;
        double rounded = Math.round(value);
        System.out.println("\nExtra: Rounded value of " + value + " = " + rounded);

        System.out.println("\n=== End of Program ===");
    }
}
