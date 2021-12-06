class A {
	int i,j;
	
	void showij(){
		System.out.println("i==" + i + "j==" + j);
	}
}

class B extends A {
	int k;
	
	void showk() {
		System.out.println("k==" +k);
	}
	
	void sum() {
		System.out.println("i+j+k== " + (i+j+k));
	}
}

class SimpleInheritence {
	public static void main (String[] args){
		A super0b = new A();
		B sub0b= new B();
		
		super0b.i = 10;
		super0b.j = 20;
		
		System.out.println("Contents of super0b: ");
		super0b.showij();
		
		sub0b.i= 20;
		sub0b.j=25;
		sub0b.k= 30;
		
		System.out.println("Contents of sub0b: ");
		sub0b.showij();
		sub0b.showk();
		
		System.out.println("Sum: ");
		sub0b.sum();
	}
}
