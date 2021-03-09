	public char letterGrade (double num) {
		
		char finalGrade;
		
		if (num < 60)
			finalGrade = 'F';
		else if (num >= 60 && num <70)
			finalGrade = 'D';
		else if (num >=70 && num <80)
			finalGrade = 'C';
		else if (num >=80 && num <90)
			finalGrade = 'B';
		else 
			finalGrade = 'A';
		
		
		return finalGrade;
		
	}
	
