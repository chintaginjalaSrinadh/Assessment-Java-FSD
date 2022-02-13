package MultiThreading;


interface First 
{  
    default void show() 
    { 
        System.out.println("Default of the First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default of the Second"); 
    } 
}  
public class interfaceClass  implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	interfaceClass  ob = new interfaceClass (); 
        ob.show(); 
    } 
}
