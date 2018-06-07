package es.hackerrank.day14;

import java.util.ArrayList;
import java.util.List;

  class Difference {
	private int[] elements;
  	public int maximumDifference;
  	
  	public Difference(int[] elements) {
		super();
		this.elements = elements;
		
	}

	public void computeDifference(){
		int element=0,difference=0, n=0;
		n=elements.length;
		if (n>=1 && n<=10) {
			
		
		List<Integer> lstDifference = new ArrayList<Integer>();
		
		for (int p = 0; p < elements.length; p++) {
			element=elements[p];
			if (element>=1 && element<=100) {
			for (int j = 0; j < elements.length; j++) {
				difference=Math.abs(element-elements[j]);
				lstDifference.add(difference);
				
			}
			}
			
			
        }
		maximumDifference=lstDifference.stream().mapToInt(i -> i).max().getAsInt();
		
		}
	}
}
