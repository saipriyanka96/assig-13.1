package string;
//Package is a grouping of related types providing access protection and name 
//string is the package name
public class StringDemo
//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
//immediate superclass of the class
//created class name as StringDemo
	
{
	public static void main(String[] args)
	//static is used for memory management
	//void is used to define the return type of the method
	//String[] args is actually an array of java.lang.String type and it's name is args here
		{
		// TODO Auto-generated method stub
		int integer=200;//Initializing the integer value
		String string=String.valueOf(integer);
//creating a String object. 
//valueOf(integer):means it is static method Of string class.
//It is a returns the value of integer that we gave
//It convert int into String in java
		string=Integer.toString(integer);
	//It is a returns the value of integer that we gave
	//It convert int into String in java
		System.out.println("After converting int into string");
//system is final class
//out is a static member of system class and type printStream
//println is method of printStream class.ln means nextline
			System.out.println("Output is:"+integer);
			//prints the integer
	}
}
