//Exercitiul 5
//Sa se determine suma primelor n numere pare – ‘n’ citit de la tastatura
import java.util.Scanner;
public class SumaNNumerePare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int s = 0;  //suma
		for(int i=0;i<=n;i+=2)
			s+=i;
		System.out.println("suma este " + s);
	}

}
