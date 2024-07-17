public class hm_10 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("陣列中所有元素的總和是: " + sum);
    }
}
