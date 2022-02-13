package MultiThreading;

public class exRunnableThread implements Runnable{
	 
    public static int myCount = 0;
    public exRunnableThread(){
         
    }
    public void run() {
        while(exRunnableThread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++exRunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting with the Main Thread");
        exRunnableThread mrt = new exRunnableThread();
        Thread t = new Thread(mrt);
        t.start();
        while(exRunnableThread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++exRunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("The main thread ends here");
    }
}
