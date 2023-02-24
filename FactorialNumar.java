import java.util.Scanner;
public class FactorialNumar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numar = input.nextInt();
		int f = 1;
		for(int i=1;i<=numar;i++)
			f *= i;
		System.out.println(f);
	}	

}