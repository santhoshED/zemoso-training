public class B extends A{
	static{
		System.out.println("SB-B");
	}
	static int m2(){
		System.out.println("m2-B");
		return 20;
	}
	{System.out.println("ex-B");}
	public B(){
		System.out.println("cons-B");
	}
	static int j = m2();
}