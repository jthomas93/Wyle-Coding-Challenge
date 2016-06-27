import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Collection {
	
	public static void main(String[] args) {
		//Begin Collection Part 1
		List<Integer> c1 = new ArrayList<Integer>();
		List<Integer> c2 = new ArrayList<Integer>();
		List<Integer> c3 = new ArrayList<Integer>();
		
		int arr[] = new int[10];
		
		int i;
		arr[0] = 1;
		int val = 2;
		for( i = 1; i < 10; i++) {
			arr[i] = val;
			val ++;
			
			
		}
		
		arr = shuffleArray(arr);
	    for(i = 0; i < arr.length; i++) {
	    	
	    	c1.add(arr[i]);
	    	
	    }
	   
	    arr[0] = 6;
	    val = 7;
        for(i = 1; i < arr.length; i++) {
	    	
	    	arr[i] = val;
	    	val ++;
	    	
	    }
	    arr = shuffleArray(arr);
	    for(i = 0; i < arr.length; i++) {
	    	c2.add(arr[i]);
	    }
		
	    System.out.println("Collection 1 = " + c1.toString() + " Size of c1 = " + c1.size());
	    System.out.println("Collection 2 = " + c2.toString() + " Size of c2 = " + c2.size());
	    System.out.println();
	
	    //Begin Collection Part 2 Merging c1 and c2
	    //Get rid of duplicates
	    for (Integer x : c2) {
	    	 if (!c1.contains(x)) {
	    		 c1.add(x);
	    	 }
	    }
		c3.addAll(c1);
		
		
		Collections.sort(c3);
		//Delete the middle entry
		int ndx = c3.size() / 2;
		c3.remove(ndx);
		//Reverse
		Collections.reverse(c3);
		System.out.println("Merged Collection in reverse = " + c3.toString() +  " Size of c3 = " + c3.size());

		System.out.println();
		//Begin Final Part
		//Keys and Values
		
		//Map of People and IDS
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		map.put("Nancy", 1001);
		map.put("Nick", 1004);
		map.put("Jacob", 1000);
		map.put("Hallie" , 1003);
		map.put("Jamal", 1111);
		map.put("Jacob", 1000);
		int occ = 0;
		for( String k : map.keySet()) {
			if(k.equalsIgnoreCase("Jacob")) {
				occ ++;
				if(occ > 1) {
					int hval = map.get(k);
					map.remove(k, hval);
				}
			}
			System.out.println("Key: " + k + " Value: " + map.get(k));
		}
		System.out.println("Size of Hash = " + map.size());
		System.out.println();
		System.out.println();
		
		//Last Question
		pageThreeLoop();
		 
	}
	//LAST QUESTION REWRITE OF FOR LOOP
	public static void pageThreeLoop() {
		int n = 5;
		int i;
		String[] arr = new String[10];
	    for(i = 0; i < arr.length; i++) {
	    	arr [i] = ".";
	    	
	    	
	    }
	    int val = 1;
	    System.out.println(arr.toString());
	    for(i = n-1; i < 0; i--) {
	    	arr[i] = Integer.toString(val);
	    	System.out.println(arr.toString());
	    	val++;
	    }
	}
	//Method to put array in random order
	public static int[] shuffleArray(int[] arr) {
		Random rgen = new Random(); 	
		 
		for (int i=0; i<arr.length; i++) {
		    int randomPosition = rgen.nextInt(arr.length);
		    int temp = arr[i];
		    arr[i] = arr[randomPosition];
		    arr[randomPosition] = temp;
		}
 
		return arr;
		
		
	}
	

}
