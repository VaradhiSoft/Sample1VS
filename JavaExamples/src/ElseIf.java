class ElseIf {
	
	public static void main(String[] args) {
		int english = 68;
		int maths = 79;
		int science = 86;
		
		int totalSubjects = 3;
		
		int totalMarks = english + maths + science;
		
		double average = totalMarks/totalSubjects;
		
		char grade;
		
		if(average >= 75 ){
			grade = 'A';
		} else if(average >= 60){
			grade = 'B';			
		} else if(average >= 50){
			grade = 'C';
		} else{
			grade = 'F';
		}
		
		System.out.println("Grade is:"+grade);
	}

}
