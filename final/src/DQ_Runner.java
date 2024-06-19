// Welcome to "First Day of Work"
public class DQ_Runner {
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to your first day of work. \nThis text based game takes you through a first day of working as a cashier and determines, from your performance, if you get to keep your job.");
        
        DQ game = new DQ();
        game.email();
        game.alarm();
        game.fit();
        game.brekkie();
        game.leave();
        game.workstation();
        game.f_c();
        game.f_c1();
        game.supervisor();
        game.clean_up();
        game.lunch();
        game.a_c();
        game.end_shift();
        
        game.PrintStats();
        
    
        
       
        
        
            
        
    
    }


}
