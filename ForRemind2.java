
public class ForRemind2 {
    public static void main(String[] args) {
        
        // 2의배수이면서 3의 배수인 값을 출력    
        for(int i=1; i <= 20; i++){           
            if((i % 2 == 0) && (i % 3 == 0)) {
            System.out.println("2와 3의 공통배수 : " + i);
            }
            else if((i % 2 == 0) || (i % 3 == 0)) {
            System.out.println("2 또는 3의 배수 : " + i);
            }
        }   
    }  
}