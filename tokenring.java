import java.util.*;
import java.io.*;

public class tokenring {

    public static void main(String [] args)
    {
        Scanner sc =  new Scanner(System.in);
        int token = 0;
        System.out.println("Enter the Number of Nodes: ");
        int n = sc.nextInt();

        boolean ch = true;

        for(int i = 0;i<n;i++)
        {
            System.out.println(" "+i);
        }

       do{

        System.out.println("enter the sender: ");
        int s = sc.nextInt();
        System.out.println("Enter the Receiver: ");
        int r =  sc.nextInt();

        System.out.println("Enter the Data: ");
        String a = sc.next();

        System.out.println("Token Passing: ");
        for(int i = token, j=token; (i%n)!=s; i++, j=(j+1)%n )
        {
            System.out.println(" "+j+"->");
        }
        System.out.println(" "+s);
        System.out.println("Message "+a+" is forwarded by sender "+s);
        for(int i=s+1; i!=r; i=i+1%n)
        {
            System.out.println("Message "+a+" is forwarded by node "+i);
        }
        System.out.println("Message "+a+" recived by "+r);

        token = r;

        System.out.println("Do you want to send data one more time ? 1 yes 0 no");
        int x = sc.nextInt();
        if(x==1)
        {
            ch = true;
        }
        else
        ch = false;
    

    }while(ch);

    }
}