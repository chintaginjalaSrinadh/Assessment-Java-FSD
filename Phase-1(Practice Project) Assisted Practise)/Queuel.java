package Project;

import java.util.LinkedList;
import java.util.Queue;

public class Queuel
{
public static void main(String[]args)
{
Queue<String>locationsQueue=new LinkedList<>();

locationsQueue.add("Kolkata");

locationsQueue.add("Patna");

locationsQueue.add("Delhi");

locationsQueue.add("Gurgaon");

locationsQueue.add("Noida");

System.out.println("Queueis:"+locationsQueue);

System.out.println("HeadofQueue:"+locationsQueue.peek());

locationsQueue.remove();

System.out.println("AfterremovingHeadofQueue:"+locationsQueue);

System.out.println("SizeofQueue:"+locationsQueue.size());

}

}