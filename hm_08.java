import java.util.Scanner;

public class hm_08 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入您的姓名: ");
        String name = scanner.nextLine();

        System.out.print("請輸入您的年齡: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("請輸入您所在的城市: ");
        String city = scanner.nextLine();

        System.out.println("您的姓名是: " + name);
        System.out.println("您的年齡是: " + age);
        System.out.println("您所在的城市是: " + city);
        scanner.close();
    }
}
