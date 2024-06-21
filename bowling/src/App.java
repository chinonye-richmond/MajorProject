import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in); 

        System.out.println("Enter a bowling score between 0 and 300");
        
        System.out.println("Please enter the bowling score (-1 to quit): ");
        int score = keys.nextInt();
        double elite = 0;
        double average = 0;
        

        while (score > 0){

            
            if (score >= 200){
                elite = elite +1.0;
            }
            else if (score < 200 && score > 0 ){
                average = average +1.0;
            }
            System.out.println("Please enter the bowling score (-1 to quit): ");
            score = keys.nextInt();
            
        }

        
        double total = elite + average;
        double elite_p = (elite/total) * 100.0 ;
        double average_p = (average/total) * 100.0 ;

        System.out.println("Elite Bowlers: " + elite_p + "%");
        System.out.println("Average Bowlers: " + average_p + "%");

        
        

        
        

        
    }
    
}
