import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Sample2 {

	
	public static void main(String[] args) {
		List arr1=new ArrayList();
		arr1.add(12);
		arr1.add(42);
		arr1.add(31);
		arr1.add(45);
		Iterator itr1=arr1.iterator();
	    while(itr1.hasNext())
		{
			System.out.println(itr1.next());
			arr1.add(56);
			 
		}
		
			
	}

}
