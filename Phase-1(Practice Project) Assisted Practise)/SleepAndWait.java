package phase1.project.Lesson12;

public class SleepAndWait {

private static Object LOCK=new Object();
public static void main(String args[])throws InterruptedException
{
Thread.sleep(1000);
System.out.println("Thread'"+Thread.currentThread().getName()+"'is woken after sleeping for 1second");
synchronized(LOCK)
{
LOCK.wait(1000);
System.out.println("Object'"+LOCK+"'is woken after"+"waiting for 1second");
}
}
}