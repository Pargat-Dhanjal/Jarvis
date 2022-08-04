import java.util.*;
class jarvis
{
    public static void main(String[]args)
    {
        detect ob=new detect();
        help ob1=new help();
        load ob2=new load();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome !");
        System.out.println("Jarvis is booting");
        ob2.load();
        System.out.println();
        System.out.println("Hi, this is Jarvis ! Your Personal Assistant");
        System.out.println("Here to help you !");
        System.out.println("And You ?");
        String n=sc.nextLine();//designed by pargat
        System.out.println();
        System.out.println("##########################################################################################");
        System.out.println();
        System.out.println("Hi "+n+" nice To Meet you !");
        System.out.println("You can try Typing Calculator or Patterns and for More Functions Ask me \"What can you do ?\"");
        System.out.println("New ? Try typing \"Help\" to learn Things that I can do for You");
        System.out.println("To exit, try typing bye !");
        System.out.println();
        System.out.println("##########################################################################################");
        System.out.println();
        int t1=101;
        for(int p1=0;p1>-1;p1++){
        if(p1%5==0 && p1!=0)
        System.out.println("What else can I do for you "+n+" ?");
        else
        System.out.println("So "+n+" how can I help ?");
        String s=sc.nextLine();
        int a=ob.search(s.toLowerCase(),t1);
        if(a==-1){
       System.out.println("See you Later "+n+" Bye !");
       // System.exit(0);
        break;}
        if(a==0)
        System.out.println("Sorry I can't understand you... Try typing something else");
        else if(a==1)        
        System.out.print("Hello ! ");
        else if(a==2)
        ob1.help();
        else if(a==3)
        System.out.print("Namaste ! ");
        else if(a==4)
        System.out.println("Great ! ");
        else if(a==5)
        System.out.println("Waiting for you to ask me something");
        else if(a==6)
        ob1.wcyd();
        else if(a==7)
        System.out.println("You are "+n+" Thats How you Introduced me");
        else if(a==8)
        System.out.println("Thank you "+n);
        if(a>=100) t1=a;
    }
}}