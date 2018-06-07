package es.hackerrank.challenge30days;



public class Student extends Person{

	
	private int[] testScores;
	
	
	Student(String firstName, String lastName, int identification,  int[] scores) {
		super(firstName, lastName, identification);
		this.testScores=scores;
	}



	
	
	

	public String calculate(){
		int average,sumScore=0,numScores=0;
		String grade = null;
		numScores=testScores.length;
		for(int i = 0; i < testScores.length; i++){
			sumScore=sumScore+testScores[i];
			
		}
		average=sumScore/numScores;
		if (average >=90 && average<=100) {
			grade="O";
		}else if (average >=80 && average<=90) {
			grade="E";
		}else if (average >=70 && average<=80) {
			grade="A";
		}else if (average >=55 && average<=70) {
			grade="P";
		}else if (average >=40 && average<=55) {
			grade="D";
		}else if (average<40) {
			grade="T";
		}
			
		return grade;}



	public int[] getTestScores() {
		return testScores;
	}



	public void setTestScores(int[] testScores) {
		this.testScores = testScores;
	}
	
}
