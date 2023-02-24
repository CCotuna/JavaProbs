// Sa se citeasca de la tastatura un numar. 
//Daca este mai mare decat 5 sa se afiseze pe ecran cuvantul ADMIS, iar daca e mai mic sa se afiseze RESPINS. Daca numarul este mai mic decat 1 si mai mare decat 10 sa se afiseze INVALID
import java.util.Scanner;

public class AdmisRespinsInvalid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numar = input.nextInt();
		
		if(numar>5 && numar <10)
			System.out.println("ADMIS");
		else if(numar>0 && numar<5)
			System.out.println("RESPINS");
		else if(numar<1 || numar>10)
			System.out.println("INVALID");
	}

}
