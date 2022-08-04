class rev 
{
    void rev(int arr[])
    {
        int t1=0;
        int j=arr.length-1;
        for(int i=0;i<=arr.length/2;i++)
        {
            t1=arr[j-i];
            arr[j-i]=arr[i];
            arr[i]=t1;
        }
    }
    public static void main()
    {
        rev ob=new rev();
        int a[]={1,2,3,4,5,6,7,8,9};
        ob.rev(a);
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}