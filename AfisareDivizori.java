//Exercitiul 11
//Sa se afiseze toti divizorii numarului ānā dat.
import java.util.Scanner;
public class AfisareDivizori {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numar = input.nextInt();
		for(int i = 1;i <= numar; i++)
			if(numar%i==0)
				System.out.print(i + " ");

	}

}
