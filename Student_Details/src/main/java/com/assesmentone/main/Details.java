package com.assesmentone.main;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.assesmentone.model.Student;
import com.assesmentone.operators.Totalmarks;

public class Details {
	Student studentOne = new Student();

	public void fetchDetails(int addmisionNum) throws IOException {
		String excelPath = "Data\\Info-classroom.xlsx";
		XSSFWorkbook work = new XSSFWorkbook(excelPath);
		XSSFSheet sheet = work.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		for (int i = 1; i <= rowcount; i++) {
			int adm = (int) sheet.getRow(i).getCell(0).getNumericCellValue();

			if (addmisionNum == adm) {



				String name = sheet.getRow(i).getCell(1).toString();
				double physicsMarks = sheet.getRow(i).getCell(2).getNumericCellValue();
				double chemistryMarks = sheet.getRow(i).getCell(3).getNumericCellValue();
				double mathsMarks = sheet.getRow(i).getCell(4).getNumericCellValue();
				studentOne.setAddmisionNum(adm);
				studentOne.setName(name);
				studentOne.setPhyMark(physicsMarks);
				studentOne.setChemMark(chemistryMarks);
				studentOne.setMathMark(mathsMarks);
				printDetails(adm, name, physicsMarks, chemistryMarks, mathsMarks);

			}

		}

		work.close();
	}

	public void nameDetails(String admname) throws IOException {
		XSSFWorkbook work = new XSSFWorkbook("Data\\Info-classroom.xlsx");
		XSSFSheet sheet = work.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		for (int k = 1; k <= rowcount; k++) {

			String nameOne = sheet.getRow(k).getCell(1).getStringCellValue().toLowerCase();
			admname = admname.toLowerCase();
			if (admname.equals(nameOne)) {

				int addm = (int) sheet.getRow(k).getCell(0).getNumericCellValue();

				String name = sheet.getRow(k).getCell(1).toString();
				double physicsMarks = sheet.getRow(k).getCell(2).getNumericCellValue();
				double chemistryMarks = sheet.getRow(k).getCell(3).getNumericCellValue();
				double mathsMarks = sheet.getRow(k).getCell(4).getNumericCellValue();
				studentOne.setAddmisionNum(addm);
				studentOne.setName(name);
				studentOne.setPhyMark(physicsMarks);
				studentOne.setChemMark(chemistryMarks);
				studentOne.setMathMark(mathsMarks);

				studentOne.getChemGrade();

				printDetails(addm, name, physicsMarks, chemistryMarks, mathsMarks);

				ArrayList<Student> studentList = new ArrayList<Student>();
				studentList.add(studentOne);
				System.out.println(studentList);

			}

		}
		work.close();
	}

	public static void printDetails(int addmisionNum, String name, double phyMark, double chemMark, double mathMark) {
		Totalmarks oper = new Totalmarks();
		System.out.println("Name : " + name);
		System.out.println("Admission Number : " + addmisionNum);
		oper.totalMark(phyMark, chemMark, mathMark);
		oper.getPercentage(phyMark, chemMark, mathMark);

		System.out.println("Physics : \n\t Marks: " + phyMark);
		oper.getGrades(phyMark);
		oper.getPoint(phyMark);

		System.out.println("Chemistry : \n\t Marks: " + chemMark);
		oper.getGrades(chemMark);
		oper.getPoint(chemMark);
		System.out.println("Maths : \n\t Marks: " + mathMark);
		oper.getGrades(mathMark);
		oper.getPoint(mathMark);
	}

}
