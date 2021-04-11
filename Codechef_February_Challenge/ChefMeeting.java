package february.challenge;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class ChefMeeting {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int test=Integer.parseInt(br.readLine().trim());
		
		//if PM is there what I do is time + 12
		//now if there is a case 12:01
		for(int i=0;i<test;i++)
		{
			String[] time=br.readLine().trim().split(" ");
			String[] hhmm=time[0].split(":");
			int mins=Integer.parseInt(hhmm[1])%60;
			//1.PM-PM
			//2.AM-PM
			//3.AM-AM
			//4.PM-AM
			int n=Integer.parseInt(br.readLine().trim());
			for(int j=0;j<n;j++)
			{
				
				String[] time2=br.readLine().trim().split(" ");
				String[] hhmm1=time2[0].split(":");
				String indicator1=time2[1];
				String[] hhmm2=time2[2].split(":");
				String indicator2=time2[3];
				int hours=0;
				int hours1=0;
				int hours2=0;
				int mins1=0;
				int mins2=0;
				if("PM".equalsIgnoreCase(time[1]))
				{
					hours=(((Integer.parseInt(hhmm[0])%12)+12)*100)+mins;
				}
				else
				{
					hours=(((Integer.parseInt(hhmm[0])%12))*100)+mins;
				}
				boolean flag=false;
				if("PM".equalsIgnoreCase(indicator1) && "PM".equalsIgnoreCase(indicator2))
				{
					mins1=Integer.parseInt(hhmm1[1])%60;
					mins2=Integer.parseInt(hhmm2[1])%60;
					hours1=(((Integer.parseInt(hhmm1[0])%12)+12)*100)+mins1;
					hours2=(((Integer.parseInt(hhmm2[0])%12)+12)*100)+mins2;
					if((hours>=hours1 && hours<=hours2))
					{
						flag=true;
					}
				}
				else if("AM".equalsIgnoreCase(indicator1) && "PM".equalsIgnoreCase(indicator2))
				{
					mins1=Integer.parseInt(hhmm1[1])%60;
					mins2=Integer.parseInt(hhmm2[1])%60;
					hours1=((Integer.parseInt(hhmm1[0])%12)*100)+mins1;
					hours2=(((Integer.parseInt(hhmm2[0])%12)+12)*100)+mins2;
					if(hours>=hours1 && hours<=hours2)
					{
						flag=true;
						
					}
				}
				else if("PM".equalsIgnoreCase(indicator1) && "AM".equalsIgnoreCase(indicator2))
				{
					mins1=Integer.parseInt(hhmm1[1])%60;
					mins2=Integer.parseInt(hhmm2[1])%60;
					hours1=(((Integer.parseInt(hhmm1[0])%12)+12)*100)+mins1;
					hours2=((Integer.parseInt(hhmm2[0])%12)*100)+mins2;
					if(hours>=hours1 && hours<=2359)
					{ 
						flag=true;
						
					}
				}
				else if("AM".equalsIgnoreCase(indicator1) && "AM".equalsIgnoreCase(indicator2))
				{
					mins1=Integer.parseInt(hhmm1[1])%60;
					mins2=Integer.parseInt(hhmm2[1])%60;
					hours1=((Integer.parseInt(hhmm1[0])%12)*100)+mins1;
					hours2=((Integer.parseInt(hhmm2[0])%12)*100)+mins2;
					if(hours>=hours1 && hours<=hours2)
					{
						flag=true;
						
					}
				}
				if(flag)
				{
				bw.write("1");
				}
				else
				{
					bw.write("0");
				}
			}
			bw.write("\n");
			bw.flush();
		}
	}

}

