import java.rmi.*;

public class client
{
    public static void main(String [] args)
    {
        try
        {
            Adder stub = (Adder)Naming.lookup("rmi://localhost:5000/sonoo");
            System.out.println(stub.add(45,20));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}