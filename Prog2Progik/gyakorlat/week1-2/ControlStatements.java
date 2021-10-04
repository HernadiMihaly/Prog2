class ControlStatements {
	public static void main(String[] args){
		
		System.out.println("Control Statements Demo");
		
		int a=10, b=8;
		
		if (a>b) a=0;
		else b=0;
		
		System.out.println("a==" + a + "b==" + b);
		boolean hasData= false;
		
		if(hasData){
			System.out.println("hasData is true");
		}
		else
			if(a==0){
			System.out.println("hasData is false and a==0");
			}
			else{
			System.out.println("hasData is false and a!=0");
			}
		int month= 6;
		String season;
		switch(month){
			case 12:
			case 1:
			case 2:
				season= "winter";
				break;
			case 3:
			case 4:
			case 5:
				season="spring";
				break;
			case 6:
			case 7:
			case 8:
				season="summer";
				break;
			case 9:
			case 10:
			case 11:
				season="autumn";
				break;
			default:
				throw new RuntimeException("Illegal month");
		}
		System.out.println("The actual season is: " + season);
	}
		
}
