
public class WhileExample {
public static void main(String[] args) {
    
    int sum = 0;
    for(int i =1; i <=5; i++) {
        sum = sum + i;
    }
    int i = 1;
    while(i <= 5){
        sum = sum + i;
        i++;
    }
    System.out.println(sum);
    i = 1;
    sum = 0; 
    while(true){
        sum = sum + i;
        if( i> 5) {
            break;
        } 
    }
    sum = 0;
    i = 1;
    while(i<=100){        
        if( i % 2 == 1) {
            sum = sum + i;             
        }        
    } 
    System.out.println("sum :" +sum);
    }
}