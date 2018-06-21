package ConstructorPracticals;
public class StudPara {
	
	int a,b;
	public StudPara(int x, int y) {
		System.out.println("We are in Parameterized Constructor :");
		a=x;
		b=y;
		System.out.println("Value of x is given to a");
		System.out.println("Value of y is given to b");
		
	}
	void D1(){
		System.out.println("We entered D1 :");
		System.out.println("Value of a is : "+a);
		System.out.println("Value of b is : "+b);
	}

}
