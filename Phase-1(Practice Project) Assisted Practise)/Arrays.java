package phase1.project.Lesson12;

public class Arrays {



public static void main(String[] args) {

//single-dimensional array
int a[]= {10,20,30,40,50};
for(int i=0;i<5;i++) {
System.out.println("Elements of array a: "+a[i]);
}


//multidimensional array 
int[][] b = {
            {2, 4, 6, 8}, 
            {3, 6, 9} };
System.out.println();
System.out.println("The elements in multi diamentional array is ");
for(int i=0;i<2;i++) {
	for(int j=0;j<2;j++) {
		System.out.print(b[i][j]+ " ");
	}
      
      System.out.println("\nLength of row 1: " + b[0].length);
      System.out.println("\nLength of row 1: " + b[1].length);
      } 
}
}
