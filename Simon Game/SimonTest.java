/*
*  File name: SimonTest.java
*  Purpose  : Tests SimonGame.java
*  Author  : Erin Hurlburt and Connor Savage
*  Date    : 2021-11-9
*/

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


class SimonTest {

	public static void main(String[] args) {
		SimonGame gameTest = new SimonGame();

		String color = "Y";
		Scanner guess = new Scanner("R");
		String userGuess = "G";
		String userGuess2 = "Y";


		// expected: color Y and another random color
		System.out.println(gameTest.updateColor(color));


		// expected: ask the user for their guess and print their guess (R)
		System.out.println(gameTest.getUsersGuess(guess));


		// expected: print false because userGuess = G and color = Y
		System.out.println(gameTest.userGotItRight(userGuess, color));


		// expected: true
		System.out.println(gameTest.userGotItRight(userGuess2, color));


		// expected: display instructions
		gameTest.displayInstructions();


		// expected: print message for when user is incorrect
		gameTest.displayStats(userGuess);


		// expected: print that the color should be Y and waits a second before going to next prompt
		gameTest.displayColor(color);


		// expected: make the entire screen disappear to just an empty line
		// this should make all of the above tests disappear after running
		// too see other tests without them vanishing, comment out the line below
		gameTest.makeVanish();



		




		
	}
}
