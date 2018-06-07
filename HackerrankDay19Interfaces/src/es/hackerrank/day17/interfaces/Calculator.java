package es.hackerrank.day17.interfaces;

 class Calculator implements AdvancedArithmetic{

	@Override
	public int divisorSum(int n) {
		int resultado=0;
		if (n>=1 && n<=1000) {
			for (int i = 1; i <= n; i++) {
				int remainder=n%i;
				if (remainder==0) {
					resultado+=i;
				}
				
			}
		}
		
		
		return resultado;
	}

}
