class strp2
{
    public static void main(String arg[]){
        String s="abc+_@$#S$%1#)0sand_";
        String s2="abd cdf    ghf ijk";
        System.out.println(s.replaceAll("[^a-z 0-9 A-Z]", ""));
        System.out.println(s2.replaceAll("\s", ""));
        int t=1;
        switch(t){
            case 1:
                System.out.println("hi");
                break;
            case 2:
            System.out.println("hi hello");
            break;
            default:
                  break;
                    

        }
    }
}