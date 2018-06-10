class FlipCoin
{
	static boolean ar[]=new boolean[100];
static	boolean x,y;
	static int i,j,hcount,tcount;
static	String ar1[]=new String[100]; 
	static boolean flipIt()
	{
		
		if (Math.random() < 0.5)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	 static void store()
	{
		for(int i=0;i<100;i++)
		{
			x=FlipCoin.flipIt();
			ar[i]=x;
		}
		
		while(j<100)
		{
			FlipCoin.display(j);
			j++;
		}
		System.out.println("Number heads "+hcount);
	System.out.println("Number tails "+tcount);

	}
	static void display(int z)
	{
		if(ar[z]==true)
		{
			ar1[z]="heads";
		}
		else
		{
			ar1[z]="tails";
		}
		
   if(ar1[z]=="heads")
   {

     hcount++;
   }

   

     if(ar1[z]=="tails")
     {
     	tcount++;
     }
		// System.out.print(ar[z]+" ");
		 System.out.print(ar1[z]+" ");
		 
	
	}
	
}
class Flipcoin1
{
	public static void main(String ar[])
	{
		FlipCoin obj=new FlipCoin();
		obj.store();
		
	}
}