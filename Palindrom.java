import java.util.Scanner;
public class Palindrom {

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
	if(invers == a)
		System.out.println("numarul e palindrom");
	else
		System.out.println("numarul nu este palindrom");
	}

}
