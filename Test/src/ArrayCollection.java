import java.util.*;
public class ArrayCollection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
	     int size=sc.nextInt();
	     String[]colors=new String[size];
	     for(int i=0;i<size;i++)
	     {
	    	 System.out.println("enter the element");
	    	 colors[i]=sc.next();
	     }
	    
	    List<String> l=Arrays.asList(colors);
		System.out.println(l);
	
	
		for(int i=0;i<l.size();i++) {
	 
	    	System.out.println("index position:" +i+" and index value: "+l.get(i));
	    	
    }
	    	
		Collections.reverse(l);
		
		System.out.println(l);
		
		for(int i=0;i<l.size();i++) {
			 
	    	System.out.println("index position:" +i+" index value: "+l.get(i));
	    	}
		
}
}

