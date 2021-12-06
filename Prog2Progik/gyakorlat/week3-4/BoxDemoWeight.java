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

class BoxWeight extends Box{
	double weight;
	
	BoxWeight(double w, double l, double h, double m){
		super(w, h, l);
		weight= m;
	}
}

class BoxDemo {
	
	public static void main(String[] args){
		BoxWeight weightBox = new BoxWeight(10, 20, 30, 5.5);
		Box plainBox = new Box();
		
		double vol= weightBox.volume();
		System.out.println("weightBox vol: " + vol);
		System.out.println("weightBox weight: " + weightBox.weight);
		
		plainBox= weightBox;
		
		vol= plainBox.volume();
		System.out.println("plainBox vol: " + vol);
		//System.out.println("box2 weight: " + plainBox.weight);  Errort ad mivel plainBox referenciát állítottunk a weightBoxra és a plain Box classban nincs weight tag
	}

}
