import java.util.Scanner;

class GPACalculator {

  public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Welcome to the GPA Calculator!");
		System.out.println("How many courses do you take?");
		int courses = input.nextInt();

		int counter = 1;
		String[] grade = new String[courses];
		char[] level = new char[courses];
		double[] credits = new double[courses];
		
		while (counter <= courses)
		{
			System.out.println("Please enter the grade for course " + counter);
			grade[counter - 1] = input.next();
			System.out.println("Please enter the credits for course " + counter);
			credits[counter - 1] = input.nextDouble();
			System.out.println("Please enter the level (H = honors, A = accelerated, R = regular) for course " + counter);
			level[counter - 1] = input.next().charAt(0);
			counter++;
		}
		input.close();
		
		double unweighted_gpa = uGPA(grade, level, credits, courses);
		double weighted_gpa = wGPA(grade, level, credits, courses);
		
		System.out.println("Your unweighted GPA is: " + unweighted_gpa);
		System.out.println("Your weighted GPA is: " + weighted_gpa);
	}

	public static double uGPA (String[] grade, char[] level, double[] credits, int courses)
	{
		int counter = 1;
		double unweighted_gpa, totalvalue = 0, totalcredits = 0;
		double[] value = new double[courses];
		
		while (counter <= courses)
		{
			value[counter - 1] = getValue(counter, grade);

			totalvalue += credits[counter - 1] * value[counter - 1];
			totalcredits += credits[counter - 1];
			counter++;
		}
		unweighted_gpa = totalvalue/totalcredits;
		
		return unweighted_gpa;
	}
	
	public static double wGPA (String[] grade, char[] level, double[] credits, int courses)
	{
		int counter = 1;
		double weighted_gpa, totalvalue = 0, totalcredits = 0;
		double[] value = new double[courses];
		
		while (counter<=courses)
		{
			value[counter - 1] = getValue(counter, grade);
			if (level[counter - 1] == 'A' && grade[counter - 1] != "D" && grade[counter - 1] != "F")
			{
				value[counter - 1] += 1;
			}
			if (level[counter - 1] == 'H' && grade[counter - 1] != "D" && grade[counter - 1] != "F")
			{
			  value[counter - 1] += 2;
			}
				  
			totalvalue += credits[counter - 1] * value[counter - 1];
			totalcredits += credits[counter - 1];
			counter++;
		}
		weighted_gpa = totalvalue/totalcredits;
				
		return weighted_gpa;
	}

	private static double getValue (int counter, String[] grade)
	{
		switch (grade[counter - 1].toUpperCase()) {
			case "A+": return 4.33;
			case "A": return 4.00;
			case "A-": return 3.67;
			case "B+": return 3.33;
			case "B": return 3.00;
			case "B-": return 2.67;
			case "C+": return 2.33;
			case "C": return 2.00;
			case "C-": return 1.67;
			case "D": return 1.00;
			default: return 0.00;
		}
  }
  
}