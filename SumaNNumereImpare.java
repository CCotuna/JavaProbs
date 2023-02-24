//Exercitiul 6
//Sa se determine suma primelor n numere impare – ‘n’ citit de la tastatura
import java.util.Scanner;
public class SumaNNumereImpare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int s = 0;  //suma
		for(int i=1;i<=n;i+=2)
			s+=i;
		System.out.println("suma este " + s);
	}

}
