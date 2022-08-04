class help
{
    input ob=new input();
    void help()
    {
     help ob1=new help();
     System.out.println("So How Can I help ?");
     System.out.println("You may choose an option in which you may need Help");
     System.out.println("1. Phrases");
     System.out.println("2. What can I do ?");
     System.out.println("3. How can You exit the Conversation ?");
     int a=(int)ob.numi();
     int b,c,d;
     if(a==1){
     System.out.println();
     System.out.println("For Mathematical Functions");
     System.out.println("Try Typing Add, Subtract, Multiply,Divide");
     System.out.println();
     System.out.println("##########################################################################################");
     System.out.println();
     System.out.println("To make me Remember things "+"\n"+"Try typing Remember proceding with the thing you want me to Remember");
     System.out.println("To know what all things you told me to Remember");
     System.out.println("Try Typing \"What I told you to Remember\"");
     System.out.println();
     System.out.println("##########################################################################################");
     System.out.println();
     System.out.println("Want a Calculator try typing any pharse with \"Calculator\" mentoined in it");
     System.out.println();
     System.out.println("##########################################################################################");
     System.out.println();
     System.out.println("For accessing Other Such Functions you may Type the Functions Name");
     System.out.println("Try Asking me \"What Can you do ?\"");
    }
    if(a==2)
      ob1.wcyd();
      if(a==3){ 
        System.out.println("Try Typing Exit, Bye, See you");
    }
}
    void wcyd(){    
     System.out.println("So you can Ask me :");
     System.out.println("1. Mathematical functions");   
     System.out.println("2. Conversions");
     System.out.println("3. To make Patterns");
     System.out.println("4. Cool feutures ");
     int b=(int)ob.numi();
     switch (b){
        case 1:
        System.out.println("I can Calculate ,find Average of ,find Factors ,find Percentage of ");
        break;
        case 2:
        System.out.println("So how about converting from Dollars to Rupees, or to covert Temperature");
        break;
        case 3:
        System.out.println("You can Ask me to Draw Pyramids or Special Artwork for you !");
        break;
        case 4:
        System.out.println("I can now Remember things for you ");
        break;
        default:
        System.out.println("Exiting you from Help");
                }
   }
    
}