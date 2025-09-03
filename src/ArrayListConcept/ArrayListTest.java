package ArrayListConcept;

import java.util.ArrayList;


public class ArrayListTest {

	public static void main(String[] args) {

		//ArrayList -- default class
		//dynamic array
		//size is not fixed
		//order based or index based
		
		ArrayList ar = new ArrayList();//vc=10,pc=0
		System.out.println(ar.size());//size=pc=0
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());//vc=8, pc=2
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());//4
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(3));
		//System.out.println(ar.get(4));//IOB
		
		ar.add(500);//4
		System.out.println(ar.get(4));
		
		System.out.println(ar.size());//5

		ar.remove(2);
		System.out.println(ar.size());//4
		System.out.println(ar.get(2));
		
		System.out.println("--------");
		
		ArrayList at = new ArrayList(5);//vc=5, pc=0
		System.out.println(at.size());//0
		at.add(100);
		at.add(12.33);
		at.add("tom");
		at.add('c');
		at.add(true);
		System.out.println(at);
		
		
		//Student marks: Integer
		//Generics Type: Integer
		ArrayList<Integer> marksList = new ArrayList<Integer>();//vc=10, pc=0
		marksList.add(80);
		marksList.add(70);//vc=8,pc=2
		
		System.out.println(marksList.size());

		//
		ArrayList<Double> dataList = new ArrayList<Double>();//vc=10, pc=0
		dataList.add(12.33);
		dataList.add(200.00);
		
		System.out.println(dataList);

		
		//
		ArrayList<String> browsersList = new ArrayList<String>();//vc=10, pc=0
		browsersList.add("chrome");//0
		browsersList.add("firefox");//1
		browsersList.add("edge");//2
		browsersList.add("IE");//3
		
		System.out.println(browsersList.size());
		System.out.println(browsersList.get(1));
		
		System.out.println(browsersList);
		
		//empData: name, age, salary, gender, true
		ArrayList<Object> empInfoList = new ArrayList<Object>();//vc=10, pc=0
		empInfoList.add("Tom");
		empInfoList.add(30);
		empInfoList.add(12.33);
		empInfoList.add('m');
		empInfoList.add(true);
		
		System.out.println(empInfoList.size());//vc=5,pc=5
		System.out.println(empInfoList);
		
		
		for(Object e : empInfoList) {
			System.out.println(e);
		}

		
	}

}
