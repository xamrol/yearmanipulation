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
		// To do
		
	}

	public static void calculateNumberOfYears(int year) {
		// To do

	}
	
	public static void checkConvenientCentury(int year) {
		// To do

	}

}
	