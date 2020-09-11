
public class Son extends Father{
	
	private String gf;
	
	public Son(String name, int age, String gf)
	{

		super(name, age);
		this.gf=gf;
	}
	
	
	
	
	
	public void drink()
	{
		System.out.println("drinking ");
	}

    

	public String getGf() {
		return gf;
	}


	public void setGf(String gf) {
		this.gf = gf;
	}

}
