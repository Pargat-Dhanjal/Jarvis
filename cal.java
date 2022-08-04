import java.util.*;
class cal
{
    int num(String a)
    {
        int l=a.length()-1;
        int sp,ss,sm,sd,sr,min;
        sp=a.indexOf('+'); //4
        ss=a.indexOf('-'); //-1
        sm=a.indexOf('*'); //2
        sd=a.indexOf('/'); //-1
        sr=a.indexOf('%');
        if(sp==-1) sp=l;
        if(ss==-1) ss=l;
        if(sm==-1) sm=l;
        if(sd==-1) sd=l;
        if(sr==-1) sr=l;
        min=Math.min((Math.min((Math.min(sp,ss)),(Math.min(sm,sd)))),sr);
        return(min);
    }
    void cal()
    {
        Scanner sc=new Scanner(System.in);
        cal ob=new cal();
        System.out.println("Here's Your Caculator");
        System.out.println("You May Proceed with your Calculations");
        System.out.println("##########################################################################################");
        String a=sc.nextLine();
        System.out.println("##########################################################################################");
        a=a+"*1";
        int l=a.length()-1;
        int min;
        double num,num1;
        min=ob.num(a);
        num=Double.valueOf(a.substring(0,min));
        a=a.substring(min);
        l=a.length()-1;
        while(!(a.equals("*1")))
        {
            char ch=a.charAt(0);
            a=a.substring(1);
            min=ob.num(a);
            num1=Double.valueOf(a.substring(0,min));
            a=a.substring(min);
            if(ch=='+')
            num=num+num1;
            if(ch=='-')
            num=num-num1;
            if(ch=='*')
            num=num*num1;
            if(ch=='/')
            num=num/num1;
            if(ch=='%')
            num=num%num1;
            l=a.length()-1;
        }
        System.out.println("The Answer is : "+num);
    }
}