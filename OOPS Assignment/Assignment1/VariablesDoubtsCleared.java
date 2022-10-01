/**

* this is not an example
* @author Kaustubh

**/

class Student{
	
	//instance variables ...
	String name = "none"; //strings dec & init without creating a new object/inst (i.e.dynamic allocation in heap)
	int age=0;
	String clas = "none"; //similarily storing in string constant pool which is also in heap
	String gender = "none";
	
	//Constructor defined by me with no parameters ...
	Student(){
		// a call to a method for printing details ... 
		printDetails();
	}
	
	//Constructor defined by me with parameters ...
	Student(String Name, String Class, String Gender, int Age){
		
		//explicitly allocating the values given as arguments to the instance variables for the particular object
		//created through this constructor ...
		name = Name;
		clas = Class;
		age = Age;
		gender = Gender;
		
		//as they are instace variables they can be accesed and changed via objects i.e. s2.name = something is valid
		//bcoz s2.name is present in heap area with the object...
		
		/*
		You can do this but this varibles are local variables and they will have local/method level scope ...
		
		String Name = Name;
		String Class = Class;
		int Age = Age;
		String Gender = Gender;
		
		and these variables cannot be accesed or changed by objects ... like
		
		s2.name  and s2.name = something not possible here ...
		bcoz s2.name is not present in heap area with the object
		*/
		
		// a call to a method for printing details ... 
		printDetails();
	}
	
	//method defined with no parameters for printing details ...
	void printDetails(){
		// directly put the instance variable 
		System.out.println("Name : "+this.name+" Class : "+this.clas+" Age : "+this.age+" Gender : "+this.gender);
	}
}


public class VariablesDoubtsCleared{
	
	public static void main(String[] args){
		
		Student s1 = new Student("Kaustubh","PG","Male",23);
		Student s2 = new Student();
		
		//Student s3 = new Student();
		//Student s4 = new Student();
		//Student s5 = new Student();
		
		// explicitly allocating values to instance variables after creating it from default no parameter constructor
		s2.name = "Hero";
		s2.gender="Male";
		s2.clas="7th";
		s2.age=10;
		
		//printing the details to check the allocation is done or not ...
		s2.printDetails();
		
		//just a method check ...
		s1.printDetails();
		
		//particular instance of object is printed ...
		System.out.println(s1.name);
	
	}
}