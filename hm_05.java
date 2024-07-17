public class hm_05 {
    public static void main(String[] args) {
        int a = 12;
        int b = 7;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.printf("%-10s: %d%n", "和", sum);
        System.out.printf("%-10s: %d%n", "差", difference);
        System.out.printf("%-10s: %d%n", "積", product);
        System.out.printf("%-10s: %d%n", "商", quotient);
        System.out.printf("%-10s: %d%n", "餘數", remainder);
    }
}
