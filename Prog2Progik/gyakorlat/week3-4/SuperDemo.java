class Box {
	private double width;
	private double height;
	private double length;
	
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

class BoxWeight extends Box{
	double weight;
	
	BoxWeight() {
		super(); //szuper osztály üres konstruktorát állítja rá a boxweightre
		weight=0;
	}
	
	BoxWeight(BoxWeight ob){
		super(ob); //szuperosztály referenciát állítunk a BoxWeight objektumra, így a 3 privát tag is értelmezve lesz
		weight = ob.weight;
	}
	
	BoxWeight(double w, double d, double h, double m){
		super(w,h,d); //van ilyen konstruktor aa szuperosztálynak
		weight = m;
	}
	BoxWeight(double len, double m){
		super(len);
		weight = m;
	}
}

class BoxDemo {
	
	public static void main(String[] args){
		BoxWeight weightBox1 = new BoxWeight(10, 20, 30, 5.5);
		
		double vol= weightBox1.volume();
		System.out.println("weightBox1 vol: " + vol);
		System.out.println("weightBox1 weight: " + weightBox1.weight);
		
		BoxWeight weightBox2 = new BoxWeight();
		
		vol= weightBox2.volume();
		System.out.println("weightBox2 vol: " + vol);
		System.out.println("weightBox2 weight: " + weightBox2.weight);
		
		BoxWeight weightBox3 = new BoxWeight(10,3.5);
		
		vol= weightBox3.volume();
		System.out.println("weightBox3 vol: " + vol);
		System.out.println("weightBox3 weight: " + weightBox3.weight);
		
		BoxWeight weightBox4 = new BoxWeight(weightBox1);
		
		vol= weightBox4.volume();
		System.out.println("weightBox4 vol: " + vol);
		System.out.println("weightBox4 weight: " + weightBox4.weight);
	}

}
