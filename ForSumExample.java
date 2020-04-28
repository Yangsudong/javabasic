public class ForSumExample{
    public static void main(String[] args) {
        
        //1 ..100 까지 합을 구하는 프로그램
        int sum =0;

        for(int i=1; i<=100; i++) {
            if(i % 3 == 0){
            sum = sum + i;
            }
        }
        System.out.println("1~100중의 3의배수의 합 " + sum);

    }
}
