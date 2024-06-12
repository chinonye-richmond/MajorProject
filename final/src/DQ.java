import java.util.Scanner;
public class DQ {
    private int numofq = 30;
    private int[] Cleanliness = new int[numofq];
    private int[] Punctuality = new int[numofq];
    private int[] DressCode = new int[numofq];
    private int[] Health = new int[numofq];
    private int[] Professionalism = new int[numofq];
    private int[] CustomerService = new int[numofq];
    
    //String[] ptype = {"Cleanliness", "Punctuality", "DressCode", "CustomerService", "Health", "Professionalism"};
    
    private Scanner keys = new Scanner(System.in);
        
    public void email(){
        System.out.println("You've just been sent an email to help you prep for your first say of work tomorrow. A) open it B) ignore it ");
        // indicate your answer using the option's corresponding letter
        String one = keys.nextLine();
        if (one == "A"){
            Cleanliness[0] = rand(50,100); 
            Punctuality[0] = rand(50,100);
            DressCode[0] = rand(50,100);
            Health[0] = rand(50,100);
            Professionalism[0] = rand(50,100);
            CustomerService[0] = rand(50,100);        
        }
        else if (one == "B"){
            Cleanliness[0] = rand(0,50); 
            Punctuality[0] = rand(0,50);
            DressCode[0] = rand(0,50);
            Health[0] = rand(0,50);
            Professionalism[0] = rand(0,50);
            CustomerService[0] = rand(0,50);
        }

    }
    private void Average(int[] array){
        if (int[] array == Cleanliness)
        for(int i=0;i<Cleanliness.length;i++){


        }
    }
    public void PrintStats(){

        System.out.println();
    }

    

         

    public int rand(int min, int max) {
        double num = Math.random() * (max - min) + min;
        return (int) num;
    }

}
 // for (int i = 0; i < points.length; i++) {
        //     System.out.println(ptype[i] + " = " + points[i]);
        // }
