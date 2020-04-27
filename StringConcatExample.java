
public class StringConcatExample {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + "," + str2;
        System.out.println(str3);
        
        System.out.println("result : " + 3 + 30); //문자열이 앞에있어서 문자열로 인식하고 33이 아닌 330이 나온다
        
        System.out.println("result : " + (3 + 30)); //(우선순위) 33이 나온다
        System.out.println(3+ 30 + "result : "); // 숫자가앞에 오면 숫자로 인식하고 계산식으로 계산 뒤에는 문자열그대로
    
    }

}