//Exercitiul 19
//Sa se afiseze inversul unui numar dat (124 -> 421)
import java.util.Scanner;
public class InversNumar {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int numar = input.nextInt();
	int a = numar; int invers = 0;
	while(numar != 0)
	{
		invers = invers*10+numar%10;
		numar /= 10;
	}
	System.out.println("Numarul este "  + a + " ,iar inversul este " + invers);
	}

}
