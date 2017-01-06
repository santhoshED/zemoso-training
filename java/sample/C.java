public class C extends B{
	static{
		System.out.println("SB-C");
	}
	static int m3(){
		System.out.println("m3-c");
		return 40;
	}
	{System.out.println("ex-B");}
	static int k = m3();
	public C(){
		{System.out.println("cons-c");}
	}
}