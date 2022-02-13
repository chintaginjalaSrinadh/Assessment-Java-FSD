package phase1.project.Lesson12;

public class MyThread extends Thread
{
public void run()
{
System.out.println("concurrentthreadstartedrunning..");
}
public static void main(String args[])
{
MyThread mt=new MyThread();
mt.start();
}



public class MyRunnableThread implements Runnable{
public static int myCount=0;
public MyRunnableThread(){
}
public void run(){
while(MyRunnableThread.myCount<=10){
try{
System.out.println("ExplThread:"+(++MyRunnableThread.myCount));
Thread.sleep(100);
}catch(InterruptedException iex){
System.out.println("Exceptioninthread:"+iex.getMessage());
}
}
}
public static void main(String a[]){
System.out.println("StartingMainThread...");
MyThread mrt=new MyThread();
Thread t=new Thread(mrt);
t.start();
while(MyRunnableThread.myCount<=10){
try{
System.out.println("MainThread:"+(++MyRunnableThread.myCount));
Thread.sleep(100);
}catch(InterruptedException iex){
System.out.println("Exceptioninmainthread:"+iex.getMessage());
}
}
System.out.println("EndofMainThread...");
}
}

}