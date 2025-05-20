package java1;

public class Problem1 {
	double a,b;
	public Problem1(double a,double b) {
		this.a=a;
		this.b=b;
	}
	public double calculate(String operations){
		switch (operations){
			case "add":
			return a+b;
			case "subtract":
				return a-b ;
			case "multiply":
				return a*b;
			case "divide":
				if(b!=0){
					return a/b;
				}else{
					System.out.println("cannot divided by 0");
				}default:
					System.out.println("Invalid operation");
					return 0;
		}
		
	}
public static void main(String [] args){
	Problem1 cal=new Problem1(10, 5);
	System.out.println("Addition : " +cal.calculate("add"));
	System.out.println("subtraction : " +cal.calculate("subtract"));
	System.out.println("multiply : " +cal.calculate("multiply"));
	System.out.println("division : " +cal.calculate("divide"));
	
}
}
