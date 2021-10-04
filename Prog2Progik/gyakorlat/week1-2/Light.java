class Light {
	public static void main(String[] args){
		
		int lightspeed= 29972;
		
		long days= 1000;
		
		long seconds = 24*60*60 * days;
		
		long distance= seconds*lightspeed;
		
		System.out.println("In " + days + " days light travels " + distance + " km");
	}
}
