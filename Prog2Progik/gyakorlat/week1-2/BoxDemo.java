class Box {
	double width;
	double height;
	double length;
	
	Box() {
		width=0;
		height=0;
		length= 0;
	}
	
	Box (Box ob){ //másoló konstruktor
		this.length= ob.length;
		this.height= ob.height;
		this.width= ob.width;
	}
	Box (double len){
		length= width = height = len;
	}
	
	Box (double width, double length, double height){
		this.width= width;
		this.height= height;
		this.length= length;
	}
	
	double volume(){
		return width*height*length;
	}
	
	void setDim(double w, double h, double l){
		width= w;
		height= h;
		length= l;
	}
	void setDim(double l){
		length=width=height=l;
	}
}

class BoxDemo {
	
	public static void main(String[] args){
		Box myBox1; //ez még csak egy referencia
		myBox1 = new Box(); //itt kerül mögé fizikailag az objektum
		
		myBox1.width= 20;
		myBox1.height= 20;
		myBox1.length= 30;
		
		double vol= myBox1.volume();
		
		System.out.println("Mybox1 volume is " + vol);
		
		Box myBox2 = new Box(myBox1);
		
		System.out.println("Mybox2 volume is " + myBox2.volume());
		
		Box myBox3 = new Box(10.0);
		System.out.println("Mybox3 volume is " + myBox3.volume());
		
		Box myBox4 = new Box(10.0,20.0,30.0);
		System.out.println("Mybox4 volume is " + myBox4.volume());
		
		Box myBox5 = new Box();
		myBox5.setDim(10);
		System.out.println("Mybox5 volume is " + myBox5.volume());
		
		Box myBox6 = new Box();
		myBox6.setDim(10.0,20.0,30.0);
		System.out.println("Mybox6 volume is " + myBox6.volume());
		
		Box tempBox= myBox6;
		
		System.out.println("tempBox: " + myBox6.volume());
		
		myBox6= myBox1;
		System.out.println("tempBox: " + myBox6.volume());
	}

}
