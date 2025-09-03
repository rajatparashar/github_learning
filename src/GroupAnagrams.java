import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> mainList = new ArrayList<List<String>>();
		for (int i = 0; i < strs.length; i++) {
			List<String> tempList = new ArrayList<String>();
			tempList.add(strs[i]);
			char arr[] = strs[i].toCharArray();
			Arrays.sort(arr);
			String temp = String.valueOf(arr);
			for (int j = i + 1; j < strs.length; j++) {
				char innerArr[] = strs[j].toCharArray();
				Arrays.sort(innerArr);
				String innerTemp = String.valueOf(innerArr);
				if (temp.equals(innerTemp)) {
					tempList.add(strs[j]);
				}
			}
			mainList.add(tempList);
		}
		return mainList;
	}
}