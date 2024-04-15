package get;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Main {
	static int a;
	static int[] b;   
	static String[] c; 
	public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
		Map<Integer,String> map=new HashMap<>();
		int a=s.nextInt();
		b=new int[a] ;   
		 c=new String[a] ;
    	for(int i=0;i<a;i++) {
    		 b[i]=s.nextInt();
    	}
    	for(int i=0;i<a;i++) {
   		   c[i]=s.next();
   	}
    	for(int i=0;i<a;i++) {
    		   map.put(b[i], c[i]);
    		   System.out.println(map);
    		   System.out.println(map.values());
    	}
    	
    	}
    	
    	
    	
    	}
    
   
     
    	
   
    
    
  