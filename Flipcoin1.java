class FlipCoin
{
	static boolean ar[]=new boolean[100];
	static	boolean x,y;
	static int i,j,hcount,tcount,hcounter,tcounter,hs,ts;
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
		System.out.println("longest heads run "+hs);
		System.out.println("longest tails run "+ts);

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
     hcounter++;
     tcounter=0;
   }

   

     if(ar1[z]=="tails")
     {
     	tcount++;
     	hcounter=0;
     	tcounter++;
     }
     if(hs<hcounter)
     {
     	hs=hcounter;
     }
     if(ts<tcounter)
     {
     	ts=tcounter;
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