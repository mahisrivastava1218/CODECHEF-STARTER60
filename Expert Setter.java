import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		for(int textcase=1;textcase<=t;textcase++){
		    long x=scn.nextInt();
		    long y=scn.nextInt();
		    long res=0;
		    if(x%2==0){
		         res=x/2;
		         
		    }else{
		        res=x/2+1;
		    }
		    if(y>=res){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    
		}
	}
}
