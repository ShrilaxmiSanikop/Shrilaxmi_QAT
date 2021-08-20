import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrderOfString {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			strings.add(sc.next());
		}
		System.out.println("Input: "+strings);
		Collections.reverse(strings);
		System.out.println("Output: "+strings);
		sc.close();
	}

}