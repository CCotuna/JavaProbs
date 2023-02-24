//Exercitiul 7
//Sa se calculeze media aritmetica a n numere – ‘n’ citit de la tastatura
import java.util.Scanner;
public class MedieAritmeticaNNumere {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int s = 0;  //suma
		for(int i=0;i<n;i++)
		{
			int numar = input.nextInt();
			s += numar;
		}
		System.out.println("media artimetica este "+s+"/"+n+"="+s/n);
	}

}
