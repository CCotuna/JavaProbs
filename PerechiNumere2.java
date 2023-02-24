/* Exercitiul 14
Sa se gaseasca perechile de numere a caror suma este 1000, primul sa fie divizibil cu 17
sau cu 13 iar al doilea cu 19 sau cu 7.*/
public class PerechiNumere2 {

	public static void main(String[] args) {
		
		int[] PrimaPereche = new int[500];
		int[] DouaPereche = new int[500];
		int j=0; int k =0;
		for(int i=13;i<=1000;i++) 
			if(i%17==0 || i%13==0)
			{
				PrimaPereche[j]=i;
				j++;
			}
		for(int i=7;i<=1000;i++)
			if(i%19==0 || i%7==0)
			{
				DouaPereche[k]=i;
				k++;
			}
		System.out.println(j +" + "+ k );
		/*for(int i=0;i<j;i++)
			System.out.print(PrimaPereche[i] +" ");
		for(int i=0;i<k;i++)	
			System.out.print("* " + DouaPereche[i]+ " ");*/
		for(int m=0;m<j;m++)
			for(int l=0;l<k;l++)
			{
				if(PrimaPereche[m]+DouaPereche[l]==1000)
					System.out.println("("+PrimaPereche[m]+" "+DouaPereche[l]+")");
			}
	}

}
