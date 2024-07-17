import java.util.Random;

public class hm_11 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); 
        }
        
        System.out.print("陣列元素: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        
        System.out.println("陣列中的最大值是: " + max);
    }
}
