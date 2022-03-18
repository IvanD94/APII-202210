package model;

import java.util.Comparator;
import java.util.List;

public class Utils<T extends Comparable<T>, C extends Comparator<T>> {
	
	public void sortBubble(List<T> list) {
		int n = list.size();
		boolean inversion = true;
		
		for (int i = 0; i < n && inversion; i++) {
			inversion = false;
	    	for (int j = 1; j < n - i; j++) {
	    		if (list.get(j).compareTo(list.get(j-1)) > 0) {
	    			T temp = list.get(j);
	    			list.set(j, list.get(j-1));
	    	        list.set(j-1, temp);
	    			inversion = true;
	    		}
	    	}
	    }
	}
	
	public void sortBubble(List<T> list, C comparator) {
		int n = list.size();
		boolean inversion = true;
		
		for (int i = 0; i < n && inversion; i++) {
			inversion = false;
	    	for (int j = 1; j < n - i; j++) {
	    		if (comparator.compare(list.get(j), list.get(j-1)) > 0) {
	    			T temp = list.get(j);
	    			list.set(j, list.get(j-1));
	    	        list.set(j-1, temp);
	    			inversion = true;
	    		}
	    	}
	    }
	}

}
