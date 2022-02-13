package phase1.project.Lesson12;


public class AccessModifiers {

	public static void main(String[] args) {
		defaultAccessSpecifier def = new defaultAccessSpecifier();
		def.display();
		
		
		privateAccessSpecifier pri = new privateAccessSpecifier();
		// private.display();    error as private methods of another class cannot be accessed
		
	
	}

}


class defaultAccessSpecifier{
	void display() {
		System.out.println("Class with default access specifier");
	}
}


class privateAccessSpecifier{
	
	private void display(){
		System.out.println("Private access Specifier");
	}
}
