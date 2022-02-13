package phase1.project.Lesson12;


public class Constructors {
	int empID;
	String name;
	void display() {
		System.out.println(empID +" : "+ name);
	}
		

	public static void main(String[] args) {
		Constructors emp1 = new Constructors();
		emp1.display();//default constructor gave values 0 and null
		
		
		
		paraConstructor emp2 = new paraConstructor(2021, "Rohith");

	}

}
class paraConstructor{
	int empID;
	String name;
	paraConstructor(int empID,String name) {// parametrized constructor
		this.empID=empID;
		this.name=name;
		System.out.println(empID +" : "+ name);
	}
}