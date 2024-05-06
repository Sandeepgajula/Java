class stringsfunctions
{
    public static void main(String[] args)
    {
        String str="Javaprogram";
        String str1=str.toUpperCase();
        str=str.toLowerCase(); 
        int n=str.length();
        System.out.println(str);
        System.out.println(n);
        System.out.println(str1);
        String s="  sandeep  ";
        String s1=s.trim();
        System.out.println(s1);
        String str3=str.substring(2);
        System.out.println(str3);  
        String str4=str.substring(2,4);
        System.out.println(str4);
        boolean b=str.endsWith("j");
        System.out.println(b);

    } 
}