import java.util.Scanner;
import java.util.Random;
public class DQ {
    private Random r = new Random();
    private int numofq = 5;
    private int[] Cleanliness = new int[numofq];
    private int[] Punctuality = new int[numofq];
    private int[] DressCode = new int[numofq];
    private int[] Health = new int[numofq];
    private int[] Professionalism = new int[numofq];
    private int[] CustomerService = new int[numofq];
    
    //String[] ptype = {"Cleanliness", "Punctuality", "DressCode", "CustomerService", "Health", "Professionalism"};
    
    private Scanner keys = new Scanner(System.in);

    public int rand(int min, int max) {
        max++;
        int num = r.nextInt(max - min) + min;
        return num;
    }

        
    public void email(){
        System.out.println("You've just been sent an email to help you prep for your first say of work tomorrow. \n a) open it \n b) ignore it ");
        // indicate your answer using the option's corresponding letter
        String one = keys.nextLine();
        if (one.equals("a")){
            Cleanliness[0] = rand(50,100);
            Punctuality[0] = rand(50,100);
            DressCode[0] = rand(50,100);
            Health[0] = rand(50,100);
            Professionalism[0] = rand(50,100);
            CustomerService[0] = rand(50,100);
            System.out.println("Important email from employer!!\nJob title: Dairy Queen Cashier");
            System.out.println("Job description: You are responsible for taking orders, handling cash and card transactions, providing excellent customer service, maintaining a clean and organized work area, and ensuring accuracy if orders.");
            System.out.println("Shift: 9am to 5pm \n Wages: $17 per hour" );
            System.out.println("Important rules:\n You must be punctual; must arrive at least 10 minutes before start of shift. \n Follow the dress code precisely. ");
            System.out.println("Dress Code \n All employees must wear a Dairy Queen hat/visor and shirt. \n Black slip-resistant work shoes are mandatory. \n Either jeans or black pants are permitted (ripped pants and leggings are not allowed). \n Long hair must be worn in a bun. ");
        }
        else if (one.equals("b")){
            Cleanliness[0] = rand(0,50);
            Punctuality[0] = rand(0,50);
            DressCode[0] = rand(0,50);
            Health[0] = rand(0,50);
            Professionalism[0] = rand(0,50);
            CustomerService[0] = rand(0,50);
        }

    }

    public void alarm(){
        System.out.println("\nIt's 7am and your alarm is blaring. \n a) Get up and start getting ready. \n b) Hit snooze ");
        String two = keys.nextLine();
        if (two.equals( "a")){
            Punctuality[1] = rand(50,100);
        }
        else if (two.equals( "b")){
            Punctuality[1] = rand(0,50);
        }
    
    }

    public void fit(){
        int [] dresscode = new int[4];
        System.out.println("\nPick your outfit for work:");
        System.out.println("Top: a) DQ shirt b) graphic tee");
        String i = keys.nextLine();
        System.out.println("Bottom: a) black dress pants b) leggings");
        String ii = keys.nextLine();
        System.out.println("Accessories: a) DQ hat b) trucker hat");
        String iii = keys.nextLine();
        System.out.println("Hair: a) braids up in a bun b) braids let down");
        String iv = keys.nextLine();

        if (i.equals( "a" )){
            dresscode[0] = rand(50,100);
        }
        else if (i.equals( "b")){
            dresscode[0] = rand(0,50);
        }

        if (ii.equals("a")){
            dresscode[1] = rand(50,100);
        }
        else if (ii.equals( "b")){
            dresscode[1] = rand(0,50);
        }
        if (iii.equals( "a")){
            dresscode[2] = rand(50,100);
        }
        else if (iii.equals("b")){
            dresscode[2] = rand(0,50);
        }
        if (iv.equals( "a")){
            dresscode[3] = rand(50,100);
        }
        else if (iv.equals( "b")){
            dresscode[3] = rand(0,50);
        }

        DressCode[1] = Average(dresscode);

    }

    public void brekkie(){
        System.out.println("\nYou have time for a quick breakfast.\n a) eat something before leaving \n b) skip breakfast");
        String three = keys.nextLine();
        if (three.equals("a")){
            Health[1] = rand(50,100);
        }
        else if (three .equals("b")){
            Health[1] = rand(0,50);
        }
    }

    public void leave(){
        System.out.println("\nIt's 8.30am and you're ready to leave for work(It's a 7 minute drive).\n a) leave now \n b) chill for about 15 minutes ");
        String four = keys.nextLine();
        if (four.equals( "a")){
            Punctuality[2] = rand(50,100);
        }
        else if (four.equals( "b")){
            Punctuality[2] = rand(0,50);
        }
    }

    public void workstation(){
        System.out.println("\nYou have arrived at work and have now settled into your workstation. You have to clean your workstation.\n a) wipe your designated surfaces \nb) carry on without cleaning");
        String clean = keys.nextLine();
        if (clean.equals("a")){
            Cleanliness[1] = rand(50,100);
        }
        else if (clean.equals("b")){
            Cleanliness[1] = rand(0,50);
        }
    }

    public void f_c(){
        System.out.println("\nYour first customer of the day is before you.\n a) greet them with a smile then take their order\n b) take their order straight away with a frown");
        String nice = keys.nextLine();
        if (nice.equals("a")){
            CustomerService[1] = rand(50,100);
        }
        else if (nice.equals("b")){
            CustomerService[1] = rand(0,50);
        }

    }

    public void f_c1(){
        System.out.println("\nYou've taken their order, and you need to move on to the next person. What would you say to the customer in front of you?\n a)  Could you please move off to the side to wait for your order\n b) yell, 'NEXT!!'");
        String nice1 = keys.nextLine();
        if (nice1.equals("a")){
            CustomerService[2] = rand(50,100);
        }
        else if (nice1.equals("b")){
            CustomerService[2] = rand(0,50);
        }
    }

    public void supervisor(){
        System.out.println("\nYour supervisor has pulled you aside for a quick chat about how your first day is going.\n a) Say its going great and express your gratitude for being giving a spot on the team\n b) Complain about your day");
        String chat = keys.nextLine();
        if (chat.equals("a")){
            Professionalism[1] = rand(50,100);
        }
        else if (chat.equals("b")){
            Professionalism[1] = rand(0,50);
        }
    }

    public void clean_up(){
        System.out.println("\nA customer has just spilt a soda near your workstation. What do you want to do? \n a) Clean it up\n b) ignore it");
        String soda = keys.nextLine();
        if (soda.equals("a")){
            Cleanliness[2] = rand(50,100);
        }
        else if (soda.equals("b")){
            Cleanliness[2] = rand(0,50);
        }
    }

    public void lunch(){
        System.out.println("\nIt is time for your lunch break, and you've gone to the staff room.\n a) chat and get to know your colleagues\n b) isolate yourself from everyone");
        String brk = keys.nextLine();
        if (brk.equals("a")){
            Professionalism[2] = rand(50,100);
        }
        else if (brk.equals("b")){
            Professionalism[2] = rand(0,50);
        }
    }

    public void a_c(){
        System.out.println("\nAn angry customer is before you. They are angry because they asked for extra cheese in their burger but cheese was left out completely. What do you want to do? \n a) Apologize and offer to have a new one made \nb) Tell them that because you didnt take their order, there's nothing you can do");
        String serve = keys.nextLine();
        if (serve.equals("a")){
            CustomerService[3] = rand(50,100);
        }
        else if (serve.equals("b")){
            CustomerService[3] = rand(0,50);
        }
    }

    public void end_shift(){
        System.out.println("\nYou have finally reached the end of your shift!!");
        System.out.println("You are leaving the building. What do you do on your way out? \n a) bid your colleagues a goodnight \nb) leave without saying a word to anyone ");
        String end = keys.nextLine();
        if (end.equals("a")){
            Professionalism[3] = rand(50,100);
        }
        if (end.equals("b")){
            Professionalism[3] = rand(0,50);
        }
    }

    private int Average(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum = sum + array[i];
        }
        int avg = sum/array.length;
        return avg;
    }

    private int retention(){
        int sum = Average(Health) + Average(CustomerService) + Average(DressCode) + Average(Professionalism) + Average(Punctuality) + Average(Cleanliness);
        int averg = sum/6;
        return averg;
    }

    public void PrintStats(){
        int score = retention();

        System.out.println("\nBelow are the scores you earned throughout your first day working as a cashier at DQ.");
        System.out.println("These scores determine your chances of retention as an employee");
        System.out.println("Health:" + Average(Health));
        System.out.println("Customer Service:" + Average(CustomerService));
        System.out.println("Dress Code:" + Average(DressCode));
        System.out.println("Professionalism:" + Average(Professionalism));
        System.out.println("Cleanliness:" + Average(Cleanliness));
        System.out.println("Punctuality:" + Average(Punctuality));
        System.out.println("\n Your retention score is " + retention() + "%");
        
        if (score < 25){
             System.out.println("As a result of your extremely poor score, you are fired!");
        }
        else if (score < 50){
            System.out.println("As a result of your poor score, your probationary period has been extended.");
        }
        else if (score < 75){
            System.out.println("As a result of your good score, your probationary period has been reduced.");
        }
        else if (score < 100){
            System.out.println("As a result of your extremely good score, you  are due for a raise after your shortened probation");
        }
    }

}

    

    

 
