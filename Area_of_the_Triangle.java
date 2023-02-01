import java.util.*;
class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat(),b=sc.nextFloat(),c=sc.nextFloat();
        float S=(a+b+c)/2;
        double res=S*(S-a)*(S-b)*(S-c);
        res=Math.pow(res,0.5);
        System.out.format("%.2f",res);
    }
}