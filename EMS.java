import ultra.util.*;
// ------------------------------------------------------User class----------------------------------------
class User
{
int choice ;
void login()
{
Scanner sc = new Scanner(System.in);

System.out.println("\n1.employee\n2.customer\n3.elecmanager");
choice = sc.nextInt();

System.out.println("-----Enter your details------");
if(choice == 1)
{
employee employee1 = new employee();
employee1.employeeLogin();
}

else if(choice == 2)
{
customer customer1=new customer();
customer1.customerLogin();
}

else if(choice == 3)
{
elecmanager elecmanager1 = new elecmanager();
elecmanager1.elecmanagerLogin();
}

else
{
System.out.println("Wrong choice!");
}
}

}

interface myarrear{

    static void hello()
    {
        System.out.println("Hello from ABC Electricity");
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

//--------------------------------employee class -----------------------------------------
class employee extends User
{
private String userName, userPwd;
void employeeLogin()
{
Scanner sc = new Scanner(System.in);
System.out.println("Username : ");
userName = sc.nextLine();

System.out.println("Password : ");
userPwd = sc.nextLine();
if(userName.equals("employee") && userPwd.equals("employee123"))
{
System.out.println("Logged in Successfully!");
}
else
{System.out.println("Login Failed!");}
}
}


//--------------------------------customer class -----------------------------------------


class customer extends User
{
    private String userName, userPwd;
    void customerLogin()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Username : ");
    userName = sc.nextLine();
    
    System.out.println("Password : ");
    userPwd = sc.nextLine();
    if(userName.equals("customer") && userPwd.equals("customer123"))
    {
    System.out.println("Logged in Successfully!");
    }
    else
    {
        System.out.println("Login Failed!");}
    }
}

//--------------------------------elecmanager class -----------------------------------------


class elecmanager extends User
{
    private String userName, userPwd;
    final String billsType;
    void elecanagerLogin()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Username : ");
    userName = sc.nextLine();
    
    System.out.println("Password : ");
    userPwd = sc.nextLine();
    if(userName.equals("elecmanager") && userPwd.equals("elecmanager123"))
    {
    System.out.println("---------------------Logged in Successfully!---------------------");
    System.out.println("\n\nSearch bills based on: \n1. Read number \n2. bills name\n3. bills name & phase name");
    choice = sc.nextInt();
    bills bills1 = new bills();
    if(choice == 1)
    {
        int READNOno;
        System.out.println("Enter Read number: ");
        READNOno = sc.nextInt();

        System.out.println("\n............Searching for bills............\n"); 
        bills1.getbillsDetails(READno);        
    }
    else if(choice == 2)
    {
    //    String billsType;
    // Scanner sc = new Scanner(System.in);
        System.out.println("Enter bills Type: ");
        sc.nextLine();
        billsType = sc.nextLine();

        System.out.println("\n............Searching for bills............\n"); 
        bills1.getbillsDetails(billsType);        
    }
    else
    {System.out.println("bills not found");}
    }
    else
    {System.out.println("Login Failed!");}
}   
}

//--------------------------------Admin class -----------------------------------------


class Admin
{
    private String userName, userPwd;
    void adminLogin()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Username : ");
    userName = sc.nextLine();
    
    System.out.println("Password : ");
    userPwd = sc.nextLine();
    if(userName.equals("admin") && userPwd.equals("admin123"))
    {
    System.out.println("Logged in Successfully!");
    }
    else
    {System.out.println("Login Failed!");}
    }
}

class bills
{
    String Type, phase, division, billsId;
    int  READNO;

    void getbillsDetails(int READNO)
    {
        if(READNO== 1111)
        {
            // READNO= 1111;
            this.billsId = "bills-1";
            this.Type = "basic";
            this.phase = "third";
            this.division = "kolkata";

            display(billsId,Type,phase,division,READNO);
        }
        if(READNO== 2222)
        {
            // READNO= 2222;
            this.billsId = "bills-2";
            this.Type = "ultra";
            this.phase = "second";
            this.division = "Rajarhat";

            display(billsId,Type,phase,division,READNO);
        }
        if(READNO== 3333)
        {
            // READNO= 3333;
            this.billsId = "bills-3";
            this.Type = "medium";
            this.phase = "first";
            this.division = "coochbihar";

            display(billsId,Type,phase,division,READNO);
        }

        else
        {
            System.out.println("\n----bills not found with READNOno: "+READno+"\n");
        }

    }


    void getbillsDetails(String Type)
    {
        if(Type.equals("Basic"))
        {
            this.READNO= 1111;
            this.billsId = "bills-1";
            // this.Type = "basic";
            this.phase = "third";
            this.division = "kolkata";
            display(billsId,Type,phase,division,READNO);
        }
        else if(Type.equals("ultra"))
        {
            this.READNO= 2222;
            this.billsId = "bills-2";
            //this.Type = "ultra";
            this.phase = "second";
            this.division = "Rajarhat";

            display(billsId,Type,phase,division,READNO);
        }
        else if(Type.equals("medium"))
        {
            this.READNO= 3333;
            this.billsId = "bills-3";
            //this.Type = "medium";
            this.phase = "first";
            this.division = "coochbihar";

            display(billsId,Type,phase,division,READNO);
        }
        else
        {
            System.out.println("\n----bills not found with Type named: "+Type+"\n");
        }
    }


    void getbillsDetails(String Type, String phase)
    {
        if(Type.equals("basic") && phase.equals("third"))
        {
            this.READNO= 1111;
            this.billsId = "bills-1";
            // this.Type = "basic";
            // this.phase = "third";
            this.division = "kolkata";
            display(billsId,Type,phase,division,READNO);
        }
        else if(Type.equals("ultra") && phase.equals("second"))
        {
            this.READNO= 2222;
            this.billsId = "bills-2";
            //this.Type = "ultra";
            // this.phase = "second";
            this.division = "Rajarhat";

            display(billsId,Type,phase,division,READNO);
        }
        else if(Type.equals("medium") && phase.equals("first"))
        {
            this.READNO= 3333;
            this.billsId = "bills-3";
            //this.Type = "medium";
            // this.phase = "first";
            this.division = "kolkata";

            display(billsId,Type,phase,division,READNO);
        }
        else
        {
            System.out.println("\n----bills not found with Type named: "+Type+"\n and phase name : "+phase);
        }
    }

    void display(String billsId,String Type,String phase,String division,int READNO)
    {

        // this.Type = Type;


        System.out.println("----------------bills Details : ------------------")  ;
        System.out.println("\t\tbills id : "+billsId);
        System.out.println("\t\tbills name : "+Type);
        System.out.println("\t\tphase : "+phase);
        System.out.println("\t\tdivision : "+division);
        System.out.println("\t\tREADNO: "+READNO);
        System.out.println("-------------------------------------------------")  ;
    }

}
class system{
    final static String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static String lexicon1 = "1234567890";
    final static java.util.Random rand = new java.util.Random();
    
    System.out.println(lexicon.toUpperCase());   // 
    

    // consider using a Map<String,Boolean> to say whether the identifier is being used or not 
    final static Set<String> identifiers = new HashSet<String>();

    public static String electricity_board_name() {
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
}
class EMS
{
public static void main(String args[])
{
int choice ;
region1 obj = new invoice();
obj.run();

Scanner sc = new Scanner(System.in);

System.out.println("\n1.User\n2.Admin");
choice = sc.nextInt();

if(choice==1)
{
User user1 = new User();
user1.login();
}
else if(choice==2)
{
Admin admin1=new Admin();
admin1.adminLogin();
}
}
}

abstract class invoice{

    abstract void count();   
    abstract  int stake;
}

class region1 extends invoice {
 void count()
 {
     System.out.println("calculating fare here..");

 }

}