package collectionsbasics;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList alist = new ArrayList();
		alist.add("hello");
		alist.add("there");
		alist.add(10);
		alist.add(25);
		alist.add('H');
		
		//items are added as onjects - as we did not use generics
		String item1 = (String)alist.get(0);
		
		Object ob1 = alist.get(2); 
		Object ob2 = alist.get(3);
		//System.out.println(ob1+ob2); // error as we cannot add objects
		
		ArrayList<String> aStrList  = new ArrayList<String>();
		getCapacity(aStrList);
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		getCapacity(aStrList);
		getCapacity(aStrList);
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		getCapacity(aStrList);
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		aStrList.add("blah"); //8
		aStrList.add("hello");
		aStrList.add("there"); //2
		aStrList.add("10"); //4
		System.out.println(aStrList);
		
		
		

	}
	
	static void getCapacity( ArrayList<?> l )
	        throws Exception
	    {
	        Field dataField = ArrayList.class.getDeclaredField( "elementData" );
	        dataField.setAccessible( true );
	        System.out.format( "Size: %2d, Capacity: %2d%n", l.size(), ( (Object[]) dataField.get( l ) ).length );
	}

}
