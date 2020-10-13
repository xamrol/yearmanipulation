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
	
	public static void main(String[] args)  {
	
		// Declarations
		int userchoice, year, retrygame;
		
		// Scanner Initialization
		Scanner sc = new Scanner(System.in);
		
		do {
		
			// Introduction
			System.out.println("Bienvenue dans notre application de manipulation d'ann�es.");
			System.out.println("Fonctionnalités disponibles:");
			System.out.println("	1) Vérification Année bissextile");
			System.out.println("	2) Nombre d'années ecoulées entre une année et la date actuelle");
			System.out.println("	3) Vérification Siécle Année");
			
			
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
			
			// Ask user if he wants to play again
			do {
				System.out.println("\nVoulez-vous rejouer? (1=>Oui;2=>Non) :");
				retrygame = sc.nextInt();
			} while (retrygame != 1 && retrygame != 2);
			
		} while (retrygame == 1);
		
		// Closure of the Scanner's stream
		sc.close();
		
		System.out.println("\nAu revoir !");
		
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
		
		// Introduction
		System.out.println("\nSiècle correspondant à l'année fournie ==>");
		
		// Declarations & Initializations
		String stringy, substract = null;
		int century;
		
		stringy = Integer.toString(year);		
		
		// Checking
		if (year>=1000 & year<10000)
			substract = stringy.substring(0, 2);
		else if (year>=100)
			substract = stringy.substring(0, 1);
		else
			substract = "0";
		
		// Century definition
		convenientCentury = century = Integer.parseInt(substract) + 1;
		
		// Output
		if(century == 1)
			System.out.println("L'année " + year + " appartient au " + century + "er siècle");
		else
			System.out.println("L'année " + year + " appartient au " + century + "e siècle");
		
	}

}