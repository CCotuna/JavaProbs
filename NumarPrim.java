//Exercitiul 9
//Sa se verifice daca un numar n diferit de 0 sau 1 este prim sau nu.
import java.util.Scanner;
public class NumarPrim {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numar = input.nextInt();
		int div = 0;
		for(int i=2;i<=numar/2;i++)
			if(numar%i==0)
				div++;
		if(div==0)
			System.out.println("numar prim");
		else
			System.out.println("numarul nu e prim");

	}

}
