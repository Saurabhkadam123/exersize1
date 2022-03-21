public class Primeupto20
{
	
	void calculateprime()
	{
		int flag=0;
		for(int i=2;i<21;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					flag=1;				
			}
			if(flag==0)
				System.out.println(i+" is an prime number ");
		}
		
	}

			

	public static void main(String[] args) {
		Primeupto20 p=new Primeupto20();
		p.calculateprime();
	
	}
}