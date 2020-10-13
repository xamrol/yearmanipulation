package com.mgl7460.yearmanipulation;

import java.util.Scanner;
import java.util.Calendar;

public class YearManipulation {
	
	/**
	 * Manipulate a given year : check a leap year, number of years between two dates or the convenient century
	 * 
	 * @author ProjectGroup
	 */	
	
	//  Declarations
	protected static boolean isLeap = true;
	protected static int numberOfYears, convenientCentury;
	
	public static void main(String[] args) {
	
		// Declarations
		int userchoice, year;
		
		// Scanner Initialization
		Scanner sc = new Scanner(System.in);
		
		// Introduction
		System.out.println("Bienvenue dans notre application de manipulation d'années.");
		System.out.println("Fonctionnalités disponibles:");
		System.out.println("	1) Vérification Année bissextile");
		System.out.println("	2) Nombre d'années ecoulées entre une année et la date actuelle");
		System.out.println("	3) Vérification Siècle Année");
		
		
		// Getting the year
		do {
			System.out.print("Entrez l'année de référence (>=0): ");
			year = sc.nextInt();
		} while (year<0);
		
		// Getting user choice
		do {
			System.out.print("Entrez le chiffre correspondant à votre choix (>=0): ");
			userchoice = sc.nextInt();
		}	while (userchoice<0);
		
		// Closure of the Scanner's stream
		sc.close();
		
		// Code behavior regarding user's choice
		switch (userchoice) {
			case 1:
				checkLeapYear(year);
			break;
			case 2:
				calculateNumberOfYears(year);
			break;
			case 3:
				checkConvenientCentury(year);
			break;
			default:
				System.out.println("Erreur! Valeur non reconnue!");
		}
		
		
	}
	
	public static void checkLeapYear(int year) {
		
		// Introduction
		System.out.println("\nVérification Année bissextile ==>");
		
		// check whether year is divisible by 4 but not 100 or divisible by 400
		if (year % 4 == 0 && year % 100 != 0){
			System.out.println(year + " EST une année bissextile");
		}
		else if (year % 400 == 0){
			System.out.println(year + " EST une année bissextile");
		}
		else {
			System.out.println(year + " N'EST PAS une année bissextile");
			isLeap = false;
		}
	}

	public static void calculateNumberOfYears(int year) {
			
		// Introduction
		System.out.println("\nCalcul nombre d'années entre Année courante et Année utilisateur ==>");
		
		// Current date checking
		Calendar calendar =Calendar.getInstance();
		int currentyear =calendar.get(Calendar.YEAR);
		
		numberOfYears = currentyear - year;
		
		// Output
		System.out.println("Année courante(" + currentyear + ") - Année fournie(" + year + ") = " + numberOfYears);	


	}
	
	public static void checkConvenientCentury(int year) {
		// To do

	}

}
	