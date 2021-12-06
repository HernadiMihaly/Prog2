class ValueTest {
//pass by value:
	void method(int i, int j){
		i*=2;
		j/=2;
	}
}
class ReferenceTest{
	//pass by reference:
	int a,b;
	
	ReferenceTest(int i, int j){
		a=i;
		b=j;
	}
	
	void method(ReferenceTest obj){
		obj.a*=2;
		obj.b/=2;
	}
}
class ArgPassDemo {

	public static void main(String[] args){
	//pass by value:
		ValueTest val0b= new ValueTest(); 
		
		int a= 25, b= 40;
		
		System.out.println("a==" + a + "b==" + b);
		
		val0b.method(a,b);
		
		System.out.println("a==" + a + "b==" + b);
	//pass by reference:
		ReferenceTest ref0b = new ReferenceTest(25,40);
		
		System.out.println("Before method call: " + ref0b.a + " " + ref0b.b);
		
		ref0b.method(ref0b);
		
		System.out.println("After method call: " + ref0b.a + " " + ref0b.b);
		
	}

}
