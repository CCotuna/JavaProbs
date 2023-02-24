
public class NumereDeForma {

	public static void main(String[] args) {
		int a; int b;

		for(int i =0;i<10;i++)
		{
			a = i;
			for(int j=0;j<10;j++)
			{
				b = j;
				if((3*1000+a*100+20+b)%9==0)
					System.out.println(3*1000+a*100+20+b);
			}
		}

	}

}
