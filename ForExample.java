public class ForExample {
    public static void main(String[] args) {
        
        int sum = 0;
        sum = sum + 1; 
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        sum = 0;

        for(int i =1; i <=5; i++) {
            sum = sum + i;
            System.out.println(sum + " , " + i);
        }
       /*
        System.out.println("sum의 : " + sum);
        System.out.println(2 + " * " + 1 + " = " + (2*1));
        System.out.println(2 + " * " + 2 + " = " + (2*2));
        System.out.println(2 + " * " + 3 + " = " + (2*3));
        */      
        int var1 =3;
        for(int i=1; i <=9; i++) {                
            System.out.println( var1 + " * " + i + " = " + (var1 * i));
        }
    
    }
}
