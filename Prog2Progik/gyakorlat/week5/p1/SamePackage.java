package p1;

class SamePackage{
	SamePackage(){
	Protection p = new Protection();
		System.out.println("Same package constructor");
		System.out.println("n==" + p.n);
		//System.out.println("n_priv==" + p.n_priv);
		System.out.println("n_prot==" + p.n_prot);
		System.out.println("n_pub==" + p.n_pub);}
}

