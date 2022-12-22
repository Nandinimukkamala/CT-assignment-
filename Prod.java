package flow1;
import java.util.*;
public class Prod {
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter productid :");
		int pid=s1.nextInt();
		System.out.println("Enter Product name :");
		String pname=s1.next();
		System.out.println("Enter Product price :");
		int ppr=s1.nextInt();
		System.out.println("Enter Quantity :");
		String qu=s1.next();
		System.out.println("Enter Category :");
		String cat=s1.next();
		System.out.println("Enter Brand :");
		String brd=s1.next();
		System.out.println("Product pid :" +pid);
	    System.out.println("Product name :" +pname);
	    System.out.println("product price: "+ppr);
	    System.out.println(" Quatity:"+qu);
	    System.out.println("Category:"+cat);
	    System.out.println("Brand "+brd);  
	}

}
