class problem1
{
    public static void main(String arg[])
    {
        String str="sandeepsanvi607@hotmail.com";
        int i=str.indexOf("@");
        String user=str.substring(0,i);
        String domain=str.substring(i+1,str.length());
        System.out.println(user);
        System.out.println(domain);
        int j=domain.indexOf(".");
        System.out.println(i);
        String c=domain.substring(0,j);
        
        System.out.println(c.equals("gmail"));
        int b=101101;
        String h="1234F";

        String s1=b+"";

        System.out.println(s1.matches("[01]+"));
        System.out.println(h.matches("[0-9A-F]+"));
        
    }
}