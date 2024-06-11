import java.util.Scanner;
public class DQ {
    int[] points = {0,0,0,0,0,0};
    String[] ptype = {"Cleanliness", "Punctuality", "DressCode", "CustomerService", "Health", "Professionalism"};
    
    Scanner keys = new Scanner(System.in);
        
    public void email(){
        System.out.println("You've just been sent an email to help you prep for your first say of work tomorrow. A) open it B) ignore it ");
        // indicate your answer using the option's corresponding letter
        String one = keys.nextLine();
        if (one == "A"){
            for(int i=0; i<points.length;i++){
                points[i] = points[i] + 

            }
            

        }


    }

    

         

    public int rand(int min, int max) {
        double num = Math.random() * (max - min) + min;
        return (int) num;
    }

}
 // for (int i = 0; i < points.length; i++) {
        //     System.out.println(ptype[i] + " = " + points[i]);
        // }
