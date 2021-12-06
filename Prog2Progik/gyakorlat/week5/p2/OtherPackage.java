package p2;

class OtherPackage{
	OtherPackage(){
		p1.Protection p=new p1.Protection();
		
		System.out.println("other package constructor");
		//System.out.println("n==" + n);
		//System.out.println("n_priv==" + n_priv);
		//System.out.println("n_prot==" + n_prot);
		System.out.println("n_pub==" + p.n_pub);
	}
}
