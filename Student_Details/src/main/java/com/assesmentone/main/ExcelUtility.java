package com.assesmentone.main;

import java.io.IOException;
import java.util.Scanner;

public class ExcelUtility {

	

	public static void main(String[] args) throws IOException {
		Scanner userin = new Scanner(System.in);
		Details data = new Details();
		Boolean flag = true;
		while (Boolean.TRUE.equals(flag)) {
			
				
				
				System.out.println("Enter 0 for Search by Admission Number \nJust type any other integer for search by name");
				int addmissionOrName = userin.nextInt();


				if (addmissionOrName == 0) {
					System.out.println("You have selected Search by Admission Number Enter the Admission Number :");
				int addmisioNum = userin.nextInt();

				data.fetchDetails(addmisioNum);

			}

			else {
				System.out.println("You have selected Search by Name Enter the Name : ");
				String studentname = userin.next();

				data.nameDetails(studentname);

			}
			System.out.println("Do yo want to continue type y for yes and n for no : ");
			String str = userin.next();
			if (str.equals("y") || str.equals("Y")) {
				flag = true;

			} else {
				flag = false;
			}

		}
		userin.close();

	}
}
