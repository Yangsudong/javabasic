public class IfExample{
    public static void main(String[] args) {
        
        int score = 77;
        if(score > 90) {                    
            System.out.println("점수가 90점 이상입니다.");
            if(score >= 95) {
                System.out.println("등급은 A+입니다.");
                }
            else{
                System.out.println("등급은 A입니다.");
                }
            }
        else if(score >= 80) {
                System.out.println("점수가 80점 이상입니다.");
                if(score >= 85) {
                System.out.println("등급은 B+입니다.");
                }
                else{
                System.out.println("등급은 B입니다.");
                }
            }
        else if(score >= 70) {
                System.out.println("점수가 70점 이상입니다.");
                if(score >=75) {
                    System.out.println("등급은 C+ 입니다.");
                }
                else{
                System.out.println("등급은 C입니다.");
                }
            }
        else {
                System.out.println("점수가 70점 미만입니다.");
            }    
            
        System.out.println("end of program.");     

    }
}