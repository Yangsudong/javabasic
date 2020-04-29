
public class MethodExample {
    public static void main(String[] args) {
            
    // method 타입만 다르면 이름은 같아도됨   
        /*System.out.println("result : " + sum(10, 20));
        System.out.println("result : " + sum(10.5, 20.1));
        System.out.println("result : " + sum(10, 20, 30));    
        System.out.println("1~5의 합 : " + toSum(1, 5));
        printStar(1,3);
        System.out.println("============");
        printStar(1,5); 
        System.out.println("============");
        printStar(3);                   */

        printDouble(7,7); //printDouble 메소드로 인해 값을 주면 앞의값 * 뒤의값을 계산한다
        printString("&&&&&","*****");
        printStar(3, "Hello");
        printGugudan(7);
    } 
    public static void printGugudan(int dan){
        System.out.println(dan +" 단");
        for(int i=1; i<=9; i++){            
            System.out.println(dan + " X "+ i + " = " + dan * i);    
        }  
    }
    public static void printString(String str,String name){
        System.out.println(str + "," + name);
    }

    public static void printDouble(int a,int b){
               
        int printDouble = a * b;
        System.out.println(a + " X " + b +" = " + printDouble );
        
    }
    public static void printStar(int a,String str){
               
        for(int i=1; i<=a; i++){                 
            System.out.println(str);
        }        
    }
    public static void printStar(int a, int b){
               
        for(int i=a; i<=b; i++){                 
            System.out.println("*****");
        }        
    }

    public static int toSum(int num1, int num2){
        int sum = 0;
        for(int i=num1; i<=num2; i++){
            sum += i;
        }
        return sum;
    }

    public static int sum(int a, int b) {
        int sum = 0;
        sum = a +  b;
        return sum;    
    }
    public static double sum(double a, double b) {
        double sum = 0;
        sum = a +  b;
        return sum;    
    }
    public static int sum(int a, int b,int c) {
        int sum = 0;
        sum = a +  b + c;
        return sum;    
    }

}