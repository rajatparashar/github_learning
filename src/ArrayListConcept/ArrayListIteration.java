package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> browsersList = new ArrayList<String>();
		browsersList.add("chrome");//0
		browsersList.add("firefox");//1
		browsersList.add("edge");//2
		browsersList.add("IE");//3
		
		System.out.println(browsersList);
		
		//index for loop:
		for(int i=0; i<browsersList.size(); i++) {
			System.out.println(browsersList.get(i));
				if(browsersList.get(i).equals("firefox")) {
					System.out.println("launch firefox");
					break;
				}
		}
		
		System.out.println("---------");
		
		//for each loop:
		for(String e : browsersList) {
			System.out.println(e);
				if(e.equals("firefox")) {
					System.out.println("launch firefox");
					break;
				}
		}
		
	}

}
