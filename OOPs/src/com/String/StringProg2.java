package com.String;

public class StringProg2 {
	
	public static void main(String[] args) {
		
	
	String s="my name is khan";
	  String arr[]=s.split(" ");
	  
	  
	 
	   
	  for(int i=0;i<arr.length;i++)  //3
	  {
		  String s1="";
	     
	      String t=arr[0];
	      
	   for(int j=1,k=0;j<arr.length;j++,k++) //3+1
	   {
	    
	   // arr[j-1]=arr[j]; //a[0]=  
		   
		   arr[k]=arr[j];
	    
	  //  arr[j]=arr[j+1]; //a[1]=
	    
	    s1=s1+" "+arr[j-1];
	    
	   
	   }
	   arr[arr.length-1]=t;
	   s1=s1+" "+arr[arr.length-1];
	   System.out.println(s1);
	   
	  }
	 

}
}
