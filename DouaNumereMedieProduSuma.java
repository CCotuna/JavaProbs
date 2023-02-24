//Exercitiul 3
/*Sa se citeasca de la tastatura 2 numere. Daca ambele numere sunt pare sa se afiseze
media artimetica. Daca ambele sunt impare sa se afiseze produsul lor. Daca unul este par
si unul impar atunci sa se afiseze suma lor.*/
import java.util.Scanner;
public class DouaNumereMedieProduSuma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numar1 = input.nextInt();
		int numar2 = input.nextInt();
		
		if(numar1%2==0 && numar2%2==0)
			System.out.println((numar1+numar2)/2);
		else if(numar1%2==1 && numar2%2==1)
			System.out.println(numar1*numar2);
		else if(numar1%2==1 && numar2%2 == 0)
			System.out.println(numar1+numar2);
		else if(numar1%2==0 && numar2%2==1)
			System.out.println(numar1+numar2);
	}

}
