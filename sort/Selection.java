package algs4.sort;


public class Selection {
	public static void sort(Comparable[] a){
		
	}
	
	
	private static boolean less(Comparable a, Comparable b){
		return a.compareTo(b) < 0;
	}
	 
	private static void exch(Comparable[] a, int i , int j){
		Comparable t = a[i]; a[i] = a[j]; a[j] = t;
	}
	public static boolean isSorted(Comparable[] a){
		for (int i = 1; i < a.length; i++){
			if (less(a[i] , a[i+1])) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
	
	}

}
