import java.util.*;
import java.io.*;
import java.io.Console;
import java.io.IOException;
import java.lang.ProcessBuilder;

abstract class electricity {  
  abstract void show(); 
  void electric()
  {
     
	 System.out.println("Welcome to the electricity management system!");
	 
  }
interface show {

    default void message() {
        System.out.println("\n\t Welcome to ABC Electricity \n");
    }
    
    void 

    public void display1();
    public void display2();
    public bill();
   


}

interface myarrear{

    static void hello()
    {
        System.out.println("Hello, New Static Method Here");
    }
   
   interface federataxcredit{
       void fedcredit();  
   }
 void calcarrear();

}

interface demand{

    void calcdemand();

}


class client implements myarrear,demand {
   public void calcarrear() {
      System.out.println("calculating arrear here");
      int arrear=(units consumed*100)/5
		System.out.println("arrear calculated is "+arrear);
   }
   public void demand() {
      System.out.println("calculating overall demand here");

   }
}
class Electricity implements show {

    int maxVal=0;
    
    public void usermessage()
    {
        final int user_id=2147140;
        System.out.println("\nuser_name : ananya"+"\n"+"user_id :"+user_id);
    }
    public void display1()
    {

    }

    public void display2()
    {

    }
  

    static String findWord(String[] arr) {

        // Create HashMap to store word and it's frequency
        HashMap<String, Integer> hs = new HashMap<String, Integer>();

        // Iterate through array of words
        for (int i = 0; i < arr.length; i++) {
            // If word already exist in HashMap then increase it's count by 1
            if (hs.containsKey(arr[i])) {
                hs.put(arr[i], hs.get(arr[i]) + 1);
            }
            // Otherwise add word to HashMap
            else {
                hs.put(arr[i], 1);
            }
        }

        // Create set to iterate over HashMap
        Set<Map.Entry<String, Integer>> set = hs.entrySet();
        String key = "";
        int value = 0;

        for (Map.Entry<String, Integer> me : set) {
            // Check for word having highest frequency
            if (me.getValue() > value) {
                value = me.getValue();
                key = me.getKey();
            }
        }

        // Return word having highest frequency
        return key;
    }

}
class bills extends statistics{
    int pid;
    String p_fname ;
    String p_lname;
    int p_age;
    String phase_no;
    String p_phone_num;
    String p_email;
    float base_salary;
    String p_address;

    bills(int id)
    {
        this.pid=id;
        System.out.println(" Adding a bills ");
    }

    public void add_bills()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first name :  ");
        p_fname=sc.nextLine();
        System.out.print("Enter the last name :  ");
        p_lname=sc.nextLine();
        System.out.print("Enter age :  ");
        p_age = sc.nextInt();sc.nextLine();
        System.out.print("Enter the phase number :  ");
        district = sc.nextLine();
        for(;;)
        {
            System.out.print("Enter the no of phase required:  ");
            phase_no = sc.nextLine();
            phase_no=phase_no.toLowerCase(); //string method tolowercase
            //string comparision
            if ((phase_no.equals("1")) || (phase_no.equals("2")) || (phase_no.equals("3")) || (phase_no.equals("4")) || (phase_no.equals("5")))
            {
                break;
            }
            else
            System.out.println("Invlaid input ");

        }
        System.out.print("Enter the phone number:  ");
        p_phone_num = sc.nextLine();
        System.out.print("Enter the email :  ");
        p_email=sc.nextLine();
        System.out.print("Enter the address :  ");
        p_address = sc.nextLine();
    }
    
    public void display()
    {
        System.out.println("Name :  "+p_fname+" "+p_lname);
        System.out.println("Age :  "+p_age);
        System.out.println("district No :  "+district);
        System.out.println("Contact :  "+p_phone_num+"\n\t"+p_email);
    }

    double cal_sal()
    {
               
        switch(phase_no)
        {
            case "striker":base_salary=50000;break;
            case "mid-fielder":base_salary=45000;break;
            case "goal-keeper":base_salary=42600;break;
            case "forward":base_salary=51920;break;
            case "defender":base_salary=47820;break;
            default: base_salary=35000;break;
        }
        System.out.println(base_salary);
        float HRA = (10.0f / 100.0f) * base_salary;
        float DA = (73.0f / 100.0f) * base_salary;
        float GS = base_salary + DA + HRA;
        float incometax = (30.0f / 100.0f) * GS;
        float netsalary = GS - incometax;
        return netsalary;
    }


}

class client{
    int eqid;
    String cl_name;
    String cl_type;
    int eq_quantity;
    int avail_qty;
    String availability;
    String comments;

    clients(int eqid,String name, String type, int quantity, String comment)
    {
        eq_name=name;
        eq_type = type;
        eq_quantity = quantity;
        avail_qty = quantity;
        comments = comment;
    }
    void book_equip(int n)
    {
        if(n<=avail_qty)
        {
            avail_qty=avail_qty-n;
            System.out.println(" THe client is issued a bill with the reference no ");
        }
        else if(avail_qty==0){
            System.out.println(" The required request  is Current Unavailable ");
            
        }
        else 
        {
            System.out.println(" The phase available right now is "+avail_qty+"\nWould u like to book ?");
            Scanner sc =new Scanner(System.in);
            String nn=sc.nextLine();
            if(nn.equals("yes"))
            {
                book_equip(avail_qty);
            }
            else
            {
                System.out.println("Thank you");
            }
        }
    }
    void display()
    {
        
    }

    public void return_equip(int num)
    {
        avail_qty = avail_qty+num;
        System.out.println("Thank you! Hope to see you soon!");
    }
}

class statistics {
    String stat_id;
    String stat_type;
    int stat_wins;
    int stat_loss;
    int stat_draw;
    int stat_goals;
    int stat_assist;
    int stat_attempt;

    statistics()
    {
        System.out.println(" stats");
    }
    statistics(String type, int wins, int loss, int draw, int goals, int assist, int attempt)
    {
        stat_type = type;
        stat_wins = wins;
        stat_loss = loss;
        stat_draw = draw;
        stat_goals = goals;
        stat_assist = assist;
        stat_attempt = attempt;
    }
    void display_stats()
    {
        
    }

    void update_stats()
    {

    }


}

class gmeter
{
    String game_id;
    String g_name;
    String g_date;
    String g_status;
    int[] g_bills = new int[15];
    void add_game()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<15;i++)
        {
            
        }
    }
}
class system{
    final static String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static String lexicon1 = "1234567890";
    final static java.util.Random rand = new java.util.Random();

    // consider using a Map<String,Boolean> to say whether the identifier is being used or not 
    final static Set<String> identifiers = new HashSet<String>();

    public static String random_name() {
        StringBuilder builder = new StringBuilder();
        while(builder.toString().length() == 0) {
            int length = rand.nextInt(5)+5;
            for(int i = 0; i < length; i++) {
                builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
            }
            if(identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }
    
    public static void ClearConsole(){
        try{
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system
              
            if(operatingSystem.contains("Windows")){        
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();
    
                startProcess.waitFor();
            } 
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
//ABSTRACT
User s=new Admin();
s.login(); 

  
      RunnableDemo R1 = new RunnableDemo( "Thread-1");
      R1.start();
      
      RunnableDemo R2 = new RunnableDemo( "Thread-2");
      R2.start();
        
 try{
                Class temp = Class.forName( "ABC"); 
               }
            catch (ClassNotFoundException e2) {
               
                System.out.println(
                    "Class does not exist check the name of the class");
            }

      try{
              login user1 = new login();
              user1.setPassword("diiiivya");
            }
            catch(Exception e3){
            
                System.out.println(e3);
            }


 


System.out.println("-----------------------------------------------------------------------------------");
//STRING BUFFER
StringBuffer sBuffer=new StringBuffer ("Welcome---To---EMS");
System.out.println("Original String is ::: " + sBuffer + ":: having length " + sBuffer.length());
sBuffer.replace(0,9,"This is ");
System.out.println("eLECTRICITY Management system :: " + sBuffer + " :: having length " + sBuffer.length());
sBuffer.delete(0,7);
System.out.println("Modified String after delete is :: " + sBuffer);


System.out.println("-----------------------------------------------------------------------------------");
//STRING BUILDER
StringBuilder sb=new StringBuilder("WELCOME");  
sb.insert(0,"USER");//now original string is changed  
System.out.println(sb);


	        System.out.println("****************************");
		System.out.println("Enter '1' to login as Admin");
		System.out.println("Enter '2' to login as Student");
		System.out.println("Enter '3' to Exit");
            Scanner sc=new Scanner(System.in);
            int op = sc.nextInt();
System.out.println("Congrats! You have been successfully logged in as an admin!");

class electricity extends storage
{
    int quantity = 50;
    void show()
    {
        
		System.out.printf("Currently there are %d medicines present in the database!\n\n", quantity); 
    }
    public medicines()
    {
        super();
    }

    public medicines(int i, int j)
    {
        System.out.printf("There are currently %d medicines \n\n",i,j);
    }
} 

public class lab {

    static {

        System.out.println(" * * * *  Manager Login * * * *");
    }
    static String usr_name="mitra";
    static String pd="4009";
    static bills[] bills_in_club = new bills[30];
    static clients[] equip_owned = new clients[30];
    static game[]electricity_played = new game[30];
    static int n_bills=0,n_equiments=0,n_games=0,p_id=201,eq_id=101;
    void bills()
    {
        int choice;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("* *  bills Menu * * ");
        System.out.println(" 1. Add Bill \n 2. Edit Bill Details \n 3. Display ALL \n 4.Exit ");
        System.out.print(" Your Choice is : "); 
        choice=sc.nextInt();sc.nextLine();
        switch(choice)
        {
            case 1:bills_in_club[n_bills]=new bills(p_id++);
                    bills_in_club[n_bills].add_bills();
                    n_bills+=1;
                    break;

            case 2:System.out.print(" Enter The bills ID ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    for(int i=0;i<n_bills;i++)
                    {
                        if(bills_in_club[i].pid==id)
                        {
                            bills_in_club[i].add_bills();
                        }
                    }
                    break;
            case 3:for(int i=0;i<n_bills;i++)
                    {
                        bills_in_club[i].display();
                        bills_in_club[i].display_stats();
                    }
                    break;
            case 4:System.out.println("Exiting...."); break;
            default: System.out.println(" Invalid Input");break;
        }
        }while(choice!=4);

    }
    void client()
    {
        int choice,id;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("* *  Equiments Menu * * ");
            System.out.println(" 1. Add client \n 2. book stabilisers  \n 3. view voltage \n 4. Display ALL \n 5.Exit ");
            System.out.print(" Your Choice is : ");
            choice=sc.nextInt();sc.nextLine();
            switch(choice)
            {
                case 1:
                        System.out.println(" Enter the Name of client ");
                        String name=sc.nextLine();
                        System.out.println(" Enter the Type of client ");
                        String type=sc.nextLine();
                        System.out.println(" Enter the no of phase  ");
                        int qty=sc.nextInt(); sc.nextLine();
                        System.out.println(" Enter the description of the concerned phase :  ");
                        String desc=sc.nextLine();
                        equip_owned[n_equiments]=new clients(eq_id++,name,type,qty,desc);
                        n_equiments+=1;
                        break;

                case 2:System.out.print(" Enter The client ID ");
                        id=sc.nextInt();
                        sc.nextLine();

                        for(int i=0;i<n_equiments;i++)
                        {
                            if(equip_owned[i].eqid==id)
                            {
                                System.out.print(" Quantity to be booked : ");
                                int n=sc.nextInt();sc.nextLine();
                                equip_owned[i].book_equip(n);
                            }
                        }
                        break;
                case 3:System.out.print(" Enter The client ID ");
                        id=sc.nextInt();
                        sc.nextLine();

                        for(int i=0;i<n_equiments;i++)
                        {
                            if(equip_owned[i].eqid==id)
                            {
                                System.out.print(" Quantity to be booked : ");
                                int num=sc.nextInt();sc.nextLine();
                                equip_owned[i].return_equip(num);
                            }
                        }
                        break;
                case 4:for(int i=0;i<n_equiments;i++)
                        {
                            equip_owned[i].display();
                        }
                        break;
                case 5:System.out.println("Exiting...."); break;
                default: System.out.println(" Invalid Input");break;
            }
        }while(choice!=4);

    }
    void electricity()
    {   
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println(" * *electricity Menu * * ");
        System.out.println(" 1. Schedule a bill check \n 2. View All electricity bill \n 3. Exit");
        System.out.print(" Your Choice is : ");
        choice=sc.nextInt();sc.nextLine();
        switch(choice)
        {
            case 1:bills[n_bill]=new bill();
                   bills[n_games].add_bill(); 
                    break;
            case 2:break;
            case 3:break;
            default: System.out.println(" Exiting.....");break;
        }
    } 
    
    //commandline arguments
    public static void login()
    {
        Scanner sc = new Scanner(System.in);
        Console con = System.console(); 
        String usr,pass;
        char[] ch=new char[40];
        for(;;)
        {
            system.ClearConsole();
            
            System.out.println(" User Name : ");
            usr=sc.nextLine();
            System.out.println(" Password : ");
            
            ch=con.readPassword();   
            
            pass = String.valueOf(ch);   
        
            if(usr.equalsIgnoreCase(usr_name) && pass.equals(pd)) //string methods
            {
                System.out.println(" Loging in ");
                system.ClearConsole();
                break;
            }
            else{
                System.out.println(" Invalid Input "); 
            }
        }
    }
    
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        lab club=new lab();
        login(); //commandline argument is invoked
        int choice;
        do
        {
            System.out.println(" Welcome to Manager Menu ");
            System.out.println(" 1. bills \n 2. clients \n 3.electricity \n 4. Logout \n");
            System.out.print(" Your Choice is : ");
            choice =sc.nextInt();sc.nextLine();
            
            switch(choice)
            {
                case 1:club.bills();break;
                case 2:club.client();break;
                case 3:club.games();break;
                case 4:System.out.println(" Logging out");  break;
                default: System.out.println(" Invalid Input ");break;

            }
        }while(choice!=4);
        

        
    }
    
    class RunnableDemo implements Runnable {
   private Thread t;
   private String threadName;
   
   RunnableDemo( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
        
             
      }
    try {
            t.join();
        }
        catch (InterruptedException i3) {
            i3.printStackTrace();
        }
   }
}
 class Address  implements Runnable
{
String state,city;
public Address(String state,String city)
{
this.state=state;
this.city=city;
}



 public void run(){
        
        try{Thread.sleep(10000);}
        catch(InterruptedException e)
        {System.out.println(e);
        }  
        System.out.println("The Yearly profit is: "+ yearly_profit);
    }
}
//AGGREGATION



Address a1= new Address("Kerala","Kannur");
Student s1= new Student(1,"Divya ",a1);

Student s2= new Student();
s2.setPassword("Tddd");
 HashSet<String> hashSet = new HashSet<String>();
 System.out.print("Student List");
      hashSet.add("ananya");
      hashSet.add("nikash");
      hashSet.add("roopak");
      hashSet.add("ronav");
      hashSet.add("ritwiz");
      hashSet.add("Aakash");
      
      System.out.println("HashSet = "+ hashSet);
      Set<String> set = new TreeSet<String>(hashSet);
      System.out.println("TreeSet = "+set);
 
}