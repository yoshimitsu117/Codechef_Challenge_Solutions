package february.challenge;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HighestDivisor {
			public static void main(String args[]) throws IOException
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				int max=0;
				int n=Integer.parseInt(br.readLine().trim());
				for(int i=1;i<=10;i++)
				{
					if(n%i==0)
					{
						max=i;
					}
				}
				System.out.println(max);
				
			}
}

