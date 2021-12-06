interface IntStack {
	void push(int item);
	int pop();
	
}

class DynStack implements IntStack{
	private int stck[];
	private int tos;
	
	DynStack(int size){
		stck= new int[size];
		tos = -1;
	}
	
	public void push(int item){
		if(tos==stck.length-1){
			int temp[] = new int[stck.length*2];
			for (int i=0; i < stck.length; i++){
				temp[i]= stck[i];
			}
			stck= temp; //a stck referenciát ráállítjuk az új arrayre(temp), ilyenkor a régi tömböt a garbage collector felszabadítja
			stck[++tos] = item;
			System.out.println("Stck length: " + stck.length);
		}
		else
			stck[++tos] = item;
	}
	
	public int pop(){
		if (tos<0){
			System.out.println("Stack is empty");
			return 0;
			}
		else return stck[tos--];
	}

}

class IFTest {
	public static void main(String[] args){
		DynStack fs1 = new DynStack(5);
		
		for (int i=0; i<5; i++) fs1.push(i);
		
		for (int i=0; i < 5; i++)
			System.out.println(fs1.pop());
	}
}
