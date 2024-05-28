package hello_world;
import java.util.*;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100, 100, 200, 200, 190, 90, 190, 190, 90, 81};
		HashMap<Integer, Integer> temp = new HashMap<>();
		for (int i=0;i<arr.length;i++) {
			if (temp.containsKey(arr[i])) {
				temp.put(arr[i], temp.get(arr[i])+1);
			}
			else {
				temp.put(arr[i],1);
			}
		}
		for(int i:temp.keySet()) {
			System.out.println(i + "-" + temp.get(i)+" Times");
		}

	}

}
