class Exc0 {
	public static void main(String[] args){
	try{
		int d = 0;
		int a= 42/d;
		System.out.println("Any questions? ");
	} catch (ArithmeticException e) {
		System.out.println("ArithmetixException  hiba ");
		e.printStackTrace();
	}
	System.out.println("After catch");
	}
}

