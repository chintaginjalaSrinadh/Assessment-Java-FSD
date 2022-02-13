package MultiThreading;


class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 
public class Throwexception 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("Temp"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}

