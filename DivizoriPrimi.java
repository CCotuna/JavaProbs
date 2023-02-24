//Exercitiul12
//Sa se afiseze toti divizorii primi ai numarului ‘n’ dat.
import java.util.Scanner;
public class DivizoriPrimi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numar = input.nextInt();
		int div = 2; int putere = 0;
		while(numar != 1)
		{
			while(numar%div==0)
			{
				putere++;
				numar /= div;
			}
			if(putere != 0)
				System.out.print(div + "^" + putere+ " * ");
			div++;
			putere =0;
		}
		
		
	}

}
