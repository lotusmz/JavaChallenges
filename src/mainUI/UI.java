package mainUI;

import forLoopChallenges.AllFactors;
import forLoopChallenges.EvenDigitSum;
import forLoopChallenges.FirstAndLastDigitSum;
import forLoopChallenges.GreatestCommonDivisor;
import forLoopChallenges.LastDigitChecker;
import forLoopChallenges.NumberPalindrome;
import forLoopChallenges.SharedDigit;
import forLoopChallenges.Sum3And5;
import methodChallenges.AreaCalculator;
import methodChallenges.EqualityPrinter;
import methodChallenges.PlayingCat;
import switchChallenges.NumberOfDaysInMonth;

public class UI {

	public static void main(String[] args) {
		
/*		*//********************************************//*
		 	   *//*******AREA CALCULATOR*****//* 
		*//*******************************************//*
		
		System.out.println(AreaCalculator.area(5.0));
		System.out.println(AreaCalculator.area(-1));
		System.out.println(AreaCalculator.area(5.0, 4.0));
		System.out.println(AreaCalculator.area(-1.0,4.0));
		
		*//********************************************//*
	 	   *//*******MINUTES TO DAYS TO YEARS*****//* 
		*//*******************************************//*
		
		*//********************************************//*
	 	   	     *//*******EQUALITY PRINTER*****//* 
		*//*******************************************//*
		
		EqualityPrinter.printEqual(1, 1, 1);
		EqualityPrinter.printEqual(1, 1, 2);
		EqualityPrinter.printEqual(-1, -1, -1);
		EqualityPrinter.printEqual(1, 2, 3);
		
		*//********************************************//*
   	     		  *//*******PLAYING CAT*****//* 
		*//*******************************************//*
		
		System.out.println(PlayingCat.isCatPlaying(true, 10));
		System.out.println(PlayingCat.isCatPlaying(false, 36));
		System.out.println(PlayingCat.isCatPlaying(false, 35));

		*//********************************************//*
  		  	 *//*******NUMBER OF DAYS IN MONTH*****//* 
		*//*******************************************//*
		
		System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
		System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
		System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
		System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
		System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));	
		
		*//********************************************//*
		  	 	*//*******SUM 3 AND 5*****//* 
		*//*******************************************//*
		
		Sum3And5.SumThreeAndFive();
		
		*//********************************************//*
  	 		    *//*******NUMBER PALINDROME*****//* 
		*//*******************************************//*
		
		int number = -1221;
		System.out.println("Is this number? " + number + " a palindrome?" + " Answer is: " + NumberPalindrome.isPalindrome(number));
		
		*//********************************************//*
		      *//*******1ST AND LAST DIGIT SUM*****//* 
		*//*******************************************//*
		
		System.out.println("The sum of the first and the last digit is: " +FirstAndLastDigitSum.sumFirstAndLastDigit(-222));
		
		*//********************************************//*
	      		*//*******EVEN DIGIT SUM*****//* 
		*//*******************************************//*
		
		System.out.println("Sum of even digits " + EvenDigitSum.getEvenDigitSum(-22));
		
		*//********************************************//*
  			   *//*******HAS SHARED DIGIT*****//* 
		*//*******************************************//*		
		
		System.out.println("Two numbers have a shared digit " + SharedDigit.hasSharedDigit(15, 55));
		
		*//*******************************************
		   /*******LAST DIGIT CHECKER*****//* 
		*//*******************************************//*	
		
		System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));
		
		*//********************************************//*
		   *//*******GREATEST COMMON DIVISOR*****//* 
		*//*******************************************//*	
		
		System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));*/
		
		/********************************************/
		   		  /*******ALL FACTORS*****/ 
		/*******************************************/
		
		AllFactors.printFactor(10);
		
	}

}
