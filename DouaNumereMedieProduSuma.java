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
