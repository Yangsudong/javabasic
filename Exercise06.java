
public class Exercise06 {
    public static void main(String[] args) {
        // 교재 P.135 6번문제
        
        printTriangle(5);
    
    }
    public static void printTriangle(int a){
        for(int i=0; i<=a; i++){    
            System.out.println();                
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            
        }
    }    
}