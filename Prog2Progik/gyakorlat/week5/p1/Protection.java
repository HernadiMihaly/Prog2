package p1;

public class Protection {
	int n=1;
	private int n_priv=2;
	protected int n_prot=3;
	public int n_pub=4;
	
	public Protection(){
		System.out.println("Base constructor");
		
		System.out.println("n==" + n);
		//System.out.println("n_priv==" + n_priv);
		System.out.println("n_prot==" + n_prot);
		System.out.println("n_pub==" + n_pub);
	}
}

