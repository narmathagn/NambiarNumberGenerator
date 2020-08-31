import java.io.*;
public class NambiarNumberGenerator{
	public static void main(String args[]){
		String s="988012743";
		int j=0,sum=0;
		String k="";
		String an="";
		int i=0;
		while(i<s.length())
		{
			j=(int)s.charAt(i)-48;
			//System.out.println(j);
			sum=j;
			k=evenodd(j);
			if(k.equals("EVEN"))
			{
			i++;
				while(evenodd(sum)=="EVEN"&&i<s.length())
				{
					int m=(int)s.charAt(i)-48;
					sum=sum+m;
					i++;
				}
				an=an+sum;
				sum=0;
			}
			
			else
			{
			i++;
				while(evenodd(sum)=="ODD"&&i<s.length())
				{
					int m=(int)s.charAt(i)-48;
					sum=sum+m;
					i++;
				}
				an=an+sum;
				sum=0;
			}
		}
		int val=Integer.parseInt(an);
		System.out.println(val);
	}
	public static String evenodd(int a)
	{
		if(a%2==0)
		{
		return "EVEN";
		}
		else
		{
		return "ODD";
		}
	}
}