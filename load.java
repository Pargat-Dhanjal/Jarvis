class load {
    void load(){
    for(int a=1;a<=7;a++){
        try{
            Thread.sleep(1000);}
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt(); }
        System.out.print(" * ");
        }
    }
}