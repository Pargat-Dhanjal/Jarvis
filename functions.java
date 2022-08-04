import java.util.*;
class functions 
{
     input ob=new input();
     Scanner sc=new Scanner (System.in);
    void avg()    
    {
        System.out.println("How many numbers would you like take Average of ?");
        int a=(int)ob.numi();
        double p;
        double c=0;
        for(int b=0;b<a;b++)       
        {
          System.out.println("Enter the numbers One by one");
          p=ob.numi();
          c=c+p;        }
        System.out.println("The Average of the entered numbers is "+((c/a)*100.0)+"\n");    
    }
    void fact()   
    {
        System.out.println("Enter the Number whose Factors you would like to know ?");
        int a=ob.numi();
        int c=0;
        for(int b=1;b<=a;b++)        
        {
            if(a%b==0)    
            {
            System.out.println(b);
            c++;        
        }       
    }
        if(c<=2) System.out.println("The Entered number is a Prime Number");
        else     System.out.println("The Entered number is not a Prime Number");    
    }
    void drc()    
    {
        System.out.println("Select your Conversion");
        System.out.println("Currently 1 Dollar is equal to 67 Rupees");
        System.out.println("1. Dollar to Rupees");
        System.out.println("2. Ruppes to Dollar");
        int a=ob.numi();
        while(true)
        {        
        if(a==1)      
        {
            System.out.println("Enter Dollars");
            double b=ob.numd();
            System.out.println("The Rupees Conversion is "+(b*80));
            break;       
        }
        else if(a==2)      
        {
            System.out.println("Enter Rupees");
            double b=ob.numd();
            System.out.println("The Dollar Conversion is "+(b*(0.013)));
            break;        
        }
        else     System.out.println("Please Chosse the valid option"); 
    } 
}
    void temp()    
    {
        System.out.println("Choose your Conversion");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int a=(int)ob.numi();
        while(true)
        {        
        if(a==1)     
        {
            System.out.println("Enter Celsius");
            double b=ob.numd();
            System.out.println("The Fahrenheit Conversion is "+(b*1.8 + 32.0));
            break;       
        }
        else if(a==2)       
        {
            System.out.println("Enter Fahrenheit");
            double b=ob.numd();
            System.out.println("The Celsius Conversion is "+(5/9.0*(b-32.0)));
            break;       
        }
        else        
        {
           System.out.println("Please Chosse the valid option");        
        }
    }
}
}