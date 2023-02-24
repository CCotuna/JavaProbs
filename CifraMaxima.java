//Exercitiul 17
//Sa se afiseze cifra maxima a unui numar
import java.util.Scanner;

public class CifraMaxima {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numar = input.nextInt();
		int[] cifre = new int[20]; int i=0; int a;
		while(numar!=0)
		{
			cifre[i]=numar%10;
			numar /= 10;
			i++;
		}
		for(int j=0;j<i;j++)
			System.out.print(cifre[j] + " ");
		System.out.println(" ");
		boolean verifica = false; int aux;
		do {
			verifica = true;
			for(int j=0;j<i-1;j++)
				if(cifre[j]>cifre[j+1])
				{
					aux = cifre[j];
					cifre[j]=cifre[j+1];
					cifre[j+1]=aux;
					verifica = false;
				}
		}
			while(!verifica);
		
		
		for(int j=0;j<i;j++)
			System.out.print(cifre[j] + " ");
		System.out.print("cifra este" + cifre[i-1]);
	}

}
