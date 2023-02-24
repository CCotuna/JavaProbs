import java.util.Scanner; //importarea scannerului
//comentariu
public class FirstDemo {
	//aceasta este functia de pornire a programului FirstDemo
	
	//@param args - argumentele de intrare ale programului
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);   //crearea unui nou scanner 
		int nr = input.nextInt();  //citire de la tastatura
		
		int i = 5;
		switch(i)  //ia o variabila, se uita la variabila, executa doar blocul ce tine de conditia aceea
		{
		case 0: 
			System.out.println("ZERO"); 
			break;
		case 1: 
			System.out.println("UNU"); 
			break;
		default : 
			System.out.println("Nu stiu ce cifra este");
		}
		
		
	}
}

/*short -2bytes
int - 4bytes - tip primitiv ce descrie un integer - nr intreg de dimensiune mai mare
long - 8bytes
float(4 zecimale), double - numere reale, cu virgula
char - un singur caracter
boolean - valoare binara - true false
String - este o clasa, manipularea sirurilor de caractere
*/


//System.out.println("Salutare dragi programatori!");
//System.out.println("yo");  // "ln" pune new line - enter


/*
if (i>3) {
System.out.println(i + " este mai mare decat 3");
System.out.println("Multumesc de intrebare");}
else
System.out.println(i + " nu este mai mare decat 3");
*/

/*
for(int i=1; i<=nr; i++) {
if(i%7==0)
	System.out.print(" BANG ");
else
	System.out.print(i + " ");
}
*/


/*
while(i<=nr)
{
	i++;
	if(i%7 == 0)
		//break;
		continue; // executi doar dupa ce ai trecut la un nou pas
	else
		System.out.print(i + " ");
}
*/