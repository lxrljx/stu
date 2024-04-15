package get;

import java.util.Scanner;

public class test4 {
	static int flag=0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int[] na=new int[a];	
		
		for(int i=0;i<a;i++) {
			na[i]=s.nextInt();
			}
		for(int i=0;i<a;i++) {
		
				if(na[i]>99999||sushu(na[i])==1||duichen(na[i])==1) {
					System.out.println("No");
				}
				else {System.out.println("Yes");
				}
				}
		}
		
	
	 public static int sushu(int i) {
		 //0是素数；1不是素数
		    if(i==1)
		        return 1;
		    if(i==2)
		        return 0;
		    //这两句是重点！
		    if(i%2==0)
		        return 1;
		    for(int j=2;j<i/2;j++)
		        if(i%j==0)
		            return 1;
		    return flag;
		
	    	  
	      }
	 
	
      
      public static int duichen(int i) {
    	  
    	String str=Integer.toString(i);
  		String nstr=new StringBuilder(str).reverse().toString();
  		if(str.equals(nstr)) {
  		}else {
  			//不对称
  			flag=1;
  		}
  		return flag;
  		}
      	  
}
