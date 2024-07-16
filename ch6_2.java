public class  ch6_2 {
    public static void main(String[] args) {
        int sum=0;
        int[] a={62,7,12,3,8,47,60,63};

        for (int i = 0; i < a.length; i++) 
            sum+=a[i];
        System.out.printf("average = %5.2f",(float)sum/a.length);
    }
}