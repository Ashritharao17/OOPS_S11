package Firstexample;

public class wrapperclassexample2 {
	public static void main(String args[])
	 {    
	    //Converting Integer to int    
	    Integer a=new Integer(3);    
	    int i=a.intValue(); //converting Integer to int explicitly  
	    int j=a; //unboxing, now compiler will write a.intValue() internally    
	    System.out.println(a+" "+i+" "+j);    
	   }


}
