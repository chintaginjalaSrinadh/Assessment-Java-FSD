package MultiThreading;

public class Summation {

    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
        Summation s = new Summation(); 
        System.out.println(s.sum(47, 20)); 
        System.out.println(s.sum(23, 46, 31)); 
        System.out.println(s.sum(10.5, 40.5)); 
    } 
}
