package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		ArrayList<String> browsersList = new ArrayList<String>();
		browsersList.add("chrome");//0
		browsersList.add("firefox");//1
		browsersList.add("edge");//2
		browsersList.add("ie");//3
		browsersList.add("opera");//4
		browsersList.add("brave");//5
		//browsersList.add("safari");//6
		
		//browsersList.set(0, "naveen");
		
		browsersList.add(2, "safari");//
		
		System.out.println(browsersList);

		//browsersList.remove(0);
		//		System.out.println(browsersList);
		//browsersList.removeAll(browsersList);
		
//		System.out.println(browsersList);
//		Collections.sort(browsersList);
		System.out.println(browsersList);
		
		//Collections.swap(browsersList, 2, 3);
		Collections.swap(browsersList, 0, browsersList.size()-1);
		
		System.out.println(browsersList);

		

		ArrayList<Integer> marksList = new ArrayList<Integer>();//vc=10, pc=0
		marksList.add(80);
		marksList.add(70);
		marksList.add(10);
		marksList.add(4);
		marksList.add(700);
		
		System.out.println(marksList);
		//Collections.sort(marksList);//ASC order
		Collections.sort(marksList, Collections.reverseOrder());//DESC order
		System.out.println(marksList);
		
		

		
		


	}

}
