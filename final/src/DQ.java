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

    public int rand(int min, int max) {
        double num = Math.random() * (max - min) + min;
        return (int) num;
    }

        
    public void email(){
        System.out.println("You've just been sent an email to help you prep for your first say of work tomorrow. \n a) open it \n b) ignore it ");
        // indicate your answer using the option's corresponding letter
        String one = keys.nextLine();
        if (one == "a"){
            Cleanliness[0] = rand(50,100);
            Punctuality[0] = rand(50,100);
            DressCode[0] = rand(50,100);
            Health[0] = rand(50,100);
            Professionalism[0] = rand(50,100);
            CustomerService[0] = rand(50,100);
            System.out.println("Job title: Dairy Queen Cashier");
            System.out.println("Job description: You are responsible for taking orders, handling cash and card transactions, providing excellent customer service, maintaining a clean and organized work area, and ensuring accuracy if orders.");
            System.out.println("Shift: 9am to 5pm \n Wages: $17 per hour" );
            System.out.println("Important rules:\n You must be punctual; must arrive at least 10 minutes before start of shift. \n Follow the dress code precisely. ");
            System.out.println("Dress Code \n All employees must wear a Dairy Queen hat/visor and shirt. \n Black slip-resistant work shoes are mandatory. \n Either jeans or black pants are permitted (ripped pants and leggings are not allowed). \n Long hair must be worn in a bun. ");
        }
        else if (one == "b"){
            Cleanliness[0] = rand(0,50);
            Punctuality[0] = rand(0,50);
            DressCode[0] = rand(0,50);
            Health[0] = rand(0,50);
            Professionalism[0] = rand(0,50);
            CustomerService[0] = rand(0,50)
        }

    }

    public void alarm(){
        System.out.println("It's 7am and your alarm is blaring. \n a) Get up and start getting ready. \n b) Hit snooze ")
        String two = keys.nextLine();
        if (two == "a"){
            Punctuality[1] = rand(50,100);
        }
        else if (two == "b"){
            Punctuality[1] = rand(0,50);
        }
    
    }

    public void fit(){
        int one, two, three, four;
        System.out.println("Pick your outfit for work:");
        System.out.println("Top: a) DQ shirt b) graphic tee");
        String i keys.nextLine();
        System.out.println("Bottom: a) black dress pants b) leggings");
        String ii keys.nextLine();
        System.out.println("Accessories: a) DQ hat b) trucker hat");
        String iii keys.nextLine();
        System.out.println("Hair: a) braids up in a bun b) braids let down");
        String iv keys.nextLine();

        if (i == "a" ){
            one = rand(50,100);
        }
        else if (i == "b"){
            one = rand(0,50);
        }

        if (ii == "a" ){
            two = rand(50,100);
        }
        else if (ii == "b"){
            two = rand(0,50);
        }
        if (iii == "a" ){
            three = rand(50,100);
        }
        else if (iii == "b"){
            three = rand(0,50);
        }
        if (iv == "a" ){
            four = rand(50,100);
        }
        else if (iv == "b"){
            four = rand(0,50);
        }

        DressCode[1] = (one + two + three + four)/4;
    }

    public void brekkie(){
        System.out.println("You have time for a quick breakfast.\n a) eat something before leaving \n b) skip breakfast");
        String three = keys.nextLine();
        if (three = "a"){
            Health[1] = rand(50,100);
        }
        else if (three = "b"){
            Health[1] = rand(0,50);
        }
    }

    public void leave(){
        System.out.println("It's 8.30am and you're ready to leave for work(It's a 7 minute drive).\n a) leave now \n b) chill for about 15 minutes ");
        String four = keys.nextLine();
        if (four = "a"){
            Punctuality[2] = rand(50,100);
        }
        else if (four = "b"){
            Punctuality[2] = rand(0,50);
        }
    }
}

    // private void Average(int[] array){
    //     if (int[] array == Cleanliness)
    //     for(int i=0;i<Cleanliness.length;i++){


    //     }
    // }

    // public void PrintStats(){

    //     System.out.println();
    // }

 // for (int i = 0; i < points.length; i++) {
        //     System.out.println(ptype[i] + " = " + points[i]);
        // }
