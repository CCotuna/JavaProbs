
public class PerechiNumere {

	public static void main(String[] args) {
		
		int[] PrimaPereche = new int[60];
		int[] DouaPereche = new int[60];
		int j=0; int k =0;
		for(int i=17;i<=1000;i+=17) 
			if(i%17==0)
			{
				PrimaPereche[j]=i;
				j++;
			}
		for(int i=19;i<=1000;i+=19)
			if(i%19==0)
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
