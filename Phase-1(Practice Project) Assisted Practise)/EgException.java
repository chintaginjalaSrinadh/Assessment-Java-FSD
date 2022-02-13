package MultiThreading;


public class EgException extends Exception{
	   String str1;
	   EgException(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("Exception Occurred: "+str1) ;
	   }
public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new EgException("This is an error Message");
		}
		catch(EgException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
}

