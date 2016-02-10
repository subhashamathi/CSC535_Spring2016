
public class Assignment1 
{
	public static void main(String[] args)
    {
        int count=0;
        for(int i=1;i<1000000;i=i+1)
        {
         if(i%13==0)
           {
               count=count+1;
           }  
         System.out.println(count);
         
        }
    }
}
