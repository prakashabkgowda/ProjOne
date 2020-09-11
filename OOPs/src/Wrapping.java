
public class Wrapping {
	public static void main(String[] args) {
		
		int a=10;
		
		/*Integer b=Integer.valueOf(a); //boxing
		System.out.println(b);
		Integer c=new Integer(a);//boxing
		
		Integer d=a;  //auto-boxing*/
		
		
		//float f=a;
		
		Float f1=(float)a;
		
		Character c1='P';
		
		char c2=c1.charValue(); //unboxing
		char c3=c1;  //auto-unboxing
		
		Integer c4=25;
		int c5=c4.intValue();
		
		
		
		
	}

}

//String s="abcde"  bcdea  cdeab ....abcde