class A {
	int i;
	private int j;
	
	void setij(int a, int b){
		i=a;
		j=b;
	}
	
	int getj(){
		return j;
	}
	
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
		System.out.println("i+j+k== " + (i+getj()+k));
	}
}

class SimpleInheritence {
	public static void main (String[] args){
		A super0b = new A();
		B sub0b= new B();
		
		super0b.setij(10,20);
		
		System.out.println("Contents of super0b: ");
		super0b.showij();
		
		sub0b.setij(20,25);
		sub0b.k= 30;
		
		System.out.println("Contents of sub0b: ");
		sub0b.showij();
		sub0b.showk();
		
		System.out.println("Sum: ");
		sub0b.sum();
	}
}
