public class ch6_1 {

        public static void main(String[] args) {
            int [] a=new int[10];
            a[0]=9;
            a[1]=6;
            a[2]=5;
            a[3]=7;
            a[4]=1;
            a[5]=9;
            a[6]=11;
            a[7]=16;
            a[8]=14;
            a[9]=20;


            for (int i = 0; i <a.length; i++) 
                System.out.printf("a[%d]=%d, ,",i,a[i]);
            System.out.printf("length=%d", a.length);
        }
}