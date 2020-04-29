
public class ForRemind {
    public static void main(String[] args) {
        
        int num = 0;

        for(int i=1; i<= 10; i++){        
            if(i % 2 == 0){
                num = num + i;
                continue;
            }
            else{
                System.out.println(i + "이 값은 홀수입니다.");                
            }
            System.out.println(i);       
        } 
    System.out.println("2의 배수의 합은 : " + num);
    }
}