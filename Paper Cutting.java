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
		    int n=scn.nextInt();
		    int k=scn.nextInt();
		    int res=0;
		    if(n==k){
		        System.out.println("1");
		    }
		    else if(k==1){
		        System.out.println(n*n);
		    }else{
		        res=n/k;
		        System.out.println(res*res);
		        
		    }
		}
	}
}
