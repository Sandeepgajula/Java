class reverse{
     
    static void revers(int x){
        int r=0;
        while(x!=0){
            r=r*10;
            r+=x%10;
            x=x/10;

        }
        System.out.println(r);
    }
    public static void main(String args[]){
        int x=123;
        revers(x);
    }
}