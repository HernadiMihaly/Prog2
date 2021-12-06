class Box {
	private double width;
	private double height;
	private double length;
	
	Box() {
		width=0;
		height=0;
		length= 0;
				System.out.println("Box() constructor");
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
			System.out.println("Box constructor");
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
		System.out.println("Boxweight() constructor");
	}
	
	BoxWeight(BoxWeight ob){
		super(ob); //szuperosztály referenciát állítunk a BoxWeight objektumra, így a 3 privát tag is értelmezve lesz
		weight = ob.weight;
	}
	
	BoxWeight(double w, double d, double h, double m){
		super(w,h,d); //van ilyen konstruktor aa szuperosztálynak
		weight = m;
		System.out.println("Boxweight constructor");
	}
	BoxWeight(double len, double m){
		super(len);
		weight = m;
	}
}

final class Shipment extends BoxWeight {
	double cost;
	
	Shipment(Shipment ob){
		super(ob);
		cost= ob.cost;
	}
	Shipment(){
		cost = -1;
		System.out.println("Shipment() constructor");
	}
	Shipment(double w, double h, double d, double m, double c){
		super(w,h,d,m);
		cost=c;
		System.out.println("Shipment constructor");
	}
}

class DemoShipment {
	
	public static void main(String[] args){
		Shipment ship1 = new Shipment(10,20,15,10,3.41);
		Shipment ship2 = new Shipment(10,20,30,40,42);
		
		double vol;
		
		vol= ship1.volume();
		
		System.out.println("Ship1 vol: " + vol);
		System.out.println("Ship1 weight: " + ship1.weight);
		System.out.println("Ship1 cost: " + ship1.cost);
		
		vol= ship2.volume();
		
		System.out.println("Ship2 vol: " + vol);
		System.out.println("Ship2 weight: " + ship2.weight);
		System.out.println("Ship2 cost: " + ship2.cost);
		
		Shipment ship3 = new Shipment();
		
		Shipment ship4= new Shipment(ship2);
		
		vol= ship4.volume();
		
		System.out.println("Ship2 vol: " + vol);
		System.out.println("Ship2 weight: " + ship2.weight);
		System.out.println("Ship2 cost: " + ship2.cost);
	}

}
