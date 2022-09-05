package com.assesmentone.operators;

public class Totalmarks {
	
	
	public double totalMark(double phyMark, double chemMark, double mathMark) {

		double totalmarks = phyMark + chemMark + mathMark;
		System.out.println("Total Marks is :" + totalmarks);
		return totalmarks;

	}

	public double getPercentage(double phyMark, double chemMark, double mathMark) {
		double totalmarks = phyMark + chemMark + mathMark;
		double percent = (totalmarks * 100) / (300);
		System.out.println("Percentage : " + percent + "%");
		return percent;
	}

	public String getGrades(double mark) {
		System.out.print("\t Grade:");
		if (mark > 90d) {
			String gradvar ="A1";
			System.out.println(gradvar);
			return gradvar;
			
		} else if (mark > 80d) {
			
			String gradvar ="A2";
			System.out.println(gradvar);
			return gradvar;
		} else if (mark > 70d) {
			String gradvar ="B1";
			System.out.println(gradvar);
			return gradvar;
		} else if (mark > 60d) {
			String gradvar ="B2";
			System.out.println(gradvar);
			return gradvar;
		} else if (mark > 50d) {
			String gradvar ="C1";
			System.out.println(gradvar);
			return gradvar;
		} else if (mark > 40d) {
			String gradvar ="C2";
			System.out.println(gradvar);
			return gradvar;
		} else if (mark > 32d) {
			String gradvar ="D";
			System.out.println(gradvar);
			return gradvar;
		} else if (mark > 20d) {
			String gradvar ="E1";
			System.out.println(gradvar);
			return gradvar;
		} else {
			String gradvar ="E2";
			System.out.println(gradvar);
			return gradvar;

		}}

	
	public double getPoint(double mark) {
		System.out.print("\t Grade Point:");
		if (mark > 90d) {
			Double pointvar = 10.0;
			System.out.println(pointvar);
			
			return pointvar;
		} else if (mark > 80d) {
			Double pointvar = 9.0;
			System.out.println(pointvar);
			
			return pointvar;
		} else if (mark > 70d) {
			Double pointvar = 8.0;
			System.out.println(pointvar);
			
			return pointvar; 
		} else if (mark > 60d) {
			Double pointvar = 7.0;
			System.out.println(pointvar);
			
			return pointvar;
		} else if (mark > 50d) {
			Double pointvar = 6.0;
			System.out.println(pointvar);
			
			return pointvar;
		} else if (mark > 40d) {
			Double pointvar = 5.0;
			System.out.println(pointvar);
			
			return pointvar;
		} else if (mark > 32d) {
			Double pointvar = 4.0;
			System.out.println(pointvar);
			
			return pointvar;
		} 
		else {
			Double pointvar = 0.0;
			System.out.println(pointvar);
			
			return pointvar;

			}
   
 }

}
