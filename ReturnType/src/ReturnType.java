import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnType {

	public ReturnType() {
		// TODO Auto-generated constructor stub
	}

	public int firstmethod(int a, int b){
    	System.out.println(" After for  a : "+a);

	    for(int x = a; x >= 0; x--) {
	    	System.out.println(" After for x : "+x);
	        if (a % x == 0 && b % x == 0) {
	          	System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		    	System.out.println(" a % x == "+a%x +" b % x == "+b%x);
	          	System.out.println(" After if  x : "+x);
		    	System.out.println(" After if a : "+a);
		    	System.out.println("  After if b : "+b);
	          	System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");

	            return x;
	        }
	    }
	    return 1;
	}
	
	public Map<Integer, Integer> secondmethod(int a[], int b[]){
		
		    Map<Integer, Integer> m = new HashMap<>();
		    for(int i = 0; i < a.length; i++) {
		  //      m.put(a[],b[]);
		    	System.out.println(" i a b "+i+" " +a+" "+b+" ");

		    }
		    return m;
		}
	
	
	public static void sortFile() throws IOException
	{     
	    FileReader fileReader = new FileReader("C:\\Text.txt");
	    BufferedReader br = new BufferedReader(fileReader);
	    List<String> ln = new ArrayList<String>();
	    String line = null;
	    while ((line = br.readLine()) != null) {
	        ln.add(line);
	    }
	    br.close();

	    Collections.sort(ln, Collator.getInstance());

	    FileWriter wrt = new FileWriter("C:\\Text.txt"); 
	    for(String str: ln) {
	      wrt.write(str + "\r\n");
	    }
	    wrt.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ReturnType rt = new ReturnType();
		rt.firstmethod(5,4);
		rt.sortFile();
//	rt.secondmethod({1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8});

	}

	
}
