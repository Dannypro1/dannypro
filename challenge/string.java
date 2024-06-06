import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter any string");
        String strng= obj.nextLine();
        String div=" ";
        int i;
        
        try
        {
            if ( (strng.length() % 3 == 0) && (strng.length() % 5 == 0)   )
        {
            System.out.print("the output of ANSCII code of your words is : " );
            for(i = 0;i < strng.length();i++)
            {
                div=strng.charAt(i) + div ;
                int c = strng.charAt(i);
                System.out.print(c + " ");
                
            }
            System.out.println("the output is :" +div);
        }
        else if (strng.length() % 3 == 0)
        {
            for(i=0;i < strng.length();i++)
            {
               div=strng.charAt(i) + div ;
            }
            System.out.println("the output is :" +div);
        }
        /* this what is going to try*/

        else if (strng.length() % 5 == 0)
        {
            System.out.print("the output of ANSCII code of your words is : " );
            for(i = 0; i< strng.length(); i ++)
            {
                int c = strng.charAt(i);
                System.out.print( c + " ");
            }
            
        }
        
        else
        {
            System.out.println("string which is not asked : " +strng);
        }
    }
    catch(Exception e)
    {
        System.out.println("the code fail");
    }
    }
}