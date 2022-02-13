package MultiThreading;


public class Throwsarithmetic {
        void Division() throws ArithmeticException
        {
            int a=35,b=7,rs;
            rs = a / b;
            System.out.print("\n\t The result is : " + rs);
        }
         public static void main(String[] args)
        {
        	 Throwsarithmetic T = new Throwsarithmetic();
             try
            {
                T.Division();
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }
            System.out.print("\n\t This program ends here.");
        }
    }
