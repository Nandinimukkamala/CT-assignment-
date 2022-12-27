package string;
import java.util.*;
public class Fourth {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter your string");
		String str=s.nextLine();
		System.out.println("enter particular ending pattern ");
		String str1=s.next();
		System.out.println(str.endsWith(str1));
	}

}


