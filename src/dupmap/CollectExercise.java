package dupmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

class CollectExercise 
{
	
	void printIntArray(int arr[]) {
		int size = arr.length;
		if (size <= 0) return;
		
		System.out.print("Collection size: " + size + ", contents [");
		for ( int i=0; i < size; i++) {
			System.out.print(arr[i] );
			if ( i < size-1 )
				System.out.print(",");
		}
		System.out.println("]");
	}
    
	public static int[] convertIntegers(ArrayList<Integer> integers)
	{
	    int[] ret = new int[integers.size()];
	    Iterator<Integer> iterator = integers.iterator();
	    for (int i = 0; i < ret.length; i++)
	    {
	        ret[i] = iterator.next().intValue();
	    }
	    return ret;
	}
	
	void printInReverse(Integer arr[] ) {
		int size = arr.length;
		if (size <= 0) return;
		
		/* Put array into an ArrayList and populate, then sort the
        elements of ArrayList in descending order. */
		
		System.out.print("Collection size: " + size + ", contents:");
		ArrayList<Integer> revArr = new ArrayList<Integer>();
		for (int i=0; i < arr.length ; i++) {
			revArr.add( arr[i] );
		}
		
		Collections.sort(revArr, Collections.reverseOrder());
		printIntArray( convertIntegers(revArr) );
  
	}
	
	void printInReverse(TreeSet<Integer> set) {
		Iterator<Integer> listIter = set.descendingIterator();
		System.out.print("printInReverse: ");
		for (Iterator<Integer> iter = listIter; iter.hasNext(); ) {
		    Integer element = (Integer) iter.next();
		    System.out.print(element + " ");
		}
		System.out.println();
		
	}
	
    // Join arr1[0..m-1] and arr2[0..n-1]
    TreeSet<Integer> joinAry(int arr1[], int arr2[]) 
    {
    	int m = arr1.length;
    	int n = arr2.length;
    	TreeSet<Integer> setNumbers = new TreeSet<>();
    	
        // With TreeSet, it implements SortedSet interface, no need to sort.
        // add arr1
        for (int i = 0; i < m; i++) {
            setNumbers.add( arr1[i] );
        }        
        // add arr2
        for (int i = 0; i < n; i++) {
            setNumbers.add( arr2[i] );
        }
        
        System.out.println("After Merge,  Set size: " + setNumbers.size() + ", = " + setNumbers);
        
        return setNumbers;
    }
    
    static public class DuplicateMap<K, V> {

        private Map<K, ArrayList<V>> m = new HashMap<>();

        public void put(K k, V v) {
            if (m.containsKey(k)) {
            	System.err.println("Key:" + k + " already exists, do not add! to preserve" + m.get(k));
                //m.get(k).add(v);
            } else {
            	//System.out.println("Adding to map, key=" + k + ", val=" + v);
                ArrayList<V> arr = new ArrayList<>();
                arr.add(v);
                m.put(k, arr);
                
            }
        }
        
        public void printValues() {
        	System.out.println("Values:" + m.values() ) ;
        }
        
        public void printKeys() {
        	System.out.println("Keys:" + m.keySet() );
        }
        
        public void size() {
        	System.out.println("Size of Key/Value mappings: " + m.size());
        }

         public ArrayList<V> get(K k) {
            return m.get(k);
        }

        public V get(K k, int index) {
            return m.get(k).size()-1 < index ? null : m.get(k).get(index);
        }
    }
	
 

    /*
     Given two collections of integers:
         arr1[] = {1..10}
         arr2[] = {6..15}
     */
    public static void main(String[] args) 
    {
    	/**
    	 1. Define 2 collections
           - Print both collections
           - Print the size of both collections
    	 */
        CollectExercise ce = new CollectExercise();
        int arr1[] = {4, 8, 7, 1, 5, 2, 3, 10, 6, 9};
        int arr2[] = {7, 9, 11, 13, 15, 8, 10, 12, 14, 6};
        System.out.println("Defining two collection of integers");
        ce.printIntArray(arr1);
        ce.printIntArray(arr2);
        
        /**
         2. Combine the above collections into a third collection
           - Should not contain duplicates
           - Must be sorted
           - Remove the middle entry
           - Print the collection in reverse order
           - Print the size of the collection
         */
        System.out.println("\nMerge the above collections in an sorted and unique order");
        TreeSet<Integer> sortedSet = ce.joinAry(arr1, arr2);
        
        int elemIndex = sortedSet.size() / 2;       
        System.out.println("\nRemoving middle entry:" + sortedSet.subSet(elemIndex, elemIndex+1) );
        sortedSet.remove(elemIndex) ;
        
        // print out sortedSet in reverse Order
        System.out.println("\nPrint the set of integers in reverse order");
        ce.printInReverse( sortedSet );

        /**
         3. Define a collection that contains a key/value pairs
           - Add 5 pairs
           - Add a duplicate key/value pair, check for the duplicate case and print it
           - Print the key/value pairs
           - Print the size of the collection when done
           - Comment code to explain the choice of specific collections.
         */
        
        System.out.println("\n-----------Duplicate Hash map-----------");
        /**
         * Use dupMap class to intercept and detect duplicate key insertion to avoid overwrite
         */
        DuplicateMap<String,String> dupMap = new DuplicateMap<>();
        dupMap.put("1", "one");
        dupMap.put("2", "two");
        dupMap.put("3", "three");
        dupMap.put("4", "four");
        dupMap.put("5", "five");
        System.out.println("Added 5 key/value pairs.");     

         // attempt to add duplicate
        System.out.println("Attempt to add duplicate key.");
        dupMap.put("5", "anotherFive");
        
        System.out.println("\nKey and Value Contents:");
        dupMap.printKeys();
        dupMap.printValues();
        dupMap.size();
        
 
        }
        
    }      
   