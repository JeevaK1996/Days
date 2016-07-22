# Days
import java.util.Scanner;

public class WorkingDay {

	
	public static void main(String[] args) {
		String days="monday,tuesday,wednesday,thursday,friday";
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		if(days.contains(s)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		

	}

}
