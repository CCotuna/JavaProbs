//Exercitiul 16
//Sa se afiseze separat cifrele unui numar.
import java.util.Scanner;

public class AfisareCifre {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numar = input.nextInt();
		
		while(numar!=0)
		{
			System.out.print(numar%10+"|");
			numar /= 10;
		}

	}

}
