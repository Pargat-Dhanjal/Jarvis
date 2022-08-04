class memory
{
    static String s[]=new String[5];
    int memory(String a,int t1)
    {
        if(t1==101) s[0]=a;
        else if(t1==102) s[1]=a;
        else if(t1==103) s[2]=a;
        else if(t1==104) s[3]=a;
        else if(t1==105) s[4]=a;
        else
        {
            System.out.println("I will be forgeting old memories to save new ones");
            t1=101;}
        t1++;
        System.out.println("Done !");
        return t1;
    }
    int forget()
    {
        for(int i=0;i<=4;i++)
        {
            s[i]="";
        }
        System.out.println("Done ! I have erased everything y");
        return(101);
    }
    void disp(int t1)
    {
       System.out.println("These are the things you told me to remember so far");
       int t=t1-100;
       for(int a=0;a<t-1;a++)
       System.out.println(s[a]);
    }
}