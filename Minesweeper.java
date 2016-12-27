import java.io.*;
class Minesweeper
{
	public static void main(String arghh[])throws IOException
	{
		String s;
		int c=0;
		BufferedReader br=new BufferedReader(new FileReader("question.txt"));
		while(true)
		{
			c++;
			s=br.readLine();
			int a=Integer.parseInt(s.substring(0,s.indexOf(' ')));
			int b=Integer.parseInt(s.substring(s.indexOf(' ')+1));
			if(a==0&&b==0)
			break;
			System.out.println("Field #"+c+": ");
			int ar[][]=new int[a][b];
			for(int i=0;i<a;i++)
			{
				s=br.readLine();
				for(int j=0;j<s.length();j++)
				{
					char ch=s.charAt(j);
					if(ch=='*')
					ar[i][j]=-1;
				}
			}
			generate(ar,a,b);
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					if(ar[i][j]==-1)
					System.out.print("*");
					else
					System.out.print(ar[i][j]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	static void generate(int ar[][],int a,int b)
	{
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(ar[i][j]==-1)
				{
					if(j-1>=0&&ar[i][j-1]!=-1)
					ar[i][j-1]++;
					if(j+1<b&&ar[i][j+1]!=-1)
					ar[i][j+1]++;
					if(i-1>=0&&ar[i-1][j]!=-1)
					ar[i-1][j]++;
					if(i+1<a&&ar[i+1][j]!=-10)
					ar[i+1][j]++;
					if(i-1>=0&&j-1>=0&&ar[i-1][j-1]!=-1)
					ar[i-1][j-1]++;
					if(i-1>=0&&j+1<b&&ar[i-1][j+1]!=-1)
					ar[i-1][j+1]++;
					if(i+1<a&&j-1>=0&&ar[i+1][j-1]!=-1)
					ar[i+1][j-1]++;
					if(i+1<a&&j+1<b&&ar[i+1][j+1]!=-1)
					ar[i+1][j+1]++;
				}
			}
		}
	}
}