
public class Calculator {

	public Calculator(){
		
		System.out.println("Calling constructor");
		
	}
	
	public void add(){
		
		
		System.out.println("adding some numbers");
	}
	
	
	public void sub(){
		
		System.out.println("Sub some numbers");
		
	}
	
	
	public void mult(){
		
		System.out.println("Mult some numbers");
		
	}
	
	
	public void div(){
		
		System.out.println("Dividing some numbers");
		
		
	}
	
	
	
	
	public static void main(String[] args) {

		
		int x = 100;
		String value = "Hello";
		
		
		Calculator calc = new Calculator();
		calc.add();
		calc.sub();
		calc.mult();
		calc.div();
		

		//System.out.println("Hello World !!!");
		
		

	}

}
