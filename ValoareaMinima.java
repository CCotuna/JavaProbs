//Exercitiul 4
//Sa se citeasca de la tastatura 3 numere. Sa se afiseze valoarea minima.
import java.util.Scanner;

public class ValoareaMinima {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nr1 = input.nextInt();
		int nr2 = input.nextInt();
		int nr3 = input.nextInt();
		
		if(nr1 < nr2 && nr1 < nr3)
			System.out.println(nr1);
		else if(nr2 < nr1 && nr2 < nr3)
			System.out.println(nr2);
		else if(nr3 < nr1 && nr3 < nr2)
			System.out.println(nr3);
	}

}
