import java.util.*;
class prog
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String s1=sc.nextLine();
        System.out.println("Enter another word");
        String s2=sc.nextLine();
        prog ob=new prog();
        for(int a=0;a<s1.length();a++)
        {
            char ch=s1.charAt(a);
            if(s1.indexOf(ch)>=0 && s2.indexOf(ch)>=0)
            {
                s1=s1.replace(ch,' ');
                s2=s2.replace(ch,' ');
            }
        }
        System.out.println(ob.space(s1));
        System.out.println(ob.space(s2));
    }
    String space(String s)
    {
        String str="";
        for(int a=0;a<s.length();a++)
        {
            char ch=s.charAt(a);
            if(ch!=' ')
            str=str+ch;
        }
        return str;
    }
}