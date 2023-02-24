import java.util.Scanner;
public class NumarPrim2 {
	static int NumarPrim(int k) {
		int div = 0;
		for(int j=2;j<=k/2;j++)
			if(k%j==0)
				div++;
		if(div==0)
			return k;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		int i = 1000;	int verifica = 0;	int rezultat = 0;
		while(verifica == 0)
		{	
			if(NumarPrim(i+1)==0)
				i++;
			else
				{System.out.println(NumarPrim(i+1));
				verifica = 1;
				}
		}
		
	}

}
