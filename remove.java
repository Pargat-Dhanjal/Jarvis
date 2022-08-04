import java.util.*;
class remove
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Word");
        String s=sc.nextLine();
        char ch;String str="";
        for(int a=0;a<s.length();a++)
        {
            ch=s.charAt(a);
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
            {
                str=str+ch;
            }
        }
        System.out.println(str);
    }
}