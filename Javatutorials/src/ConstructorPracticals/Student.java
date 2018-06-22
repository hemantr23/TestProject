package ConstructorPracticals;
public class Student {
	int a,b;
	Student()
	{
		System.out.println("This is default constructor");
		a=10;
		b=20;
		System.out.println("Value of a is initialized as 10");
		System.out.println("Value of b is initialized as 20");
	}
	
	void Display(){
		System.out.println("Value of a is : "+a);
		System.out.println("Value of b is : "+b);
		System.out.println("This is new line ");
	}

}
